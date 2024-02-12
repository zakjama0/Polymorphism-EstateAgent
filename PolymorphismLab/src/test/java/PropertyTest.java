import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PropertyTest {
    Property property;

    @BeforeEach
    public void setUp(){
        property = new Property(17072001, "Zakaria","SE18", 5, 100000);
    }


    @Test
    public void hasPostCode(){
        assertThat(property.getPostcode()).isEqualTo("SE18");
    }


    public void hasPostcode(){

    }

}
