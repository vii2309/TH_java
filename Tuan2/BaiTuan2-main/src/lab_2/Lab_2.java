/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;
import java.io.*;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class Lab_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

//    /**
//     * @param args the command line arguments
//     */
    
        System.out.print("Nhap he so bac 2, a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhap e so bac 1, b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhap hang so tu do, c = ");
        float c = scanner.nextFloat();
        Lab_2.giaiPTBac2(a, b, c);
    }
    public static void giaiPTBac2(float a, float b, float c) {
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        float d=a+b+c;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trình vô nghiem!");
            } else  {
                System.out.println("Phuong trình có mot nghiem: " + "x = " + (-c / b));
            } 
            return;
        }
        if(d==0) {
                    x1 = (-b / (2 * a));
                    System.out.println("Phuong trình có nghiem kép: " + "x1 = x2 = " + x1);
                    return;
            }
        
        // tính nghi?m
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trình có 2 nghiem là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0 ) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trình có nghiem kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trình vô nghiem!");
        }
    }
    
}

