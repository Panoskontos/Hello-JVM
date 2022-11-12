package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

// class
public class Main {
//    method
    public static void main(String[] args) {

        class Pig implements Animal {
            @Override
            public void animalSound() {
                System.out.println("wee wee");
            }
        }

        class Lizard implements Animal {
            @Override
            public void animalSound() {
                System.out.println("sssss");
            }
        }


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Benzo");
        System.out.println(cars);
        System.out.println(cars.set(0,"Opel"));
        cars.remove(0);
        System.out.println(cars.size());

        for (String car : cars) {
            System.out.println(car);
        }

        Pig mypig = new Pig();
        mypig.animalSound();

        Worker w1 = new Worker("Juan", 19);
        w1.introduce();
        System.out.println(w1.getName());

        try{
            Worker w2 = (Worker) w1.clone();
            w2.introduce();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }








    }
}