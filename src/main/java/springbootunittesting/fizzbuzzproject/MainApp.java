package springbootunittesting.fizzbuzzproject;

public class MainApp {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i<100;i++){
            fizzBuzz.setNumber((int) (Math.random()*1000));
            System.out.println(fizzBuzz.getNumber() + ", " + fizzBuzz.compute());
        }
    }
}
