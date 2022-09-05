public class LazySingleton {
	// Cách làm mở rộng hơn so với Eager Intialization
	// Hoạt động tốt trong single-thread
	private static LazySingleton instance;
	public String valueLazy;
	private LazySingleton(String valueLazy) {
		this.valueLazy=valueLazy;
	}

	public static LazySingleton getInstance(String valueLazy) {
		if (instance == null)
		{
			instance = new LazySingleton(valueLazy);
		}
		return instance;
	}
	// Khắc phục nhược điểm của Eager Initialization
	// chỉ khi nào getInstance đc gọi thì instance mới khởi tạo
	/* Nhược điểm chỉ tốt trong single-thread
	 * - thao tác create instance quá chậm trong lần sử dụng đầu tiên
	 */
}
