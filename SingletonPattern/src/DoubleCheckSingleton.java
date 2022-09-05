

import javax.swing.plaf.synth.SynthColorChooserUI;

public class DoubleCheckSingleton {
	/*
	 * Check 2 lần: trước và sau khi synchronize
	 * Để tránh vừa check null xong thì có 1 thread khác 
	 * cũng check null và tạo đối tượng khác nữa
	 */
	public static String valueDoubleCheck;
	private static volatile DoubleCheckSingleton instance;
	private DoubleCheckSingleton(String valueDoubleCheck) {
		this.valueDoubleCheck=valueDoubleCheck;
	}
	public static DoubleCheckSingleton getInstance(String valueDoubleCheck) {
		//Check trước khi getInstance
		if(instance==null) {
			// Khởi tạo quá lâu..
			// Chặn các thread khác không thể vào khởi tạo
			synchronized (DoubleCheckSingleton.class) {
				// Check lại lần nữa 
				if(instance ==null) {
					instance = new DoubleCheckSingleton(valueDoubleCheck);				}
			}
		}
		return instance;
	}
}
