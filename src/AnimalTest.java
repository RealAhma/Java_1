public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(100, 200);
        cat.swim(5,8);
        cat.setAnimalId();

        Dog dog = new Dog();
        Dog dog1 = new Dog();
        dog.swim(8, 10);
        dog.run(200, 500);
        dog.setAnimalId();
        dog1.swim(510,500);
        dog1.setAnimalId();


    }
}
