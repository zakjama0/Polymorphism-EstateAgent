public class Property {
    // Private Variables
    private int dateOfContruction ;
    private String ownerOfBuilding;

    private String postcode;
    private int numberOfRooms ;
    private int price;

    // Constructor Function
    public Property(int inputDateOfConstruction, String inputOwnerOfBuilding, String inputPostcode, int inputNumberOfRooms, int inputPrice){
        this.numberOfRooms = inputNumberOfRooms;
        this.ownerOfBuilding = inputOwnerOfBuilding;
        this.postcode = inputPostcode;
        this.dateOfContruction = inputDateOfConstruction;
        this.price = inputPrice;
    }

    // Setters and Getters
    public String getPostcode(){
        return this.postcode;
    }


}
