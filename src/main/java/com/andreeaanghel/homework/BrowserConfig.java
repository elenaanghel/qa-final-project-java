package com.andreeaanghel.homework;

public class BrowserConfig {
    private BrowserType browser;
    private String version;
    private boolean isHeadless;

    // Constructor principal
    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    // Constructor cu 2 parametrii
    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false);
    }

    // Constructor cu 1 parametru
    public BrowserConfig(BrowserType browser) {
        this(browser, "latest", false);
    }

    // Metoda statica Factory
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    // Metoda de afisare
    public void afiseazaConfig() {
        System.out.println("Browser: " + browser
                + "\nVersion: " + version
                + "\nHeadless: " + isHeadless);
    }


    // Getters
    public BrowserType getBrowser() {
        return browser;
    }

    public String getVersion() {
        return version;
    }

    public boolean isHeadless() {
        return isHeadless;
    }
}
