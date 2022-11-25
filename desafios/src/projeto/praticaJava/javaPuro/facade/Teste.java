package projeto.praticaJava.javaPuro.facade;

public class Teste {
    public static void main(String[] args) {
        /*Testes relacionados ao Facede:
        Prover uma interface que reduza a complexidade nas integrações com subsistemas.*/

        Facade facade = new Facade();
        facade.migrarCliente("Mislaine", "11111-000");

    }
}
