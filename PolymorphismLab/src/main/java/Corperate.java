import interfaces.IRoom;

public class Corperate extends Property implements IRoom {
    private int numberOfOffices;
    private int numberOfComputer;
    private String nameOfCompany;

    public Corperate(int inputNumberOfOffices, int inputNumberOfComputer, String inputNameOfCompany, int inputDateOfConstruction, String inputOwnerOfBuilding, String inputPostcode, int inputNumberOfRooms, int inputPrice){
        super(inputDateOfConstruction, inputPostcode,  inputPrice, inputOwnerOfBuilding, inputNumberOfRooms);
        this.nameOfCompany=inputNameOfCompany;
        this.numberOfComputer = inputNumberOfComputer;
        this.numberOfOffices = inputNumberOfOffices;
    }

    public void addOffice(){
        numberOfOffices = numberOfOffices + 1;
    }

    public  int addRoom( int inputNumberOfRoom){
        return numberOfRooms = numberOfRooms + inputNumberOfRoom;
    }

    public void addComputer(){
        numberOfComputer = numberOfComputer +1;
    }

    public int getNumberOfOffices() {
        return numberOfOffices;
    }

    public int getNumberOfComputer() {
        return numberOfComputer;
    }
}
