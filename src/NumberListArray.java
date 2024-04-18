public class NumberListArray {
    private int[] numberArray;
    public static final int MAX_SIZE = 10;

    public NumberListArray() {
        numberArray = new int[MAX_SIZE];

        for (int i = 0; i < MAX_SIZE; i++) {
            numberArray[i] = -1;
        }
    }

    public void addNumber(int number) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (numberArray[i] == -1) {
                numberArray[i] = number;
                break;
            }
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < MAX_SIZE; i++) {

            result += numberArray[i] + " ";
        }
        return result;
    }
}
