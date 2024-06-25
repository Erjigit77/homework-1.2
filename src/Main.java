public class Main {
    public static void main(String[] args) {
        System.out.println(permission(23, 23));
        System.out.println(permission(18, 50));
        System.out.println(permission(33, 60));
        System.out.println(permission(50, 0));
        System.out.println(permission(17, 80));

        System.out.println(permission(generateRandomAge(), 10));
    }

    public static String permission(int age, int each) {
        if (age > 20 && age < 45 && each > -20 && each < 30) {
            return "Можно идти гулять.";

        } else if (age < 20 && each > 0 && each < 28) {
            return "Можно иидти гулять.";

        } else if (age > 45 && each > -10 && each < 25) {
            return "Можно иидти гулять.";

        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        int alt = (int) (Math.random() * 100);
        return alt;
    }

}