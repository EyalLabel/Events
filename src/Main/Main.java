package Main;

import Beans.Person;
import Threads.ScanThread;

import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person dan = new Person("Daniel", MonthDay.of(05, 23), "birthday", "0506441480");
        Person mom= new Person("Tziona",MonthDay.of(05,23),"womensDay","0528692100");
        List<Person>people=new ArrayList<Person>();
        people.add(dan);
        people.add(mom);
        ScanThread t1= new ScanThread(people);
        Thread thread=new Thread(t1);
        thread.start();
    }
}
