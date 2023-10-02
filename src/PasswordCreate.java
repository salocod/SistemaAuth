import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class PasswordCreate {

    private Scanner sc = null;
    private PrintStream saidaPadrao = System.out;

    private String auth = "negotonio";
    private boolean autorizado = false;

    public PasswordCreate() {
        try {
			BufferedReader streamEntrada = new BufferedReader(new FileReader("entrada.txt"));
			sc = new Scanner(streamEntrada);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void executa() {
        String senha = sc.nextLine();
        if(auth.equals(senha)) {
            autorizado = true;
            System.out.println("Toninho da massa");
        } else {
            System.out.println("Senha incorreta!");
        }
    }



}