package questao2;

public class Incremental {

	private volatile static Incremental uniquelInstance = new Incremental();
	private static int count;

	private Incremental() {
		count = 8;
	}

	public static Incremental getInstance() {
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
