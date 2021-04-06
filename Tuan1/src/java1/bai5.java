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
public class bai5 {
     public static void main(String[] args) {
        // TODO code application logic here
           Scanner x= new Scanner(System.in);
        
            System.out.print("Nhap a :");
            int a= x.nextInt();
            System.out.print("Nhap b :");
            int b= x.nextInt();
            
            
            
             System.out.print(" USCLN:" +USCLN( a, b) );
             System.out.print(" BSCNN:"+BSCNN( a, b));
 

    }
    public static int USCLN(int a,int b)
    {
        if(b==0) 
            return a;
        return USCLN(b,a % b);
    }
      public static int BSCNN(int a,int b)
    {
        return (a*b) / USCLN(a,b);
    }
}
