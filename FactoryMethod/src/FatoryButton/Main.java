package FatoryButton;

public class Main {
	public static Dialog dialog;
	static void configure() {
		if(System.getProperty("os.name").equals("Windows 11")) {
			dialog= new WindowsDialog();
		}else {
			dialog = new HtmlDialog();
		}
		
	}
	static void runBunsinessLogi() {
		dialog.renderWindow();
	}
	public static void main(String[] args) {
		configure();
		runBunsinessLogi();
	}
}
