/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author SHREYAS
 */
public class Encounter extends VitalSigns{
    
    private Date encounterDate;
    private int encounterID;
    private LocalTime encounterTime;
    public String encDiagnosis;
    public String symptoms;
    
    public Doctor doctor = new Doctor();
    public Patient patient = new Patient();
    
    public Encounter(){
    }
    
    public Encounter(int encounterID, Date encounterDate, LocalTime encounterTime, String name, int patientId, int doctorID){
        this.encounterID =encounterID;
        this.encounterDate =encounterDate;
        this.encounterTime = encounterTime;
        this.doctor.name = name;
        this.name = name;
        this.patientId = patientId;
        this.doctor.doctorID = doctorID;
        
    }
    
    
    public Encounter(int encounterID,int patientId,int doctorID,String name, String emailId,Date encounterDate,LocalTime encounterTime,float bldPressure,float sugarLevel, String allergies, float bodyTemp, float heartRate){
        super( bldPressure, sugarLevel,  allergies,  bodyTemp,  heartRate);
        this.encounterID = encounterID;
        this.encounterDate =encounterDate;
        this.encounterTime = encounterTime;
        this.patient.patientId = patientId;
        this.doctor.doctorID = doctorID;
        this.allergies = allergies;
        this.bldPressure=bldPressure; 
        this.sugarLevel=sugarLevel;
        this.bodyTemp=bodyTemp;
        this.heartRate=heartRate; 
    }
   

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public int getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(int encounterID) {
        this.encounterID = encounterID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalTime getEncounterTime() {
        return encounterTime;
    }

    public void setEncounterTime(LocalTime encounterTime) {
        this.encounterTime = encounterTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getEncDiagnosis() {
        return encDiagnosis;
    }

    public void setEncDiagnosis(String encDiagnosis) {
        this.encDiagnosis = encDiagnosis;
    }



    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
    
    
    
    
    
    
    @Override 
    public String toString(){
        return String.valueOf(encounterID);
    }
    
}
    
