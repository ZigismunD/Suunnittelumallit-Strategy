import java.util.List;

public class Context {
    private ListConverter lc;
    private List list;

    public void setListConverter(ListConverter lc) {
        this.lc = lc;
    }

    public ListConverter getListConverter() {
        return this.lc;
    }

    public void setList(List list) {
        this.list = list;
    }

    public String toString() {
        return lc.listToString(list);
    }
}
