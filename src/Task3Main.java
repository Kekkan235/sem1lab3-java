import java.util.*;

public class Task3Main {
    public static void main(String[] args) {
        // 1. Создайте список объектов Human
        List<Human> humans = Arrays.asList(
                new Human("Иван", "Иванов", 25),
                new Human("Пётр", "Петров", 30),
                new Human("Алексей", "Иванов", 20),
                new Human("Анна", "Сидорова", 22)
        );

        // 2. Положите список в HashSet и выведите
        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("HashSet: " + hashSet);

        // 3. Положите список в LinkedHashSet и выведите
        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // 4. Положите список в TreeSet и выведите
        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("TreeSet (естественный порядок Comparable): " + treeSet);

        // 5. TreeSet с компаратором HumanComparatorByLastName
        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("TreeSet (по фамилии): " + treeSetByLastName);

        // 6. TreeSet с анонимным компаратором по возрасту
        Set<Human> treeSetByAge = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        treeSetByAge.addAll(humans);
        System.out.println("TreeSet (по возрасту): " + treeSetByAge);

        /*
         * 7. Объясните различия в выводах коллекций (ответ в комментариях):
         *
         * - HashSet: Не гарантирует никакого порядка элементов. Порядок зависит от хэш-кодов.
         * - LinkedHashSet: Сохраняет элементы в порядке их добавления (вставки).
         * - TreeSet: Хранит элементы в отсортированном порядке:
         *     - По умолчанию использует метод compareTo из Comparable.
         *     - При передаче Comparator использует логику сравнения, заложенную в этот компаратор.
         *     Важно: Если компаратор (например, HumanComparatorByLastName) считает два объекта "равными" (возвращает 0),
         *     TreeSet посчитает один из них дубликатом и не добавит его в множество.
         */
    }
}