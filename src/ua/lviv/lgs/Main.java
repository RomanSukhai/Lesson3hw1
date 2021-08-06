package ua.lviv.lgs;

public class Main {
    public static void main(String[] args) {
        Robot.work("Я Robot – я просто працюю");
        RobotCoocker.work("Я RobotCoocker – я просто готую");
        RobotDancer.work("Я RobotDancer – я просто танцюю");
        CoffeRobot.work("Я CoffeRobot – я варю каву");
        System.out.println(" ");


        Robot[] a;
        a= new Robot[4];
            a[0]= new Robot("Я Robot – я просто працюю");
            a[1]= new Robot("Я RobotCoocker – я просто готую");
            a[2]= new Robot("Я RobotDancer – я просто танцюю");
            a[3]= new Robot("Я CoffeRobot – я варю каву");

            for (int i =0;i<a.length;i++){
                System.out.println(a[i]);
            }

    }
}
