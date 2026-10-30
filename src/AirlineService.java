import java.util.ArrayList;
import java.util.List;

public class AirlineService {
     List<Passenger> passengers = new ArrayList<>();

    public void addPassenger(Passenger passenger){
        for (Passenger p : passengers) {
            if (p.getIdTicket() == passenger.getIdTicket()) {
                throw new IllegalArgumentException("Ошибка! Билет с таким номером уже существует.");
            }
        }
        passengers.add(passenger);
        System.out.println("Пассажир успешно добавлен!");
    }
    public Passenger searchPassenger(int idTicket) {
        for (Passenger p : passengers) {
            if (p.getIdTicket() == idTicket ) {
                return p;
            }
        }
        throw new IllegalArgumentException("Ошибка! Пассажир с таким номером билета не найден.");
    }
    public void information(Passenger passenger){
        System.out.println("Статистика: ");
        System.out.println("Имя: "  + passenger.getName());
        System.out.println("Фамилия: " + passenger.getSurname());
        System.out.println("ID билета: " + passenger.getIdTicket());
    }
    public void displayPassengers() {
        if (passengers.isEmpty()) {
            System.out.println("Список пассажиров пуст.");
            return;
        }
        System.out.println("Список пассажиров:");
        for (Passenger p : passengers) {
            System.out.println("Пассажир: Имя = " + p.getName() + ", Фамилия = " + p.getSurname() + ", ID Билета = " + p.getIdTicket());
        }
    }



}

