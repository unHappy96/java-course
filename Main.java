import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){

        //Создали множество ноутбуков
        HashSet<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(2, 80, "Windows XP", "white"));
        laptops.add(new Laptop(4, 512, "Windows 7", "White"));
        laptops.add(new Laptop(8, 1024, "Windows 10", "grey"));
        laptops.add(new Laptop(16, 512, "Windows 11", "blue"));

        //просто проверка
        //for (var item : laptops) System.out.println(item.getHdd());

        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "Объем озу");
        criteria.put(2, "Объем жд");
        criteria.put(3, "Операционная система");
        criteria.put(4, "Цвет");

        Map<String, Object> filters = new HashMap<>();

        
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Выберите критерии: ");

        boolean continueFilter = true;

        while (continueFilter) {

            for(Map.Entry<Integer, String> item : criteria.entrySet()){
         
                System.out.printf("%d - %s \n", item.getKey(), item.getValue());
            }
    
            int criterion = iScanner.nextInt();
            iScanner.nextLine();
            switch (criterion) {
                case 1:
                    System.out.print("Введите значение ОЗУ: ");
                    filters.put("ram", iScanner.nextInt());
                    iScanner.nextLine();
                    break;
                case 2:
                    System.out.print("Введите значение объема ЖД: ");
                    filters.put("hdd", iScanner.nextInt());
                    iScanner.nextLine();
                    break;
                case 3:
                    System.out.print("Введите операционную систему: ");
                    filters.put("os", iScanner.nextLine());
                    break;
                case 4:
                    System.out.print("Введите цвет: ");
                    filters.put("color", iScanner.nextLine());
                    break;
                default:
                    System.out.println("Некорректный критерий.");
            }

            System.out.println("Хотите добавить еще один критерий?(y/n): ");
            String value = iScanner.nextLine();
            
            continueFilter = value.equalsIgnoreCase("y");
        }
        iScanner.close();
        filterLaptops(laptops, filters);  

    }

    public static void filterLaptops(Set<Laptop> laptops, Map<String, Object> filters) {
        for (Laptop laptop : laptops) {
            boolean matches = true;
            if (filters.containsKey("ram") && laptop.getRam() < (int) filters.get("ram")) {
                matches = false;
            }
            if (filters.containsKey("hdd") && laptop.getHdd() < (int) filters.get("hdd")) {
                matches = false;
            }
            if (filters.containsKey("os") && !laptop.getOs().equalsIgnoreCase((String) filters.get("os"))) {
                matches = false;
            }
            if (filters.containsKey("color") && !laptop.getColor().equalsIgnoreCase((String)filters.get("color"))) {
                matches = false;
            }
            if (matches) {
                System.out.printf("%d RAM - %d HDD - %s OS - %s Color  \n",laptop.getRam(), laptop.getHdd(), laptop.getOs(), laptop.getColor());
            }
        }
    }
}
