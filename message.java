import java.util.Random;

class message {
    message(int i) {
        Random ran;
        ran = new Random();
        int x = ran.nextInt(100000);
        int y = 0;
        // System.err.print("\t");

        switch (x % 64) {
            case 0 -> System.out.print("H a p p y    b i r t h d a y \t");
            case 1 -> System.out.print("°    ");
            case 2 -> System.out.print(".      ");
            case 3 -> System.out.print("'     ");
            case 4 -> System.out.print(",  ");
            case 5 -> System.out.print(":   ");
            case 6 -> System.out.print("+ \t\t");
            case 7 -> System.out.print(" H A V E    A    G O O D   Y E A R   ");
            case 8 -> System.out.print("L  U  V    Y  O  U    ");
            case 9 -> System.out.print("W  I  S  H    Y  O  U    H  A  P  P  I  N  E  S  S  ");
            case 10 -> System.out.print("L O V E   Y O U   ");
            case 11 -> System.out.print(" ");
            case 12 -> System.out.print("°      ");
            case 13 -> System.out.print(".   ");
            case 14 -> System.out.print("'  ");
            case 15 -> System.out.print(",     ");
            case 16 -> System.out.print(":        ");
            case 17 -> System.out.print("+         ");
            case 18 -> System.out.print("  ");
            case 19 -> System.out.print("° '      ");
            case 20 -> System.out.print(". °   ");
            case 21 -> System.out.print("'     ");
            case 22 -> System.out.print(",    ");
            case 23 -> System.out.print(":        ");
            case 24 -> System.out.print("+ °   ");
            case 25 -> System.out.print("   ");
            case 26 -> System.out.print("°     ");
            case 27 -> System.out.print(". °   ");
            case 28 -> System.out.print("' ");
            case 29 -> System.out.print(",    ");
            case 30 -> System.out.print(":  ");
            case 31 -> System.out.print("+ .     ");
            case 32 -> System.out.print("   ");
            case 33 -> System.out.print("°   ");
            case 34 -> System.out.print(".  ");
            case 35 -> System.out.print("  ");
            case 36 -> System.out.print("° .'    ");
            case 37 -> System.out.print(".       ");
            case 38 -> System.out.print("' .°       ");
            case 39 -> System.out.print(",   ");
            case 40 -> System.out.print(": °    ");
            case 41 -> System.out.print("+ .°        ");
            case 42 -> System.out.print("   ");
            case 43 -> System.out.print("°      ");
            case 44 -> System.out.print(".   ");
            case 45 -> System.out.print("'      ");
            case 46 -> System.out.print(", °  ");
            case 47 -> System.out.print(":    ");
            case 48 -> System.out.print("+    ");
            case 50 -> System.out.print("   ");
            case 51 -> System.out.print("° .       ");
            case 52 -> System.out.print(". °\t");
            case 53 -> System.out.print("' \t\t");
            case 54 -> System.out.print(", °.\t");
            case 55 -> System.out.print(": \t\t");
            case 56 -> System.out.print("+ °\t");
            case 57 -> System.out.print("\t\t");
            case 58 -> System.out.print("° \t");
            case 59 -> System.out.print(". '°\t\t");
            case 60 -> System.out.print("L E K    K I E \t\t");
            case 61 -> System.out.print("H A P P Y !   H A P P Y!\t\t");
            case 62 -> System.out.print("L  U  V\t\t");
            case 63 -> System.out.print("G R A D E AAAAAAAA+++ \t\t");
        }

    }
}