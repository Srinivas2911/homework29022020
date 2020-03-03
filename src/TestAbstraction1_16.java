class TestAbstraction1_16 {                         // class Testing Abstraction for calling

    public static void main(String[] args) {        // main method
        /* Abstractly calling each separate child class method as separate object
        although both Cirle_16 and Rectangle_17 both extend to Shape_17
         */

        Shape_16 obj = new Circle1_16();              // object obj for Circle1_16 class
        obj.draw();                                    // calling method in main method like getShape()method

        Shape_16 obj1 = new Rectangle_16();             // 2nd object obj1 created for Rectangle_16
        obj1.draw();                                    // calling method in main method like getShape()method
    }
}
