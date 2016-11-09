package hlem;

/**
 * Created by 21607179 on 03/11/2016.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }

    /**
     * j'ai modifié ça
     * modification issues 1
     * @return
     */
    public Object getValue(){
        return value;
    }
    public void setValue(Object value){
        this.value=value;
    }
}
