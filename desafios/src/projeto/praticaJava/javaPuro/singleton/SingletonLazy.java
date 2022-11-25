package projeto.praticaJava.javaPuro.singleton;

//singleton "preguiçoso"
public class SingletonLazy {
    private static SingletonLazy instancia;//minha instancia de singleton

    private SingletonLazy() {//precisa ser privado para que ninguém externo consiga instancia-lo
    super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia==null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
