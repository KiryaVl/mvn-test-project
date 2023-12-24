package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//В качестве задачи предлагаю вам реализовать код для
//демонстрации парадокса Монти Холла (Парадокс Монти Холла
//        — Википедия ) и наглядно убедиться в верности парадокса
//(запустить игру в цикле на 1000 и вывести итоговый счет).
//Необходимо:
//        ● Создать свой Java Maven или Gradle проект;
//● Самостоятельно реализовать прикладную задачу;
//● Сохранить результат в HashMap<шаг теста, результат>
//        ● Вывести на экран статистику по победам и поражениям
public class MontyHallProblem {
    private static final int TOTAL_TESTS = 1000;

    public static void main(String[] args) {
        Map<Integer, String> results = new HashMap<>();

        for (int i = 1; i <= TOTAL_TESTS; i++) {
            boolean playerWins = playMontyHall();
            results.put(i, playerWins ? "Win" : "Lose");
        }

        // Выводим статистику
        int wins = (int) results.values().stream().filter(result -> result.equals("Win")).count();
        int losses = TOTAL_TESTS - wins;

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static boolean playMontyHall() {
        Random random = new Random();
        int carPosition = random.nextInt(3); // Расположение автомобиля (0, 1, 2)
        int playerChoice = random.nextInt(3); // Выбор игрока (0, 1, 2)

        // Ведущий открывает одну из дверей с козой
        int goatDoor;
        do {
            goatDoor = random.nextInt(3);
        } while (goatDoor == carPosition || goatDoor == playerChoice);

        // Игрок решает поменять свой выбор
        int newChoice;
        do {
            newChoice = random.nextInt(3);
        } while (newChoice == playerChoice || newChoice == goatDoor);

        // Проверка, выиграл ли игрок
        return newChoice == carPosition;
    }
}
