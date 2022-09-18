import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o ano de nascimento");
        int anoNascimento = scanner.nextInt();

        System.out.println("digite o mes de nascimento");
        int mesNascimento = scanner.nextInt();
        
        if (mesNascimento > 12) {
            System.out.println("Erro! mês só vai até 12");   
            return; 
        }

        System.out.println("digite o dia de nascimento");
        int diaNascimento = scanner.nextInt();

        int diasdeVida = ((2022 - anoNascimento) * 365) + (mesNascimento * 30) + (30 - diaNascimento);
        System.out.println("dias vividos até hoje: " + diasdeVida);

    }
}