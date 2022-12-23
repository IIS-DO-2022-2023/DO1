package methodFactory;

public class BillManagement {
	Bill bill;
	BillFactory billFactory;
	
	
	public BillManagement(BillFactory billFactory) {
		super();
		this.billFactory = billFactory;
	}

	public void processBill(String type) {
		bill = billFactory.createBill(type);
		
		bill.calculateTotal();
		
		bill.pay();	
	}

}
