import java.util.List;
import java.util.HashMap;

public class EmendaDeRelator extends Emenda {
    private String parlamentarAutor;
    private String nomeRelator;
    
    public EmendaDeRelator(int id, String autor, double valorTotal, int ano, String tipo, 
                          List<Documento> documentos, HashMap<String, String> convenios, 
                          HashMap<String, String> acordos,
                          String parlamentarAutor, String nomeRelator) {
        super(id, autor, valorTotal, ano, tipo, documentos, convenios, acordos);
        this.parlamentarAutor = parlamentarAutor;
        this.nomeRelator = nomeRelator;
    }
    
    public String getParlamentarAutor() {
        return parlamentarAutor;
    }
    
    public void setParlamentarAutor(String parlamentarAutor) {
        this.parlamentarAutor = parlamentarAutor;
    }
    
    public String getNomeRelator() {
        return nomeRelator;
    }
    
    public void setNomeRelator(String nomeRelator) {
        this.nomeRelator = nomeRelator;
    }
    
    @Override
    public String toString() {
        return String.format("EmendaDeRelator{id=%d, autor='%s', valorTotal=%.2f, ano=%d, tipo='%s', parlamentarAutor='%s', nomeRelator='%s', documentos=%s, convenios=%s, acordos=%s}", 
                           id, autor, valorTotal, ano, tipo, parlamentarAutor, nomeRelator, documentos, convenios, acordos);
    }
}
