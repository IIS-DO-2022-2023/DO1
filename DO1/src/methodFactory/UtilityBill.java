package methodFactory;

public class UtilityBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Utility bill calculated...");

	}

	@Override
	public void pay() {
		System.out.println("Utility bill payed...");

	}

}
