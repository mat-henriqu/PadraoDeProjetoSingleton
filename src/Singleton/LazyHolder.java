package Singleton;
/**
 * Singleton "LazyHolder".
 *
 * @author Matheus Henrique
 */
public class LazyHolder {
    private static class InstanciaHolder {
        private static LazyHolder instancia = new LazyHolder();
    }

    private LazyHolder (){super();}

    public static LazyHolder getInstancia(){
        return InstanciaHolder.instancia;
    }
}
