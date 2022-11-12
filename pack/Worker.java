package pack;

public class Worker implements Cloneable{
    private String name;
    public int age;
    Worker(String name, int age){
        this.name = name;
        this.age= age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce(){
        System.out.println("Workers name is: "+this.name+" he is number "+ this.age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
