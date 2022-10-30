/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

/**
 *
 * @author SHREYAS
 */
public class Patient extends Person{
    
    

    public int patientId;
    public float patientWeight;
    public float patientHeight;
    public String Bloodgroup;
    public String patientPassword;
    public String patientRePassword;
    
    public Patient(String name, int age, long contactDetails, String emailId, String gender,String state, String houseNumber, String streetName,  int zip, String cityName, String communityName, String password, int patientId, float patientWeight,float patientHeight, String Bloodgroup, String patientPassword,String patientRePassword){
        super( name,  age,  contactDetails,  emailId,  gender, state,  houseNumber,  streetName,   zip,  cityName,  communityName,  password);
          this.patientId = patientId;
          this.patientWeight = patientWeight;
          this.patientHeight = patientHeight;
          this.Bloodgroup = Bloodgroup;
          this.patientPassword = patientPassword;
          this.patientRePassword= patientRePassword;
          
    
    
}
    


    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public float getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(float patientWeight) {
        this.patientWeight = patientWeight;
    }

    public float getPatientheight() {
        return patientHeight;
    }

    public void setPatientheight(float patientheight) {
        this.patientHeight = patientheight;
    }

    public String getBloodgroup() {
        return Bloodgroup;
    }

    public void setBloodgroup(String Bloodgroup) {
        this.Bloodgroup = Bloodgroup;
    }

    

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public String getPatientRePassword() {
        return patientRePassword;
    }

    public void setPatientRePassword(String patientRePassword) {
        this.patientRePassword = patientRePassword;
    }
    
    public Patient(){
    }
    
    
    
    @Override
    public String toString(){
        return String.valueOf(patientId);
    }
    
}
    
    
        
    
    
    
       
    
    

