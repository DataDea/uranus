package org.uranus.observer;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.uranus.observer.event.GoblinStudentEvent;
import org.uranus.observer.event.GoblinTeacherEvent;
import org.uranus.observer.handler.StudentEventHandler;
import org.uranus.observer.handler.TeacherEventHandler;

/**
 * @author yanghai
 * @since 2021/4/28-3:43 下午
 */
public class TestObserver {

    @Test
    public void test() throws Exception {
        GoblinTeacherEvent goblinTeacherEvent = new GoblinTeacherEvent();
        goblinTeacherEvent.setEventId(String.valueOf(RandomUtils.nextLong(0L, 1000000000000L)));
        goblinTeacherEvent.setType("TEACHER_CLASS");
        goblinTeacherEvent.setEventTime(DateUtils.parseDate("2020-04-27 23:59:59"));
        goblinTeacherEvent.setName("英语课");
        goblinTeacherEvent.setAddress("阶梯102");
        goblinTeacherEvent.setClassz("网络1402");
        goblinTeacherEvent.setStart("2020-04-27 20:30:00");
        goblinTeacherEvent.setEnd("2020-04-27 21:30:00");

        GoblinStudentEvent goblinStudentEvent = new GoblinStudentEvent();
        goblinStudentEvent.setEventId(String.valueOf(RandomUtils.nextLong(0L, 1000000000000L)));
        goblinStudentEvent.setType("STUDENT_CLASS");
        goblinStudentEvent.setEventTime(DateUtils.parseDate("2020-04-27 23:59:59"));
        goblinStudentEvent.setName("英语课");
        goblinStudentEvent.setSubject("ENGLISH");
        goblinStudentEvent.setTeacher("张老师");
        goblinStudentEvent.setStart("2020-04-27 20:30:00");
        goblinStudentEvent.setEnd("2020-04-27 21:30:00");

        EventBusManager.getInstance().registerHandler(TeacherEventHandler.getInstance());
        EventBusManager.getInstance().registerHandler(StudentEventHandler.getInstance());
        EventBusManager.getInstance().notify(goblinTeacherEvent);
        EventBusManager.getInstance().notify(goblinStudentEvent);
    }
}
