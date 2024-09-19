

public class Contador {
    // TO-DO:
            // CASE1:
                // criar variavel com valor de 2000
                // criar variavel com salario pretendido pelo candidato, valor aleatorio
                // criar if para caso o salario base for maior que o salario pretendido.
                    // o if terá a seguinte mensagem: "LIGAR PARA O CANDIDATO"
                // criar um else caso o salario base for igual ao pretendido.
                    // imprima no console: "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA"
                // Criar um outro caso em que nenhum dos casos anteriores forem atendidos
                    // imprima: "AGUARDANDO RESULTADO DEMAIS CANDIDATOS"
            
    public static void main(String[] args) throws Exception {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
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
