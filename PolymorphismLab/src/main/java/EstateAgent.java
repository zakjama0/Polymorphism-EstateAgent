import java.util.ArrayList;

public class EstateAgent {
    // Private Variables
    private ArrayList<Property> propertyList;
    private int till;

    //Constructor Function

    public EstateAgent(int inputTill){
        this.propertyList = new ArrayList<>();
        this.till = inputTill;
    }
    // Method
    public void addProperty(Property property){
        propertyList.add(property);
    }

    public int getTill(){
        return this.till;
    }

    public void sellProperty(Property inputProperty){
        propertyList.remove(inputProperty);
        till = till + inputProperty.getPrice();
    }

    public int getListSize(){
        return this.propertyList.size();
    }

}
