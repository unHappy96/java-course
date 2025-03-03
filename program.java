
class Answer {
    public int factorial(int n) {
    // Введите свое решение ниже
        if (n < 0) {
            return -1;
        }
        if (n < 2) {
            return 1;
        }
        int result = 1;
        result = factorial(n - 1) * n;
        return result;
    }
}
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class program {
    public static void main(String[] args) {
        int n = 5;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
    // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.factorial(n);
        System.out.println(itresume_res);
    }
}