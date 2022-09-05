package FatoryBank;

public class FactoryBank {
	
	private FactoryBank() {
		
	}
	public static final Bank getBank(TypeBank typeBank) {
		switch (typeBank) {
		case TPBANK: 
			return new TPBank();
		
		case VIETTINBANK: 
			return new ViettinBank();
		
		default:
			throw new IllegalArgumentException("Ko có: " + typeBank);
		}
	}
}
