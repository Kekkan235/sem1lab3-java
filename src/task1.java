import java.util.*;

public class task1 {
    public static void main(String[] args) {
        int n = 10; // Размер массива
        Random random = new Random();

        //массив из N случайных чисел от 0 до 100
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(101);
        }
        System.out.println("1. Массив: " + Arrays.toString(array));

        //список List на основе массива
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("2. Список: " + list);

        // сортировка списка по возрастанию
        Collections.sort(list);
        System.out.println("3. По возрастанию: " + list);

        // сортировка списка в обратном порядке
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("4. По убыванию: " + list);

        // перемешка списка
        Collections.shuffle(list);
        System.out.println("5. Перемешанный: " + list);

        // циклический сдвиг на 1 элемент
        Collections.rotate(list, 1);
        System.out.println("6. Сдвиг на 1: " + list);

        // оставить в списке только уникальные элементы
        List<Integer> uniqueList = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("7. Уникальные элементы: " + uniqueList);

        // оставить в списке только повторяющиемя элементы
        List<Integer> duplicatesList = new ArrayList<>();
        for (Integer item : list) {
            if (Collections.frequency(list, item) > 1 && !duplicatesList.contains(item)) {
                duplicatesList.add(item);
            }
        }
        System.out.println("8. Дублирующиеся элементы: " + duplicatesList);

        // получить массив из списка
        Integer[] resultArray = list.toArray(new Integer[0]);
        System.out.println("9. Массив из списка: " + Arrays.toString(resultArray));

        // подсчет количества вхождений каждого числа и вывод рез-та
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("10. Частота вхождений: " + frequencyMap);
    }
}