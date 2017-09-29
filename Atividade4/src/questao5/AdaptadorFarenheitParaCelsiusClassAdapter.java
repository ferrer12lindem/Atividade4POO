package questao5;

import java.util.Random;

public class AdaptadorFarenheitParaCelsiusClassAdapter extends MedidorFarenheit implements  MedidorCelsiusIF{

	private MedidorFarenheitIF medeFarenheit;
	
	public AdaptadorFarenheitParaCelsiusClassAdapter(Random random, MedidorFarenheitIF medeFarenheit) {
		super(random);
		super.random = random;
		this.medeFarenheit = medeFarenheit;
		
	}

	@Override
	public double medirTemperatura() {
		return 45;
	}
	
	@Override
    public double getTemperaturaFarenheit(){
		double valor = (medeFarenheit.getTemperaturaFarenheit()-32) /1.8;
    	return valor;
    }
}
