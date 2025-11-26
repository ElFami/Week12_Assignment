import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_write {
    public static void main(String[] args) {
        try{
            File Obj = new File("myfile.txt");
            Scanner Reader = new Scanner(Obj);
            while(Reader.hasNextLine()){
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
