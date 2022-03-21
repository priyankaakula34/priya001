/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import model.Community;
import model.Patient;
import model.VitalSigns;

/**
 *
 * @author priya
 */
public class AddVitalSignsPanel extends javax.swing.JPanel {

    /**
     * Creates new  AddVitalSignsPanel
     */
    public AddVitalSignsPanel() {
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
        txtPatientId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSystBP = new javax.swing.JTextField();
        btnSaveVSData = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Add Vital Signs Data");

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Enter Patient ID");

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("Enter Systolic BP");

        btnSaveVSData.setText("Save");
        btnSaveVSData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveVSDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSystBP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(btnSaveVSData)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtSystBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnSaveVSData)
                .addContainerGap(395, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void btnSaveVSDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveVSDataActionPerformed
        // TODO add your handling code here:
        VitalSigns vs;
        Patient p;
        boolean patientExists;
        Community comm;

        int age = 0;
        p = new Patient();
        ArrayList<VitalSigns> existedArray = new ArrayList<VitalSigns>();
        Map<Patient, ArrayList<VitalSigns>> map = Patient.getEncounterHistory();
        patientExists = false;
        for (Patient patient : map.keySet()) {
            if (Integer.parseInt(txtPatientId.getText()) == patient.getPatientId()) {
                patientExists = true;
                existedArray = map.get(patient);
                p = patient;
            }
        }
        if (patientExists) {
            vs = new VitalSigns();
            vs.setSysBP(Double.parseDouble(txtSystBP.getText()));
            vs.setEntryDateTime(LocalDateTime.now());
            existedArray.add(vs);
            map.put(p, existedArray);
            JOptionPane.showMessageDialog(btnSaveVSData, "Added Vital Signs details successfully");
        } else {
            JOptionPane.showMessageDialog(btnSaveVSData, "Patient does not exist");
        }
    }//GEN-LAST:event_btnSaveVSDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveVSData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtSystBP;
    // End of variables declaration//GEN-END:variables
}
