import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CorperateTest {
    Corperate corperate;

    @BeforeEach
    public void setUp(){
        corperate = new Corperate(5,6,"Bright Network",120224,"Jama","SE18",5,500);
    }

    @Test
    public void checkNewOffice(){
        corperate.addOffice();
        assertThat(corperate.getNumberOfOffices()).isEqualTo(6);
    }

    @Test
    public void checkNewComputer(){
        corperate.addComputer();
        assertThat(corperate.getNumberOfComputer()).isEqualTo(7);
    }
}
