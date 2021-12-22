package Threads;

import Beans.Messages;
import Beans.Person;

import java.time.MonthDay;
import java.util.List;

public class ScanThread implements Runnable {
    private List <Person>people;
    private MonthDay now = MonthDay.now();
    private boolean running = true;


    public ScanThread(List people) {
        this.people = people;
    }

    @Override
    public void run() {
        while (running){
            for (Person person: people){
                if (now.equals(person.getEvent())){
                    Messages message= new Messages(person.getEventType());
                    System.out.println("Sending message to "+person.getPhoneNum()+" "+message.sendMessage().replace("X",person.getName()));
                }
            }
            try {
                Thread.sleep(1000*3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
public void stopScanning(){
        this.running=false;
}

}
