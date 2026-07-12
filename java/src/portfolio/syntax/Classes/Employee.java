package syntax.Classes;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable
{
    private String forename;
    private String surname;
    private Date startDate;

    // temp; not stored on disk - "transient"
    transient String vehicleOnLoan;

    // constructor
    public Employee(String forename, String surname, Date startDate)
    {
        this.forename = forename;
        this.surname = surname;
        this.startDate = startDate;
    }

    // getters
    public String getForename()
    {
        return forename;
    }

    public String getSurname()
    {
        return surname;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    // setters
    public void setForename(String forename)
    {
        this.forename = forename;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    @Override
    public String toString()
    {
        return "Employee " + forename + " " + surname + " started " + startDate;
    }
}
