package ua.lviv.lgs;

import java.util.StringJoiner;

public class RobotCoocker extends Robot{

    public RobotCoocker() {
        this.descriptionWork="Я RobotCoocker – я просто готую";
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
