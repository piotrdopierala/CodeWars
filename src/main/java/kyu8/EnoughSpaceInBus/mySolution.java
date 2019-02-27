package kyu8.EnoughSpaceInBus;

public class mySolution {
    public static int enough(int cap, int on, int wait){
        return (cap-on-wait)*(-1);
    }
}
