package questao5;

public class MedidorCelsius implements MedidorCelsiusIF {
	
	private double valor;
	
	public MedidorCelsius(double valor){
		this.valor = valor;
	}
	
	@Override
	public double medirTemperatura(){
		return this.valor;
	}

	public double getValor(){
		return this.valor;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
}
