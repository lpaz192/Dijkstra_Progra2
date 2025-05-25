import interfaces.ConjuntoTDA;

public class ConjuntoAR implements ConjuntoTDA {
    int[] arr;
	int cant;
	
	public void inicializarConjunto() {
		arr = new int[20];
		cant = 0;
	}

	public void agregar(int x) {
		if (!this.pertenece(x))	{
			arr[cant] = x;
			cant++;
		}
	}

	public void sacar(int x) {
		int i = buscar(x);
		if (i != -1) {
			arr[i] = arr[cant-1];
			cant--;
		}
	}

	public int elegir() {
		double num = Math.random() * cant;
		int inx = (int)Math.floor(num);
		return arr[inx];
	}

	public boolean pertenece(int x) {
		int i = buscar(x);
		return (i != -1);
	}

	public boolean conjuntoVacio() {
		return (cant == 0);
	}
	
	private int buscar(int x) {
		int i = cant-1;
		while(i >= 0 && arr[i] != x)
			i--;
		return i;
}
}
