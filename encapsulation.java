class A{
    private int a;
    A(int a){
        this.a = a;
    }
    A(){
        
    }
    public int geta(){
        return a;
    }
    public void seta(int a){
        this.a = a;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.geta());
        obj.seta(12);
        System.out.println(obj.geta());
        
        
    }
}
