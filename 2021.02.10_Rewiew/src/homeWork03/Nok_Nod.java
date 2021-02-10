package homeWork03;

public class Nok_Nod {
    public static void main(String[] args) {
        findNod(120, 258);
        findNok(120, 258);
    }

    private static void findNok(int num1, int num2) {
        int big = num1 * num2;
        int maxNum = Math.max(num1, num2);
        int minNum = Math.min(num1, num2);
        int nok = 0;
        System.out.print("Все кратные для чисел " + num1 + " и " + num2 + " : ");
        for (int i = big; i > maxNum; i--) {
            if (i % minNum == 0 && i % maxNum == 0) {
                nok = i;
                System.out.print(nok + ";");
            }
        }
        System.out.println(" \n" + "Наименьшим кратным " + "чисел " + num1 + " и " + num2 + " является число " + nok);
    }


    private static void findNod(int number1, int number2) {
        int nod = 0;
        int numberMin = Math.min(number1, number2);
        System.out.print("Все общие делители чисел " + number1 + " и " + number2 + " : ");
        for (int i = 1; i <= numberMin; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                nod = i;
                System.out.print(nod + " ");
            }
        }
        System.out.println(" \n" + "Наибольший общий делитель " + nod);
    }
}
