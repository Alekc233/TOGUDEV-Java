public class Main {
    public static void main(String[] args) {
        Vehicle Pagani = new Vehicle("Pagani Zonda","2011","Dark Grey","340 km/h");
        Vehicle Lamborghini = new Vehicle("Lamborghini Centenario","2016","Black","350 km/h");
        Vehicle McLaren = new Vehicle("McLaren P1","2013","Yellow","362 km/h");
        Vehicle nMcLaren = new Vehicle("McLaren P1","2013","Yellow","362 km/h");
        Vehicle Volga = new Vehicle("GAZ Volga 3110","2005","Dark Blue","175 km/h");
        Driver UncleSam = new Driver("Pagani Zonda","2011","Dark Grey","340 km/h","Sam", 37);
        Driver KidPeter = new Driver("GAZ Volga 3110","2005","Dark Blue","175 km/h","Peter", 14);
        Sportcar Bugatti = new Sportcar("Bugatti Veyron", "2015", "Black", "408 km/h", "Martin", 25, "8.0 L quad-turbocharged W16", "7-speed DSG auto", "$1,919,333");
        Bus PAZ = new Bus("PAZ-3206","1995","white","90 km/h","Sam",37,28,"30 RUB", "Olga");

        Pagani.CarInfo();
        Pagani.forward();
        System.out.println(" ");

        Lamborghini.CarInfo();
        Lamborghini.backward();
        System.out.println(" ");

        McLaren.CarInfo();
        McLaren.left();
        System.out.println(" ");

        Volga.CarInfo();
        Volga.beep();
        System.out.println(" ");

        UncleSam.DriverInfo();
        UncleSam.right();
        System.out.println(" ");

        KidPeter.DriverInfo();
        KidPeter.forward();
        System.out.println(" ");

        Bugatti.sportcarInfo();
        Bugatti.forward();
        System.out.println(" ");

        PAZ.busInfo();
        PAZ.PassangerComeIn(15);
        PAZ.PassangerComeOut(7);
        PAZ.PassangerComeIn(21);
        System.out.println(" ");

        if (McLaren.equals(nMcLaren))
            System.out.println("Yea, they are the same thing");
        else
            System.out.println("Nope, they are not the same thing");
    }
}