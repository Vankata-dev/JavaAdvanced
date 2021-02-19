package Collection;

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
                String element = data.get(index);
                index++;
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

    public void printAll() {
        validatePrint();
        this.data.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

 /*   @Override
    public void forEach(Consumer<? super String> action) {
        this.data.forEach(action);
    }
*/

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
