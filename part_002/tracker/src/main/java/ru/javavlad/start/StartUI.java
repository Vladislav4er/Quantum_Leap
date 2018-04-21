package ru.javavlad.start;

import ru.javavlad.models.Item;

public class StartUI {
    private Input input;
    private Tracker tracker;
    private final String menuOptions = "0. Add new Item\n"
            + "1. Show all items\n"
            + "2. Edit item\n"
            + "3. Delete item\n"
            + "4. Find item by Id\n"
            + "5. Find items by name\n"
            + "6. Exit Program\n"
            + "Select: ";

    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI(input, tracker).init();
    }

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        String answer = "";
        while (!answer.equals("6")) {
            answer = input.ask(menuOptions);

            if (answer.equals("0")) {
                this.createItem();
            }

            if (answer.equals("1")) {
                this.showAll();
            }

            if (answer.equals("2")) {
                this.editItem();
            }

            if (answer.equals("3")) {
                this.deleteItem();
            }

            if (answer.equals("4")) {
                this.findById();
            }

            if (answer.equals("5")) {
                this.findByName();
            }
        }
    }

    private void createItem() {
        Item item = new Item();
        String name = input.ask("Введите имя заявки ");
        item.setName(name);
        String description = input.ask("Введите описание заявки ");
        item.setDescription(description);
        tracker.add(item);
        System.out.println("Заявка " + item.getName() + " (описание: " + item.getDescription() + ")" + " добавлена. Id: " + item.getId());
    }

    private void showAll() {
        if (tracker.findAll().length > 0) {
            System.out.println("Созданные заявки: ");
            for (int index = 0; index < tracker.findAll().length; index++) {
                System.out.println("Заявка: " + tracker.findAll()[index].getName() + " с id " + tracker.findAll()[index].getId());
            }
        } else {
            System.out.println("Заявок нет\n");
        }
    }

    private void editItem() {
        String itemId = input.ask("Введите id заявки, которую хотите изменить:");
        if (tracker.findById(itemId) != null) {
            Item item1 = new Item();
            item1.setName(input.ask("Введите новое имя: "));
            item1.setDescription(input.ask("Введите новое описание: "));
            item1.setId(itemId);
            tracker.update(item1);
        } else {
            System.out.println("Такой заявки не существует");
        }
    }

    private void deleteItem() {
        tracker.delete(tracker.findById(input.ask("Введите Id заявки ")));
    }

    private void findById() {
        Item item = tracker.findById(input.ask("Введите Id заявки "));
        System.out.println("Найдена заявка с именем: " + item.getName() + ". Описание: " + item.getDescription());
    }

    private void findByName() {
        String name = input.ask("Введите имя заявки ");
        for (int index = 0; index < tracker.findByName(name).length; index++) {
            System.out.println("Найдена заявка: " + name
                    + " (описание: " + tracker.findByName(name)[index].getDescription() + ")"
                    + " c id: " + tracker.findByName(name)[index].getId());
        }
        System.out.println("");
    }
}


