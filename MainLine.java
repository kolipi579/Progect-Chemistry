import java.util.Scanner;

public class MainLine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Names name1 = new Names();
        Names name2 = new Names();
        Names name3 = new Names();
        name1.line = sc.nextLine();
        name2.line = sc.nextLine();
        name3.line = sc.nextLine();
        System.out.println(name2.name());

    }

}
class Names {
    String line;
    Integer length(){

        int k = 0;
        String [] sarr = line.split("-");
        for (String s:sarr){

            k++;

        }
        return k;

    }
    String name() {

        switch (length()) {

            case 1: {

                return "метан";

            }

            case 2: {

                return "этан";

            }

            case 3: {

                return "пропан";

            }

            case 4: {

                return "бутан";

            }

            case 5: {

                return "пентан";

            }

            case 6: {

                return "гексан";

            }

            case 7: {

                return "гептан";

            }

            case 8: {

                return "октан";

            }

            case 9: {

                return "нонан";

            }

            case 10: {

                return "декан";

            }

            default: {

                return "мы пока не можем это определить";

            }
        }
    }
}

