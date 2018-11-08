package org.pursuit;
//Create a `class` called `Child` in a file called `Child.java` in the `org.pursuit` package.
//
//        This class should extend from the class `Parent`.
//
//        This class should have 1 (one) `private` field:
//        * `age`, of type `int`
//        * It should have a custom constructor, using 3 (three) parameters: 2 (two) should be passed to the super's constructor, and 1 (one) should assign a value to the field `age` at the moment of instantiation
//        * It should have 1 (one) "getter" method:
//        * `getAge`, which should return the `int` value stored in the `age` field
public class Child extends Parent{

    private int age;

    public int getAge() {
        return age;
    }

    public Child(String eyeColor, String hairColor, int age) {
        super(eyeColor, hairColor);
        this.age = age;
    }
}
