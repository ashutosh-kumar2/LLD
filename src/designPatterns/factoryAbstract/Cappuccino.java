package designPatterns.factoryAbstract;

public class Cappuccino extends Coffee{
    public Cappuccino(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    void brew() {

    }

    @Override
    void boil() {

    }
}
