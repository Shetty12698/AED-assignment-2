/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

import java.util.Date;


/**
 *
 * @author SHREYAS
 */
public class Person {
    
    public String name;
    public int age;
    public long contactDetails;
    public String emailId;
    public String gender;
    public int personId;
    public String password;
    public Date date;
    

    
    
    public House residence = new House();
    public Hospital hospital = new Hospital();
    
    
    public Person(){
    }
    
    public Person(String name, int age, long contactDetails, String emailId, String gender,String state, String houseNumber, String streetName,  int zip, String cityName, String communityName, String password){
        this.name = name;
        this.contactDetails = contactDetails;
        this.emailId = emailId;
        this.gender = gender;
        this.residence.houseNumber = houseNumber;
        this.residence.streetName = streetName;
        this.residence.state = state;
        this.residence.communityName= communityName;
        this.residence.cityName = cityName;
        this.residence.zip = zip;
        this.password = password;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(long contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}

