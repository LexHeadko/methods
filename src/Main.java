public class Main {
    public static void checkYear(int year) {
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }
    }

    public static void checkOS(int typeOS, int year) {
        String os = null;
        String version;
        if (year < 2015) {
            version = "облегченную";
        } else {
            version = "обычную";
        }
        if (typeOS == 1 || typeOS == 0) {
            if (typeOS == 0) {
                os = "iOS";
            } else if (typeOS == 1) {
                os = "Android";
            }
            System.out.println("Установите " + version + " версию приложения для " + os + " по ссылке:");
        } else {
            System.out.println("Неверно введена ОС!!!");
        }
    }

    public static void deliveryBank(int distance) {
        int dayCount = 1;
        if (distance <= 100) {
            if (distance > 20) {
                dayCount++;
            }
            if (distance > 60) {
                dayCount++;
            }
            System.out.println("Доставка будет через " + dayCount + " сутки(ок).");
        } else {
            System.out.println("Доставка не осуществляется");
        }

    }

    public static void main(String[] args) {
        int year = 2023;
        checkYear(year);
        int typeOS = 1;
        checkOS(typeOS, year);
        int deliveryDistance = 101;
        deliveryBank(deliveryDistance);
    }
}
