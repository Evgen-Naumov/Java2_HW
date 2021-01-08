package Lesson1.HW1;

import java.lang.reflect.Array;
import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {

        Barrier[] barriers = {new RunningPath(700),
                new Wall(0.3),
                new RunningPath(100),
                new RunningPath(256),
                new Wall(1.15),
                new Wall(0.6),
                new RunningPath(450),
        };


        Skills[] members = {
                new Human("H1", 500, 0.5),
                new Human("H2", 200, 0.3),
                new Cat("C1", 200, 1.0),
                new Cat("C2", 330, 1.2),
                new Robot("R1", 1000,0),
                new Robot("R2", 863, 2)};


        System.out.println("Прохождение препятствий");

        for (Skills r : members
        ) {
            ((Running) r).canRun();
            ((Jumping) r).canJump();

            System.out.println(r.toString() + " готов");
            for (Barrier b : barriers
            ) {
                if (b instanceof RunningPath) {
                    System.out.print("Беговая дорожка длиной " + b.LengthPath + " :");
                    if ((r instanceof Running) && ((Running) r).doRun(450)) {
                        System.out.println(r.toString() + " пробежал");
                    } else {
                        System.out.println(r.toString() + " не пробежал");
                        System.out.println(r.toString() + " сошел с дистанции");
                        break;
                    }
                }

                if (b instanceof Wall) {
                    System.out.print("Стена высотой " + b.LengthPath+ " :");
                    if ((r instanceof Jumping) && ((Jumping) r).doJum(0.8)){
                        System.out.println(r.toString() + " перепрыгнул");
                    } else {
                        System.out.println(r.toString() + " не перепрыгнул");
                        System.out.println(r.toString() + " сошел с дистанции");
                        break;
                    }
                }
            }
        }

    }


}
