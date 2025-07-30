import java.util.List;
import java.util.HashMap;

public class EmendaDeComissao extends Emenda {
    private String linkComissao;
    private List<String> parlamentaresComissao;
    private String linkRelatorio;
    private String parlamentarSugestor;
    
    public EmendaDeComissao(int id, String autor, double valorTotal, int ano, String tipo, 
                           List<Documento> documentos, HashMap<String, String> convenios, 
                           HashMap<String, String> acordos,
                           String linkComissao, List<String> parlamentaresComissao, 
                           String linkRelatorio, String parlamentarSugestor) {
        super(id, autor, valorTotal, ano, tipo, documentos, convenios, acordos);
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
        return String.format("EmendaDeComissao{id=%d, autor='%s', valorTotal=%.2f, ano=%d, tipo='%s', linkComissao='%s', parlamentaresComissao=%s, linkRelatorio='%s', parlamentarSugestor='%s', documentos=%s, convenios=%s, acordos=%s}", 
                           id, autor, valorTotal, ano, tipo, linkComissao, parlamentaresComissao, linkRelatorio, parlamentarSugestor, documentos, convenios, acordos);
    }
}
