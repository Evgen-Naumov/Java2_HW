package Lesson1.HW1;

public class Robot implements Running, Jumping{

    private String Name;
    private double MaxRun;
    private double MaxJump;


    public Robot(String Name, double MaxRun,double MaxJump) {
        this.Name = Name;
        this.MaxRun = Math.max(0,MaxRun);
        this.MaxJump = Math.max(0,MaxJump);
    }

    @Override
    public boolean doRun(double RunPath) {
        return this.MaxRun >= RunPath;
    }

    @Override
    public boolean doJum(double JumpPath) {
        return this.MaxJump >= JumpPath;
    }

    @Override
    public String toString() {
        return "Робот " + this.Name;
    }

    @Override
    public void canRun(){
        if((int)this.MaxRun==0){
            System.out.println(toString() + " не умеет бегать");
        } else {
            System.out.println(toString() + " умеет бегать");
        }
    }
    @Override
    public void canJump(){
        if((int)this.MaxJump==0){
            System.out.println(toString() + " не умеет прыгать");
        } else {
            System.out.println(toString() + " умеет прыгать");
        }
    }

}
