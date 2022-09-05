package FatoryBank;

public class Main {
	public static void main(String[] args) {
		Bank bank= FactoryBank.getBank(TypeBank.TPBANK);
		System.out.println(bank.getNameBank());
		Bank bank2= FactoryBank.getBank(TypeBank.VIETTINBANK);
		System.out.println(bank2.getNameBank());
		Bank bank3= FactoryBank.getBank(TypeBank.VIETCOMBANK);
		System.out.println(bank3.getNameBank());
	}
}
