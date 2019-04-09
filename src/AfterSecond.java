import java.util.List;

public class AfterSecond implements ListConverter {

    @Override
    public String listToString(List list) {
        String palaute = "";
        for (int i = 0; i < list.size(); i++) {
            palaute += list.get(i);
            if ((i + 1) % 2 == 0) {
                palaute += "\n";
            }
        }
        return palaute;
    }
}
