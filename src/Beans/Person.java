package Beans;

import java.time.MonthDay;
import java.util.Objects;

public class Person implements Comparable<MonthDay>{
    private String name;
    private MonthDay event;
    private String eventType;
    private String phoneNum;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(event, person.event) && Objects.equals(eventType, person.eventType) && Objects.equals(phoneNum, person.phoneNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, event, eventType, phoneNum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MonthDay getEvent() {
        return event;
    }

    public void setEvent(MonthDay event) {
        this.event = event;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Person(String name, MonthDay event, String eventType, String phoneNum) {
        this.name = name;
        this.event = event;
        this.eventType = eventType;
        this.phoneNum = phoneNum;
    }

    @Override
    public int compareTo(MonthDay o) {
        return 0;
    }
}
