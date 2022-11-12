package pack;

public abstract class Human {
    String name;
    int age;
    Human(String name, int age){
        name=name;
        age=age;
    }
    public abstract void Talk();
}
