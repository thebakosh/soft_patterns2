package factories;

import products.laptop.Laptop;
import products.phone.Phone;

public interface TechFactory {

    public abstract Phone createPhone();
    public abstract Laptop createLaptop();

}
