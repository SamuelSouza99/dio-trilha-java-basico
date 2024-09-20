import java.util.Scanner; // importa o scanner

class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException(String mensagem){
		super(mensagem); // cria a mensagem e exceção
	}
}

public class contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parametro");
		int parametroUm = terminal.nextInt(); // input 1
		System.out.println("Digite o segundo parametro");
		int parametroDois = terminal.nextInt(); // input 2
		
		try {
			if (parametroUm > parametroDois) {
				throw new ParametrosInvalidosException("O segundo parametro deve ser maior do que o primeiro parâmetro."); // valor da mensagem anteriormente criada
			}
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage()); // obtem a mensagem
		} finally {
			terminal.close(); // finaliza o terminal
		}
	}
	static void contar(int parametroUm, int parametroDois) {
		for (int c = parametroUm; c <= parametroDois; c++){
			System.out.println("Imprimindo o numero: " + c);
		}
	}
}