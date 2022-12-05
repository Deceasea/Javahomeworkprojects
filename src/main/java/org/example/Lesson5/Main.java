package org.example.Lesson5;


public class Main {
    public static void main(String[] args) {
        Employee[] employees = {

                new Employee("Иванов Иван Иванович",
                        "Директор",
                        "ivanov@mail.idea",
                        "81234567890",
                        "100 000",
                        42),
                new Employee("Петров Петр Петрович",
                        "Заместитель директора",
                        "petrov@mail.idea",
                        "84758595902",
                        "90 000",
                        36),
                new Employee("Гаврилова Ольга Павловна",
                        "Главный бухгалтер",
                        "gavrilova@mail.idea",
                        "84797425902",
                        "75 000",
                        48),
                new Employee("Сидоров Аристарх Евлампиевич",
                        "Главный инженер",
                        "sidorov@mail.idea",
                        "847585984659",
                        "85 000",
                        34),
                new Employee("Монеточкина Софья Игоревна",
                        "Секретарь",
                        "monetochkina@mail.idea",
                        "847585983950",
                        "35 000",
                        23)
        };
        int minAge = 40;
        for (Employee employee : employees) {
            if (employee.age > minAge) {
                employee.printInfo();
                System.out.println();
            }
        }
    }

    //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    //4. Создать массив из 5 сотрудников.
    //Пример:
    //Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    //persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    //persArray[1] = new Person(...);
    //...
    //persArray[4] = new Person(...);
    //
    //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.//
}