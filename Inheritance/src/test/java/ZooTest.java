import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ZooTest {
    Zoo zoo;

    @BeforeEach

    public void setUp(){
        zoo = new Zoo();
    }
    @Test
    public void canCountAnimals(){
        assertThat(zoo.countAnimals()).isEqualTo(0);
    }
    @Test
    public void canAddAnimals(){
    // polymorphism
        //A single clas can handle many objects
        Animal animal = new Lion("Simba", false);
        Bird parrot = new Parrot("Zazu"); // you put it to its upper abstract class (Parrot - Bird, Lion - Animal)
        parrot.eat();
        parrot.makeNoise();
        parrot.layEgg();
        zoo.addAnimal(animal);
        zoo.addAnimal(parrot);
        assertThat(zoo.countAnimals()).isEqualTo(2);
    }


}
