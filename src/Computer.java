public class Computer {
    private String model;
    private int diagonalOfMonitor;
    private boolean isCompanyComputer;
    private double price;
    private String typeOfComputer;

    public Computer(String model, int diagonalOfMonitor, boolean isCompanyComputer, double price, String typeOfComputer) {
        this.model = model;
        this.diagonalOfMonitor = diagonalOfMonitor;
        this.isCompanyComputer = isCompanyComputer;
        this.price = price;
        this.typeOfComputer = typeOfComputer;
    }

    public Computer(int diagonalOfMonitor, double price, String typeOfComputer) {
        this("Dell", diagonalOfMonitor, true, price, typeOfComputer );

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDiagonalOfMonitor() {
        return diagonalOfMonitor;
    }

    public void setDiagonalOfMonitor(int diagonalOfMonitor) {
        this.diagonalOfMonitor = diagonalOfMonitor;
    }

    public boolean isCompanyComputer() {
        return isCompanyComputer;
    }

    public void setCompanyComputer(boolean companyComputer) {
        isCompanyComputer = companyComputer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfComputer() {
        return typeOfComputer;
    }

    public void setTypeOfComputer(String typeOfComputer) {
        this.typeOfComputer = typeOfComputer;
    }

    @Override
    public String toString() {
        return  "Model: " + model + "\n" +
                "Diagonal of Monitor: " + diagonalOfMonitor + "\n" +
                "Company computer ? " + isCompanyComputer + "\n" +
                "Price: " + price + "\n" +
                "Laptop or Dekstop: " + typeOfComputer + "\n";


    }
}

