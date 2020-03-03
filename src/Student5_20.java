class Student5_20 {         // Class Student5_20 - Testing constructor Overloading

    // three variable defined
    int id;                     // data type int id;
    String name;                // String name
    int age;                    // int age

    Student5_20(int i, String n) {             // constructor with two arguments
        id = i;                                 // int i
        name = n;                               // name n
    }

    Student5_20(int i, String n, int a) {      // constructor with three arguments
        id = i;                                 // int i
        name = n;                               // name n
        age = a;                                 // int a
    }

    public void display() {                     // instance method called display
        System.out.println(id+" "+name +" "+ age);  // print statement for id no, name and age.
    }

    public static void main(String[] args) {        // main method
        // object creation for instance into static main method

        Student5_20 obj = new Student5_20(111, "Karan");        // two arguments
        obj.display();          // display of method thru constructor with two arguments

        Student5_20 obj1 = new Student5_20(222, "Aryan", 25); // three arguments
        obj1.display();             // display of method thru constructor with three arguments
    }
}