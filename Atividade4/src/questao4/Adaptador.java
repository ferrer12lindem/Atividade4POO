package questao4;
import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class Adaptador implements SomadorExiste {
	
	private SomadorEsperado somaEsperado;
	
	public Adaptador(SomadorEsperado somaEsperado){
		this.somaEsperado = somaEsperado;
	}

	@Override
	public int somaLista(List<Integer> lista) {
        int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};
		return somaEsperado.somaVetor(vetor);
	}
	
	public int testSomadorExistente() {
		List<Integer> lista = new ArrayList<Integer>();
		int resp = somaLista(lista) ;
	    for(int k=0; k<15; k++){
	        lista.add(k);	
	    }
		return resp;
	}
}
