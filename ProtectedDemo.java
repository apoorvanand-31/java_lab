/*
                            LAB-10(D)
Define class ProtectedDemo in package dpack which contains the main () method.*/



// File: ProtectedDemo.java
package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("Class B display():");
        b.display();

        C c = new C();
        System.out.println("\nClass C display():");
        c.display();
    }
}
