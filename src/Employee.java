import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private LocalDate birth;
    private List computers = new ArrayList<>();

    public Employee(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public List<Computer> getComputers() {
        return new ArrayList<>(computers);
    }

    @Override
    public String toString() {
        return  "Employee: " + getName() + "( " + getBirth() + " )" + "\n" +
                getComputers();
    }
}
