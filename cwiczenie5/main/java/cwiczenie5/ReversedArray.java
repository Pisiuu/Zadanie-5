package cwiczenie5;

public class ReversedArray {

    private int[] array;
    private int temp;
    private String reversedArray;

    public ReversedArray() {
        array = new int[3];
        reversedArray = "";
    }

    public String reverseArray(int a, int b, int c) {
        array[0] = a;
        array[1] = b;
        array[2] = c;

        for (int i = 0; i < array.length - 1; i++) {
            temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }
        for (int i = 0; i <array.length; i++) {
            reversedArray += array[i];
        }
        return reversedArray;
    }
}
