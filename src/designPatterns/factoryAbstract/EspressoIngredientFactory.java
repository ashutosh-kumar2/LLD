package designPatterns.factoryAbstract;

public class EspressoIngredientFactory implements IngredientFactory{
    @Override
    public Bean getBean() {
        return new FrenchBean();
    }

    @Override
    public Milk getMilk() {
        return new PowderedMilk();
    }

    @Override
    public Sugar getSugar() {
        return new BrownSugar();
    }

    @Override
    public Spice getSpice() {
        return new FrenchSpice();
    }
}
