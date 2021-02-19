package ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return index < data.size() -1;
            }

            @Override
            public String next() {
                return null;
            }
        };
    }

    private List<String> data;
    private int index;

    public ListyIterator(List<String> stringList) {
        this.data = stringList;
    }

    public boolean move() {
        if (iterator().hasNext()) {
            index++;
            return true;
        }
        return false;
    }


    public void print() {
        validatePrint();
        System.out.println(this.data.get(this.index));
    }

    private void validatePrint() {
        if (this.data.isEmpty()) {
            throw new IllegalStateException("Invalid Operation");
        }
    }

}
