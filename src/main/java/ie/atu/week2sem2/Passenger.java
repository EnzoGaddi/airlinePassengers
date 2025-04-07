package ie.atu.week2sem2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Passenger
{
   private String title;
   private String first_name;
   private String last_name;
   private int age;
   private String ID_code;

    public Passenger(String title, String first_name, String last_name, int age, String ID_code)
    {
        this.title = title;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.ID_code = ID_code;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name)
    {
        this.last_name = last_name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setID_code(String ID_code)
    {
        this.ID_code = ID_code;
    }

    public String getTitle() {
        return title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    public String getID_code() {
        return ID_code;
    }
}