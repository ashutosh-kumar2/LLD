package designPatterns.factoryAbstract;

public class Robusta extends Coffee{
    public Robusta(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    void brew() {

    }

    @Override
    void boil() {

    }
}
