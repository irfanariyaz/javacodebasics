public class livingThing {
    // field and method of the parent class
    protected String name;
    public void eat() {
        System.out.println("I can eat");
    }
}
public class Humanbeing extends livingThing {
    public void display() {
        System.out.println("My name is " + name);
    }
}