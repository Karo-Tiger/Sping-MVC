package web.model;

public class Car {
    private String model;
    private int year_of_manufacture;
    private String car_color;

    public Car(String model, int year_of_manufacture, String car_color) {
        this.model = model;
        this.year_of_manufacture = year_of_manufacture;
        this.car_color = car_color;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear_of_manufacture() {
        return year_of_manufacture;
    }
    public void setYear_of_manufacture(int year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }
    public String getCar_color() {
        return car_color;
    }
    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    @Override
    public String toString() {
        return "Car" +
                "model='" + model + '\'' +
                ", year_of_manufacture " + year_of_manufacture +
                ", car_color='" + car_color + '\'';
    }
}
