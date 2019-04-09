import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Context con = new Context();
        List<String> lista = new ArrayList<>();

        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");
        lista.add("6");

        con.setList(lista);
        System.out.println("Jokaisen jälkeen iteraattorilla:");
        con.setListConverter(new AfterEach());
        System.out.println(con);

        System.out.println("Joka toisen jälkeen:");
        con.setListConverter(new AfterSecond());
        System.out.println(con);

        System.out.println("Joka kolmannen jälkeen:");
        con.setListConverter(new AfterThird());
        System.out.println(con);
    }
}
