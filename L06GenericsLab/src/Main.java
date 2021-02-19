import ArrayCreator.ArrayCreator;

public class Main {
    public static void main(String[] args) {

        Integer[] array = ArrayCreator.create(13, 13);
        String[] strArr = ArrayCreator.create(String.class,3, "Pesho");


        for (Integer integer : array) {
            System.out.println(integer);
        }
        for (String s : strArr) {
            System.out.println(s);
        }

    }
}
