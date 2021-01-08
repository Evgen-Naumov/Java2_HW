package Lesson1.HW1;

public class Cat implements Running,Jumping{

    private String Name;
    private double MaxRun;
    private double MaxJump;


    public Cat(String Name, double MaxRun, double MaxJump) {
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
    public void canRun(){
        if((int)this.MaxRun==0){
            System.out.println(toString() + " умеет бегать");
        } else {
            System.out.println(toString() + " не умеет бегать");
        }
    }

    @Override
    public void canJump(){
        if((int)this.MaxJump==0){
            System.out.println(toString() + " умеет прыгать");
        } else {
            System.out.println(toString() + " не умеет прыгать");
        }
    }

    @Override
    public String toString() {
        return "Кот " + this.Name;
    }
}
