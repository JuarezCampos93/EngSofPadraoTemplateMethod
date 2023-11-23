import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsumidorPremioIsentoTest {

    @Test
    void deveRetornarComPremioNeutro(){
        ConsumidorPremioIsento cliente = new ConsumidorPremioIsento();
        cliente.setAvaliacao(7);
        assertEquals("Prêmio", cliente.verificarAvaliacao());
    }

    @Test
    void deveRetornarSemPremioNeutro(){
        ConsumidorPremioIsento cliente = new ConsumidorPremioIsento();
        cliente.setAvaliacao(6);
        assertEquals("Prêmio não disponível", cliente.verificarAvaliacao());
    }

    @Test
    void deveRetornarInformacoesCliente(){
        ConsumidorPremioIsento cliente = new ConsumidorPremioIsento();
        cliente.setAvaliacao(6);
        cliente.setNome("Deo");
        assertEquals("Consumidor Neutro{nome='Deo', nota=6}", cliente.getInfo());
    }



}