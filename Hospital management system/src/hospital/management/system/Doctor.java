/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

/**
 *
 * @author SHREYAS
 */
public class Doctor {
    private int doctorid;
    private int age;
    private String name;
    private String disease;
    private int number;
    
    
    public Doctor(int doctorid,int age, int number){
       this.doctorid = doctorid;
       this.age = age;
       this.name = name;
       this.disease = disease;
       this.number = number;
       
       
        
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    
    
    
    
}
