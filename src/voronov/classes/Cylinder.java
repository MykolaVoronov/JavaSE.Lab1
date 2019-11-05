package voronov.classes;

public class Cylinder extends Circle
{
    private double h;
    private double r;
    private int Counter;
    private double Area;
    private double Volume;

    public Cylinder(double r, double h, int counter) {
        super(r, counter);
        this.h = h;
        this.r = r;
        this.Area = Math.round(this.calculateArea() * 100.00)/100.00;
        this.Volume = Math.round(this.calculateVolume() * 100.00)/100.00;
        this.Counter = counter;
    }

    public double getH() {
        return h;
    }

    @Override
    public double getR() {
        return r;
    }

    @Override
    public double getArea() {
        return Area;
    }

    public double getVolume() {
        return Volume;
    }

    public double calculateVolume()
    {
        return Math.PI * Math.pow(this.getR(), 2) * this.getH();
    }


    @Override
    public double calculateArea()
    {
        return 2 * Math.PI * this.getR() * this.getH();
    }

    @Override
    public void printResult()
    {
        System.out.println("Цилиндр №" + Counter + ": Площадь = " + this.getArea() + ", объем = " + this.getVolume());
    }
}