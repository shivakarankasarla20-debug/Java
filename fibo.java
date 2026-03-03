class fibo
{
    public static void main(String args[])
    {
        int f = 0, f1 = 1, f2, count = 10;

        System.out.println(f);
        System.out.println(f1);

        for(int i = 2; i < count; i++)
        {
            f2 = f + f1;
            System.out.println(" " + f2);
            f = f1;
            f1 = f2;
        }
    }
}