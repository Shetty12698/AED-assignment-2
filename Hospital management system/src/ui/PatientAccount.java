/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import hospital.management.system.PatientDirectory;

/**
 *
 * @author SHREYAS
 */
public class PatientAccount extends javax.swing.JFrame {
    PatientDirectory patientDir;

    /**
     * Creates new form PatientAccount
     */
    String patientUsername;
    public PatientAccount(PatientDirectory patientDir, String patientUsername) {
        initComponents();
        this.patientDir = patientDir;
        this.patientUsername = patientUsername;
    }
    public PatientAccount() {
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

        jButton1 = new javax.swing.JButton();
        personMedicalDetails = new javax.swing.JPanel();
        patientDetailsBloodGroup = new javax.swing.JTextField();
        patientBloodGroupLbl = new javax.swing.JLabel();
        patientHeightLbl = new javax.swing.JLabel();
        patientDetailsHeight = new javax.swing.JTextField();
        patientDetailsBloodPressure = new javax.swing.JTextField();
        patientWeightLbl = new javax.swing.JLabel();
        patientBloodPressureLbl = new javax.swing.JLabel();
        patientDetailsWeight = new javax.swing.JTextField();
        patientAllergiesLbl = new javax.swing.JLabel();
        patientDetailsSugarLevel = new javax.swing.JTextField();
        patientSugarLevelLbl = new javax.swing.JLabel();
        patientDetailsAllergies = new javax.swing.JTextField();
        personPersonalDetails = new javax.swing.JPanel();
        patientDetailsName = new javax.swing.JTextField();
        patientNameLbl = new javax.swing.JLabel();
        patientContactLbl = new javax.swing.JLabel();
        patientDetailsContact = new javax.swing.JTextField();
        patientDetailsPatientID = new javax.swing.JTextField();
        patientPatientIDLbl = new javax.swing.JLabel();
        patientGenderLbl = new javax.swing.JLabel();
        patientDOBLbl = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        personAddressDetails = new javax.swing.JPanel();
        patientDetailsHouse = new javax.swing.JTextField();
        patientHouseLbl = new javax.swing.JLabel();
        patientStreetLbl = new javax.swing.JLabel();
        patientDetailsStreet = new javax.swing.JTextField();
        patientDetailsCity = new javax.swing.JTextField();
        patientCommunityLbl = new javax.swing.JLabel();
        patientCityLbl = new javax.swing.JLabel();
        patientDetailsCommunity = new javax.swing.JTextField();
        patientZipCodeLbl = new javax.swing.JLabel();
        patientDetailsState = new javax.swing.JTextField();
        patientStateLbl = new javax.swing.JLabel();
        patientDetailsZipCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Update ");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        personMedicalDetails.setBackground(new java.awt.Color(0, 153, 153));
        personMedicalDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medical Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 3, 13))); // NOI18N

        patientDetailsBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsBloodGroupActionPerformed(evt);
            }
        });

        patientBloodGroupLbl.setText("Blood Group");

        patientHeightLbl.setText("Height (in cms)");

        patientWeightLbl.setText("Weight (in lbs)");

        patientBloodPressureLbl.setText("Blood Pressure");

        patientDetailsWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsWeightActionPerformed(evt);
            }
        });

        patientAllergiesLbl.setText("Allerrgies (if any)");

        patientDetailsSugarLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsSugarLevelActionPerformed(evt);
            }
        });

        patientSugarLevelLbl.setText("Sugar Level");

        javax.swing.GroupLayout personMedicalDetailsLayout = new javax.swing.GroupLayout(personMedicalDetails);
        personMedicalDetails.setLayout(personMedicalDetailsLayout);
        personMedicalDetailsLayout.setHorizontalGroup(
            personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personMedicalDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(personMedicalDetailsLayout.createSequentialGroup()
                        .addComponent(patientBloodGroupLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(patientDetailsBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, personMedicalDetailsLayout.createSequentialGroup()
                        .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientHeightLbl)
                            .addComponent(patientWeightLbl))
                        .addGap(18, 18, 18)
                        .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientDetailsWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientDetailsHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, personMedicalDetailsLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(personMedicalDetailsLayout.createSequentialGroup()
                                .addComponent(patientAllergiesLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patientDetailsAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(personMedicalDetailsLayout.createSequentialGroup()
                                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(patientSugarLevelLbl)
                                    .addComponent(patientBloodPressureLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientDetailsBloodPressure, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientDetailsSugarLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, 0))
        );
        personMedicalDetailsLayout.setVerticalGroup(
            personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personMedicalDetailsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientDetailsBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientBloodGroupLbl))
                .addGap(20, 20, 20)
                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientDetailsHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientHeightLbl))
                .addGap(20, 20, 20)
                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientDetailsWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientWeightLbl))
                .addGap(20, 20, 20)
                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientBloodPressureLbl)
                    .addComponent(patientDetailsBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientSugarLevelLbl)
                    .addComponent(patientDetailsSugarLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientAllergiesLbl)
                    .addComponent(patientDetailsAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        personPersonalDetails.setBackground(new java.awt.Color(0, 153, 153));
        personPersonalDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 3, 13))); // NOI18N

        patientDetailsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsNameActionPerformed(evt);
            }
        });

        patientNameLbl.setText("Name");

        patientContactLbl.setText("Contact");

        patientPatientIDLbl.setText("Patient ID");

        patientGenderLbl.setText("Gender");

        patientDOBLbl.setText("DOB");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Non-binary", "Prefer not to answer" }));

        javax.swing.GroupLayout personPersonalDetailsLayout = new javax.swing.GroupLayout(personPersonalDetails);
        personPersonalDetails.setLayout(personPersonalDetailsLayout);
        personPersonalDetailsLayout.setHorizontalGroup(
            personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personPersonalDetailsLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personPersonalDetailsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientContactLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientNameLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientDOBLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientGenderLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personPersonalDetailsLayout.createSequentialGroup()
                        .addComponent(patientPatientIDLbl)
                        .addGap(20, 20, 20)))
                .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientDetailsPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientDetailsName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientDetailsContact, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        personPersonalDetailsLayout.setVerticalGroup(
            personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personPersonalDetailsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientDetailsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientNameLbl))
                .addGap(20, 20, 20)
                .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientDetailsContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientContactLbl))
                .addGap(20, 20, 20)
                .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientDetailsPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientPatientIDLbl))
                .addGap(20, 20, 20)
                .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientGenderLbl)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(patientDOBLbl)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        personAddressDetails.setBackground(new java.awt.Color(0, 153, 153));
        personAddressDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 3, 13))); // NOI18N

        patientDetailsHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsHouseActionPerformed(evt);
            }
        });

        patientHouseLbl.setText("House");

        patientStreetLbl.setText("Street");

        patientCommunityLbl.setText("Community");

        patientCityLbl.setText("City");

        patientDetailsCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsCommunityActionPerformed(evt);
            }
        });

        patientZipCodeLbl.setText("Zipcode");

        patientDetailsState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsStateActionPerformed(evt);
            }
        });

        patientStateLbl.setText("State");

        patientDetailsZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsZipCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout personAddressDetailsLayout = new javax.swing.GroupLayout(personAddressDetails);
        personAddressDetails.setLayout(personAddressDetailsLayout);
        personAddressDetailsLayout.setHorizontalGroup(
            personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personAddressDetailsLayout.createSequentialGroup()
                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personAddressDetailsLayout.createSequentialGroup()
                        .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(personAddressDetailsLayout.createSequentialGroup()
                                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(personAddressDetailsLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(patientZipCodeLbl))
                                    .addComponent(patientStateLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(12, 12, 12))
                            .addComponent(patientCityLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(patientDetailsZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientDetailsState, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(personAddressDetailsLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientDetailsCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientDetailsCity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(personAddressDetailsLayout.createSequentialGroup()
                        .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(personAddressDetailsLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(patientStreetLbl)
                                    .addComponent(patientHouseLbl)))
                            .addGroup(personAddressDetailsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(patientCommunityLbl)))
                        .addGap(32, 32, 32)
                        .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientDetailsHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientDetailsStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        personAddressDetailsLayout.setVerticalGroup(
            personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personAddressDetailsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientDetailsHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientHouseLbl))
                .addGap(20, 20, 20)
                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientDetailsStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientStreetLbl))
                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personAddressDetailsLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(patientCommunityLbl)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personAddressDetailsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientDetailsCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personAddressDetailsLayout.createSequentialGroup()
                        .addComponent(patientStateLbl)
                        .addGap(18, 18, 18)
                        .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientZipCodeLbl)
                            .addComponent(patientDetailsZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personAddressDetailsLayout.createSequentialGroup()
                        .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientCityLbl)
                            .addComponent(patientDetailsCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(patientDetailsState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGap(11, 11, 11))
        );

        jLabel1.setText("Patient details");

        jButton2.setText("cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(personPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(personAddressDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(personMedicalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(75, 75, 75))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(564, 564, 564)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(97, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personAddressDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personMedicalDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(485, 485, 485)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(127, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void patientDetailsBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsBloodGroupActionPerformed

    private void patientDetailsWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsWeightActionPerformed

    private void patientDetailsSugarLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsSugarLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsSugarLevelActionPerformed

    private void patientDetailsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsNameActionPerformed

    private void patientDetailsHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsHouseActionPerformed

    private void patientDetailsCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsCommunityActionPerformed

    private void patientDetailsStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsStateActionPerformed

    private void patientDetailsZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsZipCodeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         this.hide();
        patientloggingin lo = new patientloggingin();
        lo.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PatientAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientAllergiesLbl;
    private javax.swing.JLabel patientBloodGroupLbl;
    private javax.swing.JLabel patientBloodPressureLbl;
    private javax.swing.JLabel patientCityLbl;
    private javax.swing.JLabel patientCommunityLbl;
    private javax.swing.JLabel patientContactLbl;
    private javax.swing.JLabel patientDOBLbl;
    private javax.swing.JTextField patientDetailsAllergies;
    private javax.swing.JTextField patientDetailsBloodGroup;
    private javax.swing.JTextField patientDetailsBloodPressure;
    private javax.swing.JTextField patientDetailsCity;
    private javax.swing.JTextField patientDetailsCommunity;
    private javax.swing.JTextField patientDetailsContact;
    private javax.swing.JTextField patientDetailsHeight;
    private javax.swing.JTextField patientDetailsHouse;
    private javax.swing.JTextField patientDetailsName;
    private javax.swing.JTextField patientDetailsPatientID;
    private javax.swing.JTextField patientDetailsState;
    private javax.swing.JTextField patientDetailsStreet;
    private javax.swing.JTextField patientDetailsSugarLevel;
    private javax.swing.JTextField patientDetailsWeight;
    private javax.swing.JTextField patientDetailsZipCode;
    private javax.swing.JLabel patientGenderLbl;
    private javax.swing.JLabel patientHeightLbl;
    private javax.swing.JLabel patientHouseLbl;
    private javax.swing.JLabel patientNameLbl;
    private javax.swing.JLabel patientPatientIDLbl;
    private javax.swing.JLabel patientStateLbl;
    private javax.swing.JLabel patientStreetLbl;
    private javax.swing.JLabel patientSugarLevelLbl;
    private javax.swing.JLabel patientWeightLbl;
    private javax.swing.JLabel patientZipCodeLbl;
    private javax.swing.JPanel personAddressDetails;
    private javax.swing.JPanel personMedicalDetails;
    private javax.swing.JPanel personPersonalDetails;
    // End of variables declaration//GEN-END:variables
}