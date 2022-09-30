package carHomework;

public class Car {
    private String model;
    private String color;
    private int year;
    private int gearBox;

    public Car(String model, String color,int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    //SETTERS
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setGearBox(int gearBox) {
        this.gearBox = gearBox;
    }

    //GETTERS (de impresion)


    public void getModel() {
        System.out.println(model);;
    }

    public void getColor() {
        System.out.println(color);;
    }

    public void getYear() {
        System.out.println(year);;
    }
    public void getGearBox() {
        System.out.println("Im running with "+ gearBox+ " Gear now");
    }

    //Otros metodos
    public void start(){
        System.out.println("Im start now");
    }
    public void running(){
        System.out.println("Now im Running, nothing can stop me!");
    }

    public void stop(){
        System.out.println("OK, im stop, what now?");
    }


}
