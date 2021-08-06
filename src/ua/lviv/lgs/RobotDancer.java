package ua.lviv.lgs;

import java.util.StringJoiner;

public class RobotDancer extends Robot{

    public RobotDancer() {
        this.descriptionWork= "Я RobotDancer – я просто танцюю";
    }

    public void work(){
        System.out.println(this.descriptionWork);
    }

    @Override
    public String toString() {
        return new StringJoiner("", "" + "", "")
                .add( descriptionWork )
                .toString();
    }
}
