package sk.it.dolinsky.model;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String language;

    private final LinkedHashMap<String, String> countryOptions;
    private final LinkedHashMap<String, String> languageOptions;
    private String[] operatingSystems;

    public Student(){
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("CZE", "Czech Republic");
        countryOptions.put("SVK", "Slovakia");
        countryOptions.put("GER", "Germany");
        countryOptions.put("HUN", "Hungary");

        languageOptions = new LinkedHashMap<>();
        languageOptions.put("PHP", "PHP");
        languageOptions.put("Java", "Java");
        languageOptions.put("C#", "C#");
        languageOptions.put("Python", "Python");
    };

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }
    public LinkedHashMap<String, String> getLanguageOptions() {
        return languageOptions;
    }
    public String[] getOperatingSystems() {
        return operatingSystems;
    }
    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
