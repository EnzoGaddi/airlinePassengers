package ie.atu.week2sem2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Passenger
{
   private char title;
   private char first_name;
   private char last_name;
   private int age;
   private char ID_code;

    public Passenger(char title, char first_name, char last_name, int age, char ID_code)
    {
        this.title = title;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.ID_code = ID_code;
    }

    public void setTitle(char title)
    {
        this.title = title;
    }

    public void setFirst_name(char first_name)
    {
        this.first_name = first_name;
    }

    public void setLast_name(char last_name)
    {
        this.last_name = last_name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setID_code(char ID_code)
    {
        this.ID_code = ID_code;
    }
}