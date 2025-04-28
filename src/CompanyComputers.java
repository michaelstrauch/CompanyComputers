import java.time.LocalDate;
import java.util.ArrayList;

public class CompanyComputers {
    public static void main(String[] args) {

        Computer computer1 = new Computer(27, 70000, "Desktop");
        Computer computer2 = new Computer("Lenovo", 14, false, 25900, "Laptop");


        ArrayList<Computer> computersList = new ArrayList<>();
        computersList.add(computer1);
        computersList.add(computer2);


        for (Computer computer : computersList) {
            System.out.println(computer);
        }

        System.out.println("Computers in list: " + computersList.size());

        Employee employee1 = new Employee("CEO Tom", LocalDate.of(1980, 1, 25));
        Employee employee2 = new Employee("Secretary Samantha", LocalDate.of(1999, 5, 1));

        employee1.addComputer(computer1);
        employee2.addComputer(computer2);

        System.out.println(employee1);
        System.out.println(employee2);

    }
}