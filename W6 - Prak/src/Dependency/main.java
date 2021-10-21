package Dependency;

public class main {
public static void main(String[] args) {
        Customer pelanggan = new Customer();
        pelanggan.setCustomerId(1114);
        pelanggan.setCustomerName("Ikbal");
        Order ord = new Order(pelanggan);
    }
}

