package General;
import java.util.Random;
import java.util.Scanner;

public class Authentication {

    private Scanner sc = new Scanner(System.in);
    private int counter = 1;
    private boolean captcha;

    public Authentication() {
        executa();
    }

    public void executa() {
        try {
        menu();
        int opcao = sc.nextInt();
        while (opcao!=0) {
        switch(opcao) {
            case 1:
            TwoFactorAuth();
                break;
            default:
                break;
            }
        menu();
        opcao = sc.nextInt();
        }
        } catch(Exception e) {

        }
    }

    public void TwoFactorAuth() {
        int cont = 0;
        char[] letters = new char[5];
        String allUpper = "ABCDEFHIJKLMNOPQRSTUVWXYZabcdefghijklmopqrstuvwxyz0123456789";

        for (int i = 0; i < letters.length; i++) {
            letters[i] = allUpper.charAt(new Random().nextInt(allUpper.length()));
        }
        System.out.println("Iniciando captcha... \n");

        for (int i = 0; i < letters.length; i++) {
            if(cont == counter-1) {
                String cap = Character.toString(letters[i]);
                System.out.println("Insira a letra correta: ");
                System.out.println(cap);
                String x = sc.next();
                if(x.equals(cap)) {
                    counter++;
                    cont++;
                    captcha = true;
                } else {
                    System.out.println("Captcha invalido! Tente novamente!\n");
                    TwoFactorAuth();
                }
                System.out.println("Autenticado " + (i+1) + "/5");
            }
        }
    }

    private void menu() {   
        System.out.println("-------------------------");
        System.out.println("Selecione sua opcao!");
        System.out.println("[1] Iniciar o captcha! [" + getBoolean(captcha) + "]");
        System.out.println("[0] Finalizar o programa");
    }

    public String getBoolean(boolean b) {if(b) return "V"; else return "X";}

}