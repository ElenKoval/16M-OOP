public class Triangle {
    public static void main(String[] args) {
        triangleNumber(6);
    }

    private static void triangleNumber(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}
