/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SHREYAS
 */
public class city {
    private String cityName;
    
    private ArrayList<community> Communities;
    
    public city(String cityname, ArrayList<community> Communities) {
        this.cityName = cityName;
        this.Communities = Communities;
    }        
        public city(String cityName) {
            this.cityName = cityName;
            this.Communities = new ArrayList<community>();
        }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
        

   

    public ArrayList<community> getCommunities() {
        return Communities;
    }
     public void addcommunity(community Community){
        this.Communities.add(Community);
         
     }
     public void addCommunities(ArrayList<community> Communities){
         this.Communities.addAll(Communities);
         
     }
     public void setCommunities(ArrayList<community> communities) {
         this.Communities = Communities;
         
     }
        }
    

