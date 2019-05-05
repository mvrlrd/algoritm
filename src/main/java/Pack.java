import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pack {
    protected static List<Item> bestSet = new ArrayList<Item>();
    protected static double maxWeight;
    protected double bestPrice;

    public Pack(double _maxWeight) {
        maxWeight = _maxWeight;
    }

    //Вычисляем общий вес сета
    private double calculateWeigth(List <Item> items) {
        double sumWeight = 0;
        for (int i = 0; i < items.size() ; i++) {
            sumWeight += items.get(i).weight;
        }
        return sumWeight;
    }

    //вычисляет общую стоимость сета
    private double calculatePrice(List<Item> items) {
        double sumPrice = 0;
        for (int i = 0; i < items.size() ; i++) {
            sumPrice += items.get(i).price;
        }
        return sumPrice;
    }

    //проверяем является ли набор лучше тех которые уже были предложены
    private void bestSetChecker(List<Item> items) {
            if(calculateWeigth(items) <= maxWeight && calculatePrice(items) > bestPrice)
            {
                for (int i = 0; i < items.size() ; i++) {
                    //если лучший набор не содержит предметы из нового лучшего набора - добавляем их
                    if (!bestSet.contains(items.get(i))) {
                        bestSet.add(items.get(i));
                    }
                    for (int j = 0; j < bestSet.size() ; j++) {
                        //если лучший набор содержит предметы которые не входят в новый лучший набор - удаляем их
                        if (!items.contains(bestSet.get(i))){
                            bestSet.remove(i);
                        }
                    }
                }
                bestPrice = calculatePrice(items);
            }
    }

    public void searchingForBestSet(List<Item> items){
            bestSetChecker(items);
        if (items.size()==0){
            return;
        }
        refreshSet(items);
    }
    // прогоняем все варианты наборов
    private void refreshSet(List<Item>list){
        for (int i = 0; i <list.size() ; i++) {
            Item item = list.get(0);
            list.remove(0);
            bestSetChecker(list);
            refreshSet(list);
            list.add(item);
        }
    }

    public List<Item> getBestSet()
    {
        return bestSet;
    }

    @Override
    public String toString() {
        String[] names = new String[getBestSet().size()];
        for (int i = 0; i <getBestSet().size() ; i++) {
           names[i]= getBestSet().get(i).name;
        }
        return "Pack {" +
                "bestPrice = " + bestPrice +
                " sumWeight = "+ calculateWeigth(getBestSet())+
                "  items = " + Arrays.toString(names)+
                '}';
    }
}