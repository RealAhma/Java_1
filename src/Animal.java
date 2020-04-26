public class Animal {
    String name;

    public Animal (String name){

    }

    public Animal() {

    }

    public void run(int distance, int limit){
        if (distance > limit){
            System.out.println("I can not run more, i am so tired");
        }else {
            System.out.println("Animal run " + distance);
        }
    }

    public void swim(int distance, int limit){
        if (distance > limit){
            System.out.println("I can not swim more, i am so tired");
        }else {
            System.out.println("Animal swam " + distance);
        }
    }
    public void setAnimalId(){
        int id = 0;
        id = 0;
        id++;
    }
}

















