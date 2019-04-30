import br.com.caelum.leilao.dominio.Usuario;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsuarioTest {

    @Test
    public void getId() {
        Usuario usuario = new Usuario( 1, "jenifer");
        assertNotNull(usuario );

        assertEquals(1, usuario.getId());
    }

    @Test
    public void getNome() {
        Usuario usuario = new Usuario( 1, "jenifer");
        assertNotNull(usuario );

        assertEquals("jeniferTinder", usuario.getNome());
    }
}