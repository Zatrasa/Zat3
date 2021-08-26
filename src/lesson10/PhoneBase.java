package lesson10;

import java.util.*;

public class PhoneBase {
    HashMap<String, HashSet<String>> pBase;

    public PhoneBase() {
        this.pBase = new HashMap<>();

    }
    public String Get(String fio) {
        HashSet<String> numbers;
        numbers = pBase.getOrDefault(fio,new HashSet<String>());
        return numbers.toString();
    }
    public void Add(String fio,String phone){
        HashSet<String> numbers;
        numbers = pBase.getOrDefault(fio,new HashSet<String>());
        numbers.add(phone);
        pBase.put(fio,numbers);
    }
}
