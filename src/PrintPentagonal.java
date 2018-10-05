import java.util.Scanner;

public class PrintPentagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương lớn hơn 1: ");
        int n = scanner.nextInt();

        System.out.print("Số Pentagonal tương ứng là: " + getPentagonalNumber(n));
    }

    public static int getPentagonalNumber(int n) {
        int pentagonal = 0;
        pentagonal = (n * ((3 * n) - 1)) / 2;
        return pentagonal;
    }
}
