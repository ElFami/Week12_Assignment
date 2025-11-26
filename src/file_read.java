import java.io.FileWriter;
import java.io.IOException;

public class file_read {
    public static void main(String[] args) {
        try{
            FileWriter Writer = new FileWriter("myfile.txt");
            Writer.write("Nama saya Eldo");
            Writer.write("Saya dari umn");
            Writer.close();
            System.out.println("Success");
        } catch(IOException e){
            System.out.println("Error bjir");
            e.printStackTrace();
        }
    }
}
