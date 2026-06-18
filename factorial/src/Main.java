class Factorialfn
{
    static int Factorialfn(int n)
    {
//stopping condition
        if (n==1 ) return 1;

//sum(n) = n + sum(n-1)
        return n * Factorialfn(n-1);
    }

    public static void main(String args[])
    {
        System.out.println(Factorialfn(10));
    }

}

