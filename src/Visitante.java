public class Visitante extends Usuario {

    private static int cont;

    public Visitante() {
        cont++;
        super.setNome("Guest");
    }

    public void nomeVisistante(){
        super.setNome("Guest");
    }

    public static int getCont() {
        return cont;
    }
}
