package factories;

import products.laptop.AppleLaptop;
import products.laptop.Laptop;
import products.phone.ApplePhone;
import products.phone.Phone;


public class AppleFactory implements TechFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}
