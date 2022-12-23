package methodFactory;

public class ElectricityBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Electricity bill calculated...");

	}

	@Override
	public void pay() {
		System.out.println("Electricity bill payed...");

	}

}
