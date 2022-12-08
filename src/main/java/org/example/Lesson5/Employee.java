package org.example.Lesson5;

public class Employee {

    String name;
    String position;
    String email;
    String phone;
    String salary;
    int age;

    Employee(String name,
             String position,
             String email,
             String phone,
             String salary,
             int age)
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printInfo()
    {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("e-mail: " + email);
        System.out.println("Тел.: " + phone);
        System.out.println("ЗП: " + salary);
        System.out.println("Возраст: " + age);
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