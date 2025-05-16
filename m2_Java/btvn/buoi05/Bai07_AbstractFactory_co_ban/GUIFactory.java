package Bai07_AbstractFactory_co_ban;

public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
	Menu createMenu();
	Scrollbar createScrollbar();
}
