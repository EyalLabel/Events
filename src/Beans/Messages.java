package Beans;

import java.util.ArrayList;
import java.util.List;

public class Messages {
    private String type;

    public Messages(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private static List<String> birthdayList() {
        List<String> birthdayList = new ArrayList<String>();
        birthdayList.add("Happy birthday dear X");
        birthdayList.add("Live long and prosper X");
        birthdayList.add("X enjoy your cake");
        birthdayList.add("Mazal Tov X!");
        birthdayList.add("sanhilawa ya jamil X");

        return birthdayList;
    }

    private static List<String> anniversaryList() {
        List<String> anniversaryList = new ArrayList<String>();
        anniversaryList.add("Happy anniversary dear X");
        anniversaryList.add("Live long and anniversary X");
        anniversaryList.add("X enjoy your anniversary cake");
        anniversaryList.add("Mazal Tov anniversary X!");
        anniversaryList.add("anniversary ya jamil X");

        return anniversaryList;
    }

    private static List<String> womensDayList() {
        List<String> womensDayList = new ArrayList<String>();
        womensDayList.add("Happy Women's Day dear X");
        womensDayList.add("Live long and women's Day X");
        womensDayList.add("X enjoy your women's Day cake");
        womensDayList.add("Mazal Tov women's Day X!");
        womensDayList.add("anniversary ya jamil X");

        return womensDayList;
    }

    public String sendMessage() {
        switch (type) {
            case "birthday":
                return birthdayList().get((int) (Math.random() * (birthdayList().size() - 1)));


            case "anniversary":
                return anniversaryList().get((int) (Math.random() * (birthdayList().size() - 1)));

            case "womensDay":
                return womensDayList().get((int) (Math.random() * (birthdayList().size() - 1)));

            default:
                return "fuck";
        }
    }

}
