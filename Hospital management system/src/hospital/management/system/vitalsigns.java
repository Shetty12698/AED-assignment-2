/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

/**
 *
 * @author SHREYAS
 */



import java.text.SimpleDateFormat;
import java.util.Date;
public class vitalsigns {
    private double temperature;
    private int pulse;
    private int respirationrate;
    private double sp02;
    private double bmi;
    private String Generated;
    private String Modified;
    
    public vitalsigns ( double temperature, int pulse, int respirationrate, double sp02, double bmi){
       this.temperature = temperature;
       this.pulse = pulse;
       this.respirationrate = respirationrate;
       this.sp02 = sp02;
       this.bmi = bmi;
       this.Generated = formatDate(new Date());
       this.Modified = formatDate(new Date());
       
    }
    
    public vitalsigns() {
        
    }
    private String formatDate(Date date){
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat  simpleDateFormat = new SimpleDateFormat (pattern);
        return simpleDateFormat.format(date);
        
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getRespirationrate() {
        return respirationrate;
    }

    public void setRespirationrate(int respirationrate) {
        this.respirationrate = respirationrate;
    }

    public double getSp02() {
        return sp02;
    }

    public void setSp02(double sp02) {
        this.sp02 = sp02;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getGenerated() {
        return Generated;
    }

    public void setGenerated(String Generated) {
        this.Generated = Generated;
    }

    public String getModified() {
        return Modified;
    }

    public void setModified(String Modified) {
        this.Modified = Modified;
    }
    
    
}

