package questao5;

public class AdaptadorFarenheitParaCelsiusObjectAdapter implements MedidorFarenheitIF{

	private MedidorFarenheitIF medeFarenheit;

	public AdaptadorFarenheitParaCelsiusObjectAdapter(MedidorFarenheitIF medeFarenheit) {
		this.medeFarenheit = medeFarenheit;
	} 
	
	@Override
	public double getTemperaturaFarenheit() {
        double resposta = (medeFarenheit.getTemperaturaFarenheit()-32) /1.8;
        return resposta;
	}

	
		
}
