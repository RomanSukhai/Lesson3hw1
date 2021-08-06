package ua.lviv.lgs;


import java.util.StringJoiner;

public class Robot {

     String descriptionWork;

    public Robot() {
        this.descriptionWork = "Я Robot – я просто працюю";
    }

    public void work(){
        System.out.println(this.descriptionWork);
    }

    public String getDescriptionWork() {
        return descriptionWork;
    }

    @Override
    public String toString() {
        return new StringJoiner("", "" + "", "")
                .add( descriptionWork )
                .toString();
    }
}