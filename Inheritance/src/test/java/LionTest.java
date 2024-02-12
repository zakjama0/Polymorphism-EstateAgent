import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LionTest {
    Lion lion;
    @BeforeEach
    public void setUp(){
        lion = new Lion("Simba", false);
    }

    @Test
    public void canMakeNoise(){
        assertThat(lion.makeNoise()).isEqualTo("ROAR!");
    }

//    public void willHeBeKing(){
//        assertThat()
//    }
}
