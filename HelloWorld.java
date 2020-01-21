package ru.geekbrains;

import javax.swing.*;

public class HelloWorld{
public static float calculate(int a,int b,int c,int d){
        return a*(b+(c/d));
        }
    final int varOne = 1;
    final int varTwo = 2;
    final int varThree =3;
    final int varFour = 4;

    final float fOne = 1f;
    final float fTwo = 2f;
    final float fThree = 3f;
    final float fFour = 4.0f;
        System.out.println("calculation from the first task gives us:" + calculate(varOne,varTwo,varThree,varFour));
private static boolean check (int first,int second){
    int sum = first+second;
    return sum<=20 && sum>=10;
}

System.out.println("Does the sum of two given numbers fit the range?"+ checkTwoNumbers(1,15));
    private static boolean isPositive(int veriable){
    return veriable >=0;}
    System.out.println("Your name is"+((isPositive(-5))?"positive":"negative")+"!");
    private static String welcome (String name) {
        System.out.println("привет, указанное имя");
        System.out.println("Just kidding!");
        return "Привет,"+name+"!";
}
System.out.println(welcome("Nikolay"));

//не понимаю почему не работает//




