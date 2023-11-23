import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsumidorPremioImpulsionadorTest {

    @Test
    void deveRetornarInformacoesCliente(){
        ConsumidorPremioImpulsionador cliente = new ConsumidorPremioImpulsionador();
        cliente.setAvaliacao(10);
        cliente.setNome("Ivan");
        assertEquals("Consumidor Promotor{nome='Ivan', nota=10}", cliente.getInfo());
    }

    @Test
    void deveRetornarComPremioImpulsionador(){
        ConsumidorPremioImpulsionador cliente = new ConsumidorPremioImpulsionador();
        cliente.setAvaliacao(9);
        assertEquals("Prêmio", cliente.verificarAvaliacao());
    }

    @Test
    void deveRetornarSemPremioImpulsionador(){
        ConsumidorPremioImpulsionador cliente = new ConsumidorPremioImpulsionador();
        cliente.setAvaliacao(8);
        assertEquals("Prêmio não disponível", cliente.verificarAvaliacao());
    }

}