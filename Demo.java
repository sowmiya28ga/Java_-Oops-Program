class Employee
{
    int empid;
    String name;
    float salary;

    void display()
    {
        System.out.println("Employee Details");
        System.out.println("----------------------");
        System.out.println("Employee ID : " + empid);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }
}


class Demo
{
    public static void main(String args[])
    {
       
        Employee e1 = new Employee();
        e1.empid = 101;
        e1.name = "Sowmiya";
        e1.salary = 25000;
        e1.display();
    }
}