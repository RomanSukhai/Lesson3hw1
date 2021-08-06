package ua.lviv.lgs;

import java.util.StringJoiner;

public class Robot {

    private String work;

    Robot(String work){
        this.work = work;
    }

    static void work(String work) {
        System.out.println(work);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Robot.class.getSimpleName() + "[", "]")
                .add("work='" + work + "'")
                .toString();
    }
}