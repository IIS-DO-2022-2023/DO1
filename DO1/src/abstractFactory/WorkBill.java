package abstractFactory;

import methodFactory.Bill;

public class WorkBill extends BillFactory {

	@Override
	public Bill createBill(String type) {
		if(type.equals("tax")) {
			return new TaxBill();
		} else {
			return new VatBill();
		}
	}

}
