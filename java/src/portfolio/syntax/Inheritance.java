package syntax;

import syntax.Classes.DateFunctions;
import syntax.Classes.Employee;
import syntax.Classes.TemporaryEmployee;

import java.util.ArrayList;
import java.util.Date;

public class Inheritance
{
    public static void main(String[] args)
    {
        Date today = new Date();
        Employee josh = new Employee("Josh", "Birch", today);
        Employee elon = new Employee("Elon", "Musk", DateFunctions.thisTimeLastYear());

        Date nextYear = DateFunctions.addDays(today, 365);
        TemporaryEmployee bill = new TemporaryEmployee("Bill", "Gates", today, nextYear);

        ArrayList<Employee> staffMembers = new ArrayList<>();    // inside list subclass is treated as superclass
        staffMembers.add(josh);
        staffMembers.add(elon);
        staffMembers.add(bill);

        if(bill.getEndDate().before(today))
        {
            System.out.println("Bill has left");
        }
        else
        {
            System.out.println("Bill is still in employment");
        }

        for (Employee staffMember : staffMembers)
        {
            System.out.println(staffMember.getSurname());
        }
    }
}
