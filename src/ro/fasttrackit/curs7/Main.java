package ro.fasttrackit.curs7;

public class Main {
    public static void main(String[] args) {
        Clock MyClock = new Clock(18, 54);

        System.out.println(MyClock.readTime());
        System.out.println(MyClock.getHour());
        System.out.println(MyClock.getMinutes());
        MyClock.setMinutes(MyClock.getMinutes() + 1);
        System.out.println(MyClock.getMinutes());

        Clock secondClock = new Clock(10);
        System.out.println(secondClock.readTime());
        secondClock.addMinutes(10);
        System.out.println(secondClock.readTime());
        secondClock.addMinutes(60);
        System.out.println(secondClock.readTime());
        secondClock.addMinutes(-60);
        System.out.println(secondClock.readTime());
        secondClock.addMinutes(60);
        secondClock.addMinutes(55);
        System.out.println(secondClock.readTime());


        Clock brokenClock = new Clock(99,99);
        System.out.println(brokenClock.readTime());
        brokenClock.setHour(99);
        brokenClock.setMinutes(87);
        System.out.println(brokenClock.readTime());
        brokenClock.setMinutes(-999999);
        System.out.println(brokenClock.readTime());

        brokenClock.addMinutes(12332131);
        System.out.println(brokenClock.readTime());

        brokenClock.TIP = "BUZUNAR"; //asa nu
        System.out.println(secondClock.TIP);//asa nu
        System.out.println(Clock.TIP); // asada
        brokenClock.present();
        Clock.present();

    }
}
