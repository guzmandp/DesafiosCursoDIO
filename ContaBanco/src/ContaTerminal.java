import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        //Importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        /*
        ** Exibir as mensagens para o nosso usuario
        ** Obter pela scanner os valores digitados no terminal 
        */

        System.out.println("Por favor, digite seu número de conta: ");
        int numeroDeConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite seu nome: ");
        String NomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite seu saldo disponivel: ");
        double saldo = scanner.nextInt();

        //Exibir a mensagem conta criada
        
        System.out.println("Ola, " + NomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta: " + numeroDeConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }

}