import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EstateAgentTest {
    EstateAgent estateAgent;
    House house;

    @BeforeEach
    public void setup(){
        estateAgent = new EstateAgent(0);
       house = new House(2,5,2,"Jama", 120224,"Jama","SE18",5,500);
    }
    @Test
    public void checkAddProperty(){
        estateAgent.addProperty(house);
        assertThat(estateAgent.getListSize()).isEqualTo(1);
    }
    @Test
    public void propertyBought(){
        estateAgent.addProperty(house);
        estateAgent.sellProperty(house);
        assertThat(estateAgent.getTill()).isEqualTo(500);
        assertThat(estateAgent.getListSize()).isEqualTo(0);
    }







}
