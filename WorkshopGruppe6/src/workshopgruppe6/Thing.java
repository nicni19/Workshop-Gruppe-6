
package workshopgruppe6;

import java.util.ArrayList;

/**
 *
 * @author Nicos
 */
public abstract class Thing {
    private String name = "Default";
    
    public Thing(String name){
        this.name = name;
    }
    
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
