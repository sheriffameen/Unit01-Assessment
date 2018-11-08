package org.pursuit;

//This class should have 4 (four) `static` fields, with `public` access modifiers, which CANNOT be reassigned after assignment:
//        * `NORTH`, of type `int`, assigned a value of `0`
//        * `SOUTH`, of type `int`, assigned a value of `1`
//        * `EAST`, of type `int`, assigned a value of `2`
////        * `WEST`, of type `int`, assigned a value of `3`
//This class should also have 4 (four) `static` "getter" methods, with `public` access modifiers:
//        * `getNorth`, of type `int`, which returns the value stored in the field `NORTH`
//        * `getSouth`, of type `int`, which returns the value stored in the field `SOUTH`
//        * `getEast`, of type `int`, which returns the value stored in the field `EAST`
//        * `getWest`, of type `int`, which returns the value stored in the field `WEST`
public class FourWinds {

    public static final int NORTH = 0;

    public static final int SOUTH = 1;

    public static final int EAST = 2;

    public static final int WEST= 3;

    public static int getNORTH() {
        return NORTH;
    }

    public static int getSOUTH() {
        return SOUTH;
    }

    public static int getEAST() {
        return EAST;
    }

    public static int getWEST() {
        return WEST;
    }
}
