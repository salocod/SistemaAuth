package General;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileManipulation {

    private Scanner sc = null;
    private PrintStream saidaPadrao = System.out;

    public FileManipulation() {
        try{
            BufferedReader streamEntrada = new BufferedReader(new FileReader("entrada.txt"));
            sc = new Scanner(streamEntrada);
            PrintStream streamSaida = new PrintStream("saida.txt", StandardCharsets.UTF_8);
            System.setOut(streamSaida);
        } catch(Exception e) {
                System.out.println(e.getMessage());
        }
    }

    public void restauraES() {
        System.setOut(saidaPadrao);
        sc = new Scanner(System.in);
    }

}
