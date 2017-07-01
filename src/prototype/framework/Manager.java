package prototype.framework;

import java.util.HashMap;

/**
 * Created by yishengyang on 01/07/2017.
 */
public class Manager {
    private HashMap<String, Product> showcase = new HashMap<String, Product>();

    public void register(String name, Product p) {
        showcase.put(name, p);
    }

    public Product create(String name) {
        Product p = showcase.get(name);
        return p.createClone();
    }

}
