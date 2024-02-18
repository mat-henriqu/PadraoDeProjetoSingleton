package Singleton;
/**
 * Singleton "Apressado".
 *
 * @author Matheus Henrique
 */
public class Eager {
    private static Eager instancia = new Eager();

    private Eager (){super();}

    public static Eager getInstancia(){
        return instancia;
    }
}