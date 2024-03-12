import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotWatter b1 = new HotWatter(10);
        HotWatter b2 = new HotWatter(9);
        HotWatterAuto b3 = new HotWatterAuto(3,4,7);
        HotWatterAuto b4 = new HotWatterAuto(3,5,8);
        HotWatterAuto b5 = new HotWatterAuto(3,6,9);

        HotWatterVendingMachine vendingMachine = new HotWatterVendingMachine(new ArrayList<>());
        HotWatterVendingMachine2 vendingMachine2 = new HotWatterVendingMachine2(new ArrayList<>());
        vendingMachine2.addHotWatter(b1);
        vendingMachine2.addHotWatter(b2);
        vendingMachine.addHotWatterAuto(b3);
        vendingMachine.addHotWatterAuto(b4);
        vendingMachine.addHotWatterAuto(b5);
        System.out.println(vendingMachine2.getHotWatters(10));
        System.out.println(vendingMachine.getHotWattersAuto(3,4,7));
    }


   

}