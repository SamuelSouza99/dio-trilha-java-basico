
import java.text.DecimalFormat; // importa o formatador de numeros decimais
import java.util.Random; // Importa o randomizador de numeros
import java.util.Scanner; // importa o scanner

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        //TO-DO: importar classe scanner
        //       mostras mensagens de input no console
        //       obter os valores digitados por meio da classe scanner
        //       Exibir mensagem de conta criada

        Scanner leitor = new Scanner(System.in); // cria um scanner que lê o teclado no terminal
        Random random = new Random(); // cria um randomizador

        System.out.println("Digite o nome da sua agencia: ");
        String nomeAgencia = leitor.next();
        leitor.nextLine();
        System.out.println("Digite o numero da agencia: ");
        String numAgencia = leitor.next();
        leitor.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = leitor.next();

        int numConta = random.nextInt(10000);
        double saldo = random.nextDouble() * 100000;
        DecimalFormat formatador = new DecimalFormat("0.00");
        // Arredonda os valores pra duas casas decimais

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + nomeAgencia + ", conta " + numConta + " e seu saldo R$" + formatador.format(saldo) + " ja esta disponivel para saque!");
    }
}
