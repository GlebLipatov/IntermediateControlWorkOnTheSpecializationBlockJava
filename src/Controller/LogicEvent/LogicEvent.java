package Controller.LogicEvent;

import java.util.Random;

public class LogicEvent {
    /**
     * Получить вес игрушки рандомно.
     * @return вес игрушки.
     */
    public int getRandomWeight() {
        return new Random().nextInt(1, 4);
    }
}
