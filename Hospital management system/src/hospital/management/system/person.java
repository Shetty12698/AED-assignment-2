/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;


/**
 *
 * @author SHREYAS
 */
public class person {
    private String name;
    private double age;
    private patient Patient;
    
    
    public person(String name, double age, patient Patient) {
        this.name = name;
        this.age = age;
        this.Patient = Patient;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public patient getPatient() {
        return Patient;
    }

    public void setPatient(patient Patient) {
        this.Patient = Patient;
    }
    
    
    
    
}
