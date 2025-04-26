import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileError {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistancefile.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("Program continues after exception");
    }
}
