package prototype.framework;

/**
 * Created by yishengyang on 01/07/2017.
 */
public abstract class Product implements Cloneable {
    public abstract void use(String s);

    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
