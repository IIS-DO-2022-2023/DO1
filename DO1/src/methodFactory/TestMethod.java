package methodFactory;

public class TestMethod {

	public static void main(String[] args) {
		BillFactory billFactory = new BillFactory();
		BillManagement billManager = new BillManagement(billFactory);
		
		billManager.processBill("gas");

	}

}
