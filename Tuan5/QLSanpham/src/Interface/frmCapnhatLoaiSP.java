
package Interface;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import Proccess.LoaiSP;//Lớp LoaiSP trong Proccess đã thực hiện 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel; 

public class frmCapnhatLoaiSP extends javax.swing.JFrame {

     private final LoaiSP lsp = new LoaiSP();  
    private boolean cothem=true; 
            private final DefaultTableModel tableModel = new DefaultTableModel(); 
    //Ham do du lieu vao tableModel 
    public void ShowData() throws SQLException{         
        ResultSet result=  lsp.ShowLoaiSP();           
        try {             
            while(result.next()){ // nếu còn đọc tiếp được một dòng dữ liệu 
                String rows[] = new String[2]; 
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng) 
                rows[1] = result.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên hàng                   
                tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel  
                //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update  
            } 
        }  
       catch (SQLException e) { 
        }  
    }   
    //Ham xoa du lieu trong tableModel 
    public void ClearData() throws SQLException{ 
         //Lay chi so dong cuoi cung 
         int n=tableModel.getRowCount()-1; 
         for(int i=n;i>=0;i--) 
            tableModel.removeRow(i);//Remove tung dong          
    }  
    //Ham xoa cac TextField 
    private void setNull() 
    { 
        //Xoa trang cac JtextField 
        this.txtMaloai.setText(null); 
        this.txtTenloai.setText(null); 
        this.txtMaloai.requestFocus();       
    } 
    //Ham khoa cac TextField 
    private void setKhoa(boolean a) 
    { 
        //Khoa hoac mo khoa cho Cac JTextField 
        this.txtMaloai. setEnabled (!a); 
        this.txtTenloai. setEnabled (!a); 
    }   
    //Ham khoa cac Button 
    private void setButton(boolean a) 
    { 
        //Vo hieu hoac co hieu luc cho cac JButton 
        this.btThem. setEnabled (a); 
        this.btXoa. setEnabled (a); 
        this.btSua. setEnabled (a); 
        this.btLuu. setEnabled (!a); 
        this.btKLuu. setEnabled (!a); }
    public frmCapnhatLoaiSP() throws SQLException {
        initComponents();
        String []colsName = {"Mã Loai", "Tên loai"}; 
        // đặt tiêu đề cột cho tableModel 
        tableModel.setColumnIdentifiers(colsName);   
        // kết nối jtable với tableModel   
        jTableLoaiSP.setModel(tableModel);   
        //gọi hàm ShowData để đưa dữ liệu vào tableModel  
        ShowData();  
        //goi Ham xoa trang cac TextField 
        setNull(); 
        //Goi ham Khoa cac TextField 
        setKhoa(true); 
        //Goi vo hieu 2 button Luu, K.Luu. Mo khoa 4 button con lao  
        setButton(true); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaloai = new javax.swing.JTextField();
        txtTenloai = new javax.swing.JTextField();
        btThem = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        btKLuu = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLoaiSP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DANH MUC LOAI SAN PHAM");

        jLabel2.setText("Ma Loai");

        jLabel3.setText("Ten Loai");

        txtMaloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaloaiActionPerformed(evt);
            }
        });

        txtTenloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenloaiActionPerformed(evt);
            }
        });

        btThem.setText("Them");

        btXoa.setText("Xoa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btSua.setText("Sua");

        btLuu.setText("Luu");

        btKLuu.setText("K.Luu");
        btKLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKLuuActionPerformed(evt);
            }
        });

        btThoat.setText("Thoat");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });

        jTableLoaiSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ma Loai", "Ten Loai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableLoaiSP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaloai, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenloai, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btThem)
                                .addGap(31, 31, 31)
                                .addComponent(btXoa)
                                .addGap(29, 29, 29)
                                .addComponent(btSua)
                                .addGap(26, 26, 26)
                                .addComponent(btLuu)
                                .addGap(38, 38, 38)
                                .addComponent(btKLuu)))))
                .addGap(35, 35, 35)
                .addComponent(btThoat)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btXoa)
                    .addComponent(btSua)
                    .addComponent(btLuu)
                    .addComponent(btKLuu)
                    .addComponent(btThoat))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaloaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaloaiActionPerformed

    private void txtTenloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenloaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenloaiActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btXoaActionPerformed

    private void btKLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKLuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btKLuuActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException  {
         frmCapnhatLoaiSP f = new frmCapnhatLoaiSP(); 
        f.setVisible(true); 
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btKLuu;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLoaiSP;
    private javax.swing.JTextField txtMaloai;
    private javax.swing.JTextField txtTenloai;
    // End of variables declaration//GEN-END:variables
}
