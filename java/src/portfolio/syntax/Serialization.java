package syntax;

import syntax.Classes.DateFunctions;
import syntax.Classes.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Serialization
{
    public static void main(String[] args)
    {
//        ArrayList<Employee> employees = new ArrayList<>();
//        Date today = new Date();
//
//        Employee josh = new Employee("Josh", "Birch", today);
//        Employee elon = new Employee("Elon", "Musk", DateFunctions.thisTimeLastYear());
//
//        employees.add(josh);
//        employees.add(elon);

        ArrayList<Employee> employees = loadEmployees();

        for (Employee employee : employees)
        {
            System.out.println(employee);
        }
//
//        saveEmployees(employees);

    }

    public static ArrayList<Employee> loadEmployees()
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream("data/serialization.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Employee> employees = (ArrayList<Employee>) objectInputStream.readObject();
            return employees;
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("Error converting data to object: " + e.getMessage());
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Can't find class representing saved object: " + e.getMessage());
        }

        return new ArrayList<Employee>();
    }

    public static void saveEmployees(ArrayList<Employee> employees)
    {
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream("data/serialization.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employees);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Unable to save file: " + e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("Unable to create object output stream: " + e.getMessage());
        }


    }
}
