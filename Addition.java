class Addition
{
   
    void add(int a, int b)
    {
        System.out.println("Addition of two numbers : " + (a + b));
    }

    void add(int a, int b, int c)
    {
        System.out.println("Addition of three numbers : " + (a + b + c));
    }

    void add(double a, double b)
    {
        System.out.println("Addition of double values : " + (a + b));
    }

    public static void main(String args[])
    {
        Addition a1 = new Addition();

        a1.add(10, 20);
        a1.add(10, 20, 30);
        a1.add(12.5, 7.5);
    }
}