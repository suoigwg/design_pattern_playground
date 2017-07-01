package factory_method.Q2;

import factory_method.Q2.framework.Factory;
import factory_method.Q2.framework.Product;
import factory_method.Q2.idcard.IDCardFactory;


public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}
