package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    protected static String choice;
    protected static int cho;
    public static String meal;

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        choice = " ";
        System.out.println("Dobrý den, chcete si zobrazit produkty, či pozměnit jejich cenu nebo počet?");
        choice = scan.nextLine();
        choice.toLowerCase(Locale.ROOT);
        choice.trim();
        switch (choice) {
            case "zobrazit" -> {
                zobrazit();
            }
            case "zmenit" -> {
                zmena();
            }
        }
    }

    public static void zmena() {
        System.out.println("Přejete si editovat ovoce, zeleninu nebo maso?");
        choice = scan.nextLine();
        choice.toLowerCase(Locale.ROOT);
        choice.trim();
        switch (choice) {
            case "ovoce" -> {
                System.out.println("Co chcete z masa editovat? Jablko, hrusku nebo jahody?");
                choice = scan.nextLine();
                choice.toLowerCase(Locale.ROOT);
                choice.trim();
                switch (choice) {
                    case "jablko" -> {
                        System.out.println("Chcete měnit cenu? 1 - ano, 2 - ne");
                        cho = scan.nextInt();
                        if (cho == 1) {
                            System.out.println("Cena jablka je " + Ovoce.JABLKO.getCena());
                            System.out.println("Napište zadávanou cenu");
                            cho = scan.nextInt();
                            Ovoce.JABLKO.setCena(cho);
                        } else {
                            System.out.println("Chcete měnit množství? 1 - ano, 2 - ne");
                            cho = scan.nextInt();
                            if (cho == 1) {
                                System.out.println("Mnžství jablka je " + Ovoce.JABLKO.getPocet());
                                System.out.println("Napište zadávané množství");
                                cho = scan.nextInt();
                                Ovoce.JABLKO.setPocet(cho);
                            } else {
                            }
                        }
                        start();
                    }
                    case "jahody" -> {
                        System.out.println("Chcete měnit cenu? 1 - ano, 2 - ne");
                        cho = scan.nextInt();
                        if (cho == 1) {
                            System.out.println("Cena jahody je " + Ovoce.JAHODY.getCena());
                            System.out.println("Napište zadávanou cenu");
                            cho = scan.nextInt();
                            Ovoce.JAHODY.setCena(cho);
                        } else {
                            System.out.println("Chcete měnit množství? 1 - ano, 2 - ne");
                            cho = scan.nextInt();
                            if (cho == 1) {
                                System.out.println("Mnžství jahody je " + Ovoce.JAHODY.getPocet());
                                System.out.println("Napište zadávané množství");
                                cho = scan.nextInt();
                                Ovoce.JAHODY.setPocet(cho);
                            } else {
                            }
                        }
                        start();
                    }
                    case "hruska" -> {
                        System.out.println("Chcete měnit cenu? 1 - ano, 2 - ne");
                        cho = scan.nextInt();
                        if (cho == 1) {
                            System.out.println("Cena hruska je " + Ovoce.HRUSKA.getCena());
                            System.out.println("Napište zadávanou cenu");
                            cho = scan.nextInt();
                            Ovoce.HRUSKA.setCena(cho);
                        } else {
                            System.out.println("Chcete měnit množství? 1 - ano, 2 - ne");
                            cho = scan.nextInt();
                            if (cho == 1) {
                                System.out.println("Mnžství hruska je " + Ovoce.HRUSKA.getPocet());
                                System.out.println("Napište zadávané množství");
                                cho = scan.nextInt();
                                Ovoce.HRUSKA.setPocet(cho);
                            } else {
                            }
                        }
                        start();
                    }
                }
            }

            case "maso" -> {
                System.out.println("Co chcete z masa editovat? Jablko, hrusku nebo jahody?");
                choice = scan.nextLine();
                choice.toLowerCase(Locale.ROOT);
                choice.trim();
                switch (choice) {
                    case "steak" -> {
                        System.out.println("Chcete měnit cenu? 1 - ano, 2 - ne");
                        cho = scan.nextInt();
                        if (cho == 1) {
                            System.out.println("Cena steak je " + Maso.STEAK.getCena());
                            System.out.println("Napište zadávanou cenu");
                            cho = scan.nextInt();
                            Maso.STEAK.setCena(cho);
                        } else {
                            System.out.println("Chcete měnit množství? 1 - ano, 2 - ne");
                            cho = scan.nextInt();
                            if (cho == 1) {
                                System.out.println("Mnžství steak je " + Maso.STEAK.getPocet());
                                System.out.println("Napište zadávané množství");
                                cho = scan.nextInt();
                                Maso.STEAK.setPocet(cho);
                            } else {
                            }
                        }
                        start();
                    }
                    case "kure" -> {
                        System.out.println("Chcete měnit cenu? 1 - ano, 2 - ne");
                        cho = scan.nextInt();
                        if (cho == 1) {
                            System.out.println("Cena kure je " + Maso.KURE.getCena());
                            System.out.println("Napište zadávanou cenu");
                            cho = scan.nextInt();
                            Maso.KURE.setCena(cho);
                        } else {
                            System.out.println("Chcete měnit množství? 1 - ano, 2 - ne");
                            cho = scan.nextInt();
                            if (cho == 1) {
                                System.out.println("Mnžství kure je " + Maso.KURE.getPocet());
                                System.out.println("Napište zadávané množství");
                                cho = scan.nextInt();
                                Maso.KURE.setPocet(cho);
                            } else {
                            }
                        }
                        start();
                    }
                    case "salam" -> {
                        System.out.println("Chcete měnit cenu? 1 - ano, 2 - ne");
                        cho = scan.nextInt();
                        if (cho == 1) {
                            System.out.println("Cena salam je " + Maso.SALAM.getCena());
                            System.out.println("Napište zadávanou cenu");
                            cho = scan.nextInt();
                            Maso.SALAM.setCena(cho);
                        } else {
                            System.out.println("Chcete měnit množství? 1 - ano, 2 - ne");
                            cho = scan.nextInt();
                            if (cho == 1) {
                                System.out.println("Mnžství salam je " + Maso.SALAM.getPocet());
                                System.out.println("Napište zadávané množství");
                                cho = scan.nextInt();
                                Maso.SALAM.setPocet(cho);
                            } else {
                            }
                        }
                        start();
                    }
                }
            }
            case "zelenina" -> {
                System.out.println("Co chcete z masa editovat? Jablko, hrusku nebo jahody?");
                choice = scan.nextLine();
                choice.toLowerCase(Locale.ROOT);
                choice.trim();
                switch (choice) {
                    case "porek" -> {
                        System.out.println("Chcete měnit cenu? 1 - ano, 2 - ne");
                        cho = scan.nextInt();
                        if (cho == 1) {
                            System.out.println("Cena porek je " + Zelenina.POREK.getCena());
                            System.out.println("Napište zadávanou cenu");
                            cho = scan.nextInt();
                            Zelenina.POREK.setCena(cho);
                        } else {
                            System.out.println("Chcete měnit množství? 1 - ano, 2 - ne");
                            cho = scan.nextInt();
                            if (cho == 1) {
                                System.out.println("Mnžství porek je " + Zelenina.POREK.getPocet());
                                System.out.println("Napište zadávané množství");
                                cho = scan.nextInt();
                                Zelenina.POREK.setPocet(cho);
                            } else {
                            }
                        }
                        start();
                    }
                    case "mrkev" -> {
                        System.out.println("Chcete měnit cenu? 1 - ano, 2 - ne");
                        cho = scan.nextInt();
                        if (cho == 1) {
                            System.out.println("Cena mrkev je " + Zelenina.MRKEV.getCena());
                            System.out.println("Napište zadávanou cenu");
                            cho = scan.nextInt();
                            Zelenina.MRKEV.setCena(cho);
                        } else {
                            System.out.println("Chcete měnit množství? 1 - ano, 2 - ne");
                            cho = scan.nextInt();
                            if (cho == 1) {
                                System.out.println("Mnžství mrkev je " + Zelenina.MRKEV.getPocet());
                                System.out.println("Napište zadávané množství");
                                cho = scan.nextInt();
                                Zelenina.MRKEV.setPocet(cho);
                            } else {
                            }
                        }
                        start();
                    }
                    case "brambory" -> {
                        System.out.println("Chcete měnit cenu? 1 - ano, 2 - ne");
                        cho = scan.nextInt();
                        if (cho == 1) {
                            System.out.println("Cena brambor je " + Zelenina.BRAMBORY.getCena());
                            System.out.println("Napište zadávanou cenu");
                            cho = scan.nextInt();
                            Zelenina.BRAMBORY.setCena(cho);
                        } else {
                            System.out.println("Chcete měnit množství? 1 - ano, 2 - ne");
                            cho = scan.nextInt();
                            if (cho == 1) {
                                System.out.println("Mnžství brambor je " + Zelenina.BRAMBORY.getPocet());
                                System.out.println("Napište zadávané množství");
                                cho = scan.nextInt();
                                Zelenina.BRAMBORY.setPocet(cho);
                            } else {
                            }
                        }
                        start();
                    }
                }
            }
        }
    }

    public static void priceChange() {

    }

    public static void zobrazit() {
        System.out.println("Chcete zobrazit množství všeho, nebo cenu všeho?");
        choice = scan.nextLine();
        choice.trim();
        choice.toLowerCase(Locale.ROOT);
        switch (choice) {
            case "mnozstvi" -> {
                System.out.println("dfh");
            }
            case "cenu" -> {

            }
        }
    }
}
