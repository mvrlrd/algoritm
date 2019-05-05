import java.util.ArrayList;
import java.util.List;

public class Pack {


    public static List<Item> bestItems2 = new ArrayList<Item>();

    private static double maxW;
    int n;

    public double bestPrice;

    public Pack(double _maxW) {
        maxW = _maxW;
    }


    //вычисляет общий вес набора предметов
    private double CalcWeigth(List<Item> items) {
        double sumW = 0;
        for (int i = 0; i < items.size() ; i++) {
            sumW += items.get(i).weight;
        }

        return sumW;
    }

    //вычисляет общую стоимость набора предметов
    private double CalcPrice(List<Item> items) {
        double sumPrice = 0;
        for (int i = 0; i < items.size() ; i++) {
            sumPrice += items.get(i).price;
        }
        return sumPrice;
    }

    private void CheckSet(List<Item> items) {

            if(CalcWeigth(items) <= maxW && CalcPrice(items) > bestPrice)
            {


                for (int i = 0; i < items.size() ; i++) {
                    if (!bestItems2.contains(items.get(i))) {
                        bestItems2.add(items.get(i));
                    }
                    for (int j = 0; j <bestItems2.size() ; j++) {
                        if (!items.contains(bestItems2.get(i))){
                            bestItems2.remove(i);
                        }
                    }


                }
//                bestItems = items;
                bestPrice = CalcPrice(items);
            }
//        }
    }






//    }

    public void delete(List<Item> items){
            CheckSet(items);
        if (items.size()==0){
            return;
        }
del(items);
//        for (int i = 0; i < items.size(); i++) {
//
//            Item it = items.get(0);
//            items.remove(0);
//            CheckSet(items);
//            items.add(it);
//        }
//        for (int i = 0; i <items.size() ; i++) {
//
//            Item it = items.get(0);
//            items.remove(i);
//            delete(items);
//            items.add(it);
//        }


    }
    public void del(List<Item>list){
        for (int i = 0; i <list.size() ; i++) {
            Item item = list.get(0);
            list.remove(0);
            CheckSet(list);

            del(list);
            list.add(item);
        }
    }

    public List<Item> GetBestSet()
    {
        return bestItems2;
    }
}