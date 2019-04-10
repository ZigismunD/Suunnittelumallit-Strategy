import java.util.List;

public class AfterSecond implements ListConverter {

    @Override
    public String listToString(List list) {
            StringBuilder palaute = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            palaute.append(list.get(i));
            if ((i + 1) % 2 == 0) {
                palaute.append("\n");
            }
        }
        return palaute.toString();
    }
}
