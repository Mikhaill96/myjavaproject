package Задание2;
class Person {
    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Person(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
}
class Main {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];


        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrova Alena", "Accountant", "alpetrova@mailbox.com", "892312313", 35000, 25);
        persArray[2] = new Person("Sidorov Alexey", "Manager", "alsidorov@mailbox.com", "892312314", 40000, 41);
        persArray[3] = new Person("Fedorova Maria", "Designer", "mfedorova@mailbox.com", "892312315", 32000, 29);
        persArray[4] = new Person("Nikolaev Nikolay", "Developer", "nnikolaev@mailbox.com", "892312316", 45000, 35);


        for (Person person : persArray) {
            System.out.println(person.name + " " + person.position + " " + person.email + " " +
                    person.phoneNumber + " " + person.salary + " " + person.age);
        }
    }
}

