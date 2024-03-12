// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    Dog doggy = new Dog("Tyson", 5, "Gray");
    doggy.speak();

    Cat kitty = new Cat("Garfield", 8, "Oragne");
    kitty.speak();
        System.out.println(doggy);
        System.out.println(kitty);

    }
}

abstract class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract public void speak();


}

class Dog extends Animal{
    private String furColor;

    public Dog(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "furColor='" + furColor + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("Woof");
    }

}
class Cat extends Animal{
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}