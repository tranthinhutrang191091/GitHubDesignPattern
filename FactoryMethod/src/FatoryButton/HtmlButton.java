package FatoryButton;

public class HtmlButton implements Button {

	@Override
	public void render() {
		System.out.println("<button>Test Button Html</button>");
		onClick();
	}

	@Override
	public void onClick() {
		System.out.println("Click! Button says - 'Hello World!'");

	}

}
