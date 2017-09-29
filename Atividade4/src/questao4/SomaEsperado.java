package questao4;

public class SomaEsperado implements SomadorEsperado {

	@Override
	public int somaVetor(int[] vetor) {
		int resp = 0;
		for(Integer i: vetor){
			resp += i;
		}
		return resp;
	}
}
