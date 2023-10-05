package edu.alisson.gof.singleton;

/**
 * Singleton preguiçoso
 * @author AlissonSilva07
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy () {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
