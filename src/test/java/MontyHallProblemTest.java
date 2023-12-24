import org.example.MontyHallProblem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MontyHallParadoxTest {

    @Test
    public void testPlayMontyHall() {
        // Тестирование метода playMontyHall на 1000 повторениях
        int wins = 0;
        for (int i = 0; i < 1000; i++) {
            if (MontyHallProblem.playMontyHall()) {
                wins++;
            }
        }

        // Ожидаем, что вероятность выигрыша при смене двери близка к 2/3
        assertTrue(wins > 600);
    }
}
