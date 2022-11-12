package pack;

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

//        final class Library extends Building{
//
//        }
//
//        class SchholLibrary extends Library{
//
//        }
//
//
//        Library lib = new Library();
//        lib.build();
//        SchholLibrary sclib = new SchholLibrary();
//        sclib.build();

        Pig mypig = new Pig();
        mypig.animalSound();

        Teacher myt = new Teacher();
        myt.Talk();



    }
}