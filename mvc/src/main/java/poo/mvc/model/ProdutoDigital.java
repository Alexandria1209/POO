package poo.mvc.model;

public class ProdutoDigital {
    private String codigoLicenca;
    private Double tamanhoDownload;
    private String url;

    public String getCodigoLicenca() {
        return codigoLicenca;
    }
    public void setCodigoLicenca(String codigoLicenca) {
        this.codigoLicenca = codigoLicenca;
    }
    public Double getTamanhoDownload() {
        return tamanhoDownload;
    }
    public void setTamanhoDownload(Double tamanhoDownload) {
        this.tamanhoDownload = tamanhoDownload;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
