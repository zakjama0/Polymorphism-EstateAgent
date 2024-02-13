import interfaces.IRoom;

public abstract class Residential extends Property implements IRoom {

    private int numberOfToilets;
    protected int numberOfBedrooms;
    private String familyName;
    public Residential(int inputNumberOfBedrooms, int inputNumberOfToilets, String inputFamilyName, int inputDateOfConstruction, String inputOwnerOfBuilding, String inputPostcode, int inputNumberOfRooms, int inputPrice){
        super(inputDateOfConstruction, inputPostcode,  inputPrice, inputOwnerOfBuilding, inputNumberOfRooms);
        this.numberOfBedrooms= inputNumberOfBedrooms;
        this.numberOfToilets = inputNumberOfToilets;
        this.familyName = inputFamilyName;
    }

    //Method
    public void addBedroom( int inputNumberOfRooms){
        numberOfBedrooms = numberOfBedrooms + inputNumberOfRooms;
    }
    public int addRoom( int inputNumberOfRoom){
        return numberOfRooms = numberOfRooms + inputNumberOfRoom;
    }

    // Setters and Getters
    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
