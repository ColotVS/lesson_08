public class lesson_08_10 {
    //Сужение типов
    //При сужении типа мы должны явно показать компилятору, что мы не ошиблись, и отбрасывание части числа сделано осознанно.
    //Для этого используется оператор приведения типа. Это имя типа в круглых скобочках.
    //
    //В таких ситуациях Java-компилятор требует от программиста указывать оператор преобразования типа. Выглядит в общем виде он так:
    //(тип) выражение

    long a = 1;
    int b = (int) a;
    short c = (short) b;
    byte d = (byte) c;
    //Каждый раз нужно явно указывать оператор преобразования типа

    //Реализуй метод setValues(long value), чтобы он устанавливал полученное значение параметра value переменным a, b, c и d.
    //Изменять типы переменных a, b, c и d нельзя.
    public static byte a1;
    public static short b1;
    public static int c1;
    public static long d1;
    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value) {
        a1 = (byte) value;
        b1 = (short) value;
        c1 = (int) value;
        d1 = value;
    }

}
