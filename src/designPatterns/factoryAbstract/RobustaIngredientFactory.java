package designPatterns.factoryAbstract;

public class RobustaIngredientFactory implements IngredientFactory{
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
        return new BrownSugar();
    }

    @Override
    public Spice getSpice() {
        return new IndianSpice();
    }
}
