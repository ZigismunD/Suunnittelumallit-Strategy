import java.util.Iterator;
import java.util.List;

public class AfterEach implements ListConverter {

    @Override
    public String listToString(List list) {
        String palaute = "";
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            palaute += itr.next() + "\n";
        }
        return palaute;
    }
}
