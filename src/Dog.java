/**
 * Created by awei on 12/22/16.
 */
public class Dog {
    String name, breed;
    int age;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String bark() {
        System.out.println("Woof");
        return "Woof";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}
