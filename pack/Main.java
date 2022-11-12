package pack;

import java.util.*;

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


        HashMap<String, String> capitals = new HashMap<String, String>();
        capitals.put("England", "London");
        capitals.put("Norway","Oslo");
        System.out.println(capitals);
        System.out.println(capitals.size());
        System.out.println(capitals.get("Norway"));



//        User Input
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: "+userName);






    }
}