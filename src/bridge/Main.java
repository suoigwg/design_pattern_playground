package bridge;

public class Main {
    public static void main(String[] args) {
//        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
//        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
//        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
//        d1.display();
//        d2.display();
//        d3.display();
//        d3.multiDisplay(5);

//Test code for q1
//        RandomCountDisplay d = new RandomCountDisplay(new StringDisplayImpl("Hello, China."));
//        d.randomDisplay(10);
//Test code for q2
//        CountDisplay d = new CountDisplay(new FileDisplayImpl("newfile.txt"));
//        d.multiDisplay(3);

//Test code for q3
        IncreaseDisplay d1 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay d2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        d1.increaseDisplay(4);
        d2.increaseDisplay(6);
    }
}
