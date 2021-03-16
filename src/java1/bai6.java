/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.Scanner;
import static java1.bai5.BSCNN;
import static java1.bai5.USCLN;

/**
 *
 * @author Administrator
 */
public class bai6 {
      public static void main(String[] args) {
        // TODO code application logic here
           Scanner x= new Scanner(System.in);
        
            System.out.print("Nhap n:");
            int n= x.nextInt();
            System.out.print(" Cac so nguyen to nho hon n \n" );
            if(n>=2)
            {
               System.out.print(2);
            }
            for(int i=3;i<n;i+=2)
            {
                if (ktsnt(i))
                {
                    System.out.print(" "+i);

                }
            }
    }
        public static boolean ktsnt(int n)
    {
        if(n <2)
        {
        return false;
        }
            
        int kt=(int) Math.sqrt(n);
        for(int i =2;i<=kt;i++)
            if(n % i ==0)
            {
                return false;
            }
        return true;
    }
    
}
