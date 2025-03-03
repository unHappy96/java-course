class Answer2 {
    public void printEvenNums() {
    // Введите свое решение ниже
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
        
    }
}
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class program2 {
    public static void main(String[] args) {
  
    // Вывод результата на экран
        Answer2 ans = new Answer2();
        ans.printEvenNums();
    }
}