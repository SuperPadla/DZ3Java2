public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double index = service.calculate(1.68, 53.5);
        System.out.println("Ваш ИМТ: " + index + " кг/м².");

        //double index1 = service.calculate(1.54, 60.);
        //System.out.println("ОР: 25,2993759487266, ФР: " + index1);

        //double index2 = service.calculate(1.82, 92.5);
        //System.out.println("ОР: 27.925371331964737 , ФР: " + index2);

        //double index3 = service.calculate(1.74, 77.);
        //System.out.println("ОР:25.43268595587264 , ФР: " + index3);
    }
}