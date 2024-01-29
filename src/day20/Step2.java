package day20;

public class Step2 {
    public static void main(String[] args) {
        RemoteControl2 rc = new SmarTelevision();
        rc.turnOn();
        rc.turnOff();
        //rc.search("주소");

        Searchable searchable = new SmarTelevision();
        searchable.turnOn();
        //searchable.turnOff();
        searchable.search("주소");
    }
}
