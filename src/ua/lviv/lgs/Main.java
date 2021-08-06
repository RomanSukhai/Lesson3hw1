package ua.lviv.lgs;

public class Main {
    public static void main(String[] args) {

    Robot           a = new Robot();
    CoffeRobot      b = new CoffeRobot();
    RobotDancer     c = new RobotDancer();
    RobotCoocker    d = new RobotCoocker();
    a.work();
    b.work();
    c.work();
    d.work();
        System.out.println(" ");
        System.out.println("_______________________________________________________________________________");
        System.out.println(" ");
    Robot[] work = new Robot[4];
        work[0]=a;
        work[1]=b;
        work[2]=c;
        work[3]=d;
    for (int i = 0 ; i < work.length ; i++){
        System.out.println(work[i]);
    }



    }
}
