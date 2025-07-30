import java.util.List;
import java.util.HashMap;

public class EmendaDeBancada extends Emenda {
    private List<String> parlamentaresBancada;
    private String linkAta;
    private String parlamentarSugestor;
    private String estadoOuDF;
    
    public EmendaDeBancada(int id, String autor, double valorTotal, int ano, String tipo, 
                          List<Documento> documentos, HashMap<String, String> convenios, 
                          HashMap<String, String> acordos,
                          List<String> parlamentaresBancada, String linkAta, 
                          String parlamentarSugestor, String estadoOuDF) {
        super(id, autor, valorTotal, ano, tipo, documentos, convenios, acordos);
        this.parlamentaresBancada = parlamentaresBancada;
        this.linkAta = linkAta;
        this.parlamentarSugestor = parlamentarSugestor;
        this.estadoOuDF = estadoOuDF;
    }
    
    public List<String> getParlamentaresBancada() {
        return parlamentaresBancada;
    }
    
    public void setParlamentaresBancada(List<String> parlamentaresBancada) {
        this.parlamentaresBancada = parlamentaresBancada;
    }
    
    public void adicionarParlamentarBancada(String parlamentar) {
        if (parlamentaresBancada != null) {
            parlamentaresBancada.add(parlamentar);
        }
    }
    
    public String getLinkAta() {
        return linkAta;
    }
    
    public void setLinkAta(String linkAta) {
        this.linkAta = linkAta;
    }
    
    public String getParlamentarSugestor() {
        return parlamentarSugestor;
    }
    
    public void setParlamentarSugestor(String parlamentarSugestor) {
        this.parlamentarSugestor = parlamentarSugestor;
    }
    
    public String getEstadoOuDF() {
        return estadoOuDF;
    }
    
    public void setEstadoOuDF(String estadoOuDF) {
        this.estadoOuDF = estadoOuDF;
    }
    
    @Override
    public String toString() {
        return String.format("EmendaDeBancada{id=%d, autor='%s', valorTotal=%.2f, ano=%d, tipo='%s', parlamentaresBancada=%s, linkAta='%s', parlamentarSugestor='%s', estadoOuDF='%s', documentos=%s, convenios=%s, acordos=%s}", 
                           id, autor, valorTotal, ano, tipo, parlamentaresBancada, linkAta, parlamentarSugestor, estadoOuDF, documentos, convenios, acordos);
    }
}
