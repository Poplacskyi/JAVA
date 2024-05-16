package LAB6;

class SugarCoffee extends CoffeeDecorator {
    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", with sugar";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 2;
    }
}