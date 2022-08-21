package lesson11.part2;

import java.util.Arrays;
import java.util.Objects;

public class CustomCollection<C> {
    private int[] array;
    private String[] stringArray;
    public int size;

    public CustomCollection(){
        this.array = new int[10];
        this.stringArray = new String[10];
    }

    public CustomCollection(int size) {
        this.array = new int[size];
        this.stringArray = new String[size];
        this.size = size;

    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public void fillArray(){
        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }
        System.out.println(Arrays.toString(array));
    }

    public void fillStringArray(){
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = (String.valueOf((char)(i + 97)));
        }
        System.out.println(Arrays.toString(stringArray));
    }

    public void addElement(int element) {
        int[] resultArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i];

        }
        resultArray[resultArray.length - 1] = element;
        System.out.println(Arrays.toString(resultArray));
        setArray(resultArray);
    }

    public void addStringElement(String element){
        String[] stringResultArray = new String[stringArray.length + 1];
        for (int i = 0; i < stringArray.length; i++) {
            stringResultArray[i] = stringArray[i];
        }
        stringResultArray[stringResultArray.length - 1] = element;
        System.out.println(Arrays.toString(stringResultArray));
        setStringArray(stringResultArray);
    }

    public void deleteElement(int index) {
        int[] resultArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                resultArray[j++] = array[i];
            }

        }
        System.out.println(Arrays.toString(resultArray));
        setArray(resultArray);
    }

    public void deleteStringElement(int element){
        String[] stringResultArray = new String[stringArray.length - 1];
        int remainingElements = stringArray.length - ( element + 1 );
        System.arraycopy(stringArray, 0, stringResultArray, 0, element);
        System.arraycopy(stringArray, element + 1, stringResultArray, element, remainingElements);
        System.out.println(Arrays.toString(stringResultArray));

        setStringArray(stringResultArray);
    }

    public void getElementByIndex(int index){
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                System.out.println("Элемент:" + array[i]);
            }
        }
    }

    public void getStringElementByIndex(int index){
        for (int i = 0; i < stringArray.length; i++) {
            if (i == index){
                System.out.println("Элемент: " + stringArray[i]);
            }
        }
    }

    public void elementInCollectionCheck(int element){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("Данный элемент находится в коллекции");
                break;
            }else if (i == array.length - 1) {
                System.out.println("Данного элемента нет в коллекции");
            }

        }

    }

    public void stringElementInCollectionCheck(String element){
        for (int i = 0; i < stringArray.length; i++) {
            if (element.equals(stringArray[i])){
                System.out.println("Данный элемент находится в коллекции");
                break;
            } else if (i == stringArray.length - 1){
                System.out.println("Данного элемента нет в коллекции");
            }

        }
    }

    public void clearCollection(){
        int[] resultArray = new int[]{};
        Arrays.fill(array, 0);
        System.out.println(Arrays.toString(resultArray));
        setArray(resultArray);

    }

    public void clearStringCollection(){
        String[] stringResultArray = new String[]{};
        Arrays.fill(stringArray,"");
        System.out.println(Arrays.toString(stringResultArray));
        setStringArray(stringResultArray);
    }
}
