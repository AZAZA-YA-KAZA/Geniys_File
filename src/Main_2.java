import java.io.*;
import java.util.Scanner;
public class Main_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("imput.txt");
        File output = new File("output.txt");
        File first = new File("first.txt");
        //считать инф хотим
        /*try{
            FileInputStream fis = new FileInputStream(file);
            int c;
            while ((c = fis.read()) != -1){
                System.out.println(c + " ");
            }
        }*/
        Scanner in = null;
        PrintWriter writer;
        in = new Scanner(file);
        int dl = 0;
        while (in.hasNextInt()) {
            dl++;
            in.nextInt();
        }
        try{
            int k = 0;
            in = new Scanner(file);
            writer = new PrintWriter(first);
            while (k != (dl / 2)/*in.hasNextInt() */) {
                k++;
                writer.print(in.nextInt() + " ");
            }
            writer.close();
            writer = new PrintWriter(output);
            while (in.hasNextInt()) {
                writer.print(in.nextInt() + " ");
            }
            in = new Scanner(first);
            while (in.hasNextInt()) {
                writer.print(in.nextInt() + " ");
            }
            in.close();
            writer.close();
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
