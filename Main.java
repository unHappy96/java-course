import java.util.HashSet;

public class Main {
    public static void main(String[] args){

        //Создали множество ноутбуков
        HashSet<laptop> laptops = new HashSet<>();
        laptops.add(new laptop(2, 80, "Windows XP", "white"));
        laptops.add(new laptop(4, 512, "Windows 7", "White"));
        laptops.add(new laptop(8, 1024, "Windows 10", "grey"));
        laptops.add(new laptop(16, 512, "Windows 11", "blue"));

        //просто проверка
        //for (var item : laptops) System.out.println(item.getHdd());

        
    }
}
