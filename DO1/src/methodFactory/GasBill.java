package methodFactory;

public class GasBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Gas bill calculated...");

	}

	@Override
	public void pay() {
		System.out.println("Gas bill payed...");

	}

}
