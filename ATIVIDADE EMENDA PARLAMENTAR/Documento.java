import java.time.LocalDate;

public class Documento{
	private LocalDate data;
	private String fase;
	private double valor;
	private String tipo;
	
	public Documento(LocalDate data, String fase, double valor, String tipo){
		this.data = data;
		this.fase = fase;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public LocalDate getData(){
		return data;
	}
	
	public void setData(LocalDate data){
		this.data = data;
	}
	
	public String getFase(){
		return fase;
	}
	
	public void setFase(String fase){
		this.fase = fase;
	}
	
	public double getValor(){
		return valor;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	@Override
	public String toString(){
		return String.format("Documento{data=%s, fase='%s', valor=%.2f, tipo='%s'}", data, fase, valor, tipo);
	}
}