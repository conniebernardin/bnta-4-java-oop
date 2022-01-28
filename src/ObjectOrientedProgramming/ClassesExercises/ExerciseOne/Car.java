package ObjectOrientedProgramming.ClassesExercises.ExerciseOne;

//new class = Car
public class Car {
        private int year;
        private Manufacturer manufacturer;
        private int mileage;
        private String engineType;
        private double price;

        //construction parameters
        public Car(int year, Manufacturer manufacturer, int mileage, String engineType, double price) {
                this.year = year;
                this.manufacturer = manufacturer;
                this.mileage = mileage;
                this.engineType = engineType;
                this.price = price;
        }

        //set and get mileage
        public void setMileage(int mileage){
                this.mileage = mileage;
        }
        public int getMileage(){
                return mileage;
        }
        //set and get year
        public void setYear(int year){
                this.year = year;
        }
        public int getYear(){
                return year;
        }
        //set and get manufacturer
        public void setManufacturer(Manufacturer manufacturer){
                this.manufacturer = manufacturer;
        }
        public Manufacturer getManufacturer(){
                return manufacturer;
        }
        //set and get engine type
        public void setEngineType(String engineType){
                this.engineType = engineType;
        }
        public String getEngineType(){
                return engineType;
        }
        //set and get price
        public void setPrice(int price){
                this.price = price;
        }
        public double getPrice(){
                return price;
        }

        @Override
        public String toString() {
                return "Car{" +
                        "year=" + year +
                        ", manufacturer=" + manufacturer +
                        ", mileage=" + mileage +
                        ", engineType='" + engineType + '\'' +
                        ", price=" + price +
                        '}';
        }
}

