public class NumberListArray {
    private int[] numberArray;
    public static final int MAX_SIZE = 7;

    public NumberListArray() {
        numberArray = new int[MAX_SIZE];

        for (int i = 0; i < MAX_SIZE; i++) {
            numberArray[i] = -1;
        }
    }

    public void addNumber(int number) {
        boolean esIstNochPlatz = false;

        for (int i = 0; i < MAX_SIZE; i++) {
            if (numberArray[i] == -1) {
                esIstNochPlatz = true;
                break;
            }
        }

        if (!esIstNochPlatz) {
            System.out.println("Kein Platz für die Zahl " + number);
            return;
        }

        for (int i = 0; i < MAX_SIZE; i++) {
            // liste sortiert halten
            if (numberArray[i] > number) {
                for (int j = MAX_SIZE - 1; j > i; j--) {
                    numberArray[j] = numberArray[j - 1];
                }
                numberArray[i] = number;
                break;
            } else if (numberArray[i] == -1) {
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
