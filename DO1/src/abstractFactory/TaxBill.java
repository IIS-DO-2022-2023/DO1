package abstractFactory;

import methodFactory.Bill;

public class TaxBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Tax bill calculated");

	}

	@Override
	public void pay() {
		System.out.println("Tax bill payed");

	}

}
