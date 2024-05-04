
public class Employee {
    private String fullName;
    private double salary;

    // Metoda zwracająca imię i nazwisko pracownika
    public String getName() {
        return fullName;
    }

    // Metoda zwracająca wynagrodzenie pracownika
    public double getSalary() {
        return salary;
    }

    // Metoda ustawiająca nowe wynagrodzenie pracownika
    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    // Metoda zwracająca reprezentację tekstową pracownika
    public String toString() {
        return "Employee: " + fullName + ", Salary: " + salary;
    }

    // Metoda ustawiająca imię i nazwisko pracownika
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

Main.java public class Main {
    public static void main(String[] args) {
        // Tworzenie tablicy Employees
        Employee[] employees = new Employee[5];

        // Wyświetlanie danych dla pracownika o indeksie równym 3
        System.out.println("Dane pracownika o indeksie 3:");
        // Sprawdzenie, czy pracownik o indeksie 3 istnieje przed wywołaniem jego metod
        if (employees[3] != null) {
            System.out.println("Imię i nazwisko: " + employees[3].getName());
            System.out.println("Wynagrodzenie: " + employees[3].getSalary());
        } else {
            System.out.println("Brak pracownika o indeksie 3.");
        }

        // Modyfikacja wynagrodzenia dla pracownika o indeksie równym 3
        if (employees[3] != null) {
            employees[3].setSalary(60000.0);
        } else {
            System.out.println("Nie można zmodyfikować wynagrodzenia - brak pracownika o indeksie 3.");
        }

        // Wyświetlanie danych dla wszystkich pracowników
        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }
}
