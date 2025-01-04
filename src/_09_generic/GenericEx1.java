package _09_generic;

import java.util.ArrayList;

class CustomList {
    ArrayList<String> list = new ArrayList<>();

    public void addElement(String element) { list.add(element); }
    public void removeElement(String element) { list.remove(element); }
    public String get(int i) { return list.get(i); }
    @Override
    public String toString() { return "CustomList = " + list; }
}

// 제네릭 클래스
class CustomListGeneric<T> {
    ArrayList<T> list = new ArrayList<>();
    public void addElement(T element) { list.add(element); }
    public void removeElement(T element) { list.remove(element); }
    public T get(int i) { return list.get(i); }
    @Override
    public String toString() { return "CustomList = " + list; }
}

public class GenericEx1 {
    public static void main(String[] args) {
        // not using generic
        CustomList li = new CustomList();
        li.addElement("first element");
        li.addElement("second element");
        System.out.println(li.toString());

        // using generic
        CustomListGeneric<Integer> genericLi = new CustomListGeneric<>();
        genericLi.addElement(3);
        genericLi.addElement(6);
        System.out.println(genericLi.toString());

        CustomListGeneric<Character> genericLi2 = new CustomListGeneric<>();
        genericLi2.addElement('A');
        genericLi2.addElement('B');
        System.out.println(genericLi2.toString());
    }

}
