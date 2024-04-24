package LAB2;

public class Main {
    public static void main(String[] args) {

        Planet earth = new Earth();
        Planet moon = new Moon();


        earth.reportAboutMovement();
        earth.reportAboutLife();

        moon.reportAboutMovement();
        moon.reportAboutLife();
    }
}
