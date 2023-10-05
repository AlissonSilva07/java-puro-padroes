package edu.alisson.singleton;

/**
 * Singleton apressado
 * @author AlissonSilva07
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager () {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
