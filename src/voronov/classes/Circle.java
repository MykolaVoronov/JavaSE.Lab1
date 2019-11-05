package voronov.classes;

public class Circle
{
    private double R;
    private int Counter;
    private double Area;
    private double Length;

    public Circle(double r, int counter) {
        this.R = r;
        this.Counter = counter;
        this.Area = Math.round(calculateArea() * 100.00)/100.00;
        this.Length = Math.round(calculateLength() * 100.00)/100.00;
    }

    public double getArea() { return Area; }

    public double getLength() { return Length; }

    public double getR() { return R; }

    public double calculateArea() {
        return Math.PI * Math.pow(this.getR(), 2);
    }

    public double calculateLength() {
        return 2 * Math.PI * this.getR();
    }

    public static double isCorrect(String input) {
        double checker = -1;
        try
        {
            checker = Double.parseDouble(input) > 0 ? Double.parseDouble(input) : -1;
        }
        catch (Exception e)
        {
            System.out.println("Ошибка ввода");
        }
        return checker;
    }

    public static int isCorrectCount(String input) {
        int checker = -1;
        try
        {
            checker = Integer.parseInt(input) > 0 ? Integer.parseInt(input) : -1;
        }
        catch (Exception e)
        {
            System.out.println("Ошибка ввода");
        }
        return checker;
    }
    public void printResult()
    {
        System.out.println("Окружность №" + Counter + ": Площадь = " + this.getArea() + ", длина = " + this.getLength());
    }
}