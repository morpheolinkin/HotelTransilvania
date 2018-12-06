package dominio;

public class Romaria {
    private int codigo;
    private int quantidadeCasais;
    private int quantidadeSolteiros;
    private int quantidadeCriancas;

    public Romaria() {
    }

    public Romaria(int codigo, int quantidadeCasais,
                   int quantidadeSolteiros, int quantidadeCriancas) {
        this.codigo = codigo;
        this.quantidadeCasais = quantidadeCasais;
        this.quantidadeSolteiros = quantidadeSolteiros;
        this.quantidadeCriancas = quantidadeCriancas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeCasais() {
        return quantidadeCasais;
    }

    public void setQuantidadeCasais(int quantidadeCasais) {
        this.quantidadeCasais = quantidadeCasais;
    }

    public int getQuantidadeSolteiros() {
        return quantidadeSolteiros;
    }

    public void setQuantidadeSolteiros(int quantidadeSolteiros) {
        this.quantidadeSolteiros = quantidadeSolteiros;
    }

    public int getQuantidadeCriancas() {
        return quantidadeCriancas;
    }

    public void setQuantidadeCriancas(int quantidadeCriancas) {
        this.quantidadeCriancas = quantidadeCriancas;
    }
}
