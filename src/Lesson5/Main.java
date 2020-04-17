package Lesson5;

public class Main {
    private static final int CAPACITY = 8;


    public static void main(String[] args) {

        /*1. Написать программу по возведению числа в степень с помощью рекурсии.*/
        TestExp();
        /*  2. Написать программу «Задача о рюкзаке» с помощью рекурсии.*/
        TestBag();
        /* 3. Доработать бинарный рекурсивный поиск (если элемент найден, вернуть true + индекс элемента, если нет бросить исключение)*/
        testBinaryFind();

    }

    private static void TestBag() {
        Bag bag = new Bag(15,
                new Bag.Item(7, 1),
                new Bag.Item(4, 13),
                new Bag.Item(2, 10),
                new Bag.Item(8, 100),
                new Bag.Item(6, 12));

        System.out.println("Weight of Bag " + bag.getBag());
    }

    private static void TestExp() {

        System.out.println("2^5 = " + recursiveExponentiation(2, 5));

        System.out.println("3^3 = " + recursiveExponentiation(3, 3));

        System.out.println("5^0 = " + recursiveExponentiation(5, 0));
    }

    private static void testBinaryFind() {
        MyArrBinaryFind arr = new MyArrBinaryFind(CAPACITY);

        for (int i = 0; i < CAPACITY; i++) {
            arr.insert( 100 - 3*i);
        }

        int search = 94;
        MyArrBinaryFind.ResultValue res = arr.binaryFind(search);
        System.out.println(res);
    }

    static int recMultiply(int a, int b) {
        if (b == 1) {
            return a;
        }
        return recMultiply(a, b - 1) + a;
    }

    static int recursiveExponentiation(int a, int n) {
        if (n <= 0) {
            return 1;
        }
        // a^n = a^(n-1) * a
        return recursiveExponentiation(a, n - 1) * a;
    }


    static int multiply(int a, int b) {
        int value = 0;
        for (int i = 0; i < b; i++) {
            value += a;
        }
        return value;
    }


    static int recTriangle(int n) {
        if (n <= 1) {
            return 1;
        }
        return recTriangle(n - 1) + n;
    }

    static int triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }


    static long recFibo(int n) {
        System.out.print(n + " ");
        if (n < 3) {
            return 1;
        }

        return recFibo(n - 2) + recFibo(n - 1);
    }


    static long fibo(int n) {
        long a = 1;
        long b = 1;
        System.out.print(n + " ");

        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }


    public static void hello(String name) {
        System.out.println("Hello " + name);
        bye(name);
    }

    public static void bye(String name) {
        System.out.println("Good bye " + name);
    }


    static Long recFact(int n) {
        if (n <= 1) {
            return 1L;
        }

        return recFact(n - 1) * n;
    }

    // factorial
    static Long fact(int n) {
        Long value = 1l;
        for (int i = 1; i <= n; i++) {
            value *= i;
        }

        return value;
    }

//    public static int countdown(int n) {
//        System.out.println(n);
//        if ( n == 1) {
//            return 1;
//        }
//        return countdown(n - 1);
//    }
}
