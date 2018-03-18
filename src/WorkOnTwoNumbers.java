public class WorkOnTwoNumbers {
    private double numberOne;
    private double numberTwo;

    public WorkOnTwoNumbers(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public void addition() {
        double working = numberOne + numberTwo;
        System.out.println(working);
    }

    public void subtraction() {
        double working = numberOne + numberTwo;
        System.out.println(working);
    }

    public void multiplication() {
        double working = numberOne * numberTwo;
        System.out.println(working);
    }

    public void division() {
        double working = numberOne / numberTwo;
        System.out.println(working);
    }
}