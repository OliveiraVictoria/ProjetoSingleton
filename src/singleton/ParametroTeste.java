package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametroTeste {

    @Test
    public void deveRetornarNomeVacina() {
        Parametro.getInstance().setNomeVacina("Vacina da Gripe");
        assertEquals("Vacina da Gripe", Parametro.getInstance().getNomeVacina());
    }

    @Test
    public void deveRetornarUsuarioVacinado() {
        Parametro.getInstance().setUsuarioVacinado("Usuario Vacinado");
        assertEquals("Usuario Vacinado", Parametro.getInstance().getUsuarioVacinado());
    }

}
