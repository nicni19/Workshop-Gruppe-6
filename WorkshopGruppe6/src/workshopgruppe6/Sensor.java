
package workshopgruppe6;

/**
 *
 * @author Nicos
 */
public abstract class Sensor extends Thing {
    private int value = 0;
    

    public Sensor(String name, int value){
        setName(name);
        this.value = value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
    

    @Override
    public String toString(){
        return "Invalid object type";
    }
}
