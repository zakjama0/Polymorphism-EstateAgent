public abstract class Property {
    // Private Variables
    private int dateOfConstruction ;
    private String ownerOfBuilding;

    private String postcode;
    private int numberOfRooms;
    private int price;

    // Constructor Function
    public Property(int inputDateOfConstruction, String inputPostcode, int inputPrice, String inputOwnerOfBuilding, int inputNumberOfRooms){
        this.ownerOfBuilding = inputOwnerOfBuilding;
        this.postcode = inputPostcode;
        this.dateOfConstruction = inputDateOfConstruction;
        this.price = inputPrice;
        this.numberOfRooms = inputNumberOfRooms;
    }

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

    public void addRoom(){
        numberOfRooms = numberOfRooms + 1;
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
