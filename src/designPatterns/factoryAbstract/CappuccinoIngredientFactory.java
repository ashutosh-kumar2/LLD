package designPatterns.factoryAbstract;

public class CappuccinoIngredientFactory implements IngredientFactory{
    @Override
    public Bean getBean() {
        return new AmericanBean();
    }

    @Override
    public Milk getMilk() {
        return new CowMilk();
    }

    @Override
    public Sugar getSugar() {
        return new RegularSugar();
    }

    @Override
    public Spice getSpice() {
        return new FrenchSpice();
    }
}
