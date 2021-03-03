public class Seven {
    public int countSeven(int number) {
        if (number < 7) return 0;
        if (number == 7) return 1;
        if (number % 10 == 7) {
            return 1 + countSeven(number / 10);
        } else {
            return countSeven(number / 10);
        }
    }

    public int loopCountSeven(int number) {
        int count = 0;
        for (int i = number; i >= 7; i = i / 10) {
            if (i % 10 == 7) {
                count++;
            }
        }
        return count;
    }
}

class TestCountSeven {
    public static void main(String[] args) {
        Seven number = new Seven();
        System.out.println(number.loopCountSeven(717));
        System.out.println(number.loopCountSeven(7));
        System.out.println(number.loopCountSeven(123));
        System.out.println("********************");


        System.out.println(number.countSeven(717));
        System.out.println(number.countSeven(7));
        System.out.println(number.countSeven(123));
    }
}
