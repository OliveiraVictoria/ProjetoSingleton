package singleton;

public class Parametro {

    private Parametro() {};
    private static Parametro instance = new Parametro();
    public static Parametro getInstance() {
        return instance;
    }

    private String nomeVacina;
    private String usuarioVacinado;

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getUsuarioVacinado() {
        return usuarioVacinado;
    }

    public void setUsuarioVacinado(String usuarioVacinado) {
        this.usuarioVacinado = usuarioVacinado;
    }
}

