class Bike2_18 extends Vehicle_18{          // Child class Bike2_18 extends to Vehicle_18

    public void run (){                     // defining a instance method for Bike running
                                            // similar method to that of Parent Vehicle_18

        System.out.println("Bike is running safely");  // Print statement also has running

    }

    // main method declared in Child class to override the run behaviour from Parent class
    public static void main(String[] args) {        // Main method static

        Bike2_18 obj = new Bike2_18();              // object obj created to call instance method in static main method
        obj.run();                                  // method called from run method Bike2_18 Child Class
    }                                               // to Override

}
