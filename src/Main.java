public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmi = service.calculate(45, 156);
        System.out.println(bmi);
    }
}
