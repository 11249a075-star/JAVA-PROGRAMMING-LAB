class employee {
    void work() {
        System.out.println("employee works");
    }
}
class manager extends employee {
    void manage() {
        System.out.println("manager manages the team");
    }
}
public class hierarchialinheritance {
    public static void main(String[] args) {
        manager m = new manager();
        m.work();    
        m.manage();  
    }
}

