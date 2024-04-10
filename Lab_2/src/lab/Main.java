public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкти для Землі та Місяця
        Planet earth = new Earth();
        Planet moon = new Moon();

        // Викликаємо методи для виведення повідомлень
        earth.reportAboutMovement();
        earth.reportAboutLife();

        moon.reportAboutMovement();
        moon.reportAboutLife();
    }
}