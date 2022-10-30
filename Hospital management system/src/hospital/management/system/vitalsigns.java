/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

/**
 *
 * @author SHREYAS
 */




public class VitalSigns extends Patient {
    public float bldPressure;
    public float sugarLevel;
    public String allergies;
    public float bodyTemp;
    public float heartRate;
    
    
    
    public VitalSigns(){
    }
    
    public VitalSigns(String name, int patientId){
    
    this.name = name;
    this.patientId = patientId;
    }
    
  
    
    public VitalSigns(float bldPressure,float sugarLevel, String allergies, float bodyTemp, float heartRate){
        this.bldPressure = bldPressure;
        this.sugarLevel = sugarLevel;
        this.allergies = allergies;
        this.bodyTemp = bodyTemp;
        this.bodyTemp = bodyTemp;
    }
    
    

    public float getBldPressure() {
        return bldPressure;
    }

    public void setBldPressure(float bldPressure) {
        this.bldPressure = bldPressure;
    }

    public float getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(float sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public float getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(float bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }
    
    
    
}

