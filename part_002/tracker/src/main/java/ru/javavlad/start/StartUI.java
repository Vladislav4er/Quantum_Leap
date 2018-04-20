package ru.javavlad.start;

import ru.javavlad.models.Item;

public class StartUI {
    private Input input;
    private Tracker tracker = new Tracker();

    public void init() {
        Item item = new Item();
        input = new ConsoleInput();
        String answer = "null";
        while (!answer.equals("6")) {
            answer = input.ask("0. Add new Item\n"
                    + "1. Show all items\n"
                    + "2. Edit item\n"
                    + "3. Delete item\n"
                    + "4. Find item by Id\n"
                    + "5. Find items by name\n"
                    + "6. Exit Program\n"
                    + "Select: ");

            if (answer.equals("0")) {
                //Item item = new Item();
                String name = input.ask("Введите имя заявки ");
                item.setName(name);
                String description = input.ask("Введите описание заявки ");
                item.setDescription(description);
                tracker.add(item);
                System.out.println("Заявка " + item.getName() + " (описание: " + item.getDescription() + ")" + " добавлена. Id: " + item.getId());
            }

            if (answer.equals("1")) {
                if (tracker.findAll().length > 0) {
                    System.out.println("Созданные заявки: ");
                    for (int index = 0; index < tracker.findAll().length; index++) {
                        System.out.println("Заявка: " + tracker.findAll()[index].getName() + " с id " + tracker.findAll()[index].getId());
                    }
                } else {
                    System.out.println("Заявок нет\n");
                }
            }

            if (answer.equals("2")) {
                String itemId = input.ask("Введите id заявки, которую хотите изменить:");
                if (tracker.findById(itemId) != null) {
                    Item item1 = new Item();
                    item1.setName(input.ask("Введите новое имя: "));
                    item1.setDescription(input.ask("Введите новое описание: "));
                    item1.setId(itemId);
                    tracker.update(item1);
                }
                else {
                    System.out.println("Такой заявки не существует");
                }
            }

            if (answer.equals("3")) {
                tracker.delete(tracker.findById(input.ask("Введите Id заявки ")));

            }

            if (answer.equals("4")) {
                //Item item = new Item();
                item = tracker.findById(input.ask("Введите Id заявки "));
                System.out.println("Найдена заявка с именем: " + item.getName() + ". Комментарий: " + item.getDescription());
            }

            if (answer.equals("5")) {
                String name = input.ask("Введите имя заявки ");
                for (int index = 0; index < tracker.findByName(name).length; index++) {
                    System.out.println("Найдена заявка: " + name
                            + " (описание: " + tracker.findByName(name)[index].getDescription() + ")"
                            + " c id: " + tracker.findByName(name)[index].getId());
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        new StartUI().init();
    }
}
