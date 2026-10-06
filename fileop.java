import java.io.*;
public class fileop {
    public static void main(String[] args) {
        String filename="example.txt";
        try {
            FileWriter writer=new FileWriter(filename);
            writer.write("hello thereeeeee....\n");
            writer.write("this is file operations programs");
            writer.close();
            FileReader reader=new FileReader(filename);
            int character;
            while ((character=reader.read())!=-1) {
                System.out.print((char) character);
            }
            reader.close();
        }catch (IOException e) {
            System.out.print("an error occured:"+e.getMessage());
        }
    }
}
