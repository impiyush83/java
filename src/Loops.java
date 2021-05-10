public class Loops {
    public static void main(String[] args) {
        System.out.println("For Loops");
        Integer [] numbers = {1,2,3,4,5,6};
        for (int i : numbers ) {
            System.out.println("Item value:"+ i);
        }

        System.out.println("Do While Loops");

        int iteratorIndex = 0;
        do {
            System.out.println("Item value:"+ numbers[iteratorIndex]);
            iteratorIndex += 1;
        }while(iteratorIndex < numbers.length);
    }
}
