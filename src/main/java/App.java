import java.util.ArrayList;
import java.util.List;

public class App {

    private static double res=1;
    private static int c=0;



    public static void main(String[] args) {

        multiply(3,3);
        System.out.println("Возведение в степень : "+res);

        System.out.println("S E C O N D  T A S K ___________________");

        final Item item1 = new Item("TV",15,22);
        final Item item2 = new Item("banana",2,2);
        final Item item3 = new Item("glasses",1,7);
        final Item item4 = new Item("gold",25,90);
        final Item item5 = new Item("gum",2,1);

        List<Item> list = new ArrayList<Item>(){{
            add(item1);
            add(item2);
            add(item3);
            add(item4);
            add(item5);
        }};

        Pack pack = new Pack(29);
        pack.searchingForBestSet(list);
        System.out.println(pack.toString());

    }

// возведение в степень
    private static double multiply(int x, int b){
        if (b == 0) {
            res = 1;
            return res;
        }
        if (b == 1) {
            return res=x;
        }
        if ((b>1)&&(b>c)) {
            res = res * x;
            c++;
            multiply(x,b);
        }
        if ((b<0)&&(b<c)){
            res=res/x;
            c--;
            multiply(x,b);
        }
        return  res;
    }



}
