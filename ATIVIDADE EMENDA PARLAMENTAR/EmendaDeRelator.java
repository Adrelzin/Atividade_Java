public class EmendaDeRelator {
    private String parlamentarAutor;
    private String nomeRelator;
    
    public EmendaDeRelator(String parlamentarAutor, String nomeRelator) {
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
        return String.format("EmendaDeRelator{parlamentarAutor='%s', nomeRelator='%s'}", parlamentarAutor, nomeRelator);
    }
}