import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("file1.txt", false)) {
            String text = "Привет, читатель!";
            writer.write(text);
            writer.append('\n');
            writer.append("Первая запись в 1 файле!");
            writer.append('\n');
            writer.append("Вторая запись в 1 файле!");
            writer.close();

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("file2.txt")) {

            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}