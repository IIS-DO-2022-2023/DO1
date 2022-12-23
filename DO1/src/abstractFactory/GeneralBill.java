package abstractFactory;

import methodFactory.Bill;

public class GeneralBill extends BillFactory {

	@Override
	public Bill createBill(String type) {
		if(type.equals("housecleaning")) {
			return new HouseCleaningBill();
		} else {
			return new KindergartenBill();
		}
	}

}
