public class ClienteNormal extends Cliente{
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
