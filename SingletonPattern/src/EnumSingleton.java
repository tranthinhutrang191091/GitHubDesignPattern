

public enum EnumSingleton {
	/*
	 * Khi dùng enum thì các params chỉ đc khởi tạo 1 lần duy nhất
	 */
	    INSTANCE;
		int value;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	/*
	 * Enum có thể sử dụng như một Singleton, 
	 * nhược điểm là không thể extends từ một lớp được, 
	 * nên khi sử dụng cần xem xét vấn đề này.
	 * Hàm constructor của enum là lazy,
	 *  nghĩa là khi được sử dụng mới chạy hàm khởi tạo
	 *   và nó chỉ chạy duy nhất một lần. 
	 *   Nếu muốn sử dụng như một eager singleton 
	 *   thì cần gọi thực thi trong một 
	 *   static block khi start chương trình.
	 */
}
