package _10_collection._list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Book> list = new ArrayList<>();

        // 객체 추가
        list.add(new Book("title1", "author1"));
        list.add(new Book("title2", "author2"));
        list.add(new Book("title3", "author3"));
        list.add(new Book("title4", "author4"));
        list.add(new Book("title5", "author5"));
        System.out.println(list);

        // 리스트 개수 얻기
        int size = list.size();
        System.out.printf("총 %d 권의 책이 존재합니다. %n%n", size);

        // 객체 가져오기 (인덱스 이용)
        System.out.println(list.get(2));

        // 삭제
        list.remove(2);
        System.out.println(list);

        // 모든 객체 삭제
        System.out.println("객체가 비어 있나요? " + list.isEmpty());
        list.clear();
        System.out.println("객체가 비어 있나요? " + list.isEmpty());
    }
}
