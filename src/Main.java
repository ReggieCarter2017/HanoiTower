public class Main {
    public static void main(String args[])
    {
        int n = 3;
        HanoiTower(n,'A','C', 'B');
    }
    static void HanoiTower(int n, char from, char to, char buf)
    {
        if (n == 1)
        {
            System.out.println("Диск 1 из стержня " +  from + " к " + to);
            return;
        }
        HanoiTower(n-1, from, buf, to);
        System.out.println("Диск " + n + " из стержня " +  from + " к " + to);
        HanoiTower(n-1, buf, to, from);
    }
}