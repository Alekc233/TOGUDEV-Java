public class Main {
    public static void main(String[] args) {
        Vehicle Pagani = new Vehicle("Pagani Zonda","2011","Dark Grey","340 km/h");
        Vehicle Lamborghini = new Vehicle("Lamborghini Centenario","2016","Black","350 km/h");
        Vehicle McLaren = new Vehicle("McLaren P1","2013","Yellow","362 km/h");

        System.out.println("- " + Pagani.getModel() + " " + Pagani.getYear() + " " + Pagani.getColor() + " " + Pagani.getMaxSpeed());
        System.out.println("A " + Pagani.getModel() + " can:");
        Pagani.backward();
        Pagani.forward();
        Pagani.left();
        Pagani.right();
        Pagani.beep();
        System.out.println("==================");

        System.out.println("- " + Lamborghini.getModel() + " " + Lamborghini.getYear() + " " + Lamborghini.getColor() + " " + Lamborghini.getMaxSpeed());
        System.out.println("A " + Lamborghini.getModel() + " can:");
        Lamborghini.backward();
        Lamborghini.forward();
        Lamborghini.left();
        Lamborghini.right();
        Lamborghini.beep();
        System.out.println("==================");

        System.out.println("- " + McLaren.getModel() + " " + McLaren.getYear() + " " + McLaren.getColor() + " " + McLaren.getMaxSpeed());
        System.out.println("A " + McLaren.getModel() + " can:");
        McLaren.backward();
        McLaren.forward();
        McLaren.left();
        McLaren.right();
        McLaren.beep();
    }
}
