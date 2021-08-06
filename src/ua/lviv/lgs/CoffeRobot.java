package ua.lviv.lgs;

import java.util.StringJoiner;

public class CoffeRobot extends Robot{

    public CoffeRobot() {
        this.descriptionWork = "Я CoffeRobot – я варю каву";
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
