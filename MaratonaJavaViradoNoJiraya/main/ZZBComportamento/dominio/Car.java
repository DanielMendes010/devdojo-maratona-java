package ZZBComportamento.dominio;

public class Car {
    private String name = "Audi";
    private String color;
    private int year;

    public Car(String color, int year){
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }
}
