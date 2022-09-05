

public class ThreadSafeSingleton {
	/* Để đảm bảo trong cùng 1 thời điểm chỉ có thể có 1 luồng
	 * có thể truy cập vào hàm getInstance()
	 */
	/* volatile: thông báo sự thay đổi giá trị của biến với các
	 * thread khác nhau nếu biến này đang đc sử dụng trong nhiều
	 * thread
	 */
	private static volatile ThreadSafeSingleton instance;
	public static String valueThreadSafe;
	private ThreadSafeSingleton(String valueThreadSafe) {
		this.valueThreadSafe=valueThreadSafe;
	}
	/*
	 * Method synchronized 
	 * Nhược điểm: chạy chậm vì phải chờ 1 thread khác đang sử dụng
	 */
	public static synchronized ThreadSafeSingleton getInstance(String valueThreadSafe) {
		if(instance == null) {
			instance = new ThreadSafeSingleton(valueThreadSafe);
		}
		return instance;
	}
}
