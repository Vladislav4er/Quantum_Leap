package ru.javavlad;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import ru.javavlad.start.*;
import ru.javavlad.models.Item;

public class StubInputTest {

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = new Item("Имя", "Описание", 1L);
        tracker.add(item);
        Input input = new StubInput(new String[]{"2", item.getId(), "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }

    @Test
    public void whenUserWantsSeeAllElementsThenShowThem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Имя1", "Описание1", 1L);
        Item item2 = new Item("Имя2", "Описание2", 2L);
        tracker.add(item2);
        tracker.add(item1);
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll(), is(new Item [] {item2, item1}));
    }

    @Test
    public void whenUserWantsDeleteOneElementWhenTrackerHasTwoThenTrackerWillHaveOne() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Имя1", "Описание1", 1L);
        Item item2 = new Item("Имя2", "Описание2", 2L);
        tracker.add(item1);
        tracker.add(item2);
        Input input = new StubInput(new String[]{"3", item1.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll(), is(new Item [] {item2}));
    }

    @Test
    public void whenUserWantsFindElementByIdThenHeDoIt() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Имя1", "Описание1", 1L);
        Item item2 = new Item("Имя2", "Описание2", 2L);
        tracker.add(item1);
        tracker.add(item2);
        Input input = new StubInput(new String[]{"4", item2.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item2.getId()), is(item2));
    }

    @Test
    public void whenUserWantsFindElementByNameAndTrackerHasTwoElementsWithSameNameThenUserGetTwoElements() {
        Tracker tracker = new Tracker();
        String name = "Имя";
        Item item1 = new Item(name, "Описание1", 1L);
        Item item2 = new Item(name, "Описание2", 2L);
        tracker.add(item1);
        tracker.add(item2);
        Input input = new StubInput(new String[]{"5", name, "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName(name), is(new Item [] {item1, item2}));
    }
}
