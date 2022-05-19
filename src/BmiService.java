public class BmiService {
    public double calculate(int weight, double growth) {

        double growth2 = growth * growth;
        double index = weight / growth2;

        return index;

    }


}
