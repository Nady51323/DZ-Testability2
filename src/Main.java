public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        int weight = 65;
        double growth = 1.72;

        double index = service.calculate(weight, growth);

        System.out.println(index);
    }


}
