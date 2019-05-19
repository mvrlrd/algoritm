
import java.util.LinkedList;

public class Hash {
    private LinkedList<Item>[] hashMap;


    public Hash(int maxSize) {
        this.hashMap = new LinkedList[maxSize];
        for (int i = 0; i <maxSize ; i++) {
            hashMap[i]=new LinkedList<Item>();
        }

    }

    public void addItem(Item item){
        if (hashMap.length >= item.getId()){
            hashMap[item.getId()].add(item);
        }
    }

    public void display(){
        for (int i = 0; i < hashMap.length; i++) {
            System.out.print(i);
            for (int j = 0; j < hashMap[i].size() ; j++) {
                    System.out.print("   "+ hashMap[i].get(j).getName()+"--"+hashMap[i].get(j).getPrice());
            }
            System.out.println();
        }
    }

    public void display(String name){
        char [] arr = name.toCharArray();
        int a=0;
        for (int i = 0; i <arr.length ; i++) {
            a += arr[i];
        }
        int id = a%10;
        for (int j = 0; j <hashMap[id].size() ; j++) {
            if (hashMap[id].get(j).getName().equals(name)) {
                System.out.println(hashMap[id].get(j).getName()+"  "+hashMap[id].get(j).getPrice());
            }
        }
    }
}
