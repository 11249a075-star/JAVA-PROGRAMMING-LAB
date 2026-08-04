class Animal {
    final void display() {
        System.out.println("this is a final method");
    }
}
class dog extends Animal {
}
public class FinalMethod {
    public static void main(String[] args) {
        dog d=new dog();
        d.display();
    }
} 