import java.io.*;
class StreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream out=new FileOutputStream("example.txt");
            out.write("Hello Java".getBytes());
            out.close();
            FileInputStream in=new FileInputStream("example.txt");
            int c;
            while ((c=in.read())!=-1)
                System.out.print((char)c);
            in.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
