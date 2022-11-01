/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import hospital.management.system.Community;
import hospital.management.system.DoctorDirectory;
import hospital.management.system.EncounterHistory;
import hospital.management.system.House;
import hospital.management.system.Patient;
import hospital.management.system.PatientDirectory;
import static hospital.management.system.PatientDirectory.patientDir;
import hospital.management.system.VitalSignsHistory;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author SHREYAS
 */
public class systemadminpatientdirectory extends javax.swing.JFrame {

    VitalSignsHistory vitalDir;
    PatientDirectory patientDir;
//    PersonDirectory personDir;
    DoctorDirectory records;
    EncounterHistory encounterHist;
    private TableRowSorter sorter;
    Community houseList;
    public systemadminpatientdirectory() {
        initComponents();
        this.patientDir = patientDir;
//        
        if(houseList == null){
            ArrayList<House> houseList = new ArrayList<>();
        }
        else{
            this.houseList = houseList;
        }
    }
    boolean validation(){
        String id, name, emailId, gender, community, city, state, username ;
        String houseNumber, zipCode, age, bloodGroup, height, weight;
        String contactDetails;
        Date dob;
        //String patternEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
        String patternEmail = "^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$";
        String bmi = "[(0-9\\.)]{2,}$";
                
        id = PatientIDTxt.getText();
        name = patientNameTxt.getText();
        emailId = emailIDTxt.getText();
        contactDetails = contactTxt.getText();
        age = ageTxt.getText();
        
        houseNumber = houseTxt.getText();
        community = commTxt.getText();
        city = cityTxt.getText();
        state = stateTxt.getText();
        zipCode = zipCodeTxt.getText();
        //bloodGroup = (String) patientBloodGroupTxt.getSelectedItem();
        
        
        if (id.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter Patient ID");
            return false;
        }
        
        if (name.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter name");
            return false;
        }
        
        if (contactDetails.equals("") || !(contactTxt.getText().length()==10))
        {
            JOptionPane.showMessageDialog(this, "Please enter valid contact Number");
            contactTxt.setText("");
            
            return false;
        }
        //emailIDTxt.getText().isBlank() &&
        if( !emailIDTxt.getText().matches(patternEmail)){
                JOptionPane.showMessageDialog(this, "Please enter a valid Email.");
                emailIDTxt.setText("");
                return false;
            }
        
        if (age.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter age");
            return false;
        }
        
        
        
        if (houseNumber.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter houseNumber");
            return false;
        }
        
        if (community.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter community");
            return false;
        }
        
        if (city.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter city");
            return false;
        }
        
        if (state.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter state");
            return false;
        }
        
        if (zipCode.equals("") || !(zipCodeTxt.getText().length()==5))
        {
            JOptionPane.showMessageDialog(this, "Please enter zipCode");
            zipCodeTxt.setText("");
            return false;
        }
        

        
        
       
    
        
        
        
        
        
        
        
        return true;
        
    }
    
