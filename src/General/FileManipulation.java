package General;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileManipulation {

    private static Scanner sc = null;
    private static PrintStream saidaPadrao = System.out;
    private static BufferedReader streamEntrada;
    private static PrintStream streamSaida;

    public FileManipulation() {
        try{
            streamEntrada = new BufferedReader(new FileReader("banco.txt"));
            sc = new Scanner(streamEntrada);
            streamSaida = new PrintStream("banco.txt", StandardCharsets.UTF_8);
            System.setOut(streamSaida);
        } catch(Exception e) {
                System.out.println(e.getMessage());
        }
    }

    public static void restauraES() {
        System.setOut(saidaPadrao);
        sc = new Scanner(System.in);
    }

    public static void retornaES() {
        sc = new Scanner(streamEntrada);
        System.setOut(streamSaida);
    }

    public void escreverDados(String texto) {
        System.out.println(texto);
    }

    public void lerDados(String texto) {
        while(sc.hasNextLine()) {
            if(sc.nextLine().contains(texto)) {
            }
        }
    }
}
