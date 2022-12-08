public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}

//public class Main {

  //  public static void main(String[] args) {
    //    int cost = 16_698;


      //  int miles = cost / 20;
        //System.out.println("Бонусные мили: " + miles);
    //}
//}