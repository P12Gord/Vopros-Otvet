import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Пример №1: Введите своё имя
        Scanner q = new Scanner (System.in);
        System.out.print("Привет!\nКак тебя Зовут?: ");
        String w = q.nextLine();
        System.out.println("Здраствуй "+w+"!");
        //Пример №2:Узнай сколько тебе лет!
        Scanner hoot = new Scanner (System.in);
        System.out.print("В Каком Году Ты Родился? : ");
        int fire = hoot.nextInt();
        final int year = 2023;
        System.out.println("Поздравляю "+w+" "+"тебе :"+(year - fire));
        //Пример №3:Периметр Квадрата
        Scanner qw = new Scanner (System.in);
        System.out.println("Задайте ЛЮБУЮ! длину квадрата:");
        int wq = qw.nextInt();
        int r = wq*4;
        System.out.println("Периметр Квадрата Равен:"+r);
        //Пример №4:Площадь Окружности
        Scanner t = new Scanner (System.in);
        System.out.print("Введите радиус окружности: ");
        int t1 = t.nextInt();
        double grog = Math.PI;
        double t2 = Math.pow(t1,2);
        System.out.println("Площадь Окружности Равна :"+grog*t2+"\u00B2");
        //Пример №5:Узнай с какой скоростью ты передвигался
        Scanner m = new Scanner (System.in);
        System.out.print("Напишите Растояние в КМ: ");
        long m2 = m.nextLong();
        System.out.println("Напишите за сколько ЧАСОВ вы преодолеете данное растояние:");
        long m3 = m.nextLong();
        System.out.println("Ваша Скорость Равна: "+m2/m3+"км/ч");
        //Пример №6:Конвертор Валют
        Scanner ch = new Scanner (System.in);
        System.out.print("Напишите Сумму в \u20AC: ");
        BigDecimal cn = ch.nextBigDecimal();
        final BigDecimal cl = new BigDecimal(480.64);
        BigDecimal cv = cl.multiply(cn);
        System.out.println("Сумма в \u20B8:"+cv);
        //Пример №7:Объём Данных
        Scanner osd = new Scanner (System.in);
        System.out.print("Введите Объём Флешки в Гб: ");
        int ost = osd.nextInt();
        int osf = 1024;
        int osr = 820;
        int oss = osf*ost;
        int ose = oss / osr;
        System.out.println("Итак вы сможете разместить :"+ose+" Файлов размером 820 мб");
        //Пример №8:Анкета
        System.out.println("Мы Рады Приветствовать вас на нашем сайте!");
        System.out.println("\nНо у Вас до сих пор небыло аккаунта попрошу Вас пройти регистрацию!");
        Scanner ww = new Scanner (System.in);
        System.out.print("Введите Своё Имя :");
        String w1 = ww.nextLine();
        System.out.println("Введите Свою Фамилию :");
        String w2 = ww.nextLine();
        System.out.println("Введите Своё Отчество :");
        String w3 = ww.nextLine();
        System.out.println("Введите Страну Рождения :");
        String w5 = ww.nextLine();
        System.out.println("Введите Город Проживания :");
        String w4 = ww.nextLine();
        System.out.println("Значит зовут вас "+w2+" "+w1+" "+w3+" Роделись в стране :"+w5+" Проживаете в городе :"+w4);
        System.out.println("Поздровляю вас "+w2+" "+w1+" "+w3 +" Вы успешно прошли регистрацию!");
        //Пример №9:Узнай свой возрост!
        Scanner g = new Scanner (System.in);
        System.out.print("В каком году вы родились? :");
        int j = g.nextInt();
        final int jg = 2023;
        System.out.println("Поздравляю "+w2+" "+w1+" "+w3+" тебе :"+(jg-j));
    }

}
