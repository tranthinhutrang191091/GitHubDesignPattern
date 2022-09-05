
public class StaticBlockSingleton {
	// Tương tự Eager Initialization
	// Khác trong Contructor có thêm phần cung cấp lựa chonj cho việc
	// handle exception hay các xử lý khác
	private static final StaticBlockSingleton instance = new StaticBlockSingleton();

	private StaticBlockSingleton() {
		
	}

	static {
		try {
		} catch (Exception ex) {
			throw new RuntimeException("Xảy ra lỗi khi tạo Singleton");
		}
	}

	public static StaticBlockSingleton getIntance() {
		return instance;
	}
}
