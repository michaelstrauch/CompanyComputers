import java.util.ArrayList;
import java.util.List;

public class CompanyComputers {
    public static void main(String[] args) {

        Computers computer1 = new Computers(27, 70000, "Desktop");
        Computers computer2 = new Computers("Lenovo", 14, false, 25900, "Laptop");


        ArrayList<Computers> computersList = new ArrayList<>();
        computersList.add(computer1);
        computersList.add(computer2);


        for (Computers computer : computersList) {
            System.out.println(computer);
        }

        System.out.println("Computers in list: " + computersList.size());

    }
}