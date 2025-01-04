package _10_collection._map;

import _10_collection._set.Course;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // 키는 id, 값은 name 인 HashMap

        Map<Integer, String> map = new HashMap<>();

        // 객체 저장 (키 중복 X)
        map.put(1001 , "홍길동");
        map.put(1002 , "철수");
        map.put(1003 , "영희");
        map.put(1004 , "민수");

        // 전체 객체 수
        int size = map.size();

        // 키를 이용해서 값 얻기
        int key = 1003;
        String value  = map.get(key);
        System.out.println(value);

        // 키와 값으로 구성된 모든 Map.Entry 객체를 Set 담아 리턴
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(entrySet); // [1001=홍길동, 1002=철수, 1003=영희, 1004=민수]

        // iterator
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry); // 1001=홍길동 ...
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.printf("%s 학생은 %d 번 입니다.%n", v, k);
        }

        // 키 Set 컬렉션 얻고, 반복해서 키와 값 얻기
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet); // [1001, 1002, 1003, 1004]

        // 주어진 키와 일치하는 entry 삭제
        String deletedValue = map.remove(key);
        System.out.printf("%s 학생이 삭제됐습니다.%n", deletedValue);

    }
}
