package General;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PasswordCreate {

    private Scanner sc;
    private String auth = "uA1j34K10lk";

    public PasswordCreate() {
        try {
			BufferedReader streamEntrada = new BufferedReader(new FileReader("entrada.txt"));
			sc = new Scanner(streamEntrada);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        executa();
    }

    public void executa() {
        String senha = sc.nextLine();
        if(auth.equals(senha)) {
            System.out.println("Voce foi atuenticado com sucesso!");
            Usuario.changeLog();
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    



}