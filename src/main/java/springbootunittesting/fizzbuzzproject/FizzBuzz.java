package springbootunittesting.fizzbuzzproject;

public class FizzBuzz {
    private int number;

    public FizzBuzz(){

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public String compute() {
        String stringToPrint = "" + number;
        boolean isDividedByThree = false;
        if (number%3==0){
            stringToPrint = "Fizz";
            isDividedByThree = true;

        }
        if (number%5==0){
            if(isDividedByThree)
            {
            stringToPrint = stringToPrint.concat("Buzz");
            }
            else {
                stringToPrint = "Buzz";
            }
        }
        return stringToPrint;
    }
}
