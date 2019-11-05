package voronov.classes;

public class Cylinders
{
    private Cylinder[] cylinders;

    public Cylinders(int count)
    {
        cylinders = new Cylinder[count];
    }

    public void addNewCylinder(int position, Cylinder cylinder)
    {
        cylinders[position] = cylinder;
    }
    public void getInfo() {
        for (int i = 0; i < cylinders.length; i++)
        {
            cylinders[i].printResult();
        }
    }
    public void getAverageVolume()
    {
        double average = 0;
        for (int i = 0; i < cylinders.length; i++)
        {
            average += cylinders[i].getVolume();
        }
        average = average/cylinders.length;
        System.out.println("Средний объем цилиндров: " + average);
    }
}