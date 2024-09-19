import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {           
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"JORGE", "CARLOS", "LUIS", "FERNANDO", "CHARLES", "MAX", "ALEX", "SÉRGIO", "OSCAR", "KEVIN"};
        for(String candidato: candidatos){
            entrandoContato(candidato);
        }
    }

    static void entrandoContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM O " + candidato + " NA " + tentativasRealizadas + " TENTATIVA(S)!");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"JORGE", "CARLOS", "LUIS", "FERNANDO", "CHARLES", "MAX", "ALEX", "SÉRGIO", "OSCAR", "KEVIN"};

        System.out.println("Imprimindo lista de candidatos, informando o indice de cada elemento...");

        for(String candidato: candidatos){
            System.out.println("Candidatos disponíveis: " + candidato);
        }

        for(int indice = 0; indice <candidatos.length; indice++){
            System.out.println("O candidato de N# " + (indice+1) + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"JORGE", "CARLOS", "LUIS", "FERNANDO", "CHARLES", "MAX", "ALEX", "SÉRGIO", "OSCAR", "KEVIN"}; 

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " soliciotou um salário no valor de " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado.");
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Método com o salário pretendido pelo candidato e seus respectivos testes:
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println( "AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }
}
