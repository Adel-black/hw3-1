public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 12000;
        int miles = service.calculate(price);
        System.out.println("На вашем счету бонусных миль: " + miles);
    }
}