package factory_method.Q2.idcard;

import factory_method.Q2.framework.Factory;
import factory_method.Q2.framework.Product;

import java.util.HashMap;
import java.util.List;

public class IDCardFactory extends Factory {
    //    private List owners = new ArrayList();
    private HashMap<Integer, String> owners = new HashMap<Integer, String>();
    private int serial = 100;

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    protected void registerProduct(Product product) {
        owners.put(((IDCard) product).getId(), ((IDCard) product).getOwner());
    }

    public List getOwners() {
        return (List) owners.values();
    }
}
