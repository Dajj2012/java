import java.util.Scanner;

public class Program {
   
    static int scanNumber() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //sc.close();
        return number;
        
    }

    static String scanOperations() {
        Scanner sc2 = new Scanner(System.in);
        String operations = sc2.nextLine();
        //sc2.close(); Если их закрыть то все перестает работать с ошибкой: Exception in thread "main" java.util.NoSuchElementException: No line found
        // я не понимаю причины
        return operations;
        
    }
    
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);
    }

}
