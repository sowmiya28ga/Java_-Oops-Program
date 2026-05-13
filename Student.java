class College
{
    void universityName()
    {
        System.out.println("University Name : Takshashila University");
    }
}

class Department extends College
{
    void deptName()
    {
        System.out.println("Department : Computer Science");
    }
}

class Student extends Department
{
    void studentName()
    {
        System.out.println("Student Name : Sowmiya");
    }

    public static void main(String args[])
    {
        Student s1 = new Student();

        s1.universityName();
        s1.deptName();
        s1.studentName();
    }
}