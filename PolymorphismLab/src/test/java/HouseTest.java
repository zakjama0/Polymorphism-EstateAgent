import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HouseTest {
    House house;

    @BeforeEach
    public void setUp(){
        house = new House(2,5,2,"Jama", 120224,"Jama","SE18",5,500);
    }

    @Test
    public void checkNewFloor(){
        house.addFloor();
        assertThat(house.getNumberOfFloors()).isEqualTo(3);
    }
    @Test
    public void checkNewRooms(){
        house.addRoom(3);
        assertThat(house.getNumberOfRooms()).isEqualTo(8);
    }

}
