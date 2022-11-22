class iPadMini {

    public void displayDeviceName(String manufacturer, String device, String model, int generation){
        String deviceName = manufacturer + " " + device + " " + model + " " + generation;
        System.out.println("\nSelected device is: " + deviceName + "th generation");
    }

    public void determineScreenSize(String model){
        double display;

        if (model.equalsIgnoreCase("mini")){
            display = 8.3;
            System.out.println("Your device's screen size is: " +  display + "in");
        } else if (model.equalsIgnoreCase("air")){
            display = 10.9;
            System.out.println("Your device's screen size is: " +  display + "in");
        } else if (model.equalsIgnoreCase("pro")){
            display = 12.9;
            System.out.println("Your device's screen size is: " +  display + "in");
        } else {
            System.out.println("Wrong model name entered.");
        }
    }
}
class iPadAir extends iPadMini{

    public void displayConnectionCapabilities (String model) {

        if (model.equalsIgnoreCase("mini") ||
                model.equalsIgnoreCase("air") ||
                model.equalsIgnoreCase("pro"))
        {
            String connection = "Wi-Fi + Cellular";
            System.out.println("\nSupported connection in your device is: " + connection);
        } else {
            System.out.println("Wrong model name entered.");
        }
    }
}

class iPadPro extends iPadAir {

    public void makeVideoCalls(String phoneNumber){
        System.out.println("\nFacetiming Maryna at: " + phoneNumber + " ...");
        System.out.println("Hello!");
    }

    public void recordVoiceMessages (String phoneNumber){
        System.out.println("\nRecording audio for Maryna at: " + phoneNumber + " ...");
        System.out.println("Message has been sent!");
    }
}



