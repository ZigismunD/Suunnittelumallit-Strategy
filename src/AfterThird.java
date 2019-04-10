import java.util.List;

public class AfterThird implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        StringBuilder palaute = new StringBuilder();
        String[] array = list.toArray(new String[list.size()]);

        for (int i = 0; i < array.length; i++) {
            palaute.append(array[i]);
            if ((i + 1) % 3 == 0) {
                palaute.append("\n");
            }
        }

        return palaute.toString();
    }
}
