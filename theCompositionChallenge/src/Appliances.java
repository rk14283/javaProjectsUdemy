public class Appliances extends Kitchen {
    private Refrigrator refrigrator;
    private Dishwasher dishwasher;

    private  CoffeeMaker coffeeMaker

    public Appliances(Boolean hasWorkToDo, Refrigrator refrigrator, Dishwasher dishwasher, CoffeeMaker coffeeMaker) {
        super(hasWorkToDo);
        this.refrigrator = refrigrator;
        this.dishwasher = dishwasher;
        this.coffeeMaker = coffeeMaker;
    }
}
