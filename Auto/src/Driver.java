import java.util.logging.Logger;

public class Driver extends Vehicle{
    String driverMame;
    int driverAge;
    private static Logger log = Logger.getLogger(Driver.class.getName());

    public Driver (String model, String year, String color, String maxSpeed, String driverName, int driverAge){
        super(model, year, color, maxSpeed);
        this.driverMame = driverName;
        this.driverAge = driverAge;
        log.info("Driver Constructor");
    }

    @Override
    public void forward(){
        if (driverAge >= 18)
            System.out.println("This driver is allowed!");
        else
            System.out.println("10-40, Suspicious vehicle noticed, beginning pursuit");
    }

    @Override
    public void backward(){
        if (driverAge >= 18)
            System.out.println("This driver is allowed!");
        else
            System.out.println("10-40, Suspicious vehicle noticed, beginning pursuit");
    }

    @Override
    public void left(){
        if (driverAge >= 18)
            System.out.println("This driver is allowed!");
        else
            System.out.println("10-40, Suspicious vehicle noticed, beginning pursuit");
    }

    @Override
    public void right(){
        if (driverAge >= 18)
            System.out.println("This driver is allowed!");
        else
            System.out.println("10-40, Suspicious vehicle noticed, beginning pursuit");
    }

    public String getDriverMame() {
        return driverMame;
    }

    public void setDriverMame(String driverMame) {
        this.driverMame = driverMame;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }

    public void DriverInfo() {
        super.CarInfo();
        System.out.println(driverMame + " " + driverAge + " ");
    }
}
