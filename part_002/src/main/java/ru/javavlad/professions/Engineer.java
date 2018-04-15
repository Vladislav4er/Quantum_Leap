package ru.javavlad.professions;

/**
 * Дочерний класс Profession.
 * @author Vladislav
 * @version 1.00
 * @since 15.04.2018
 */

public class Engineer extends Profession {

    /**
     * Сфера деятельности инженера.
     */
    private String sphere;

    /**
     * Заработная плата инженера.
     */
    private int salary;

    /**
     * Sphere setter.
     * @param sphere - сфера деятельности инженера
     */

    public void setSphere(String sphere) {
        this.sphere = sphere;
    }

    /**
     * Salary setter.
     * @param salary - заработная плата инженера
     */

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Sphere getter.
     * @return сфера деятельности инженера
     */

    public String getSphere() {
        return sphere;
    }

    /**
     * Salary getter.
     * @return заработная плата инженера
     */

    public int getSalary() {
        return salary;
    }

    /**
     * Метод, с помощью которого инженер создает чертеж.
     * @param scheme - схема
     * @return кто и какой чертеж создает
     */

    public String draw(String scheme) {
        return "Инженер " + this.getName() + " создает чертеж: " + scheme;
    }

    /**
     * Метод, с помощью которого инженер считает стомость производства.
     * @param count - количество
     * @param cost - стоимость производства 1 штуки
     * @return стоимость производства партии
     */

    public int calculate(int count, int cost) {
        return count * cost;
    }

    /**
     * Переопределение метода takeMoney.
     * @return заработок инженера за один месяц
     */

    public String takeMoney() {
        return "Инженер " + this.getName() + " заработал за месяц " + this.salary + " рублей";
    }
}
