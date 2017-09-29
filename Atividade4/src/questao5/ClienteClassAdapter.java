package questao5;

import java.util.Random;

public class ClienteClassAdapter {

	public static void main(String[] args){
		
		Random random = new Random();
		System.out.println("Temperatura em Farenheit: "+random.nextDouble());
		
		MedidorFarenheitIF medeFarenheit = new MedidorFarenheit(random);
		
		MedidorFarenheitIF adaptador = new AdaptadorFarenheitParaCelsiusClassAdapter(random, medeFarenheit);
		System.out.println("E temperatura convertida de Farenheit pra Celsius: "+adaptador.getTemperaturaFarenheit());
	}
}
