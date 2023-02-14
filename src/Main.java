import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog= dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper +4;
        System.out.println(paper);
        paper = paper - 7639;

        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxersWeight1 = 78.2;
        var boxersWeight2 = 82.7;
        var totalWeight = boxersWeight1 + boxersWeight2;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг.");

        var weightDifference = boxersWeight2 - boxersWeight1;
        System.out.println("Разница весов спортсменов " + weightDifference);

        var weightDifference1 = (boxersWeight2 / boxersWeight1) %totalWeight;
        System.out.println("Разница весов спортсменов с помощью функции остаток деления " + weightDifference);

        var officeHours = 640;
        var employeesWorkingHours = 8;
        var numbersEmployess = officeHours / employeesWorkingHours;
        System.out.println("Всего работников в компании - " + numbersEmployess + " человек");

        numbersEmployess = numbersEmployess + 94;
        officeHours = officeHours + (94 * 8);
        System.out.println("Если в компании работает " + numbersEmployess  +" человек, то всего " + officeHours + " часов работы может быть поделено между сотрудниками");



    }
}