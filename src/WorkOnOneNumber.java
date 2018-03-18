public class WorkOnOneNumber {
    private int numberOne;

    public WorkOnOneNumber(int numberOne) {
        this.numberOne = numberOne;
    }

    public void squaring() {
        int working = numberOne * numberOne;
        System.out.println(working);
    }

    public void erectingCube() {
        int working = numberOne * numberOne * numberOne;
        System.out.println(working);
    }
}