package abstractFactory;

public class TestAbstract {

	public static void main(String[] args) {
		WorkBill workBill = new WorkBill();
		BillManager billManager = new BillManager(workBill);
		
		billManager.processBill("tax");

	}

}
