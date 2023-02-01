class animal{
    public void legs(){
        System.out.println("I have 4 legs");
    }        
}
class dog extends animal{
    public void bark(){
        System.out.println("Bark...");
    }
}
class cheetah extends animal{
    public void run(){
        System.out.println("running...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // animal an = new animal();
        // an.legs();

        // dog dg = new dog();
        // dg.bark();
        // dg.legs();

        cheetah ch = new cheetah();
        ch.run();
    }
}
