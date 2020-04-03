package com.klu.JUnit;


import java.util.Scanner;
public class App 
{
    private static Scanner sc;

	public static void main( String[] args )
    {
        sc = new Scanner(System.in);
        String originalString=sc.next();
        RemoveAsTask rat=new RemoveAsTask();
        System.out.println(rat.removeAs(originalString));
    }
}
