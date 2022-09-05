import java.io.Serializable;

public class SerializedSingleton implements Serializable{
	private static final long serialVersionUID = 1741825395699241705L;
	private SerializedSingleton() {
		
	}
	private static class HelperSingleton{
		private static final SerializedSingleton instance = new SerializedSingleton();
    
	}
	public static SerializedSingleton getInstance() {
		return HelperSingleton.instance;
	}


}
