package org.pursuit;
//Create a `class` called `Parent` in a file called `Parent.java` in the `org.pursuit` package.
//
//        This class should have 2 (two) `private` fields:
//        * `eyeColor`, of type `String`
//        * `hairColor`, of type `String`
//        * It should have a custom constructor, which assigns values to both fields at the moment of instantiation using 2 (two) parameters
//        * It should have 2 (two) "getter" methods:
//        * `getEyeColor` which should return the `String` value stored in the `eyeColor` field
//        * `getHairColor` which should return the `String` value stored in the `hairColor` field
public class Parent {

    private String eyeColor;
    private String hairColor;

    public Parent(String eyeColor, String hairColor){
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }
}
