public class EmendaIndividual{
	private String parlamentar;
	private String tipoTransferencia;
	
	public EmendaIndividual(String parlamentar, String tipoTransferencia){
		this.parlamentar = parlamentar;
		this.tipoTransferencia = tipoTransferencia;
	}
	
	public String getParlamentar(){
		return parlamentar;
	}
	
	public void setParlamentar(String parlamentar){
		this.parlamentar = parlamentar;
	}
	
	public String getTipoTransferencia(){
		return tipoTransferencia;
	}
	
	public void setTipoTransferencia(String tipoTransferencia){
		this.tipoTransferencia = tipoTransferencia;
	}
	
	@Override
	public String toString(){
		return String.format("EmendaIndividual{parlamentar='%s', tipoTransferencia='%s'}", parlamentar, tipoTransferencia);
	}
}