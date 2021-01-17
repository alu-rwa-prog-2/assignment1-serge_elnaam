
/* 
a Program to measure a person's BMI.

Authors
UMUTONI Elnaam and SUGIRA Serge
*/ 


import java.util.Scanner;
public class Number1 {

public static void main(String[] args) {
// TODO Auto-generated method stub

String name;
Double height;
Double weight;
Double bmi;

Scanner username = new Scanner(System.in);
Scanner userheight = new Scanner(System.in);
Scanner userweight = new Scanner(System.in);

//Tell user to enter name, weight and height
System.out.println("Enter your name");
name = username.nextLine();
System.out.println("Enter your height");
height = userheight.nextDouble();
System.out.println("Enter your weight");
weight = userweight.nextDouble();


//the bmi formula
bmi = weight/(height*height);
System.out.println("Dear "+ name +" your BMI is: " + bmi);



//the rectangle question

//declaring variables
int length;
int width;
double perimeter;
double surface;

//scanner for length and width
Scanner rectl  = new Scanner(System.in);
Scanner rectw = new Scanner(System.in);

//The user is prompted to enter the length and width of the rectangle
System.out.println("Enter the length of the rectangle");
length = rectl.nextInt();

System.out.println("Enter the width of the rectangle");
width = rectw.nextInt();


perimeter = (length + width)*2;
surface = length *width;

System.out.println("The perimenter of your rectangle is "+ perimeter);
System.out.println("The area of your rectangle is "+ surface);





}

}
