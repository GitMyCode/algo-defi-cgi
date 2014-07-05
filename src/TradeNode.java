/**
 * Created by MB on 7/1/14.
 */
public class TradeNode {

    private String id;
    private String group;
    private int value;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }



    public TradeNode(String line){
        String[] splits = line.split(",");
        id = splits[0];
        group = splits[1];
        value = Integer.parseInt(splits[2]);
    }


    public String toString(){
       return this.getId()+","+this.getGroup()+","+this.getValue();
    }
}
