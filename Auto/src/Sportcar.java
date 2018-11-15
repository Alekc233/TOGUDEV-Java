import java.util.logging.Logger;

public class Sportcar extends Driver {

    private String cost;
    private String engine;
    private String transmission;
    private static Logger log = Logger.getLogger(Sportcar.class.getName());

    public Sportcar (String model, String year, String color, String maxSpeed, String driverName, int driverAge, String engine, String transmission, String cost){
        super(model, year, color, maxSpeed, driverName, driverAge);
        this.engine = engine;
        this.transmission = transmission;
        this.cost = cost;
        log.info("Sportcar Constructor");
    }

    @Override
    public void right() {
        System.out.println("Turn Right");
    }

    @Override
    public void left() {
        System.out.println("Turn Left");
    }

    @Override
    public void forward() {
        System.out.println("Move Forward");
    }

    @Override
    public void backward() {
        System.out.println("Move Backward");
    }

    @Override
    public void beep() {
        System.out.println("Beep");
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void sportcarInfo(){
        super.DriverInfo();
        System.out.println(engine + " " + transmission + " " + cost + " ");
    }
}
