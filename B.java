/*
                                   LAB=10(B)
Define class B in package bpack which extends A and write display() method which access
variables of class A.*/



// File: B.java
package bpack;

import apack.A;

public class B extends A {
    public void display() {
        // System.out.println("Default Var: " + defaultVar); // ❌ Not accessible (different package, not subclass)
        System.out.println("Protected Var: " + protectedVar); // ✅ Accessible (subclass)
        // System.out.println("Private Var: " + privateVar);   // ❌ Not accessible (private)
        System.out.println("Public Var: " + publicVar);       // ✅ Accessible (public)
    }
}
