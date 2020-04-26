public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public Cat() {

    }

    @Override
    public void run(int distance, int limit) {
        if (distance > limit){
            System.out.println("I can not run more, i am so tired");
        }else {
            System.out.println("Cat run " + distance);
        }
    }

    @Override
    public void swim(int distance, int limit) {
        System.out.println("Hey, man, i can not swim, i am a cat");
    }

    @Override
    public void setAnimalId() {
        int id = 0;
        id++;
        System.out.println("Cat id " + id);
    }
}
