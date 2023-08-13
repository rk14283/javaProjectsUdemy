public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}





//The composition challenge
// In this challenge, you need to create an application for controlling a smart kitchen
//Your smart kitchen will have several appliances.
//Your appliances will be internet of things (IOT) devices, which can be programmed.

//It's your job to write the code, to enable your Smart Kitchen application, to execute certain jobs.

//Methods on your SmartKitchen class, will determine what work needs to be done:
// .addWater() will set the Coffee Maker's hasWorkToDo field to true.
// .pourMilk() will set Refrigerator's hasWorkToDo to true.
// .loadDishwasher() will set hasWorkToDo flag to true, on that appliance.
// Alternatively, you could have a single method, called setKitchenState, that takes three
//boolean values, which could combine the three methods above.

// To execute the work needed to be done by the appliances, you'll implement this in two ways:
// First, your application will access each appliance (by using a getter), and execute a method.
//.The appliance methods are orderFood() on Refrigerator, doDishes() on DishWasher, and brewCoffee()
// on CoffeeMaker
//. These methods should check the hasWorkToDo flag and if true, print a message out, about
//what work is being done.

//Second your application won't access the appliances directly
// .It should call doKitchenWork(), which delegates the work, to any of its appliances
