package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string");
        String name = input.nextLine();
        System.out.println( name + " has " +  name.length() + " characters." );
    }
}
