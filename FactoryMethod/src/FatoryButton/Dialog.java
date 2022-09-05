package FatoryButton;

public abstract class Dialog {
	public void renderWindow(){
		Button okButton = creatButton();
		okButton.render();
	}
	public abstract Button creatButton();
}
