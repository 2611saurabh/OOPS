
public class Car {
    private String make = "Tesla";

    private String model = "Model X";

    private String color = "Gray";

    private int doors = 2;

    private boolean convertible = true;



    //here we initilize getter to access private modifier
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getDoor(){
        return doors;
    }
    public boolean isConvertible(){
        return convertible;
    }

    public void describeCar(){
        System.out.println(doors + " -Door"+
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
