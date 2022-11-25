package projeto.praticaJava.javaPuro.singleton;

public class Teste {
    public static void main(String[] args) {
        /*Testes relacionados ao Design Pattern Singleton:
        Permite a criação de uma única instância de uma classe e fornecer um modo para recuperá-la (reutilizar).*/

        SingletonLazy lazy= SingletonLazy.getInstancia();// não é possível instanciar pelo new, é preciso acessar pela classe.
        System.out.println(lazy);
        lazy= SingletonLazy.getInstancia();// o endereço de memória deve ser o mesmo.
        System.out.println(lazy);

        System.out.println();
        SingletonEager eager= SingletonEager.getInstancia();
        System.out.println(eager);
        eager= SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println();
        SingletonLazyHolder holder= SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder= SingletonLazyHolder.getInstancia();
        System.out.println(holder);

    }
}
