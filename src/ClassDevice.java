public class ClassDevice {

    String manufacturer;
    String name;
    int version;
    String model;
    double screenSize;
    int desiredStorage;
    int[] storages = {128, 256, 512};
    double startingPrice = 0;
    boolean isContract;
    double pricePerMonth;
    char currency;

    public void fullName(String manufacturer, String name, int version, String model) {
        String fullName = manufacturer + " " + name + " " + version + " " + model;
        System.out.println("\nYour selected device is: " + fullName);
    }

    public void displayFullPriceBasedOnStorage(int[] storages) {

        System.out.print("\n");
        for (int storage : storages) {
            if (storage == 128) {
                startingPrice = 899;
            } else if (storage == 256) {
                startingPrice = startingPrice + 100;
            } else if (storage == 512) {
                startingPrice = startingPrice + 200;
            }
            System.out.println("For the " + storage + "GB storage, " + "the full price is: $" + startingPrice);
        }
    }

    public void calculatePricePerMonth(boolean isContract, int desiredStorage) {

        if (isContract) {
            if (desiredStorage == 128) {
                pricePerMonth = (double) 899 / 24;
            } else if (desiredStorage == 256) {
                pricePerMonth = (double) 999 / 24;
            } else if (desiredStorage == 512) {
                pricePerMonth = (double) 1199 / 24;
            }
        }

        System.out.println("\nPrice per month for 2-year contract: " + currency + String.format("%.2f", pricePerMonth));
    }

    // HomeworkTask1_Nov15: create three Constructors in your Class, which are taking different parameters,
    // and create three objects in the MainClass using these constructors

    // "no-argument" Constructor
    ClassDevice() {
        System.out.println("This is a blank constructor, which corresponds with line 8");
    }

    // Parameterized Constructor
    ClassDevice(String manufacturerInput, String nameInput, int versionInput) {
        manufacturer = manufacturerInput;
        name = nameInput;
        version = versionInput;
        System.out.println(manufacturerInput + nameInput + versionInput);
    }

    // Parameterized Constructor
    ClassDevice(String manufacturerInput, String nameInput, int versionInput, String modelInput) {
        manufacturer = manufacturerInput;
        name = nameInput;
        version = versionInput;
        model = modelInput;
        System.out.println(manufacturerInput + nameInput + versionInput + modelInput);
    }

    // Parameterized Constructor
    ClassDevice(String manufacturerInput, String nameInput, int versionInput, String modelInput, double screenSizeInput) {
        manufacturer = manufacturerInput;
        name = nameInput;
        version = versionInput;
        model = modelInput;
        screenSize = screenSizeInput;
        System.out.println(manufacturerInput + nameInput + versionInput + modelInput + screenSizeInput);
    }

}

