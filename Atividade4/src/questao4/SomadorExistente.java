package questao4;
import java.util.List;
import java.util.ArrayList;

public class SomadorExistente implements SomadorExiste {

	public int somaLista(List<Integer> lista){
		lista = new ArrayList<Integer>();
		int resultado = 0;
		for(int i: lista){
			resultado += i;
		}
		return resultado;
	}	
}
