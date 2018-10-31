public class Vehicle {
    private String model;
    private String year;
    private String color;
    private String maxSpeed;

    public Vehicle(String model, String year, String color, String maxSpeed) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void right() {
        System.out.println("Turn Right");
    }


    public void left() {
        System.out.println("Turn Left");
    }

    public void forward() {
        System.out.println("Move Forward");
    }

    public void backward() {
        System.out.println("Move Backward");
    }

    public void beep() {
        System.out.println("Beep");
    }
}
