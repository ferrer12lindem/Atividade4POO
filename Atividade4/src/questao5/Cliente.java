package questao5;
import java.util.Random;

public class Cliente {

	public static void main(String[] args){
		
        Random random = new Random();
        System.out.println(random.nextDouble());
        
		MedidorFarenheitIF medeFarenheit = new MedidorFarenheit(random);
		
		MedidorFarenheitIF adaptador = new AdaptadorFarenheitParaCelsiusObjectAdapter(medeFarenheit);		
		System.out.println("E a temperatura convertida de farenheit para celsius: "+adaptador.getTemperaturaFarenheit());
	}
}
