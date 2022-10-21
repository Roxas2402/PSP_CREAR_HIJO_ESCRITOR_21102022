package com.cieep;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String ficheroName = scanner.nextLine();

        File fichero = new File(ficheroName);
        PrintWriter pw = new PrintWriter(fichero);

        String linea;

        while (!(linea = scanner.nextLine()).isEmpty()) {
            pw.println(linea);
        }

        pw.close();

    }
}