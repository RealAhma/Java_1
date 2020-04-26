public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public Dog() {

    }

    @Override
    public void run(int distance, int limit) {
        if (distance > limit){
            System.out.println("I can not run more, i am so tired");
        }else {
            System.out.println("Dog run " + distance);
        }
    }

    @Override
    public void swim(int distance, int limit) {
        if (distance > limit){
            System.out.println("I can not swim more, i am so tired");
        }else {
            System.out.println("Dog swam " + distance);
        }
    }

    @Override
    public void setAnimalId() {
        int id = 0;
        id++;
        System.out.println("Dog id " + id);
    }
}
