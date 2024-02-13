import interfaces.IRoom;

public abstract class Property implements IRoom {
    // Private Variables
    private int dateOfConstruction ;
    private String ownerOfBuilding;

    private String postcode;
    protected int numberOfRooms;
    private int price;

    // Constructor Function
    public Property(int inputDateOfConstruction, String inputPostcode, int inputPrice, String inputOwnerOfBuilding, int inputNumberOfRooms){
        this.ownerOfBuilding = inputOwnerOfBuilding;
        this.postcode = inputPostcode;
        this.dateOfConstruction = inputDateOfConstruction;
        this.price = inputPrice;
        this.numberOfRooms = inputNumberOfRooms;
    }

    // Abstract Method
    public  abstract int addRoom( int inputNumberOfRoom);

    // Setters and Getters
    public String getPostcode(){
        return this.postcode;
    }

    public int getPrice(){
        return this.price;
    }

    public void setDateOfConstruction(int inputDayOfConstruction){
        this.dateOfConstruction = inputDayOfConstruction;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getDateOfConstruction() {
        return dateOfConstruction;
    }

    public String getOwnerOfBuilding() {
        return ownerOfBuilding;
    }

    public void setOwnerOfBuilding(String ownerOfBuilding) {
        this.ownerOfBuilding = ownerOfBuilding;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
