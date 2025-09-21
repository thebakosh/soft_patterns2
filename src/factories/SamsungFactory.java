package factories;

import products.laptop.SamsungLaptop;
import products.phone.SamsungPhone;
import products.laptop.Laptop;
import products.phone.Phone;

public class SamsungFactory implements TechFactory {
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }

}
