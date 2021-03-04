public class TS3 extends TS {

    private TS3Adaptee ts3Adaptee;

    public TS3() {

        ts3Adaptee = new TS3Adaptee();
    }
    String getTemp() {

        // get celsius
        temp = ts3Adaptee.getTSTempt();

        // convert to fahrenheit
        int index = temp.indexOf("celsius");
        temp = temp.substring(0, index) + "fahrenheit";

        return temp;

    }

}
