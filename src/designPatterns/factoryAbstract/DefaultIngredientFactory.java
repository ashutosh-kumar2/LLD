package designPatterns.factoryAbstract;

public class DefaultIngredientFactory implements IngredientFactory{
    @Override
    public Bean getBean() {
        return new AmericanBean();
    }

    @Override
    public Milk getMilk() {
        return new PowderedMilk();
    }

    @Override
    public Sugar getSugar() {
        return new RegularSugar();
    }

    @Override
    public Spice getSpice() {
        return new IndianSpice();
    }
}
