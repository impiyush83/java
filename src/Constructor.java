public class Constructor {
    static public int staticVariable = 5;
    public int nonstaticVariable = 5;
    Constructor() {
        staticVariable = 20;
        this.nonstaticVariable = 20;
        System.out.println("Inside Constructor staticVariable: " + staticVariable);
        System.out.println("Inside Constructor nonstaticVariable: " + nonstaticVariable);
    }

    Constructor(int x) {
        staticVariable = x;
        this.nonstaticVariable = x;
        System.out.println("Inside Constructor staticVariable: " + staticVariable);
        System.out.println("Inside Constructor nonstaticVariable: " + nonstaticVariable);

    }

    public static void main(String[] args) {
        System.out.println("Creating constructor object");
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(50);
        // Static variables are same 50 because many objects refer to same memory
        System.out.println("Static Variable : " + Constructor.staticVariable);
        System.out.println("Static Variable : " + Constructor.staticVariable);
        // Non Static variables are different 20 and 50 because many object have their own memory
        System.out.println("Non Static Variable : " + constructor1.nonstaticVariable);
        System.out.println("Non Static Variable : " + constructor2.nonstaticVariable);
    }
}
