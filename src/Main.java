public class Main {
    public static void main(String[] args) {
        //Задача 1
        int a = 100;
        byte b = 10;
        short c = 1;
        long d = 1000;
        float e = 1.7F;
        double f = 10.0;
        System.out.println("Значение переменной а с типом int равно " + a );
        System.out.println("Значение переменной b с типом byte равно " + b );
        System.out.println("Значение переменной c с типом short равно " + c );
        System.out.println("Значение переменной d с типом long равно " + d );
        System.out.println("Значение переменной e с типом float равно " + e );
        System.out.println("Значение переменной f с типом double равно " + f );

        //Задача 2
        byte one = 2;
        long two = 987678965;
        double three = 27.12;
        int four = 569;
        short five = 786;
        float six = -159;
        boolean seven = false;

        //Задача 3
        int ЛюдмилаПавловна = 23;
        int АннаСергеевна = 27;
        int ЕкатеринаАндреевна = 30;
        int allPaper = 480;
        double paperChild = allPaper /(ЛюдмилаПавловна + АннаСергеевна + ЕкатеринаАндреевна);
        System.out.println("На каждого ученика рассчитано " + paperChild + " листов бумаги");

        //Задача 4
        int min = 2;
        int bottle = 16;
        int min20 = 20 * bottle / min;
        System.out.println( "За 20 минут машина произвела бутылок " + min20 + " штук ");
        int day = (24 * 60) * bottle / min;
        System.out.println( "За сутки машина произвела бутылок " + day + " штук ");
        int threeDays = day * 3;
        System.out.println( "За 3 дня машина произвела бутылок " + threeDays + " штук ");
        int mounth = threeDays * 10;
        System.out.println( "За месяц машина произвела бутылок " + mounth + " штук ");

        //Задача 5
        int allJars = 120;
        int whiteJar = 2;
        int brownJar = 4;
        int classes = allJars / (whiteJar + brownJar);
        int whiteJarNeed = classes * whiteJar;
        int brownJarNeed = classes * brownJar;
        System.out.println( "В школе, где " + classes + " классов, нужно " + whiteJarNeed + " банок белой краски и " + brownJarNeed + " банок коричневой краски");

        //Задача 6
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceСream = 2 * 100;
        int egg = 4 * 70;
        int allGr = banana + milk + iceСream + egg;
        System.out.println( "Вес спорт-завтрака равен " + allGr + "грамм");
        float allKg = allGr / (float)1000;
        System.out.println( "Вес спорт-завтрака равен " + allKg + "килограмм");

        //Задача 7





    }
}