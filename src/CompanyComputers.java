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

    }
}