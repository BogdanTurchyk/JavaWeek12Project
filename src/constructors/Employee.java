package constructors;

public class Employee {

    public String name, jobTitle;
    public int ID;
    public double salary;
    public static String companyName;

    static {
        companyName = "Microsoft";
    }

    public Employee() {

    }

    public Employee(String name, String jobTitle, int id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        ID = id;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", Id=" + ID +
                ", salary=" + salary +
                ", company Name=" + companyName +
                '}';
    }
}

/*
Task 1:
Employee:
    attribute/fields/variables
name, jobTitle, ID, salary

    add a constructor to initialize all the fields
    add a default constructor with no fields

    toString() method will rint out the fields
 */