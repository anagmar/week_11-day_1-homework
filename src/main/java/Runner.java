public class Runner {


    public static void main(String[] args) {
        Calculator calculator = new Calculator(5,7);

        double addition = calculator.add();
        System.out.println(addition);
        double subtractor = calculator.subtract();
        System.out.println(subtractor);
        double multiply = calculator.multiply();
        System.out.println(multiply);
        double divide = calculator.divide();
        System.out.println(divide);

        WaterBottle waterBottle = new WaterBottle(100);
        System.out.println(waterBottle.volume);
        System.out.println(waterBottle.decreaseDrink());
        System.out.println(waterBottle.emptyBottle());
        System.out.println(waterBottle.fillBottle());


    }
}
