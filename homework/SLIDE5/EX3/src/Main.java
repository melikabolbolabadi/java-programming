public class Main
{
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = CarFactory.getCar("BMW");
        car1.technicalSpecifications();

        Car car2 = CarFactory.getCar("JAC");
        car2.technicalSpecifications();

        Car car3 = CarFactory.getCar("PORSCHE");
        car3.technicalSpecifications();
    }

}
