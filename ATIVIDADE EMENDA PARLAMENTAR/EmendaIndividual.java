import java.util.List;
import java.util.HashMap;

public class EmendaIndividual extends Emenda {
    private String parlamentar;
    private String tipoTransferencia;
    
    public EmendaIndividual(int id, String autor, double valorTotal, int ano, String tipo, 
                           List<Documento> documentos, HashMap<String, String> convenios, 
                           HashMap<String, String> acordos,
                           String parlamentar, String tipoTransferencia) {
        super(id, autor, valorTotal, ano, tipo, documentos, convenios, acordos);
        this.parlamentar = parlamentar;
        this.tipoTransferencia = tipoTransferencia;
    }
    
    public String getParlamentar() {
        return parlamentar;
    }
    
    public void setParlamentar(String parlamentar) {
        this.parlamentar = parlamentar;
    }
    
    public String getTipoTransferencia() {
        return tipoTransferencia;
    }
    
    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }
    
    @Override
    public String toString() {
        return String.format("EmendaIndividual{id=%d, autor='%s', valorTotal=%.2f, ano=%d, tipo='%s', parlamentar='%s', tipoTransferencia='%s', documentos=%s, convenios=%s, acordos=%s}", 
                           id, autor, valorTotal, ano, tipo, parlamentar, tipoTransferencia, documentos, convenios, acordos);
    }
}
