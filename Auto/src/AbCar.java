public abstract class AbCar {
    private String model;
    private String year;
    private String color;
    private String maxSpeed;

    public AbCar(String model, String year, String color, String maxSpeed) {
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
        return "1 km/h";
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void CarInfo() {
        System.out.println(getModel() + " " + getYear() + " " + getColor() + " " + getMaxSpeed() + " ");
    }
}
