

package com.mycompany.lab01;
import java.util.Scanner;

public class Lab01 {

    public static void main(String[] args) 
    {   int x, y, z;
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter first number");
        x = sc.nextInt();
        System.out.println("enter secont number");
        y = sc.nextInt();
        try{
        z= x/y;
        System.out.println("answer is : " +z);
        }
        catch(Exception e){
            System.out.println("Error : divided by zero");
        
        
        }
    }
}
