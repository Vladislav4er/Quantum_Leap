package ru.javavlad.professions;

/**
 * Родительский класс Profession.
 * @author Vladislav
 * @version 1.00
 * @since 15.04.2018
 */

public class Profession {

    /**
     * Переменная для имени работника.
     */
    private String name;

    /**
     * Переменная для возраста работника.
     */
    private int age;

    /**
     * Количество лет опыта работы.
     */
    private int workExperience;

    /**
     * Age setter.
     * @param age - возраст
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Name setter.
     * @param name - имя
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Work Experience setter.
     * @param workExperience - количество лет опыта
     */

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    /**
     * Name getter.
     * @return имя
     */

    public String getName() {
        return this.name;
    }

    /**
     * Age getter.
     * @return возраст
     */

    public int getAge() {
        return this.age;
    }

    /**
     * WorkExperience getter.
     * @return количество лет опыта работы
     */

    public int getWorkExperience() {
        return this.workExperience;
    }

    /**
     * Метод, рассчитывающий заработок работника.
     * @return заработок
     */

    public String takeMoney() {
        return "Заработок";
    }
}
