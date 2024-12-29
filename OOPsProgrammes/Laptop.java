public class Laptop {
    String company;
    int price;
    String ram;

    public String getCompany() {
        return company;
    }

    public Laptop(String company, int price, String ram) {
        this.company = company;
        this.price = price;
        this.ram = ram;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop [company=" + company + ", price=" + price + ", ram=" + ram + "]";
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP", 50000, "8 GB");
        System.out.println(l1);
    }
}
