package projeto.praticaJava.javaPuro.singleton;

//Singleton "apressado"
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();//logo no momento que a variável estática é definida, ele já atribui a instancia

    private SingletonEager() {
    }

    public static SingletonEager getInstancia(){// quando alguém chamar, já estara pronto.
        return instancia;
    }

}
