public class CarRunner
{
    public static void main(String[] args)
    {
        Car myMustang = new Car();
        //System.out.println(myMustang);
        myMustang.drive(20);
        System.out.println(myMustang.getAmountOfGas());
        myMustang.drive(100);
        System.out.println(myMustang.getAmountOfGas());
        myMustang.fillUpGasTank(20);
        System.out.println(myMustang.getAmountOfGas());
        myMustang.drive(20);
        System.out.println(myMustang.getAmountOfGas());
        myMustang.drive(100);
        System.out.println(myMustang.getAmountOfGas());
        myMustang.fillUpGasTank(20);
        System.out.println(myMustang.getAmountOfGas());
    }
}
