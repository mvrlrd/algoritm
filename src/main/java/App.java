import java.util.ArrayList;
import java.util.List;

public class App {

    private static double res=1;
    private static int c=0;



    public static void main(String[] args) {
    multiply(3,-6);

//        System.out.println(res);


       final Item item1 = new Item("a",10,11);
        final Item item2 = new Item("b",1,22);
        final Item item3 = new Item("c",13,20);
        final Item item4 = new Item("d",29,62);
        final Item item5 = new Item("e",1,1);

        List<Item> list = new ArrayList<Item>(){{
           add(item1);
            add(item2);
            add(item3);
            add(item4);
            add(item5);
        }};
//        System.out.println(list.size()+" size");
//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get(i));
//        }

        Pack pack = new Pack(29);

        pack.delete(list);
//        System.out.println(
//        pack.GetBestSet().toString());
//        for (int i = 0; i <pack.GetBestSet().size() ; i++) {
//            System.out.print( pack.GetBestSet().get(i).name);
//            System.out.print("  ");

//        }

        System.out.println(pack.bestPrice);
        for (int i = 0; i <pack.bestItems2.size() ; i++) {
            System.out.print(pack.bestItems2.get(i).name+" ");
        }

    }


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
