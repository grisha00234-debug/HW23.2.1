public class Passenger {

    private String name;
    private String surname;
    private  int idTicket;

    public Passenger(String name, String surname, int idTicket) {
        this.name = name;
        this.surname = surname;
        this.idTicket = idTicket;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
