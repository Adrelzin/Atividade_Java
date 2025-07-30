import java.util.List;

public class EmendaDeComissao {
    private String linkComissao;
    private List<String> parlamentaresComissao;
    private String linkRelatorio;
    private String parlamentarSugestor;
    
    public EmendaDeComissao(String linkComissao, List<String> parlamentaresComissao, String linkRelatorio, String parlamentarSugestor) {
        this.linkComissao = linkComissao;
        this.parlamentaresComissao = parlamentaresComissao;
        this.linkRelatorio = linkRelatorio;
        this.parlamentarSugestor = parlamentarSugestor;
    }
    
    public String getLinkComissao() {
        return linkComissao;
    }
    
    public void setLinkComissao(String linkComissao) {
        this.linkComissao = linkComissao;
    }
    
    public List<String> getParlamentaresComissao() {
        return parlamentaresComissao;
    }
    
    public void setParlamentaresComissao(List<String> parlamentaresComissao) {
        this.parlamentaresComissao = parlamentaresComissao;
    }
    
    public void adicionarParlamentarComissao(String parlamentar) {
        if (parlamentaresComissao != null) {
            parlamentaresComissao.add(parlamentar);
        }
    }
    
    public String getLinkRelatorio() {
        return linkRelatorio;
    }
    
    public void setLinkRelatorio(String linkRelatorio) {
        this.linkRelatorio = linkRelatorio;
    }
    
    public String getParlamentarSugestor() {
        return parlamentarSugestor;
    }
    
    public void setParlamentarSugestor(String parlamentarSugestor) {
        this.parlamentarSugestor = parlamentarSugestor;
    }
    
    @Override
    public String toString() {
        return String.format("EmendaDeComissao{linkComissao='%s', parlamentaresComissao=%s, linkRelatorio='%s', parlamentarSugestor='%s'}", 
                           linkComissao, parlamentaresComissao, linkRelatorio, parlamentarSugestor);
    }
}