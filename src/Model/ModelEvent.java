package Model;

import Model.EventItem.ModelLargeToy;
import Model.EventItem.ModelMediumToy;
import Model.EventItem.ModelSmallToy;
import Model.EventItem.ModelToy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ModelEvent {
    private long idLast;
    private final int SMALLTOY = 1;
    private final int MEDIUMTOY = 2;
    private final int LARGETOY = 3;
    private List<String> toyType;
    private List<String> prizeToys;

    public ModelEvent() {
        this.toyType = new ArrayList<>();
        this.prizeToys = new ArrayList<>();
    }

    /**
     * Загружаем типы игрушек
     */
    public void loadToyType() {
        this.toyType.add("Кошечка");
        this.toyType.add("Собачка");
        this.toyType.add("Машинка");
        this.toyType.add("Меч");
        this.toyType.add("Робот");
        this.toyType.add("Кораблик");
        this.toyType.add("Единорог");
        this.toyType.add("Водяной пистолет");
        this.toyType.add("Мяч");
        this.toyType.add("Лего");
    }

    /**
     * Загрузить из файла информацию об уже выигранных игрушках.
     * @param path путь к файлу с информацией об уже выигранных игрушках.
     */
    public void loadPrizeToy(String path) {
        try (BufferedReader file = new BufferedReader(new FileReader(path))) {
            String toyData;
            while ((toyData = file.readLine()) != null) {
                prizeToys.add(toyData);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    /**
     * Установить последний ID на основе загруженных выигрышей.
     */
    public void setIdLast() {
        long idMax = 0;
        for (String toy : prizeToys) {
            String idInfo = toy.substring(0, toy.indexOf(';'));
            long idCurrent = Long.parseLong(idInfo.split(":")[1]);
            if (idMax < idCurrent) idMax = idCurrent;
        }
        this.idLast = idMax + 1;
    }

    /**
     * Выдача выигрыша.
     * @param weight вес, который определяет размер игрушки.
     * @param type выбранный тип игрушки.
     * @return игрушка.
     */
    public ModelToy getToy(int weight, String type) {
        switch (weight) {
            case SMALLTOY:
                return new ModelSmallToy(type, idLast++);
            case MEDIUMTOY:
                return new ModelMediumToy(type, idLast++);
            case LARGETOY:
                return new ModelLargeToy(type, idLast++);
            default:
                return null;
        }
    }

    public List<String> getToyType() {
        return toyType;
    }

    /**
     * Получить информацию об уже выданных игрушках.
     * @return информация в формате(title:info;title:info...)
     */
    public String prizeInfo() {
        return String.join("\n", prizeToys);
    }
}
