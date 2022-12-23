package abstractFactory;

import methodFactory.Bill;

public class KindergartenBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Kindergarten bill calculated");

	}

	@Override
	public void pay() {
		System.out.println("Kindergarten bill payed");

	}

}
