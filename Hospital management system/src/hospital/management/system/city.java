/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SHREYAS
 */
public class city extends modificationinfo {
    private cityname cityName;
    
    private List<community> communities;

    public City(cityname cityName, List<community> communities, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.cityName=cityName;
        this.communities=communities;
    }
    
    public cityname getCityName() {
        return cityName;
    }

    public void setCityName(cityname cityName) {
        this.cityName = cityName;
    }
    
    public List<community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<community> communities) {
        this.communities = communities;
    }    

    @Override
    public String toString() {
        return cityName.name();
    }
    
}

    
    
        

   

   
    

