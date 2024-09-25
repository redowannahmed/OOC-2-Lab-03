package Task1;

public class NumWordPrinter {
    public String printWord (int n, boolean toUpperCase)
    {
        String ans;
        if (n % 2 == 0 && n % 11 == 0 && n % 13 == 0) {
            ans = "EvenPrimeLucky";
        }
        else if (n % 2 == 0 && n % 11 == 0) {
            ans = "EvenPrimeEleven";
        }
        else if (n % 2 == 0) {
            ans = "Even";
        }
        else if (n % 11 == 0) {
            ans = "PrimeEleven";
        }
        else if (n % 13 == 0) {
            ans = "LuckyThirteen";
        }
        else {
            ans = "OddOneOut";
        }

        if (toUpperCase)
        {
            return ans.toUpperCase();
        }

        return ans;
    }
}
