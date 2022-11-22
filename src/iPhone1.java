
class iPhone1 {
    public void makeCalls (String phoneNumber){
        System.out.println("Calling the number: " + phoneNumber + " ...");
        System.out.println("The phone number is out of service.");
    }

    public void sendTexts (String phoneNumber){
        System.out.println("Messaging the number: " + phoneNumber + " ...");
        System.out.println("Message has been sent!");
    }
}

class iPhone2 extends iPhone1 {

    public void makeVideoCalls(String phoneNumber){
        System.out.println("Facetiming Maryna at: " + phoneNumber + " ...");
        System.out.println("Hello!");
    }

    public void recordVoiceMessages (String phoneNumber){
        System.out.println("Recording audio for Maryna at: " + phoneNumber + " ...");
        System.out.println("Message has been sent!");
    }
}
