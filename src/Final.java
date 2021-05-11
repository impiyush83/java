public class Final {
    final int i = 10;
    static int j = 10;


    public void changeValue () {
    //   i = 10 This will give error as the i is final
        j = 20;
    }


    public static void changeStaticValue () {
    //     i = 10; instance variables not allowed in static methods
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("HelloWorld");
    }
}
