package com.gmail.alinakotova102.hillelcourse.task17;

public class SmartphoneRunner {
    public static void main(String[] args) {
        System.out.println("Using an iPhone");
        Iphone iphone = new Iphone();
        iphone.call("Father", 4428593475L);
        iphone.sms("Hello!! It's me!", "Mama");
        iphone.showVersion(17.8);

        IOS ios = new Iphone();
        ios.showVersion(17.7);

        Smartphone phoneIphone = new Iphone();
        phoneIphone.call("Kolly Lix", 8475967832L);

        System.out.println("\nUsing an Android");
        Android android = new Android();
        android.call("Sister", 9475683211L);
        android.sms("Deadline until 20.09", "teacher");
        android.show();

        LinuxOS linuxOS = new Android();
        linuxOS.show();

        Smartphone phoneAndroid = new Android();
        phoneAndroid.call("Mary", 8473452285L);
    }
}