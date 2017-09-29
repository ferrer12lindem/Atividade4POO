package questao4;
import java.util.List;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		int vetor[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Cliente cliente = Cliente.getInstance();
		SomadorEsperado somaEsperada = new SomaEsperado();
		
		System.out.print("Exemplo de impressão esperada pelo cliente: ");
		cliente.executar();
		somaEsperada.somaVetor(vetor);
		SomadorExiste adapter = new Adaptador(somaEsperada);
		System.out.println("Resultado da adaptação: "+testaSoma(adapter));
	}
	
	public static int testaSoma(SomadorExiste somaExiste){
		List<Integer> lista = new ArrayList<Integer>();
		return somaExiste.somaLista(lista);
	}
	
}
