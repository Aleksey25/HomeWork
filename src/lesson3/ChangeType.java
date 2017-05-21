package lesson3;
/*
* Создать программу, в которой последовательно прописать преобразования всех совместимых примитивных типов друг к другу.
*/

public class ChangeType {
    public static void main(String[] args) {
        toIntSimple();
        toLongSimple();
        toFloatSimple();
        toDoubleSimple();
        toByte();
        toShort();
        toChar();
        toInt();
        toLong();
        toFloat();
    }

    private static void toIntSimple() {
        byte b = 6;
        short a = 4;
        char ch = 12;
        int c = 6;
        c = a;
        c = b;
        c = ch;
        c = a;
    }

    private static void toLongSimple() {
        byte b = 6;
        short a = 4;
        char ch = 12;
        int c = 6;
        long d = 546;
        d = c;
        d = b;
        d = ch;
        d = a;
    }

    private static void toFloatSimple() {
        byte b = 6;
        short a = 4;
        char ch = 12;
        int c = 6;
        long d = 546;
        float e = 543.4f;
        e = d;
        e = b;
        e = ch;
        e = a;
        e = c;
    }

    private static void toDoubleSimple() {
        byte b = 6;
        short a = 4;
        char ch = 12;
        int c = 6;
        long d = 546;
        float e = 543.4f;
        double f = 456.54;
        f = d;
        f = b;
        f = ch;
        f = a;
        f = c;
        f = e;
    }

    private static void toByte() {
        short g = 23;
        int h = 24;
        long i = 56;
        float j = 546.45f;
        double k = 4897.562;
        char m = 15;
        byte n = 46;
        n = (byte) g;
        n = (byte) h;
        n = (byte) i;
        n = (byte) j;
        n = (byte) k;
        n = (byte) m;
    }

    private static void toShort() {
        short p = 2213;
        int b = 234;
        long c = 51236;
        float d = 546213.45f;
        double e = 48917.562;
        char f = 15;
        p = (short) b;
        p = (short) c;
        p = (short) d;
        p = (short) e;
        p = (short) f;
    }

    private static void toChar() {
        short f = 23;
        int e = 24;
        long d = 56;
        float c = 546.45f;
        double b = 4897.562;
        char ab = 15;
        byte a = 46;

        ab = (char) a;
        ab = (char) b;
        ab = (char) c;
        ab = (char) d;
        ab = (char) e;
        ab = (char) f;
    }


    private static void toInt() {
        int ad = 123;
        long a = 12333;
        float b = 523.45f;
        double g = 4121.676;

        ad = (int) a;
        ad = (int) b;
        ad = (int) g;
    }

    private static void toLong() {
        long aq = 1233653;
        float aw = 52623.45f;
        double ay = 412541.676;

        aq = (long) aw;
        aq = (long) ay;
    }

    private static void toFloat() {
        float f = 52623.45f;
        double a = 412541.676;
        f = (float) a;
    }
}