package cwiczenie5;

public class ArraySequence {

    private int[] array;
    private boolean bool;

    public ArraySequence() {
        array = new int[] {1, 2, 4, 5, 1, 2, 3, 7};
        bool = true;

    }

    public boolean find(int a, int b, int c) {

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == a && array[i + 1] == b && array[i + 2] == c) {
                return bool = true;
            } else bool = false;
        }
            return bool;
    }
}
