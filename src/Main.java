import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ficheroName = scanner.nextLine();

        File fichero = new File(ficheroName);
        PrintWriter pw = new PrintWriter(fichero);

        String linea;
    }
}