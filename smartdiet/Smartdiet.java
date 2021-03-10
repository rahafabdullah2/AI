/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartdiet;

import java.util.Scanner;

/**
 *
 * @author rahafabdullah
 */
public class Smartdiet {

      

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
         float cal=0;
         System.out.println("Welcome to SmartDiet! What is your name?");
             String str= read.nextLine();
               System.out.println();
               
         System.out.println("Hi "+str+"! Please enter your weight in kg.");
         int  weight=read.nextInt();
           System.out.println();
           
           System.out.println("Please enter your height in cm.");
         int  height=read.nextInt();
         System.out.println();
          
          System.out.println("Please enter your age.");
         int  age=read.nextInt();
         System.out.println();
         
          System.out.println("Please enter your gender (M/F)");
         String  gender=read.next();
         System.out.println();
         
         System.out.println("Please enter your food preference (v for vegetarian and nv for non-vegetarian)");
         String  food=read.next();
         System.out.println();
         
         person p1=new person(str,weight,height,age,gender,food);
         
         cal=p1.countcalories(p1);
         
         
          System.out.println("Your maximum allowed calories per day is "+cal+" calories.\n");
       
         System.out.println();
         
         
         System.out.println("We are working on preparing your optimal meal plan. . .");
   
    
         
    }}

    


    

