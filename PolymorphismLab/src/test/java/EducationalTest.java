import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EducationalTest {
    Educational educational;

    @BeforeEach

    public void set(){
        educational = new Educational(5,6);
    }

    //Testing interface
    @Test
    public void canAddRoom(){
        educational.addRoom(3);
        assertThat(educational.getNumberOfRooms()).isEqualTo(9);
    }

}
