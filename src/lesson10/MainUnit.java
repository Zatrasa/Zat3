package lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainUnit {
    public static void main(String[] args) {

        //Задание 1
        String[] words = {"стол", "стул", "чашка", "стол", "стол", "ложка", "стол", "вилка",
                "ложка", "мотыль", "утюг", "вилка", "масло", "стол", "чашка"};

        Map<String,Integer> nWords = new HashMap<>();
        for (String word:words) {
            nWords.put(word,nWords.getOrDefault(word,0)+1);
        }
        System.out.println(nWords);
        System.out.print("Уникальные слова: ");
        for(Map.Entry<String,Integer> o: nWords.entrySet()) {
            if (o.getValue()==1){
                System.out.print(o.getKey()+' ');
            }
        }
        System.out.println();

        //Задание 2
        PhoneBase ph = new PhoneBase();
        ph.Add("Чонг","123-456-789");
        System.out.println("Чонг: "+ph.Get("Чонг"));
        System.out.println("Вонг: "+ph.Get("Вонг"));
        ph.Add("Чонг","111-111-111");
        System.out.println("Чонг: "+ph.Get("Чонг"));
        ph.Add("Чонг","111-111-111");
        System.out.println("Чонг: "+ph.Get("Чонг"));
    }
}
