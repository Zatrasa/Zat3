package lesson5;

public class Sotrudnik {
    String fio;
    String position;
    String email;
    String phone;
    int age;
    int salary;

    public Sotrudnik(String fio, String position, String email, String phone, int age, int salary) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }

    public void info() {
        System.out.printf("ФИО: %s Должность: %s email: %s телефон: %s возраст:%d ЗП: %d \n",
                this.fio, this.position, this.email, this.phone, this.age, this.salary);
    }
}
