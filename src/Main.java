public class Main {
    public static void main(String[] args) {
        // 1 задача
        byte age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен "+ age +" он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+ age +" он не достиг совершеннолетия, нужно немного подождать");
        }
        // 2 задча
        byte temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        // 3 задача
        short speed = 150;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
        // 4 задача
        byte years = 24;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в детский сад");
        } else if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в школу");
        } else if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в универститет");
        } else {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить на работу");
        }
        // 5 задача
        byte attraction = 12;
        boolean parents = false;
        if (attraction < 5) {
            System.out.println("Если возраст ребенка равен " + attraction + " то ему нельзя кататься на аттракционе");
        } else if ((attraction >= 5 && attraction <= 14) && parents) {
            System.out.println("Если возраст ребенка равен " + attraction + " можно кататься на аттракционе в соправаждении");
        } else if ((attraction >= 5 && attraction <= 14) && parents == false) {
            System.out.println("Если возраст ребенка равен " + attraction + " без сопровождения взрослого нельзя");
        } else {
            System.out.println("Если возраст ребенка равен " + attraction + " можно кататься на аттракционе без сопровождения взрослого");
        }
        // 6 задача
        byte numberPeople = 82;
        if (numberPeople < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (numberPeople < 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Вагон забит полностью");
        }
        // 7 задача
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}