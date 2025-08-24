import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(new Address("Россия", "Казань"), 800);
        costPerAddress.put(new Address("Россия", "Москва"), 600);
        costPerAddress.put(new Address("Россия", "Новосибирск"), 500);
        costPerAddress.put(new Address("Китай", "Хайнань"), 900);
        costPerAddress.put(new Address("Франция", "Марсель"), 1100);
        costPerAddress.put(new Address("Германия", "Берлин"), 1300);
        costPerAddress.put(new Address("Италия", "Портофино"), 1200);


        int totalPrice = 0;
        Set<String> countries = new HashSet<>();

        while (true) {
            System.out.println(" Заполнение нового заказа. ");

            System.out.print(" Введите страну: ");
            String country = scanner.nextLine();
            if ("end".equals(country)) {
                break;
            }

            System.out.print(" Введите город: ");
            String city = scanner.nextLine();

            System.out.print(" Введите вес (кг): ");
            int weight = Integer.parseInt(scanner.nextLine());

            Address address = new Address(country, city);
            if (costPerAddress.containsKey(address)) {
                int price = weight * costPerAddress.get(address);
                totalPrice += price;
                countries.add(country);
                System.out.println("Стоимость доставки составит: " + price);
                System.out.println("Общая стоимость всех доставок: " + totalPrice);
                System.out.println("В какое количество стран были оформлены доставки: " + countries.size());
            } else {
                System.out.println("Доставки по этому адресу нет");
            }


        }


    }
}
