

package com.mycompany.lab02;


public class Lab02 {

    public static void main(String[] args) 
    {   try{
    
    int arr[]= new int[5];
    arr[5] = 10;
    System.out.println("last element is " +arr[5]);
    }
    catch(ArrayIndexOutOfBoundsException e){
    System.out.println("error : array index is invalid");
    
    }
        System.out.println("Hello World!");
    }
}
