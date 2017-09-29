package questao5;
import java.util.Random;

public class MedidorFarenheit implements MedidorFarenheitIF{
    
	private Random random = new Random();
	
	public MedidorFarenheit(Random random){
		this.random = random;
	}
	public double getTemperaturaFarenheit(){
		return random.nextDouble(); //simulando o termômetro
	}
}
