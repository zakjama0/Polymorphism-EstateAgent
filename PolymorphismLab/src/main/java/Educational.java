import interfaces.IRoom;

public class Educational implements IRoom {
    private int numberOfWhiteboards;
    private int numberOfRooms;

    public Educational(int inputNumberOfWhiteboards, int inputNumberOfRooms){
        this.numberOfRooms = inputNumberOfRooms;
        this.numberOfWhiteboards = inputNumberOfWhiteboards;
    }


    public int addRoom(int inputNumberOfRoom){
        return numberOfRooms = numberOfRooms + inputNumberOfRoom;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
}
