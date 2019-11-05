package voronov.classes;

public class Circles
{
   private Circle[] circles;

    public Circles(int count)
    {
        circles = new Circle[count];
    }

    public void addNewCircle(int position, Circle circle)
    {
        circles[position] = circle;
    }
        public void getInfo() {
         for (int i = 0; i < circles.length; i++)
         {
             circles[i].printResult();
         }
    }
    public void getMaximumArea()
    {
        double temp = 0;
        for (int i = 0; i < circles.length; i++)
        {
            if (circles[i].getArea() > temp)
                temp = circles[i].getArea();
        }
        System.out.println("Максимальная площадь окружности: " + temp);
    }

}