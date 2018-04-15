package ru.javavlad.professions;

/**
 * Дочерний класс Doctor.
 * @author Vladislav
 * @version 1.00
 * @since 15.04.2018
 */

public class Doctor extends Profession {

    /**
     * Область медицины, в которой работает доктор.
     */
    private String branchOfMedicine;

    /**
     * Стоимость приема у доктора.
     */
    private int costOfVisit;

    /**
     * Branch Of Medicine setter.
     * @param branchOfMedicine - область медицины
     */

    public void setBranchOfMedicine(String branchOfMedicine) {
        this.branchOfMedicine = branchOfMedicine;
    }

    /**
     * Cost Of Visit setter.
     * @param costOfVisit - стоимость одного приема у доктора
     */

    public void setCostOfVisit(int costOfVisit) {
        this.costOfVisit = costOfVisit;
    }

    /**
     * Branch Of Medicine getter.
     * @return область медицины
     */

    public String getBranchOfMedicine() {
        return branchOfMedicine;
    }

    /**
     * Cost Of Visit getter.
     * @return  - стоимость одного приема у доктора
     */

    public int getCostOfVisit() {
        return costOfVisit;
    }

    /**
     * Метод, с помощью которого доктор планирует лечение.
     * @param disease - заболевание
     * @return планирование лечения
     */

    public String treatmentPlanning(String disease) {
        return "Доктор " + this.getName() + " создает план лечения для заболевания: " + disease;
    }

    /**
     * Метод, с помощью которого доктор проводит операцию.
     * @param pacient - пациент
     * @param operationType - тип операции
     * @return кто, кого и как оперирует
     */

    public String operation(String pacient, String operationType) {
        return "Доктор " + this.getName() + " проводит операцию: " + operationType + " пациенту: " + pacient;
    }

    /**
     * Переопределение метода takeMoney.
     * @return заработок доктора за один прием пациента
     */

    public String takeMoney() {
        return "Доктор " + this.getName() + " заработал за прием " + this.getCostOfVisit() + " рублей";
    }

}
