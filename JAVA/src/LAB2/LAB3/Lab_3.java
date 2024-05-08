package LAB3;

import java.util.*;

 class Lab_31 {
    public static void main(String[] args) {

        List<Integer> originalList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> copiedList = new ArrayList<>(originalList);
        System.out.println("Копія списку масивів: " + copiedList);


        Set<String> hashSet = new HashSet<>(Arrays.asList("apple", "banana", "orange"));
        List<String> arrayList = new ArrayList<>(hashSet);
        System.out.println("Перетворений HashSet у ArrayList: " + arrayList);


        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        List<String> elementsToInsert = Arrays.asList("X", "Y");
        int insertPosition = 2;
        linkedList.addAll(insertPosition, elementsToInsert);
        System.out.println("Зв'язаний список після вставки елементів: " + linkedList);


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println("Перегляд відображень у map:");
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

