import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = sc.nextInt();
        System.out.printf("Треугольное число: %d\n", summ(i));
        System.out.printf("Факториал: %d\n", fact(i));
        sc.close();
    } 

    public static int summ(int a) {
        return (a * (a + 1)) / 2;
    }
    public static int fact(int a) {
        int j=1;
        for (int i=2; i<a+1; i++){
            j=j*i;
        }
        return j;
    }


}