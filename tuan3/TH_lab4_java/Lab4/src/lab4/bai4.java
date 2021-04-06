
package lab4;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class bai4 extends JFrame{
    public bai4(String title)
    {
         JPanel pnBox=new JPanel();
      pnBox.setLayout(new BoxLayout(pnBox,BoxLayout.X_AXIS));
      JButton btn1=new JButton("BoxLayout");
      btn1.setForeground( Color.RED);
      Font font=new Font("Arial", Font.BOLD | Font.ITALIC,25);
      btn1.setFont(font); pnBox.add(btn1);
      JButton btn2=new JButton("X_AXIS");
      btn2.setForeground(Color.BLUE);
      btn2.setFont(font);pnBox.add(btn2);
      JButton btn3=new JButton("Y_AXIS");
      btn3.setForeground(Color.ORANGE);
      btn3.setFont(font);pnBox.add(btn3);
      
      Container con=getContentPane();
      con.add(pnBox);
    }
    
    public static void main(String[] args) {
    
      bai4 myUI=new bai4("BoxLayout");
       myUI.setSize(600, 100);
       myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       myUI.setLocationRelativeTo(null);
       myUI.setVisible(true);
    } 
}
