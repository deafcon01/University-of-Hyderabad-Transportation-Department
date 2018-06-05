
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    Connection con;
    public Home() {
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
        adddepartment = new javax.swing.JButton();
        addvehicle = new javax.swing.JButton();
        vehiclepart = new javax.swing.JButton();
        vehicleReservation = new javax.swing.JButton();
        tripCompletion = new javax.swing.JButton();
        vehicleMaintain = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("University of Hyderabad Transport Department");

        adddepartment.setText("Add Department");
        adddepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddepartmentActionPerformed(evt);
            }
        });

        addvehicle.setText("Add Vehicle");
        addvehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addvehicleActionPerformed(evt);
            }
        });

        vehiclepart.setText("Add Vehicle Part Details");
        vehiclepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiclepartActionPerformed(evt);
            }
        });

        vehicleReservation.setText("Vehicle Reservation");
        vehicleReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleReservationActionPerformed(evt);
            }
        });

        tripCompletion.setText("Trip Completion Form");
        tripCompletion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tripCompletionActionPerformed(evt);
            }
        });

        vehicleMaintain.setText("Vehicle Maintainence");
        vehicleMaintain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleMaintainActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adddepartment)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(vehicleReservation)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addvehicle)
                        .addGap(18, 18, 18)
                        .addComponent(vehiclepart)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tripCompletion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vehicleMaintain)
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adddepartment)
                    .addComponent(addvehicle)
                    .addComponent(vehiclepart))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleReservation)
                    .addComponent(tripCompletion)
                    .addComponent(vehicleMaintain))
                .addGap(35, 35, 35)
                .addComponent(exit)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adddepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddepartmentActionPerformed
        // TODO add your handling code here:
        Department d=new Department();
        d.setVisible(true);
    }//GEN-LAST:event_adddepartmentActionPerformed

    private void addvehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addvehicleActionPerformed
        // TODO add your handling code here:
        Vehicle v=new Vehicle();
        v.setVisible(true);
    }//GEN-LAST:event_addvehicleActionPerformed

    private void vehiclepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiclepartActionPerformed
        // TODO add your handling code here:
        PartDetails p=new PartDetails();
        p.setVisible(true);
    }//GEN-LAST:event_vehiclepartActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void vehicleReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleReservationActionPerformed
        // TODO add your handling code here:
        ReservationForm r=new ReservationForm();
        r.setVisible(true);
    }//GEN-LAST:event_vehicleReservationActionPerformed

    private void tripCompletionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tripCompletionActionPerformed
        // TODO add your handling code here:
        TripCompletionForm t=new TripCompletionForm();
        t.setVisible(true);
    }//GEN-LAST:event_tripCompletionActionPerformed

    private void vehicleMaintainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleMaintainActionPerformed
        // TODO add your handling code here:
        Maintainlog ml=new Maintainlog();
        ml.setVisible(true);
    }//GEN-LAST:event_vehicleMaintainActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adddepartment;
    private javax.swing.JButton addvehicle;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tripCompletion;
    private javax.swing.JButton vehicleMaintain;
    private javax.swing.JButton vehicleReservation;
    private javax.swing.JButton vehiclepart;
    // End of variables declaration//GEN-END:variables
}
