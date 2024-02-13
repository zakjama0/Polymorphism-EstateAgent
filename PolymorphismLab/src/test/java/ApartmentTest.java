import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApartmentTest {

    Apartment apartment;

    @BeforeEach
    public void setUp(){
        apartment = new Apartment(false, 3, 6,5,2,"Jama", 120224,"Jama","SE18",5,500);
    }

    @Test
    public void checkNewLift(){
        apartment.addLift();
        assertThat(apartment.getNumberOfLifts()).isEqualTo(7);
    }
}
