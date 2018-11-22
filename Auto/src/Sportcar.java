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

    public void IncapsulationSportcar() {
        super.moveForward();
        super.moveBackward();
        super.turnLeft();
        super.turnRight();
        super.beeping();
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

    public final void sportcarInfo(){
        super.DriverInfo();
        System.out.println(engine + " " + transmission + " " + cost + " ");
    }
}
