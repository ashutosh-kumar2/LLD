package designPatterns.factoryAbstract;

public interface IngredientFactory {

    Bean getBean();

    Milk getMilk();

    Sugar getSugar();

    Spice getSpice();
}
