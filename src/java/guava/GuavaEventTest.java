package guava;

import com.google.common.eventbus.EventBus;

/**
 * Created by Tom on 2019/3/17.
 */
public class GuavaEventTest {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        Student student = new Student();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(student);
        eventBus.register(guavaEvent);
        eventBus.post("Tom");
    }
}
