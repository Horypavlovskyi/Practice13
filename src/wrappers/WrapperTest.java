package wrappers;

//12 Wrapper классы (Практика)
//        1 Создать пакет wrappers в своем проекте, дальнейшая работа будет вестись в нем.
//        2 Создать класс WrapperTest, с main методом
//        2.1 Для каждого типа данных создать по 4 переменные и проинициализировать разными
//        вариантами:
//        • Из примитива, используя автоупаковку
//        • С помощью метода valueOf
//        • С помощью new
//        • Распарсить значение из строки
//        Пример:
//        Integer i1 = 10;
//        Integer i2 = Integer.valueOf(10);
//        Integer i3 = new Integer(10);
//        Integer i4 = Integer.parseInt("10");
//        3 Создать переменную типа Double присвоить ей значение с дробнойчастью.
//        3.1 Создать переменный примитивных типов (byte, short, int, float, long )
//        3.2 Преобразовать и присвоить значение Double каждому из примитивных типов
//        используя специальные методы или автораспаковку.
//        4 Проверить значения NaN и Infinity.
//        4.1 Создать 2 переменные типа Double, одной из них присвоить значение 0.0.
//        4.2 Создать переменную типа Double nanValue и присвоить ей значение, деления
//        ненулевой переменной на нулевую.
//        4.3 Создать переменную infinityValue и присвоить ей значение, деления нулевой
//        переменной саму на себя.
//        4.4 Вывести nanValue и infinityValue на экран.
//        4.5 Добавить по 2 блока if для каждого числа в которых проверяется результат
//        выполнения методов isNaN и isInfinity.
//        Если число NaN вывести текст «Переменная {{имя переменной}} = NaN»
//        Если число Infinityвывести текст «Переменная {{имя переменной}} = Infinity»
//        5 Создать 2 переменной типа Long присвоить обеим значения 120
//        5.1 Вывести на экран результат сравнения этих переменных по оператору ==.
//        5.2 Заменить значения переменных на 1200, перепроверить сравнение.

public class WrapperTest {
    public static void main(String[] args) {
        Integer x1 = 5;
        Integer x2 = Integer.valueOf(5);
        Integer x3 = new Integer(5);
        Integer x4 = Integer.parseInt("5");

        Double x5 = 10.4;

        byte a1 = x5.byteValue();
        System.out.println(a1);
        short a2 = x5.shortValue();
        System.out.println(x5);
        int a3 = x5.intValue();
        System.out.println(a3);
        long a4 = x5.longValue();
        System.out.println(a4);
        float a5 = x5.floatValue();


        /**
         * 4.2
         */
        Double double1 = 0.0;
        Double double2 = 2.2;

        Double nanValue = double2 / double1;
        System.out.println(nanValue);

        if (nanValue.isInfinite())
            System.out.println("Переменная " + nanValue + " = Infinite");

        Double infinityValue = double1 / double1;
        System.out.println(infinityValue);

        if (infinityValue.isNaN())
            System.out.println("Переменная " + nanValue + " = NaN");


        Long v1 = 120L;
        Long v2 = 120L;
        System.out.println(v1 == v2);

        Long v3 = 1200L;
        Long v4 = 1200L;
        System.out.println(v3 == v4);


    }
}
