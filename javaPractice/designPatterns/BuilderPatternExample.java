package javaPractice.designPatterns;

class Car {
    String name;
    int wheels;

    Car (Builder builder) {
        this.name = builder.name;
        this.wheels = builder.wheels;
    }

    static class Builder {
        String name = "default_name";
        int wheels = 4;

        Builder(String name){
            this.name = name;
        }

        Builder wheels(int num) {
            this.wheels = num;
            return this;
        }

        Car build() {
            return new Car(this);
        }
    }
}

public class BuilderPatternExample {
    public static void main(String[] args) {

            Car car = new Car.Builder("ford").wheels(4).build(); 
            System.out.println(car.name);
    }
}
