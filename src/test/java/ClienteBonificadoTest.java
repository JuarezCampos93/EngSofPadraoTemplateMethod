import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteBonificadoTest {

    @Test
    void deveRetornarInformacoesCliente(){
        ClienteBonificado cliente = new ClienteBonificado();
        cliente.setAvaliacao(9);
        cliente.setNome("Juarez");
        assertEquals("Cliente Bonificado{nome='Juarez', nota=9}", cliente.getInfo());
    }

    @Test
    void deveRetornarComPremioImpulsionador(){
        ClienteBonificado cliente = new ClienteBonificado();
        cliente.setAvaliacao(9);
        assertEquals("Prêmio", cliente.verificarAvaliacao());
    }

    @Test
    void deveRetornarSemPremioImpulsionador(){
        ClienteBonificado cliente = new ClienteBonificado();
        cliente.setAvaliacao(8);
        assertEquals("Prêmio não disponível", cliente.verificarAvaliacao());
    }

}