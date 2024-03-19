public class TestClub {
    public static void main(String[] args) {
        Club c1 = new Club();
        c1.init();

        Club c2 = new Club(c1);

        System.out.println("Club c1 :");
        System.out.println(c1.toString());

        System.out.println("Club c2 (copie de c1) :");
        System.out.println(c2.toString());
    }
}
