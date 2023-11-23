public class ConsumidorPremioImpulsionador extends Consumidor {
    @Override
    public String verificarAvaliacao() {
        if(this.getAvaliacao() >= 9){
            return "Prêmio";
        }else{
            return "Prêmio não disponível";
        }
    }

    @Override
    public String getTipo(){
        return "Consumidor Promotor";
    }
}
