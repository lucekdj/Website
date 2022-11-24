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
       this.price = price + 1;
    }

    iPhone(int displaySize, int price, boolean isAvailableOnContract){
        this.price = price;
    }
}

class Samsung extends Phone{
    Samsung(int price, boolean isAvailableOnContract){
    }
}

class Asus extends Phone{
    boolean isMemoryCard;
}




