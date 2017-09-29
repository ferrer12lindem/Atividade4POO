package questao2;

public class TestandoIncremento {

	public static void main(String[] args){
		
		for(int k=1; k<10; k++){
			
			Incremental inc = Incremental.getInstance();			
			System.out.println(inc);
		}
	}
}
