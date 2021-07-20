package lesson5;

public class MainClass {
    public static void main(String[] args) {
        Sotrudnik[] arrS = new Sotrudnik[5];
        arrS[0] = new Sotrudnik("Ян Чен Себ", "первый министр", "1@ya.ru", "111", 20, 1000);
        arrS[1] = new Sotrudnik("Ли Бань Ми", "второй министр", "2@ya.ru", "222", 41, 1200);
        arrS[2] = new Sotrudnik("Чонг Чен Хам", "третий министр", "3@ya.ru", "333", 50, 1400);
        arrS[3] = new Sotrudnik("Бао Баб Себ", "четвертый министр", "4@ya.ru", "444", 25, 1100);
        arrS[4] = new Sotrudnik("Ив Сен Лоран", "пятый министр", "5@ya.ru", "555", 18, 1300);

        for (int i = 0; i < arrS.length; i++) {
            if (arrS[i].age > 40) {
                arrS[i].info();
            }
        }

    }
}
