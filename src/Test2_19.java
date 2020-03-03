class Test2_19 {                //Another Class Test_19 to test Overriding

    public static void main(String[] args) {    // main method to call all child class method

        SBI_19 obj = new SBI_19();          // object creation for SBI_19 Class
        ICICI_19 obj1 = new ICICI_19();     // object creation for ICICI_19 Class
        AXIS_19 obj2 = new AXIS_19();       // object creation for AXIS_19 Class

        // getting the method from each child class through their individual objects.
        // and printing statements
        System.out.println("SBI Rate of Interest: "+ obj.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+ obj1.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + obj2.getRateOfInterest());
    }

}
