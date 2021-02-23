package inheritance;

public class Seminar {
    public Person[] members;
    public int size;

    public Seminar(int capacity) {
        //capacity - выделено в пмяти для массива из скольких элементов, который изначально null
        members = new Person[capacity];
        size = 0;
        //сколько уже жлементов добавлено
    }

    public String addMembers(Person person) {
        if (size < members.length) {
            members[size] = person;
            size++;
            // SIZE- номер ячейки
            return "Добавление прошло удачно";
        }
        return "Участник не добавлен";
    }

    public String deleteMembers(Person person) {
        for (int i = 0; i < size; i++) {
            if (members[i].equals(person)) {
                members[i] = members[size - 1];
                size--;
            }
        }
        return "Удаление прошло удачно";

    }

    public String updateMembers(Person person, Person newPerson) {
        for (int i = 0; i < size; i++) {
            if (members[i].equals(person)) {
                members[i] = newPerson;
            }
        }

        return "Участник заменен";
    }
}

