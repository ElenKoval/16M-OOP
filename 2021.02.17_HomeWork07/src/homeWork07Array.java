public class homeWork07Array {


    public static void main(String[] args) {
        int[] array1 = new int[]{6, 2, 5, 3};
        int[] array2 = new int[]{1, 2};
        int[] array3 = new int[]{1};
        myPrint(shiftLeft1(array1));// → [2, 5, 3, 6]
        myPrint(shiftLeft1(array2));// → [2, 1]
        myPrint(shiftLeft1(array3));// → [1]

    }

    private static int[] shiftLeft1(int[] input) {
        int[] newArray = new int[input.length];
        for (int i = 0; i < input.length - 1; i++) {
            newArray[i] = input[i + 1];
        }
        newArray[input.length - 1] = input[0];
        return newArray;
    }

    private static int[] shiftLeft(int[] input) {
        int temp = 0;
        for (int i = 0; i < input.length - 1; i++) {
            temp = input[i];
            input[i] = input[i + 1];
            input[i + 1] = temp;
        }
        return input;
    }

    public static void myPrint(int[] input) {
        System.out.print("[");
        for (int i = 0; i < input.length-1; i++) {
            System.out.print(input[i] + ",");
        }
        System.out.println(input[input.length-1]+"]");
    }
}
