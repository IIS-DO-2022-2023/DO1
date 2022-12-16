package observer;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice ccp = new CryptoCurrencyPrice();
		CryptoCurrencySMS ccsms = new CryptoCurrencySMS();
		
		ccp.addObservers(ccsms);
		
		ccp.setBitcoinPrice(200000);
		ccp.setEtherPrice(2000);

	}

}
