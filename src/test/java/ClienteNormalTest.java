import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteNormalTest {

    @Test
    void deveRetornarComPremioNeutro(){
        ClienteNormal cliente = new ClienteNormal();
        cliente.setAvaliacao(7);
        assertEquals("Prêmio", cliente.verificarAvaliacao());
    }

    @Test
    void deveRetornarSemPremioNeutro(){
        ClienteNormal cliente = new ClienteNormal();
        cliente.setAvaliacao(6);
        assertEquals("Prêmio não disponível", cliente.verificarAvaliacao());
    }

    @Test
    void deveRetornarInformacoesCliente(){
        ClienteNormal cliente = new ClienteNormal();
        cliente.setAvaliacao(7);
        cliente.setNome("JuarezC");
        assertEquals("Cliente Normal{nome='JuarezC', nota=7}", cliente.getInfo());
    }



}
