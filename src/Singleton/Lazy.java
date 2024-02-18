package Singleton;
/**
 * Singleton "Preguiçoso".
 *
 * @author Matheus Henrique
 */
public class Lazy {
    private static Lazy instancia;

    private Lazy(){super();}

    public static Lazy getInstancia(){
        if (instancia.equals(null)) instancia = new Lazy();
        return instancia;
    }
}