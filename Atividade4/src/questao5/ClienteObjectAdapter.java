package questao5;
import java.util.Random;

public class ClienteObjectAdapter {

	public static void main(String[] args){
		
        Random random = new Random();
        System.out.println("Temperatura em Farenheit: "+random.nextDouble());
        
		MedidorFarenheitIF medeFarenheit = new MedidorFarenheit(random);
		
		MedidorFarenheitIF adaptador = new AdaptadorFarenheitParaCelsiusObjectAdapter(medeFarenheit);		
		System.out.println("E a temperatura convertida de Farenheit para Celsius: "+adaptador.getTemperaturaFarenheit());
	}
}
