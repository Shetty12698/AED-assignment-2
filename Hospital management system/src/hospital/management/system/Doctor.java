/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

/**
 *
 * @author SHREYAS
 */
public class Doctor extends Person{
    
    public int doctorID;
    private String qualification;
    private String specialization;
    private int slotsAvailable;
    public Hospital hospital = new Hospital();
    
    public Doctor(){
    }
    
    public Doctor(String name, int age, long contactDetails, String emailId, String gender,String state, String houseNumber, String streetName, int zip, String cityName, String communityName, String password, int doctorID, String hospitalName, String qualification, String specialization, int slotsAvailable){
        super(name, age, contactDetails, emailId, gender, state, houseNumber, streetName, zip, cityName,communityName, password);
        this.doctorID = doctorID;
        this.hospital.hospitalName = hospitalName;
        this.qualification = qualification;
        this.specialization = specialization;
        this.slotsAvailable = slotsAvailable;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getSlotsAvailable() {
        return slotsAvailable;
    }

    public void setSlotsAvailable(int slotsAvailable) {
        this.slotsAvailable = slotsAvailable;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    @Override
    public String toString(){
        return String.valueOf(doctorID);
    }
    
    
}