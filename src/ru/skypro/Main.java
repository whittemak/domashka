package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Задача 1");
        byte child = 1;
        short men = 200;
        int women = 500;
        long people = 1000L;
        float height = 2.55f;
        double weight = 50.7777777;
        System.out.println("Задача 2");
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес " + totalWeight + " кг");
        float raznica = secondBoxer - firstBoxer;
        System.out.println("Разница в весе " + raznica + " кг");
        System.out.println("Задача 3");
        int banan = 80;
        int milk = 105;
        int ice = 100;
        int egg = 70;
        int total = banan * 5 + milk * 2 + ice * 2 + egg * 4;
        float kilo = total / 1000;
        System.out.println("Общий вес завтрака " + kilo + " кг");
        System.out.println("Задача 4");
        int purpose = 7;
        double minimum = 0.25;
        float maximum = 0.5f;
        double maxDay = purpose / minimum;
        float minDay = purpose / maximum;
        double average = (minimum + maximum) / 2;
        double averageDay = purpose / average;
        System.out.println("Минимально понадобится " + minDay + " дней" + "максимально понадобится " + maxDay + " дней" +  "в среднем понадобится " + averageDay + " дней");
        System.out.println("Задача 5");
        int masha = 67760;
        int mashaGod = masha * 12;
        double mashaRost = masha * 1.1;
        double mashaRostGod = mashaRost * 12;
        double mashaRaznica = mashaRostGod - mashaGod;
        System.out.println("Маша теперь получает " + mashaRost + " рублей" "годовой доход вырос на " + mashaRaznica + " рублей" );
        int denis = 83690;
        int denisGod = denis * 12;
        double denisRost = denis * 1.1;
        double denisRostGod = denisRost * 12;
        double denisRaznica = denisRostGod - denisGod;
        System.out.println("Денис теперь получает " + denisRost + " рублей" "годовой доход вырос на " + denisRaznica + " рублей" );
        int kris = 76230;
        int krisGod = kris * 12;
        double krisRost = kris * 1.1;
        double krisRostGod = krisRost * 12;
        double krisRaznica = krisRostGod - krisGod;
        System.out.println("Кристина теперь получает " + krisRost + " рублей" "годовой доход вырос на " + krisRaznica + " рублей" );



        }

    }
}
