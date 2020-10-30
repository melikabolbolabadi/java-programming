public class CalcFactory
{
    public static Calculator getCalc(String str)
    {

        if (str == null)
        {
            return null;
        }
        if (str.charAt(1) == '+')
        {
            return new CalcPlus();
        }
        else if (str.charAt(1)=='-')
        {
            return new CalcMinus();
        }
        return null;
    }
}
