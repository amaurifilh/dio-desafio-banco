import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        double saldo = 0.00;
    
        try (Scanner Scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Bem Vindo ao seu Banco");
            System.out.println("1 - Acessar a contar");
            System.out.println("2 - SAIR");
            int acesso = Scanner.nextInt();

            if(acesso == 1){
                System.out.println("Digite seu Nome");
                String nomeCliente = Scanner.next();

                System.out.println("Digite sua Agencia");
                String agencia = Scanner.next();

                System.out.println("Digite sua Conta");
                int numero = Scanner.nextInt();

                System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque");
            }
            else{
                System.out.println("Obrigado!");
            }
        }        
    }
}
