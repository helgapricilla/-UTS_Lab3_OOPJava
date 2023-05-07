import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input text : ");
        String text = input.nextLine();
        System.out.println("1. Reverse Perhuruf");
        System.out.println("2. Reverse Perkata");
        System.out.print("Input Pilihan : ");
        int pilihan = input.nextInt();

        if (pilihan == 1){
            char[] textArray = text.toCharArray();
            for (int i = 0; i < textArray.length / 2; i++) {
                char temp = textArray[i];
                textArray[i] = textArray[textArray.length - i - 1];
                textArray[textArray.length - i - 1] = temp;
            }
            String reversePerhuruf = new String(textArray);
            System.out.println("Reverse perhuruf: " + reversePerhuruf);
        } else if (pilihan == 2){
            String[] stringArray = text.split(" ");
            for (int i = 0; i < stringArray.length / 2; i++) {
                String temp = stringArray[i];
                stringArray[i] = stringArray[stringArray.length - i - 1];
                stringArray[stringArray.length - i - 1] = temp;
            }
            String reversePerkata = String.join(" ", stringArray);
            System.out.println("Reverse perkata: " + reversePerkata);
        }
        else {
            System.out.println("Input yang Dimasukkan Salah");
            System.exit(0);
        }

    }
}
