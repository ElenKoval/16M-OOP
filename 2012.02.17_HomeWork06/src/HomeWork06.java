import java.util.Arrays;

public class HomeWork06 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(repeatFront("Chocolate", 4));// → "ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3));// → "ChoChC"
        System.out.println(repeatFront("Ice Cream", 2));// → "IcI"
        System.out.println();

        System.out.println(xyzMiddle("AAxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBBB"));// → false
        System.out.println();

        int[] arr1 = new int[]{2, 1, 3, 5};
        int[] arr2 = new int[]{2, 1, 2, 5};
        int[] arr3 = new int[]{2, 4, 2, 5};
        System.out.println(modThree(arr1));// → true
        System.out.println(modThree(arr2));// → false
        System.out.println(modThree(arr3));// → true
        System.out.println();

        int[] array1 = new int[]{5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(array1, 1));//→ false
        System.out.println(sameEnds(array1, 2));// → true
        System.out.println(sameEnds(array1, 3));// → false
        System.out.println(sameEnds(array1, 0));// → true
        System.out.println();

        triangleNumber(6);
    }

    private static void triangleNumber(int size) {
        int number = 0;
        for (int i = 0; i < 6; i++) {
            number++;
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

    private static boolean sameEnds(int[] input, int n) {
        for (int i = 0; i < n; i++) {

            if (input[i] == input[((input.length - n) + i)]) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }


    private static boolean modThree(int[] input) {
        for (int i = 0; i < input.length - 2; i++) {
            if (input[i] % 2 == 0 && input[i + 1] % 2 == 0 && input[i + 2] % 2 == 0 ||
                    input[i] % 2 != 0 && input[i + 1] % 2 != 0 && input[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean xyzMiddle(String word) {
        for (int i = 0; i < word.length() - 2; i++) {
            if (word.startsWith("xyz", i)) {
                int leftNumber = i;
                int rightNumber = word.length() - (i + 3);
                if (Math.abs(leftNumber - rightNumber) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

//        int leftNumber = word.indexOf("xyz");
//        int rightNumber = word.length() - (word.indexOf("xyz") + 3);
//        if (word.length() >= 3) {
//            return Math.abs(leftNumber - rightNumber) <= 1;
//        }
//        return false;
//    }

    private static String repeatFront(String string, int n) {
        String result = "";
        for (int i = n; i > 0; i--) {
            result += string.substring(0, i);
        }
        return result;
    }
}

