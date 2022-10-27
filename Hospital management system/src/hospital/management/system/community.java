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
public class community {
    private String communityname;
    private ArrayList<house> communityhouses;
    
    public community(String communityname, ArrayList<house> communityhouses) {
        this.communityname = communityname;
        this.communityhouses =  communityhouses;
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname;
    }

    public ArrayList<house> getCommunityhouses() {
        return communityhouses;
    }

    public void setCommunityhouses(ArrayList<house> communityhouses) {
        this.communityhouses = communityhouses;
    }

    
}
    
  
    

