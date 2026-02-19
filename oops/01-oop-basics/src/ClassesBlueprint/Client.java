package ClassesBlueprint;

public class Client {
    static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("Apple");
        p.setBatteryLevel("100%");
        p.setStorage("1 GB");

        System.out.println(p.getBrand()+" - "+p.getStorage() +" - "+p.getBatteryLevel());
    }
}
