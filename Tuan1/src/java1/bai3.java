/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai3 {
     public static void main(String[] args) {
        // TODO code application logic here
           Scanner x= new Scanner(System.in);
           System.out.print("Nhap ma so sinh vien:");
           String masv= x.nextLine();
           
            System.out.print("Nhap họ tên:");
           String hoten= x.nextLine();
           
            System.out.print("Nhap tuổi:");
            Byte tuoi= x.nextByte();
            
            System.out.print("Nhap nam sinh :");
            int namsinh= x.nextInt();
            
            
             System.out.print("Nhap DTB :");
             Float dtb= x.nextFloat();
            
             System.out.print(" ma so sinh vien:" + masv);
             System.out.print(" họ tên:"+hoten);
             System.out.print("tuổi:"+tuoi);
             System.out.print(" nam sinh :"+namsinh);
             System.out.print("DTB :"+dtb);

    }
}
