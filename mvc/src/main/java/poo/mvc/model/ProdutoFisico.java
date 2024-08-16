package poo.mvc.model;

public class ProdutoFisico extends Produto {
    private String numeroSerial;
    private Double peso;
    private Double largura;
    private Double altura;
    private Double profundidade;

    public String getNumeroSerial() {
        return numeroSerial;
    }
    public void setNumeroSerial(String numeroSerial) {
        this.numeroSerial = numeroSerial;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getLargura() {
        return largura;
    }
    public void setLargura(Double largura) {
        this.largura = largura;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getProfundidade() {
        return profundidade;
    }
    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

    
}
