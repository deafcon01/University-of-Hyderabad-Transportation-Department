
/**
 *
 * @author Rahul
 */
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MaintainDetailForm extends javax.swing.JFrame {

    /**
     * Creates new form MaintainDetailForm
     */
    Connection con=null;
    JComboBox jComboBox1=null;
    public MaintainDetailForm() {
         try{
            jComboBox1=new JComboBox();
            jComboBox1.setBounds(190, 240, 175, 25);
            jComboBox1.addItem("Mechanic ID");
            jComboBox1.addItem("Part No");
     
        add(jComboBox1);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serialno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        formno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        partno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mechanicid = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        close = new javax.swing.JButton();
        viewParts = new javax.swing.JButton();
        vieMaintaindetail = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search = new javax.swing.JButton();
        viewMechanic = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Maintain Detail Form");

        jLabel2.setText("Serial no");

        jLabel3.setText("only update purpose");

        jLabel4.setText("form no");

        jLabel5.setText("part no");

        jLabel6.setText("mechanic id");

        insert.setText("insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        close.setText("close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        viewParts.setText("view parts");
        viewParts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPartsActionPerformed(evt);
            }
        });

        vieMaintaindetail.setText("view maintain details");
        vieMaintaindetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vieMaintaindetailActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        viewMechanic.setText("view mechanic");
        viewMechanic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMechanicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewParts)
                            .addComponent(insert))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vieMaintaindetail)
                                .addGap(18, 18, 18)
                                .addComponent(viewMechanic)
                                .addGap(18, 18, 18)
                                .addComponent(search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(update)
                                .addGap(47, 47, 47)
                                .addComponent(delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(close)
                                .addGap(12, 12, 12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(serialno)
                                    .addComponent(formno)
                                    .addComponent(partno)
                                    .addComponent(mechanicid, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(serialno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(formno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(partno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(mechanicid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(close))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewParts)
                    .addComponent(vieMaintaindetail)
                    .addComponent(search)
                    .addComponent(viewMechanic))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        try{int r=0,r1=0,value=0;
        String s="";
            con=MySqlConnect.ConnectDB();
            //checking for mechanic id
            PreparedStatement pchk=con.prepareStatement("Select * from staffmechanic where staffid=?;");
            pchk.setString(1, mechanicid.getText().trim());
            ResultSet rs=pchk.executeQuery();
            if(formno.getText().trim().length()>0&&partno.getText().trim().length()>0&&mechanicid.getText().trim().length()>0&&rs.next())
            {     
            PreparedStatement p=con.prepareStatement("insert into maintaindetail(formno,partno,mechanicid) values(?,?,?);");
            p.setString(1,formno.getText().trim());
            p.setString(2,partno.getText().trim());
            p.setString(3,mechanicid.getText().trim());
            r=p.executeUpdate();
            PreparedStatement pchk1=con.prepareStatement("Select * from part where partno=?;");
            pchk1.setString(1, partno.getText().trim());
            ResultSet rs1=pchk1.executeQuery();
            if(rs1.next())
            {
                s=rs1.getString("quantity");
                value=Integer.parseInt(s);
                value--;
                s=Integer.toString(value);
             
             PreparedStatement p1=con.prepareStatement("update part set quantity=? where partno=?");
            p1.setString(2,partno.getText().trim());
            p1.setString(1,s);
            r1=p1.executeUpdate();
            }
            if(r1>0)
            JOptionPane.showMessageDialog(null, "Successfull update part");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Recheck all details");
            }
            if(r>0)
            JOptionPane.showMessageDialog(null, "Successfull Insert");
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
         try{int r=0;
            con=MySqlConnect.ConnectDB();
            //check mechanic id
            PreparedStatement pchk=con.prepareStatement("Select * from staffmechanic where staffid=?;");
            pchk.setString(1, mechanicid.getText().trim());
            ResultSet rs=pchk.executeQuery();
            if(formno.getText().trim().length()>0&&partno.getText().trim().length()>0&&mechanicid.getText().trim().length()>0&&rs.next())
            {      
            PreparedStatement p=con.prepareStatement("update maintaindetail set formno=?,partno=?,mechanicid=? where serialno=?;");
            p.setString(1,formno.getText().trim());
            p.setString(2,partno.getText().trim());
            p.setString(3,mechanicid.getText().trim());
            p.setString(4,serialno.getText().trim());
            r=p.executeUpdate();
            }
            else
            {
                JOptionPane.showMessageDialog(null," recheck form");
            }
            if(r>0)
            JOptionPane.showMessageDialog(null, "Successfull update");
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         try{int r=0;
            con=MySqlConnect.ConnectDB();
            //insert into deaprtment
            if(serialno.getText().trim().length()>0)
            {      
            PreparedStatement p=con.prepareStatement("delete from maintaindetail where serialno=?;");
            p.setString(1,serialno.getText().trim());
            r=p.executeUpdate();
            }
            if(r>0)
            JOptionPane.showMessageDialog(null, "Successfull delete");
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void viewPartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPartsActionPerformed
        // TODO add your handling code here:
        try{
            con=MySqlConnect.ConnectDB();
        Statement s;
             s = con.createStatement();
        ResultSet res=s.executeQuery("Select * from part");
        //get meta data
             ResultSetMetaData rsmetadata= (ResultSetMetaData) res.getMetaData();
             // get column count
             int column=rsmetadata.getColumnCount();
             // this object pass data into jtable
             DefaultTableModel dtm= new DefaultTableModel();
             Vector columnname= new Vector();
             Vector datarow= new Vector();
             for(int i=1;i<=column;i++)
             {
                 columnname.addElement(rsmetadata.getColumnName(i));
             }
             dtm.setColumnIdentifiers(columnname);
             while(res.next())
                     {
                         datarow= new Vector();
                      for(int j=1;j<=column;j++)
                      {
                          datarow.addElement(res.getString(j));
                      }
                      dtm.addRow(datarow);
                     }
             jTable1.setModel(dtm);  
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_viewPartsActionPerformed

    private void vieMaintaindetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vieMaintaindetailActionPerformed
        // TODO add your handling code here:
        try{
            con=MySqlConnect.ConnectDB();
        Statement s;
             s = con.createStatement();
        ResultSet res=s.executeQuery("Select * from maintaindetail");
        //get meta data
             ResultSetMetaData rsmetadata= (ResultSetMetaData) res.getMetaData();
             // get column count
             int column=rsmetadata.getColumnCount();
             // this object pass data into jtable
             DefaultTableModel dtm= new DefaultTableModel();
             Vector columnname= new Vector();
             Vector datarow= new Vector();
             for(int i=1;i<=column;i++)
             {
                 columnname.addElement(rsmetadata.getColumnName(i));
             }
             dtm.setColumnIdentifiers(columnname);
             while(res.next())
                     {
                         datarow= new Vector();
                      for(int j=1;j<=column;j++)
                      {
                          datarow.addElement(res.getString(j));
                      }
                      dtm.addRow(datarow);
                     }
             jTable1.setModel(dtm);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_vieMaintaindetailActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try{
            con=MySqlConnect.ConnectDB();
            PreparedStatement p=null;
        if(jComboBox1.getSelectedItem().equals("Mechanic ID")&&mechanicid.getText().trim().length()>0)
        {
                    p=con.prepareStatement("Select * from maintaindetail where mechanicid=?");
                    p.setString(1, mechanicid.getText().trim());
        }
        else  if(jComboBox1.getSelectedItem().equals("Part No")&& partno.getText().trim().length()>0)
        {
                    p=con.prepareStatement("Select * from maintaindetail where partno=?");
                    p.setString(1, partno.getText().trim());
        }
        else
        {
            JOptionPane.showMessageDialog(null,"field empty or improper value selected");
        }
        ResultSet res=p.executeQuery();
        //get meta data
             ResultSetMetaData rsmetadata= (ResultSetMetaData) res.getMetaData();
             // get column count
             int column=rsmetadata.getColumnCount();
             // this object pass data into jtable
             DefaultTableModel dtm= new DefaultTableModel();
             Vector columnname= new Vector();
             Vector datarow= new Vector();
             for(int i=1;i<=column;i++)
             {
                 columnname.addElement(rsmetadata.getColumnName(i));
             }
             dtm.setColumnIdentifiers(columnname);
             while(res.next())
                     {
                         datarow= new Vector();
                      for(int j=1;j<=column;j++)
                      {
                          datarow.addElement(res.getString(j));
                      }
                      dtm.addRow(datarow);
                     }
             jTable1.setModel(dtm);
             
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void viewMechanicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMechanicActionPerformed
        // TODO add your handling code here:
        try{
            con=MySqlConnect.ConnectDB();
        Statement s;
             s = con.createStatement();
        ResultSet res=s.executeQuery("Select * from staffmechanic");
        //get meta data
             ResultSetMetaData rsmetadata= (ResultSetMetaData) res.getMetaData();
             // get column count
             int column=rsmetadata.getColumnCount();
             // this object pass data into jtable
             DefaultTableModel dtm= new DefaultTableModel();
             Vector columnname= new Vector();
             Vector datarow= new Vector();
             for(int i=1;i<=column;i++)
             {
                 columnname.addElement(rsmetadata.getColumnName(i));
             }
             dtm.setColumnIdentifiers(columnname);
             while(res.next())
                     {
                         datarow= new Vector();
                      for(int j=1;j<=column;j++)
                      {
                          datarow.addElement(res.getString(j));
                      }
                      dtm.addRow(datarow);
                     }
             jTable1.setModel(dtm);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_viewMechanicActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MaintainDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaintainDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaintainDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaintainDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaintainDetailForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JButton delete;
    private javax.swing.JTextField formno;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mechanicid;
    private javax.swing.JTextField partno;
    private javax.swing.JButton search;
    private javax.swing.JTextField serialno;
    private javax.swing.JButton update;
    private javax.swing.JButton vieMaintaindetail;
    private javax.swing.JButton viewMechanic;
    private javax.swing.JButton viewParts;
    // End of variables declaration//GEN-END:variables
}