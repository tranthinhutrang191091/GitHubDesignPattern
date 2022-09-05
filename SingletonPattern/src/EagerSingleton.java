

// Singleton Class được khỏi tạo ngay khi được gọi
public class EagerSingleton {
	// Đặt private static final để đảm bảo biến chỉ được khởi tạo trong class
	private static final EagerSingleton instance = new EagerSingleton();
	
	// Private Contructor để hạn chế truy cập với class bên ngoài
	private EagerSingleton() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	// Method public static để return instance được khởi tạo ở trên
	public static final EagerSingleton getInstance() {
		
		return instance;
	}
	
	// Ưu điểm: cách tiếp cận tốt, dễ cài đặt
	// Nhược điểm: dễ bị phá vỡ bởi Rèflection
}
