public class Main {
    public static void main(String[] args) {
        int age = 10;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия");
        }

        int tepmerature = 3;
        if (tepmerature < 5) {
            System.out.println("На улице " + tepmerature + " градусов, нудно одеть шапку");
        } else {
            System.out.println("На улице " + tepmerature + " градусов, можно идти без шапки");
        }


        int speed = 100;
        if (speed > 60) {
            System.out.println("если скорость" + speed + ", прийдется заплатить штраф");
        } else {
            System.out.println("если скорость" + speed + ", можно ездить спокойно");
        }

        age = 5;
        if (age >=2 && age <=6 ) {
            System.out.println("Если возраст человека " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >=7 && age <=17 ) {
            System.out.println("Если возраст человека " + age + ", то ему нужно ходить в школу");
        }
        if (age >=18 && age <=24 ) {
            System.out.println("Если возраст человека " + age + ", то ему нужно ходить в университет");
        }
        if (age >24) {
            System.out.println("Если возраст человека " + age + ", то ему нужно ходить на работу");
        }
        age = 22;
        if (age <5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на атракционе");
        }
        if (age >= 5 && age <14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе в сопровождении");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе без сопровождения взрослого");
        }

        int places = 102;
        int sitPlaces = 60;
        int people = 64;

        if (people < sitPlaces) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (people >= sitPlaces && people < places) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (people >= places) {
            System.out.println("В вагоне нет мест");
        }

        int one = 100;
        int two = 5;
        int three = 30;

        if (one >= two && one>= three) {
            System.out.println("Максимальное число переменной one, равно " + one);
        } else {
            if (two>=three){
                System.out.println("Максимальное число переменной two, равно " + two);
            } else {
                System.out.println("Максимальное число переменной three, равно " + three);
            }
        }
    }
}