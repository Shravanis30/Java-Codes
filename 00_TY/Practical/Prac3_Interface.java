// // The common base interface (Grandparent)
// interface A {
//     void show();
// }

// // The first intermediate interface (Parent 1)
// interface B extends A {
//     // No implementation needed here
// }

// // The second intermediate interface (Parent 2)
// interface C extends A {
//     // No implementation needed here
// }

// // The class that implements both B and C (Child)
// class D implements B, C {
//     @Override
//     public void show() {
//         System.out.println("D's show()");
//     }
// }
// class Prac3_Interface {
//     public static void main(String[] args) {
//         D d = new D();
//         d.show(); // Output: D's show()
//     }
// }





// The common base class (Grandparent)
class A {
    void show() {
    System.out.println("A's show()");
    }
   }
   // The first intermediate class (Parent 1)
   class B extends A {
    @Override
    void show() {
    System.out.println("B's show()");
    }
   }
   // The second intermediate class (Parent 2)
   class C extends A {
    @Override
    void show() {
        System.out.println("C's show()");
        }
       }
       // The class that inherits from both B and C (Child)
       class D extends B, C {
        // No implementation needed here
       }
       public class Prac3_Interface {
        public static void main(String[] args) {
        D d = new D();
        d.show(); // Output: B's show()
        }
       }