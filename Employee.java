class Employee
{
    int empid;
    String name;
    float salary;
    Employee(int id, String n, float s)
    {
        empid = id;
        name = n;
        salary = s;
    }

    void display()
    {
        System.out.println("Employee Details");
        System.out.println("------------------------");
        System.out.println("Employee ID : " + empid);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String args[])
    {
        Employee e1 = new Employee(101, "Sowmiya", 25000);
        Employee e2 = new Employee(102, "Naran", 30000);
        e1.display();

        System.out.println();

        e2.display();
    }
}