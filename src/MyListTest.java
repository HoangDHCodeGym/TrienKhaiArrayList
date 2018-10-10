public class MyListTest {
    public static void main(String[] args) {
        MyList list = new MyList<String>(5);
        list.add("Hello");
        list.add("Manga");
        list.add("Vietnam");
        list.printList();
        list.remove(1);
        list.printList();
        list.add(1, "Codegym");
        list.printList();
        MyList list2 = list.clone();
        list2.printList();
        System.out.println("Found position 'Vietnam' in list: " + list.indexOf("Vietnam"));
    }
}
