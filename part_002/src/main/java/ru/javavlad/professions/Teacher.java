package ru.javavlad.professions;

/**
 * Дочерний класс Teacher.
 * @author Vladislav
 * @version 1.00
 * @since 15.04.2018
 */

public class Teacher extends Profession {

    /**
     * Стоимость одного часа занятий.
     */
    private int costPerHour;

    /**
     * Преподаваемая дисциплина.
     */
    private String subject;

    /**
     * CostPerHour setter.
     * @param cost - стоимость одного часа
     */

    public void setCostPerHour(int cost) {
        this.costPerHour = cost;
    }

    /**
     * Subject setter.
     * @param subject - преподаваемая дисциплина
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * CostPerHour getter.
     * @return стоимость одного часа
     */

    public int getCostPerHour() {
        return costPerHour;
    }

    /**
     * Subject getter.
     * @return преподаваемая дисциплина
     */

    public String getSubject() {
        return subject;
    }

    /**
     * Метод, с помощью которого учитель обучает.
     * @return обучение
     */

    public String teach() {
        return this.getName() + " обучает предмету: " + this.getSubject();
    }

    /**
     * Метод, с помощью которого учитель проверяет домашнее задание.
     * @return оценка
     */

    public int homeTaskCheck() {
        return (int) (Math.random() * 5);
    }

    /**
     * Переопределение метода takeMoney.
     * @return заработок учителя за одно занятие
     */

    public String takeMoney() {
        return "Учитель " + this.getName() + " заработал за занятие " + this.getCostPerHour() + " рублей";
    }

}
