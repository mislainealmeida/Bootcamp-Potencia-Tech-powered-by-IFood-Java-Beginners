package projeto.praticaJava.javaPuro.strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
