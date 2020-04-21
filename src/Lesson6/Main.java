package Lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> mtm = new MyTreeMap<>();

        testTreeForBalance();

    }

    static void testTreeForBalance() {
        int balanced = 0;
        Random random = new Random();
        MyTreeMap<Integer, String>[] treeMaps = new MyTreeMap[10000];
        for (int i = 0; i < treeMaps.length; i++) {
            treeMaps[i] = new MyTreeMap<>();
            /*1. Создать и запустить программу для построения двоичного дерева. В цикле построить двадцать деревьев
             с глубиной в 6 уровней. Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел
             типа int. Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -100 до 100.
            * */
            while (treeMaps[i].height() < 5) {
                treeMaps[i].put(random.nextInt(200) , "");
            }
            /*
            * 2. Проанализировать, какой процент созданных деревьев являются несбалансированными.
            * */
            if (treeMaps[i].isBalance()) {
                balanced++;
            }
        }
        double percent = ((double) balanced)*100/treeMaps.length;
        System.out.format("%n %.2f процентов(а) деревьев являются сбалансированными %n",  percent);
    }

}
