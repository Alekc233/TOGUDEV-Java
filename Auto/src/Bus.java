import java.util.logging.Logger;

public class Bus extends Driver {
    private int passengerMax;
    private String ticketCost;
    private String conductorName;
    private int passenger = 0;
    private static Logger log = Logger.getLogger(Bus.class.getName());

    public Bus(String model, String year, String color, String maxSpeed, String driverName, int driverAge, int passengerMax, String ticketCost, String conductorName) {
        super(model, year, color, maxSpeed, driverName, driverAge);
        this.passengerMax = passengerMax;
        this.ticketCost = ticketCost;
        this.conductorName = conductorName;
        log.info("Bus Constructor");
    }

    public final void PassangerComeIn(int pss){
        if (passenger == passengerMax) {
            System.out.println("Oops! You have reached the passenger quantity limit!");
            return;
        }
        if (passengerMax <= (pss + passenger)) {
            System.out.println("You can have only " + (passengerMax - passenger) + " passenger on board!");
            return;
        }
        passenger += pss;
        return;
    }

    public final void PassangerComeOut(int pss){
        passenger -= pss;
        return;
    }

    public void IncapsulationBus(){
        super.forward();
        super.backward();
        super.right();
        super.left();
        super.beep();
    }

    public int getPassengerMax() {
        return passengerMax;
    }

    public void setPassengerMax(int passengerMax) {
        this.passengerMax = passengerMax;
    }

    public String getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(String ticketCost) {
        this.ticketCost = ticketCost;
    }

    public String getConductorName() {
        return conductorName;
    }

    public void setConductorName(String conductorName) {
        this.conductorName = conductorName;
    }

    public final void busInfo() {
        super.DriverInfo();
        System.out.println(passengerMax + " " + ticketCost + " " + conductorName + " ");
    }
}
