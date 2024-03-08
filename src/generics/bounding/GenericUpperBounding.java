package generics.bounding;

public class GenericUpperBounding<T extends Number> {
    //sinirlama yapabiliriz  ---->     <T extends Number >

    private T[] numbers;


    public GenericUpperBounding(T[] numbers) {
        this.numbers = numbers;
    }

    public double getAverage() {
        double sum = 0;

        for (T t : this.numbers) {
            sum += t.doubleValue();
        }

        double average = sum / this.numbers.length;
        return sum;
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] doubles = {1.6, 2.3, 3.9, 4.345, 5.980, 6.1, 7.56, 8.7, 9.45, 10.334};

        GenericUpperBounding<Integer> gnc=new GenericUpperBounding<>(integers);
        System.out.println("gnc.getAverage() = " + gnc.getAverage());
        GenericUpperBounding<Double> gnc2=new GenericUpperBounding<>(doubles);
        System.out.println("gnc2.getAverage() = " + gnc2.getAverage());

    }
}
