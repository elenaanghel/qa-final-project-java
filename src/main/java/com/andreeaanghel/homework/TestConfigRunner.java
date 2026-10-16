package com.andreeaanghel.homework;

public class TestConfigRunner {

    public static void main(String[] args) {

        BrowserConfig config1 = new BrowserConfig(BrowserType.CHROME, "1.1", true);
        BrowserConfig config2 = new BrowserConfig(BrowserType.FIREFOX, "latest");
        BrowserConfig config3 = new BrowserConfig(BrowserType.EDGE);

        BrowserConfig config4 = BrowserConfig.createDefaultChromeConfig();

        // Afisare obiecte
        System.out.println("Config 1 (3 parametrii): ");
        config1.afiseazaConfig();

        System.out.println("\nConfig 2 (2 parametrii): ");
        config2.afiseazaConfig();

        System.out.println("\nConfig 3 (1 parametru) ");
        config3.afiseazaConfig();

        System.out.println("\nConfig 4 (metoda Factory): ");
        config4.afiseazaConfig();
    }
}
