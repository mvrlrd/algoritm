import java.util.Arrays;
import java.util.Date;

public class App {

    private static int[] array = new int[100000];

    public static void main(String[] args) {

        fillArray(array);

        int[] array1 = array.clone();
        int[] array2 = array.clone();
        int[] array3 = array.clone();

        System.out.println(Arrays.toString(array));

        bubbleSorter(array1);
        sortVibor(array2);
        insertIntoSort(array3);

//        System.out.println("array исходный   "+Arrays.toString(array));
//        System.out.println("array пузырек    "+Arrays.toString(array1));
//        System.out.println("array выбором    "+Arrays.toString(array2));
//        System.out.println("array3 вставкой  "+Arrays.toString(array3));

    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (0 + Math.random() * 10);
        }
    }
    //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
    public static void bubbleSorter(int[] arr) {
        Date d1 = new Date();
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        Date d2 = new  Date();
        long t = d2.getTime()-d1.getTime();
        System.out.println("время сортировки bubble "+t);
    }
    
    //МЕТОД  СОРТИРОВКИ ВЫБОРОМ
    public static void sortVibor(int[] arr) {
        Date d1 = new Date();
        	for (int min = 0; min < arr.length - 1; min++) {
             		int least = min;
            		for (int j = min + 1; j < arr.length; j++) {
               		    if (arr[j] < arr[least]) {
                    				least = j;
                     			}
                 		}
             		    int tmp = arr[min];
             		    arr[min] = arr[least];
             		    arr[least] = tmp;
             	}
        Date d2 = new  Date();
        long t = d2.getTime()-d1.getTime();
        System.out.println("время сортировки выбором "+t);
         }

    //МЕТОД СОРТИРОВКИ ВСТАВКОЙ
    public static void insertIntoSort(int[] arr) {
        Date d1 = new Date();
        int temp, j;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
        Date d2 = new  Date();
        long t = d2.getTime()-d1.getTime();
        System.out.println("время сортировки вставкой "+t);
    }
}
