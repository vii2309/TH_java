/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai4 {
      public static void main(String[] args) {
        // TODO code application logic here
           Scanner x= new Scanner(System.in);
        
            System.out.print("Nhap a :");
            int a= x.nextInt();
            System.out.print("Nhap b :");
            int b= x.nextInt();
            
            
            
             System.out.print(" Tong:" + (a+b));
             System.out.print(" Hieu:"+(a-b));
             System.out.print("Tich:"+(a*b));
             System.out.print(" Thuong :"+(a/b));
            

    }
    
}
