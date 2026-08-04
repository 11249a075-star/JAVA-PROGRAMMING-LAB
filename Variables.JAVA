public class Variables
{
    int instancevar=10;
    static String staticvar="I am static";
    public void showVariables()
    {
        int localvar=5;
        System.out.println("instance variables:" + instancevar);       
        System.out.println("static variables:" + staticvar);
        System.out.println("local variables:" + localvar);
    }
    public static void main(String[] args)
    {
        Variables obj1=new Variables();
        obj1.showVariables();
        System.out.println("Accessing static variable via class:" + Variables.staticvar);
    }
}