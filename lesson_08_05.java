public class lesson_08_05 {
    //В методе main вызови метод div() 2 раза. Первый раз — с такими аргументами,
    //чтобы вывод в консоли был "Infinity", а второй — "-Infinity".
    //чтобы вывод в консоли был "NaN".
    //Код метода div() изменять нельзя.
    public static void main(String[] args) {
        div(0.0,100.0);
        div(0.0,-100.0);
        div(0.0,0.0);

    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
