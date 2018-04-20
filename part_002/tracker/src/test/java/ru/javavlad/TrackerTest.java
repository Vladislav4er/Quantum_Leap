package ru.javavlad;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import ru.javavlad.start.Tracker;
import ru.javavlad.models.Item;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void whenUpdatePreviousToNextThenTrackerElementHasNextName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("previous", "previous description", 1234L);
        tracker.add(previous);
        Item next = new Item("next", "next description", 123L);
        next.setId(previous.getId());
        tracker.update(next);
        assertThat(tracker.findById(previous.getId()).getName(), is("next"));
    }

    @Test
    public void whenDeleteSecondElementWhenTrackerHasThreeItems() {
        Tracker tracker = new Tracker();
        Item first = new Item("first", "first description", 1L);
        tracker.add(first);
        Item second = new Item("second", "second description", 2L);
        tracker.add(second);
        Item third = new Item("third", "third description", 3L);
        tracker.add(third);
        tracker.delete(second);
        assertThat(tracker.findAll()[0], is(first));
        assertThat(tracker.findAll()[1], is(third));
    }

    @Test
    public void whenTwoItemsInTrackerHaveSameNameThenResultIsArrayOfThey() {
        Tracker tracker = new Tracker();
        Item first = new Item("first", "first description", 1L);
        tracker.add(first);
        Item second = new Item("second", "second description", 2L);
        tracker.add(second);
        Item third = new Item("second", "third description", 3L);
        tracker.add(third);
        assertThat(tracker.findByName("second")[0], is(second));
        assertThat(tracker.findByName("second")[1], is(third));
    }

    @Test
    public void whenFindByIdOfSecondItemThemFoundSecond() {
        Tracker tracker = new Tracker();
        Item first = new Item("first", "first description", 1L);
        tracker.add(first);
        Item second = new Item("second", "second description", 2L);
        tracker.add(second);
        Item third = new Item("third", "third description", 3L);
        tracker.add(third);
        assertThat(tracker.findById(second.getId()), is(second));
    }

    @Test
    public void whenAddCommentToItemThenItemHasComment() {
        Tracker tracker = new Tracker();
        Item first = new Item("first", "first description", 1L);
        tracker.add(first);
        tracker.addComment(first.getId(), "Коммент1");
        assertThat(tracker.findAll()[0].getComment(), is("Коммент1"));
    }
}
