package abstractFactory;

import methodFactory.Bill;

public class VatBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Vat bill calculated");

	}

	@Override
	public void pay() {
		System.out.println("Vat bill calculated");

	}

}
