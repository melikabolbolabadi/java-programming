public class CarFactory
{
    public static Car getCar(String carType)
    {
        if (carType == null)
        {
            return null;
        }
        if (carType.equalsIgnoreCase("BMW"))
        {
            return new Bmw();
        }
        else if (carType.equalsIgnoreCase("JAC"))
        {
            return new Jac();
        }
        else if (carType.equalsIgnoreCase("PORSCHE"))
        {
            return new Porsche();
        }

        return null;

    }
}
