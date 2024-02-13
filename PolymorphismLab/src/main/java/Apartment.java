public class Apartment extends Residential {
    private boolean Studio;
    private int locationInBuilding;
    private int numberOfLifts;

    public Apartment(boolean inputStudio, int inputLocationInBuilding, int inputNumberOfLifts, int inputNumberOfBedrooms, int inputNumberOfToilets, String inputFamilyName, int inputDateOfConstruction, String inputOwnerOfBuilding, String inputPostcode, int inputNumberOfRooms, int inputPrice){
        super(inputNumberOfToilets, inputNumberOfBedrooms,  inputFamilyName,  inputDateOfConstruction,  inputOwnerOfBuilding,  inputPostcode,  inputNumberOfRooms,  inputPrice);
        this.Studio = inputStudio;
        this.locationInBuilding = inputLocationInBuilding;
        this.numberOfLifts = inputNumberOfLifts;
    }

    public void addLift(){
        numberOfLifts = numberOfLifts +1;
    }
    public int getNumberOfLifts(){
        return this.numberOfLifts;
    }
}
