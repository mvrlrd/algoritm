public class Item {
    private String name;
    private int price;
    private int id;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        hashing();

    }

    private void hashing(){
        char [] arr = this.name.toCharArray();
        int a=0;
        for (int i = 0; i <arr.length ; i++) {
            a += arr[i];
        }
        this.id = a%10;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
