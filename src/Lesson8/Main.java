package Lesson8;

import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        int y = 0x10;
//        System.out.println(y);

//        int x = 64;
//        int y = 3;
//
//        int z = (x << y);
//        System.out.println(z);

//        int a = 60;
//        int c = a >>> 2;
//        System.out.println("a >>> 2 = " + c );

//        int x = 50 & 0x7fffffff;
//        System.out.println(x);

//        Graph graph = new Graph(10);
//
//        graph.addVertex("Moscow");
//        graph.addVertex("Tula");
//        graph.addVertex("Lipetsk");
//        graph.addVertex("Ryazan");
//        graph.addVertex("Tambov");
//
//        graph.addEdge("Moscow","Tula");
//        graph.addEdge("Moscow","Ryazan");
//        graph.addEdge("Ryazan","Tambov");
////
////
//        Stack<String> path = graph.shortPath("Moscow","Tambov");
//        System.out.println("path Moscow to Tambov ");
//        showPath(path);


//
               ChainingHashMap<Integer ,String> map = new ChainingHashMap<>();
        map.put(1,"apple");
        map.put(2,"apricot ");
        map.put(3,"banana");
        map.put(4,"grape");
        map.put(5,"lemon");
        map.put(6,"peach");
        map.put(7,"Plum");
        map.put(8,"mango");
        map.put(9,"Pomelo");
        map.put(10,"pomegranate");
        map.put(11,"tomato");

        System.out.println(map);

        map.delete(10);
        map.delete(3);

        System.out.println(map);

        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            map.put(random.nextInt(1000),"");
        }
        System.out.println(map);

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
//
//        String s = "asd";
//        Double d = 1.0;
//
//        LinearProbingHashMap<Integer, String> map1 = new LinearProbingHashMap<>();
//        map1.put(1, "one");
//        map1.put(2, "two");
//        map1.put(12, "12");
//        map1.put(15, "15");
//
//        System.out.println(map1.get(1));
//        map1.put(1, "1");
//        System.out.println(map1.get(1));
    }

    private static void showPath(Stack<String> path) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        int lenght = 0;

        while (!path.isEmpty()) {
            if (!isFirst) {
                sb.append(" -> ");
            }
            isFirst = false;
            sb.append(path.pop());
            lenght++;
        }
        System.out.println(sb);
        System.out.println("path " + lenght);
    }
}
