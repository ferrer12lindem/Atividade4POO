package questao2;

public class Incremental {

	private volatile static Incremental uniquelInstance;
	private static int count;

	private Incremental() {
		count = 8;
	}

	public static Incremental getInstance() {
		if(uniquelInstance == null){
			synchronized (Incremental.class) {
				if(uniquelInstance == null){
					uniquelInstance = new Incremental();
				}
			}
		}
		return uniquelInstance;
	}

	public String toString() {
		return "Incremento: " + count;
	}

	public static int getCount() {
		return count;
	}

	public static int setCount(int count) {
		Incremental.count = count;
		return count;
	}
}
