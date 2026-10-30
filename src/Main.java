import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        AirlineService airline = new AirlineService();

        int choice = 0;

        System.out.println("================================");
        System.out.println("   АВИАКОМПАНИЯ - БРОНИРОВАНИЕ");
        System.out.println("================================");
        while (choice != 4) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить пассажира");
            System.out.println("2. Найти пассажира");
            System.out.println("3. Показать всех пассажиров");
            System.out.println("4. Выход");
            System.out.print("Ваш выбор: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println(" Добавление пассажира: ");
                        System.out.print("Введите имя: ");
                        String name = scanner.nextLine().trim();
                        System.out.print("Введите фамилию: ");
                        String surname = scanner.nextLine().trim();
                        System.out.print("Введите номер билета: ");
                        int ticketNumber = Integer.parseInt(scanner.nextLine());
                        if (name.isEmpty() || surname.isEmpty()) {
                            System.out.println(
                                    "Ошибка! Имя и фамилия должны быть заполнены."
                            );
                            break;
                        }

                        if (ticketNumber <= 0) {
                            System.out.println(
                                    "Ошибка! Номер билета должен быть положительным."
                            );
                            break;
                        }

                        Passenger passenger = new Passenger(name, surname, ticketNumber
                        );
                        try {
                            airline.addPassenger(passenger);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.println(" Поиск пассажира:");
                        System.out.print("Введите номер билета: ");
                        int searchNumber = Integer.parseInt(scanner.nextLine());
                        try {
                            Passenger found = airline.searchPassenger(searchNumber);
                            System.out.println("Пассажир найден:");
                            System.out.println("Имя: " + found.getName());
                            System.out.println("Фамилия: " +  found.getSurname());
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        airline.displayPassengers();
                        break;

                    case 4:
                        System.out.println("Выход из программы. До свидания!");
                        break;

                    default:
                        System.out.println(
                                "Ошибка! Выберите пункт от 1 до 4."
                        );
                }
            } catch (NumberFormatException e) {
                System.out.println(
                        "Ошибка! Необходимо ввести корректное число."
                );
            }
        }
        scanner.close();
    }
    }

