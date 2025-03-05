package designPatterns.factoryAbstract;

public abstract class Coffee {

    private final Bean bean;
    private final Sugar sugar;
    private final Milk milk;
    private final Spice spice;
    private final IngredientFactory ingredientFactory;

    public Coffee(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.bean = ingredientFactory.getBean();
        this.sugar = ingredientFactory.getSugar();
        this.milk = ingredientFactory.getMilk();
        this.spice = ingredientFactory.getSpice();
    }

    abstract void brew();

    abstract void boil();
}
