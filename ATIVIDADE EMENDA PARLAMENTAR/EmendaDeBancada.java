import java.util.List;

public class EmendaDeBancada {
    private List<String> parlamentaresBancada;
    private String linkAta;
    private String parlamentarSugestor;
    private String estadoOuDF;
    
    public EmendaDeBancada(List<String> parlamentaresBancada, String linkAta, String parlamentarSugestor, String estadoOuDF) {
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
        return String.format("EmendaDeBancada{parlamentaresBancada=%s, linkAta='%s', parlamentarSugestor='%s', estadoOuDF='%s'}", 
                           parlamentaresBancada, linkAta, parlamentarSugestor, estadoOuDF);
    }
}