public class App {
    public static void main(String[] args) {
        Item item1 = new Item("Мяч",100);
        Item item2 = new Item("Колбаса",50);
        Item item3 = new Item("Коньки",2500);
        Item item4 = new Item("Порше",2500000);
        Item item5 = new Item("МакБук",200000);
        Item item6 = new Item("Шампунь",700);
        Item item7 = new Item("Гантели",1200);
        Item item8 = new Item("Творог",70);
//        System.out.println(item1.getId());
//        System.out.println(item2.getId());
//        System.out.println(item3.getId());
//        System.out.println(item4.getId());
//        System.out.println(item5.getId());
//        System.out.println(item6.getId());
//        System.out.println(item7.getId());
//        System.out.println(item8.getId());
        Hash hash = new Hash(10);
        hash.addItem(item1);
        hash.addItem(item2);
        hash.addItem(item3);
        hash.addItem(item4);
        hash.addItem(item5);
        hash.addItem(item6);
        hash.addItem(item1);
        hash.addItem(item7);
        hash.addItem(item8);

        hash.display();
        System.out.println();
        hash.display("Творог");
    }
}
