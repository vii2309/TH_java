
package lab4;
import javax.swing.*;  

public class bai1 {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Hello World!");  
        myFrame.setSize(300, 150); //kích thước JFrame 
        myFrame.setVisible(true);  
        JLabel lbName=new JLabel(); 
        lbName.setText("Chào các bạn!"); 
        myFrame.add(lbName);// Thêm jLabel vài JFrame 
    } 
}

