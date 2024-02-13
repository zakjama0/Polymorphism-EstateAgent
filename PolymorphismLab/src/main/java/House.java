public class House extends Residential{
    private int numberOfFloors;

    public House(int inputNumberOfFloors, int inputNumberOfBedrooms, int inputNumberOfToilets, String inputFamilyName, int inputDateOfConstruction, String inputOwnerOfBuilding, String inputPostcode, int inputNumberOfRooms, int inputPrice){
        super(inputNumberOfToilets, inputNumberOfBedrooms,  inputFamilyName,  inputDateOfConstruction,  inputOwnerOfBuilding,  inputPostcode,  inputNumberOfRooms,  inputPrice);
        this.numberOfFloors = inputNumberOfFloors;
    }

    public void addFloor(){
        numberOfFloors = numberOfFloors +1;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
}
