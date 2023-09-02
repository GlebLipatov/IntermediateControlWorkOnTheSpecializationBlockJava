package View;

/**
 * Класс описывает тексты ошибок работы в меню.
 */
public class ViewErrors {
    private String failedInputMenu;

    public void loadErrorData() {
        this.failedInputMenu = "Выберите пункт меню от 1 до";
    }

    public void showFailedInputMenu(int menuSize){
        System.out.printf("%s %d: ", failedInputMenu, menuSize);
    }
}
