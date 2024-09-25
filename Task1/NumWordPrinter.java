package Task1;

public class NumWordPrinter {
    public String printWord (int n, boolean toUpperCase)
    {
        String ans;
        if (n % 2 == 0)
        {
            ans = "Even";
        }
        else 
        {
            ans = null;
        }

        if (toUpperCase)
        {
            return ans.toUpperCase();
        }

        return ans;
    }
}
