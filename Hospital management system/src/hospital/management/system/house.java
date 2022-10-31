/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;
import java.util.ArrayList;

/**
 *
 * @author SHREYAS
 */
public class House extends Community{
    
    public String houseNumber;
    public int zip;
    String streetName;
    
    
    public House(String cityName, String state, String communityName, String houseNumber, String streetName, int zip){
        super(cityName, state, communityName);
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.zip = zip;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    
    public String validateHouse(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = "House No cannot be empty! \n";
        } else if (name.length() < 2 || name.length() > 30) {
            isValid = "House No must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!name.matches("[0-9]{1,4}")) {
            isValid = "Invalid House No Field! \n";
        }else if (name.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
    
    public House(){
}
    
    
}
    
    
    

