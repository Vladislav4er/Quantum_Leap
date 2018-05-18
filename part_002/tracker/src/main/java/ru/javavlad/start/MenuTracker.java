package ru.javavlad.start;

import ru.javavlad.models.Item;

/**
 * Внешний класс.
 */

class EditItem extends BaseAction {
    EditItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
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
}

public class MenuTracker {

    private Input input;
    private Tracker tracker;
    private  UserAction[] actions = new UserAction[7];
    private int[] ranges;
    private int position = 0;

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Заполнение меню.
     */

    public void fillActions() {
        this.actions[position++] = new AddItem(0, "Add the new item");
        this.actions[position++] = new ShowItems(1, "Show all items");
        this.actions[position++] = new EditItem(2, "Edit item");
        this.actions[position++] = new DeleteItem(3, "Delete item");
        this.actions[position++] = this.new FindItemById(4, "Find item by id");
        this.actions[position++] = this.new FindItemsByName(5, "Find item by name");
        this.actions[position++] = this.new Exit(6, "Exit program");
    }

    public int[] getRanges() {
        ranges = new int[position];
        for (int i = 0; i < position; i++) {
            ranges[i] = i;
        }
        return ranges;
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * Отображение меню.
     */

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Внутренний нестатический класс.
     */

    private class AddItem extends BaseAction {
        private AddItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            Item item = new Item();
            String name = input.ask("Введите имя заявки ");
            item.setName(name);
            String description = input.ask("Введите описание заявки ");
            item.setDescription(description);
            tracker.add(item);
            System.out.println("Заявка " + item.getName() + " (описание: " + item.getDescription() + ")" + " добавлена. Id: " + item.getId());
        }
    }

    /**
     * Внутренний статический класс.
     */

    private static class ShowItems extends BaseAction {
        private ShowItems(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            if (tracker.findAll().length > 0) {
                System.out.println("Созданные заявки: ");
                for (int index = 0; index < tracker.findAll().length; index++) {
                    System.out.println("Заявка: " + tracker.findAll()[index].getName() + " с id " + tracker.findAll()[index].getId());
                }
            } else {
                System.out.println("Заявок нет\n");
            }
        }
    }

    /**
     * Остальные внутренние классы.
     */

    private class DeleteItem extends BaseAction {
        private DeleteItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            tracker.delete(tracker.findById(input.ask("Введите Id заявки ")));
        }
    }

    private class FindItemById extends BaseAction {
        private FindItemById(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            Item item = tracker.findById(input.ask("Введите Id заявки "));
            System.out.println("Найдена заявка с именем: " + item.getName() + ". Описание: " + item.getDescription());
        }
    }

    private class FindItemsByName extends BaseAction {
        private FindItemsByName(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Введите имя заявки ");
            for (int index = 0; index < tracker.findByName(name).length; index++) {
                System.out.println("Найдена заявка: " + name
                        + " (описание: " + tracker.findByName(name)[index].getDescription() + ")"
                        + " c id: " + tracker.findByName(name)[index].getId());
            }
        }
    }

    private class Exit extends BaseAction {
        private Exit(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.exit(0);
        }
    }
}
