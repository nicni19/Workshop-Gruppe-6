
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopgruppe6;

import java.util.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author tes_7
 */
public class Thing {
    


/**
 *
 * @author Nicos
 */

    private String name;
    
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void listToString(ArrayList<Thing> list){
        for(Thing t : list){
            t.toString();
            System.out.println("/n");
        }
    }

}

