class Product {
    private int pid;
    private String name;
    private int price; // Corrected spelling from `prise` to `price`

    public Product(int pid, String name, int price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
    }
}