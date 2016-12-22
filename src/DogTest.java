import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by awei on 12/22/16.
 */


public class DogTest {

    private Dog dog;

    @BeforeClass
    public void createDog() {
        dog = new Dog("Jeff", "Terrier");
    }

    @Test
    public void testAge() {
        dog.setAge(5);
        int age = dog.getAge();
        Assert.assertEquals(age, 5);
    }

    @Test
    public void testGetters() {
        String name = dog.getName();
        Assert.assertEquals(name, "Jeff");
        String breed = dog.getBreed();
        Assert.assertEquals(breed, "Terrier");
    }

    @Test
    public void testBark() {
        String woof = dog.bark();
        Assert.assertEquals(woof, "Woof");
    }

}
