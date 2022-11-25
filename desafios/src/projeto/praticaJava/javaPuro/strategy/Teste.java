package projeto.praticaJava.javaPuro.strategy;

public class Teste {
    public static void main(String[] args) {
         /*Testes relacionados ao Strategy:
         Simplificar a variação de algoritmos para a resolução de um mesmo problema.*/

        Comportamento normal= new ComportamentoNormal();
        Comportamento defensivo= new ComportamentoDefensivo();
        Comportamento agressivo= new ComportamentoAgressivo();

        Robo robo= new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

    }
}
