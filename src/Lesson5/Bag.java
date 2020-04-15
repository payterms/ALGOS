package Lesson5;

import java.util.LinkedList;
import java.util.List;

/*
 * Из заданного множества предметов со свойствами «стоимость» и «вес»
 * требуется отобрать подмножество с максимальной полной стоимостью,
 * соблюдая при этом ограничение на суммарный вес.
 * */
public class Bag {
    private int bagCapacity;
    private Item[] items;
    private List<Integer> list = new LinkedList<>();

    public Bag(int capacity, Item... items) {
        this.bagCapacity = capacity;
        this.items = items;
    }

    public int getBag() {
        return getBag(items.length - 1, bagCapacity);
    }

    private int getBag(int i, int restCapacity) {
        if (i < 0) {
            return 0;
        }
        if (items[i].weight > restCapacity) {
            // не берем данный элемент, т.к. не вмещаетсяя по весу
            //System.out.println("не берем элемент с индексом " + i + " Вес элемента: " + items[i].weight + " Осталось места в рюкзаке: " + restCapacity);
            return getBag(i - 1, restCapacity);
        } else {
            // System.out.println("At step " + i + " restCapacity " + restCapacity + " var1 " + getBag(i - 1, restCapacity) + " var2 " + (getBag(i - 1, restCapacity - items[i].weight) + items[i].cost));
            // ищем в оставшихся элементах комбинацию с максимальным удельным весом
            // Выбираем из вариантов лучший - если бы взяли предыдущий элемент и если бы не взяли
            return Math.max(getBag(i - 1, restCapacity), getBag(i - 1, restCapacity - items[i].weight) + items[i].cost);
        }
    }

    public static class Item {
        private int weight;
        private int cost;

        public Item(int weight, int cost) {
            this.weight = weight;
            this.cost = cost;
        }
    }
}