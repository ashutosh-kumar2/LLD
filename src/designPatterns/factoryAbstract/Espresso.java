package designPatterns.factoryAbstract;

public class Espresso extends Coffee{
    public Espresso(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    void brew() {

    }

    @Override
    void boil() {

    }
}
