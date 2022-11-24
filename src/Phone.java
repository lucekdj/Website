class Phone { // Parent Class, Super Class
    String manufacturer; // null
    String model;
    int version = 16; // 0
    boolean isContract;
    int fullPrice;
    int pricePerMonths;
    double displaySize;
    static int counter;
    int price;

    // method, describes what our Class is capable of doing
    void displayNameOfPhone(String manufacturer, String model, int version){
        System.out.println(manufacturer + model + version);
    }
}

class iPhone extends Phone {
    // no-argument constructor
    iPhone(){
    }
    // parametrized
    iPhone(int price){
       counter++; // 1
       this.price = price;
    }

    iPhone(int displaySize, int price, boolean isAvailableOnContract){
    this.price = price;
    }
}

class Samsung extends Phone{
    String accessory = "stylus";
    Samsung(int price, boolean isAvailableOnContract){
        counter++; // 2
    }
}

class Asus extends Phone{
    boolean isMemoryCard;
}




