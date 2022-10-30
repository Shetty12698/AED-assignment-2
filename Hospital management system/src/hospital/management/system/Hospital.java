/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

/**
 *
 * @author SHREYAS
 */
public class Hospital {
     public String hospitalName;
    public int hospitalLincenseNumber;
    public int hospitalWard;
    public String hospitalAddress;
    
    public Community community = new Community();
    public House residence = new House();
    
    public Hospital(){
    }
    
    public Hospital(String cityName, String state, String communityName){
        this.community.cityName =cityName;
        this.community.state = state;
        this.community.communityName = communityName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getHospitalLincenseNumber() {
        return hospitalLincenseNumber;
    }

    public void setHospitalLincenseNumber(int hospitalLincenseNumber) {
        this.hospitalLincenseNumber = hospitalLincenseNumber;
    }

    public int getHospitalWard() {
        return hospitalWard;
    }

    public void setHospitalWard(int hospitalWard) {
        this.hospitalWard = hospitalWard;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    
    
    @Override 
    public String toString(){
        return String.valueOf(hospitalLincenseNumber);
    }
    
}
