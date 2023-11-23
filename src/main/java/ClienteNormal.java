public class ConsumidorPremioIsento extends Consumidor {
    public String verificarAvaliacao() {
        if(this.getAvaliacao() >= 7){
            return "Prêmio";
        }else{
            return "Prêmio não disponível";
        }
    }

    @Override
    public String getTipo(){
        return "Consumidor Neutro";
    }
}
