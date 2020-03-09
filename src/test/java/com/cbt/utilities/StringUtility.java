package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String expected, String actual){

        Boolean result = expected.equals(actual)? true:false ;
        System.out.println(result);

        System.out.println("Expected value :: "+expected+" \nActual value:: "+actual);

}}
