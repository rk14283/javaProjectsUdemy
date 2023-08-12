public class Product {
    private String mdoel;
    private String manufacturer;
    private int width;
    private int depth;

    public Product(String mdoel, String manufacturer) {

        this.mdoel = mdoel;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product {
    private int size;
    private String resolution;
    public Monitor(String mdoel, String manufacturer) {


        super(mdoel, manufacturer);
    }

    public Monitor(String mdoel, String manufacturer, int size, String resolution) {
        super(mdoel, manufacturer);
        this.size = size;
        this.resolution = resolution;

    }
    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format(
                "Drawing pixel at %d,%d in color %s", x,y, color));

    }
}

class Motherboard extends Product {
    private int ramSlots;
    private int cardSlots;
    private String bios;
    public Motherboard(String mdoel, String manufacturer) {
        super(mdoel, manufacturer);
    }

    public Motherboard(String mdoel, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(mdoel, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " os loading...");
    }
}

class ComputerCase extends Product {
    private String powerSupply;
    public ComputerCase(String mdoel, String manufacturer) {
        super(mdoel, manufacturer);
    }

    public ComputerCase(String mdoel, String manufacturer, String powerSupply) {
        super(mdoel, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }
}