    public void resetPatientForm(){
        patientNameTxt.setText("");
        ageTxt.setText("");
        contactTxt.setText("");
        emailIDTxt.setText("");
        gendertxt.setText("");
        //DOBtxt.setDate();
        houseTxt.setText("");
        commTxt.setText("");
        cityTxt.setText("");
        stateTxt.setText("");
        zipCodeTxt.setText("");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patientNameTxt = new javax.swing.JTextField();
        contactTxt = new javax.swing.JTextField();
        emailIDTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        gendertxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PatientIDTxt = new javax.swing.JTextField();
        commTxt = new javax.swing.JTextField();
        houseTxt = new javax.swing.JTextField();
        cityTxt = new javax.swing.JTextField();
        stateTxt = new javax.swing.JTextField();
        zipCodeTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Patient Directory");

        jLabel2.setText("name");
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel2KeyTyped(evt);
            }
        });

        jLabel3.setText("contact no");
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel3KeyTyped(evt);
            }
        });

        jLabel4.setText("email id");
        jLabel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel4KeyTyped(evt);
            }
        });

        jLabel5.setText("age");
        jLabel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel5KeyTyped(evt);
            }
        });

        jLabel6.setText("gender");
        jLabel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel6KeyTyped(evt);
            }
        });

        gendertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendertxtActionPerformed(evt);
            }
        });

        jLabel7.setText("patient id");
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel7KeyTyped(evt);
            }
        });

        jLabel8.setText("community id");

        jLabel9.setText("house");

        jLabel10.setText("city");

        jLabel11.setText("state");
        jLabel11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel11KeyTyped(evt);
            }
        });

        jLabel12.setText("zipcode");
        jLabel12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel12KeyTyped(evt);
            }
        });

        jButton1.setText("create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("view");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "name", "contact no", "email id", "age", "gender", "patient id", "community id", "house", "city", "state", "zip code"
            }
        ));
        jScrollPane2.setViewportView(patientTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(103, 103, 103)
                                .addComponent(patientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PatientIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(85, 85, 85)
                                .addComponent(jButton2)
                                .addGap(89, 89, 89)
                                .addComponent(jButton3)
                                .addGap(104, 104, 104)
                                .addComponent(jButton4))
                            .addComponent(commTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(houseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(stateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(zipCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(patientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(emailIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(PatientIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(commTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(houseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(stateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(zipCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gendertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendertxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Patient pt1=new Patient();
        pt1.setName(patientNameTxt.getText());
        pt1.setAge(Integer.parseInt(ageTxt.getText()));
        pt1.setContactDetails(Long.parseLong(contactTxt.getText()));
        pt1.setEmailId(emailIDTxt.getText());
        pt1.setGender((String)gendertxt.getText());
        pt1.residence.communityName= commTxt.getText();
        pt1.residence.houseNumber= houseTxt.getText();
        pt1.residence.zip = Integer.parseInt(zipCodeTxt.getText());
        pt1.residence.cityName = cityTxt.getText();
        pt1.residence.state = stateTxt.getText();
        
        
        
        
        
        

        if(validation() == true){
        PatientDirectory.patientDir.add(pt1);
        JOptionPane.showMessageDialog(this, "Patient Successfully Added");
        }
        patientDispTable();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex1=patientTable.getSelectedRow();
        if (selectedRowIndex1<0){
            JOptionPane.showMessageDialog(this,"Please select a row to view");
            return;
        }
        DefaultTableModel model1 = (DefaultTableModel) patientTable.getModel();
        Patient selectedPatient=(Patient)model1.getValueAt(selectedRowIndex1,0);
        patientNameTxt.setText(selectedPatient.getName());
        PatientIDTxt.setText(String.valueOf(selectedPatient.getPatientId()));
        contactTxt.setText(String.valueOf(selectedPatient.getContactDetails()));
        emailIDTxt.setText(selectedPatient.getEmailId());
        gendertxt.setText(selectedPatient.getGender());
        
        ageTxt.setText(String.valueOf(selectedPatient.getAge()));
        
        houseTxt.setText(String.valueOf(selectedPatient.residence.getHouseNumber()));
        commTxt.setText(selectedPatient.residence.getCommunityName());
        cityTxt.setText(selectedPatient.residence.getCityName());
        stateTxt.setText(selectedPatient.residence.getState());
        zipCodeTxt.setText(String.valueOf(selectedPatient.residence.getZip()));
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = patientTable.getSelectedRow();
        DefaultTableModel model1 = (DefaultTableModel) patientTable.getModel();
        Patient selectedPatient=(Patient)model1.getValueAt(selectedRowIndex, 0);
 
        selectedPatient.setPatientId(Integer.parseInt(PatientIDTxt.getText()));
        selectedPatient.setName(patientNameTxt.getText());
        selectedPatient.setContactDetails(Long.parseLong(contactTxt.getText()));
        selectedPatient.setEmailId(emailIDTxt.getText());
        
        selectedPatient.setGender((String)gendertxt.getText());
        selectedPatient.setAge(Integer.parseInt(ageTxt.getText()));
        
        
        selectedPatient.residence.setHouseNumber((houseTxt.getText()));
        selectedPatient.residence.setCommunityName(commTxt.getText());
        selectedPatient.residence.setCityName(cityTxt.getText());
        selectedPatient.residence.setZip(Integer.parseInt(zipCodeTxt.getText()));
        
        patientDispTable();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel12KeyTyped
        // TODO add your handling code here:
        try{
            //Allow only digits in Zip field
            char typedZipCode = evt.getKeyChar();
            if(!Character.isDigit(typedZipCode)){
                evt.consume();
            }
            //Restrict the length to 5
            if(zipCodeTxt.getText().length() > 4){
                evt.consume();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel12KeyTyped

    private void jLabel11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel11KeyTyped
        // TODO add your handling code here:
        char typedState = evt.getKeyChar();
        if(!Character.isAlphabetic(typedState) && !Character.isWhitespace(typedState)){
            evt.consume();
        }
        //Restrict the length to 256
        if(stateTxt.getText().length() > 255){
            evt.consume();
        }
    }//GEN-LAST:event_jLabel11KeyTyped

    private void jLabel5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel5KeyTyped
        // TODO add your handling code here:
        char typedAge = evt.getKeyChar();
        if(!Character.isDigit(typedAge)){
            evt.consume();
        }
        //Restrict the length to 5
        if(ageTxt.getText().length() > 2){
            evt.consume();
        }
    }//GEN-LAST:event_jLabel5KeyTyped

    private void jLabel6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel6KeyTyped
        // TODO add your handling code here:
        String selectedValue = gendertxt.getText().toString();
    }//GEN-LAST:event_jLabel6KeyTyped

    private void jLabel4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyTyped
        // TODO add your handling code here:
        Pattern regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
    }//GEN-LAST:event_jLabel4KeyTyped

    private void jLabel3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyTyped
        // TODO add your handling code here:
        char typedContactNumber = evt.getKeyChar();
        if(!Character.isDigit(typedContactNumber)){
            evt.consume();
        }
        //Restrict the length to 10
        if(contactTxt.getText().length() == 10){
            evt.consume();
        }
    }//GEN-LAST:event_jLabel3KeyTyped

    private void jLabel2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyTyped
        // TODO add your handling code here:
        char typedName = evt.getKeyChar();
        if(!Character.isAlphabetic(typedName) && !Character.isWhitespace(typedName)){
            evt.consume();
        }
        //Restrict the length to 256
        if(patientNameTxt.getText().length() > 100){
            evt.consume();
        }
    }//GEN-LAST:event_jLabel2KeyTyped

    private void jLabel7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyTyped
        // TODO add your handling code here:
        char typedPatientID = evt.getKeyChar();
        if(!Character.isDigit(typedPatientID)){
            evt.consume();
        }

        if(PatientIDTxt.getText().length() > 5){
            evt.consume();
        }
        
        
    }//GEN-LAST:event_jLabel7KeyTyped
    public void patientDispTable(){
        DefaultTableModel model1 = (DefaultTableModel) patientTable.getModel();
        model1.setRowCount(0);
        System.out.println("Done");
        for (Patient pt:PatientDirectory.getPatientDir()){
            Object[] row=new Object[15];
            row[0]=pt;
            row[1]=pt.getName();
            row[2]=pt.getContactDetails();
            row[3]=pt.getEmailId();
            row[4]=pt.getGender();
            row[5]=pt.getAge();
            row[6]=pt.getDate();
            row[7]=pt.residence.getHouseNumber();
            row[8]=pt.residence.getCommunityName();
            row[9]=pt.residence.getCityName();
            row[10]=pt.residence.getState();
            row[11]=pt.residence.getZip();
            row[12]=pt.getBloodgroup();
            row[13]=pt.getPatientheight();
            row[14]=pt.getPatientWeight();
            
            model1.addRow(row);
        }
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
            java.util.logging.Logger.getLogger(systemadminpatientdirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(systemadNametxtirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(systemadminpatientdirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(systemadminpatientdirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new systemadminpatientdirectory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PatientIDTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JTextField commTxt;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JTextField emailIDTxt;
    private javax.swing.JTextField gendertxt;
    private javax.swing.JTextField houseTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField patientNameTxt;
    private javax.swing.JTable patientTable;
    private javax.swing.JTextField stateTxt;
    private javax.swing.JTextField zipCodeTxt;
    // End of variables declaration//GEN-END:variables
}
