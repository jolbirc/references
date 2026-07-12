package syntax.Classes;

import java.util.Date;

public class TemporaryEmployee extends Employee
{

    private Date endDate;

    // constructor
    public TemporaryEmployee (String forename, String surname, Date startDate, Date endDate)
    {
        super(forename, surname, startDate);
        this.endDate = endDate;
    }

    // getters
    public Date getEndDate()
    {
        return endDate;
    }

    @Override
    public String getSurname()
    {
        String name = super.getSurname();
        return name + " [Temp]";
    }

    // methods
    public void extendContract(int days)
    {
        endDate = DateFunctions.addDays(endDate, days);
    }
}
