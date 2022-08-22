package lesson11.part2;

public class MainClass {
    public static void main(String[] args) {
        CustomCollection<Integer> cc1 = new CustomCollection<>();

        cc1.fillArray();
        cc1.addElement(2);
        cc1.deleteElement(5);
        cc1.getElementByIndex(3);
        cc1.elementInCollectionCheck(10);
        cc1.clearCollection();

        CustomCollection<String> cc2 = new CustomCollection<>(10);
        cc2.fillStringArray();
        cc2.addStringElement("o");
        cc2.deleteStringElement(2);
        cc2.getStringElementByIndex(5);
        cc2.stringElementInCollectionCheck("g");
        cc2.clearStringCollection();




    }
}
