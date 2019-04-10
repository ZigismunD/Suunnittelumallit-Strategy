import java.util.Iterator;
import java.util.List;

public class AfterEach implements ListConverter {

    @Override
    public String listToString(List list) {
        StringBuilder palaute = new StringBuilder();
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            palaute.append(itr.next());
            palaute.append("\n");
        }
        return palaute.toString();
    }
}
