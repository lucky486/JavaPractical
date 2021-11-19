interface Vehicle {
    String Engine_Capacity = "";
    String Mileage = "";

    public void apply_breaks();

    public void speed_up();

    public void gear_change();
}

class Bicycle implements Vehicle {
    String Engine_Capacity = "-";
    String Mileage = "-";

    public void apply_breaks() {
        System.out.println("Applying Breaks to the Bicycle.");

    }

    public void speed_up() {
        System.out.println("Speeding Up the Bicycle.");

    }

    public void gear_change() {
        System.out.println("Changing Gears of the Bicycle.");
    }
}

class Bike implements Vehicle {
    String Engine_Capacity = "0.25 litres";
    String Mileage = "67 kmpl";

    public void apply_breaks() {
        System.out.println("Applying Breaks to the Bike.");

    }

    public void speed_up() {
        System.out.println("Speeding Up the Bike.");

    }

    public void gear_change() {
        System.out.println("Changing Gears of the Bike.");
    }
}

class Car implements Vehicle {
    String Engine_Capacity = "1.5-litre diesel engine";
    String Mileage = "Up to 25.3 kmpl";

    public void apply_breaks() {
        System.out.println("Applying Breaks to the Car.");

    }

    public void speed_up() {
        System.out.println("Speeding Up the Car.");

    }

    public void gear_change() {
        System.out.println("Changing Gears of the Car.");
    }
}

public class program {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        System.out.println("Bicycle class implementing Vehicle interface :");
        Bicycle bi = new Bicycle();
        System.out.println("Engine Capacity : " + bi.Engine_Capacity);
        System.out.println("Mileage : " + bi.Mileage);
        bi.apply_breaks();
        bi.speed_up();
        bi.gear_change();
        System.out.println("------------------------------------------------\n");

        System.out.println("------------------------------------------------");
        System.out.println("Bike class implementing Vehicle interface :");
        Bike b = new Bike();
        System.out.println("Engine Capacity : " + b.Engine_Capacity);
        System.out.println("Mileage : " + b.Mileage);
        b.apply_breaks();
        b.speed_up();
        b.gear_change();
        System.out.println("------------------------------------------------\n");

        System.out.println("------------------------------------------------");
        System.out.println("Car class implementing Vehicle interface :");
        Car c = new Car();
        System.out.println("Engine Capacity : " + c.Engine_Capacity);
        System.out.println("Mileage : " + c.Mileage);
        c.apply_breaks();
        c.speed_up();
        c.gear_change();
        System.out.println("------------------------------------------------\n");

    }
}

/*

OUTPUT :

------------------------------------------------
Bicycle class implementing Vehicle interface :  
Engine Capacity : -
Mileage : -
Applying Breaks to the Bicycle.
Speeding Up the Bicycle.
Changing Gears of the Bicycle.
------------------------------------------------

------------------------------------------------
Bike class implementing Vehicle interface :
Engine Capacity : 0.25 litres
Mileage : 67 kmpl
Applying Breaks to the Bike.
Speeding Up the Bike.
Changing Gears of the Bike.
------------------------------------------------

------------------------------------------------
Car class implementing Vehicle interface :
Engine Capacity : 1.5-litre diesel engine
Mileage : Up to 25.3 kmpl
Applying Breaks to the Car.
Speeding Up the Car.
Changing Gears of the Car.
------------------------------------------------
*/
