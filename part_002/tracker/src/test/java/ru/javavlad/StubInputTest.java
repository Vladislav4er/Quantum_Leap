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
        Input input = new StubInput(new String[]{"0", "test name", "desc", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getName(), is("test name"));
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("name", "desc", 123L));
        Input input = new StubInput(new String[]{"2", tracker.findAll().get(0).getId(), "name2", "desc2", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getName(), is("name2"));
        assertThat(tracker.findAll().get(0).getDescription(), is("desc2"));
    }

    @Test
    public void whenUserDeleteFirstItemThenResultOnlySecondItemInTracker() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("name", "desc", 123L));
        tracker.add(new Item("name2", "desc2", 1234L));
        Input input = new StubInput(new String[]{"3", tracker.findAll().get(0).getId(), "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getName(), is("name2"));
        assertThat(tracker.findAll().get(0).getDescription(), is("desc2"));
    }
}
