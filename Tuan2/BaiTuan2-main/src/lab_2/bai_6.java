/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class bai_6 {
    public static void main(String[] args){
    int n;
    try{
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Nhap so nguyen:",""));
    }
    catch(java.lang.NumberFormatException el){
    System.out.println(el.toString());
            }
    finally{
        System.out.println("Have good fun");
    }
    }
}
