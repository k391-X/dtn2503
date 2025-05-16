package Bai07_AbstractFactory_co_ban;

public class Application {
	private final Button button;
	private final Checkbox checkbox;
	private final Menu menu;
	private final Scrollbar scrollbar;
	
	public Application(GUIFactory factory) {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
		this.menu = factory.createMenu();
		this.scrollbar = factory.createScrollbar();
	}
	
	public void renderUI() {
		button.paint();
		checkbox.render();
		menu.display();
		scrollbar.scroll();
	}
}
