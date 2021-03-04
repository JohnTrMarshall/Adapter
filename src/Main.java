public class Main {

    public static void main(String[] args) {

        TS ts1 = new TS1();
        System.out.println(ts1.getTemp());

        TS ts2 = new TS2();
        System.out.println(ts2.getTemp());

        TS3Adaptee ts3a = new TS3Adaptee();
        System.out.println(ts3a.getTSTempt());
        
        TS ts3 = new TS3();
        System.out.println(ts3.getTemp());
    }
}
