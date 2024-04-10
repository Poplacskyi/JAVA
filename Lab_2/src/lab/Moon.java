class Moon extends Planet {
    @Override
    public void reportAboutMovement() {
        System.out.println("Місяць рухається навколо Землі.");
    }

    @Override
    public void reportAboutLife() {
        System.out.println("На Місяці немає відомостей про наявність життя.");
    }
}