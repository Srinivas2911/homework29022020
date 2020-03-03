class TestInheritance2_17 {                 // class TestInheritance2_17 for multilevel inheritance

    public static void main(String[] args) {        // has main method

        /* Since BabyDog_17 extends to Dog_17 & Dog_17 extends to Animals_17
        All methods can be called through One object creation for BabyDog_17*/

        BabyDog_17 obj = new BabyDog_17();         // object created for BabyDog_1
        obj.eat();                                 // calling eat method from parent class Animals_17
        obj.bark();                               //  calling bark method from Dog_17 class
        obj.weep();                               // own method of BabyDog_17
    }
}
