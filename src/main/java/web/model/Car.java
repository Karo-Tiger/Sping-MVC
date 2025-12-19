package web.model;

public class Car {
    private String model;
    private int yearOfManufacture;
    private String carColor;

    public Car(String model, int yearOfManufacture, String carColor) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.carColor = carColor;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}
