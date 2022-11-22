public class iPadMain {
    public static void main(String[] args) {
        iPadMini ip1 = new iPadMini();
        ip1.displayDeviceName("Apple", "iPhone", "mini", 6);
        ip1.determineScreenSize("mini");


        iPadAir ip2 = new iPadAir();
        ip2.displayDeviceName("Apple", "iPhone", "Air", 5);
        ip2.determineScreenSize("Air");
        ip2.displayConnectionCapabilities("Air");

        iPadPro ip3 = new iPadPro();
        ip3.displayDeviceName("Apple", "iPhone", "Pro", 6);
        ip3.determineScreenSize("Pro");
        ip3.displayConnectionCapabilities("Pro");
        ip3.makeVideoCalls("757.633.0954");
        ip3.recordVoiceMessages("757.633.0954");

    }
}
