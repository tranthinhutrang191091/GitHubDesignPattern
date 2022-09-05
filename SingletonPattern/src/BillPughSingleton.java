

public class BillPughSingleton {
	/*
	 * Tạo static nested class Helper khi muốn tách biệt 
	 * chức năng cho 1 class function rõ ràng hơn 
	 */
	private BillPughSingleton() {
	}
	
	public static BillPughSingleton getInstance() {
		return HelperSingleton.instance;
	}
	
	private static class HelperSingleton {
		private static final BillPughSingleton instance =
				new BillPughSingleton();
	}
	
}
