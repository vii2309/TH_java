/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import static java.lang.Math.sqrt;
import java.util.Scanner;
import static java1.bai6.ktsnt;

/**
 *
 * @author Administrator
 */
public class bai7 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);

        int a[], n = 0;

        do {
            System.out.print("Nhap so phan tu trong mang: ");
            n = x.nextInt();
            if (n <= 0) {
                System.out.println("Nhap lai!");
            }
        } while (n <= 0);

        a = new int[n];

        System.out.print("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("a[%d] =", i));
            a[i] = x.nextInt();
        }
        //xuat cac pha ntu la nguyen to
        System.out.print(" Cac phan tu la nguyen to \n");
        for(int i=0;i<n;i++)
        {
            if(ktsnt(a[i])==true)
            {
                System.out.println(a[i]+" ");
            }
        }
        //tim phan tu lon nhat trong mang
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.print(String.format("\n phan tu lon nhat trong mang: %d", max));
        //dem cac phan tu la so chinh phuong
        System.out.print("So chinh phuong trong mang: ");
        int sl = 0;
        for (int i = 0; i < n; i++) {
            if (scp(a[i])==1) {
                sl++;
                System.out.println(a[i] + " ");
            }
        }
        System.out.println("Co " + sl + " so chinh phuong.");
        // sap xep mang tang dan
          System.out.println("Mang sau sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static boolean ktsnt(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //xuat snt

//          public static boolean xuatsnt(int n,int a[])
//    {
//            for(int i=0; i<a.length;i++)
//            {
//                if(ktsnt(a[i])) {
//                    System.out.print(a[i]+"\t");
//                }
//            }
//    }
    // scp 
    public static int scp(int n) {
        if (n == sqrt(n) * sqrt(n)) {
            return 1;
        } else {
            return 0;
        }
    }
    // dem scp
//          public static int demscp(int n,int a[])
//    {
//       int i;
//       int dem=0;
//       int s=0;
//       for( i=0;i<n;i++)
//       {
//           if(scp(a[i]))
//           {
//               System.out.print(String.format("\n a[%d] = %d \n" , i,a[i]));
//               dem++;
//               s+=a[i];
//           }
//           System.out.print(String.format("\n tong so chinh phuong trong mangla %d \n" , s));
//       }
//    }
}
