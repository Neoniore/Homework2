public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog=" + dog + ", cat=" + cat + ", paper=" + paper + ";");
        System.out.println("");

        // Задание 2
        System.out.println("Задание 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog=" + dog + ", cat=" + cat + ", paper=" + paper + ";");
        System.out.println("");

        // Задание 3
        System.out.println("Задание 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog=" + dog + ", cat=" + cat + ", paper=" + paper + ";");
        System.out.println("");

        // Задание 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println("friend=" + friend);
        friend += 2;
        System.out.println("friend+2=" + friend);
        friend /= 7;
        System.out.println("friend/7=" + friend);
        System.out.println("");

        // Задание 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println("frog=" + frog);
        frog *= 10;
        System.out.println("frog*10=" + frog);
        frog /= 3.5;
        System.out.println("frog/3.5=" + frog);
        frog += 4;
        System.out.println("frog+4 =" + frog);
        System.out.println("");

        //Задание 6
        System.out.println("Задание 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса двух бойцов " + totalWeight + "кг");
        var weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница между массами бойцов " + weightDifference + "кг");
        System.out.println("");

        //Задание 7
        System.out.println("Задание 7");
        weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между массами бойцов " + weightDifference + "кг");
        System.out.println("");

        //Задание 8
        System.out.println("Задание 8");
        var totalHours = 640;
        var workingDayDuration = 8;
        var employees = totalHours / workingDayDuration;
        System.out.println("Всего работников в компании — " + employees + " человек");

        employees += 94;
        totalHours = employees * workingDayDuration;
        System.out.println("Если в компании работает " + employees + " человека, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");

        System.out.println("");
    }
}