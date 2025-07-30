import java.util.List;
import java.util.HashMap;

public class Emenda {
    private int id;
    private String autor;
    private double valorTotal;
    private int ano;
    private String tipo;
    private List<Documento> documentos;
    private HashMap<String, String> convenios;
    private HashMap<String, String> acordos;
    
    public Emenda(int id, String autor, double valorTotal, int ano, String tipo, 
                  List<Documento> documentos, HashMap<String, String> convenios, 
                  HashMap<String, String> acordos) {
        this.id = id;
        this.autor = autor;
        this.valorTotal = valorTotal;
        this.ano = ano;
        this.tipo = tipo;
        this.documentos = documentos;
        this.convenios = convenios;
        this.acordos = acordos;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public List<Documento> getDocumentos() {
        return documentos;
    }
    
    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }
    
    public HashMap<String, String> getConvenios() {
        return convenios;
    }
    
    public void setConvenios(HashMap<String, String> convenios) {
        this.convenios = convenios;
    }
    
    public HashMap<String, String> getAcordos() {
        return acordos;
    }
    
    public void setAcordos(HashMap<String, String> acordos) {
        this.acordos = acordos;
    }
    
    public double calcularValorTotalPorCategoria(String categoria) {
        if (categoria.equals(this.tipo)) {
            return this.valorTotal;
        }
        return 0.0;
    }
    
    @Override
    public String toString() {
        return String.format("Emenda{id=%d, autor='%s', valorTotal=%.2f, ano=%d, tipo='%s', documentos=%s, convenios=%s, acordos=%s}", 
                           id, autor, valorTotal, ano, tipo, documentos, convenios, acordos);
    }
}