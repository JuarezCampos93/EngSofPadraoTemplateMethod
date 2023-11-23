public abstract class Consumidor {
    private String nome;
    private int avaliacao;
    private String sugestao;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getSugestao() {
        return sugestao;
    }

    public void setSugestao(String sugestao) {
        this.sugestao = sugestao;
    }

    public  abstract String verificarAvaliacao();

    public String getTipo(){
        return "Consumidor";
    }
    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", nota=" + this.getAvaliacao() +
                '}';
    }




}
