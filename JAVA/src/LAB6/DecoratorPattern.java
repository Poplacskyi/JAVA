package LAB6;

public class DecoratorPattern {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " costs " + simpleCoffee.cost());

        Coffee milkCoffee = new MilkCoffee(simpleCoffee);
        System.out.println(milkCoffee.getDescription() + " costs " + milkCoffee.cost());

        Coffee sugarMilkCoffee = new SugarCoffee(milkCoffee);
        System.out.println(sugarMilkCoffee.getDescription() + " costs " + sugarMilkCoffee.cost());
    }
}