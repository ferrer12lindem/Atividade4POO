package questao4;

public class Cliente{

	private static SomadorEsperado somador = new SomaEsperado();
	private static Cliente cliente;
	Adaptador adapter = new Adaptador(somador);
	
	private Cliente(SomadorEsperado somador){
		Cliente.somador = somador;
	}
	
	public static Cliente getInstance(){
		if(cliente == null){
			cliente = new Cliente(somador);
		}
	return cliente;
	}
	
	public void executar(){
		int[] vetor = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int soma = somador.somaVetor(vetor);
		System.out.println("Resultado normal: "+soma);
	}
}
