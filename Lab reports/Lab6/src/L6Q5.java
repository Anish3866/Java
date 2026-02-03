class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    Time addTime(Time t) {
        int h = this.hours + t.hours;
        int m = this.minutes + t.minutes;
        int s = this.seconds + t.seconds;

        if (s >= 60) {
            s = s - 60;
            m = m + 1;
        }

        if (m >= 60) {
            m = m - 60;
            h = h + 1;
        }

        return new Time(h, m, s);
    }

    Time subtractTime(Time t) {
        int h = this.hours - t.hours;
        int m = this.minutes - t.minutes;
        int s = this.seconds - t.seconds;

        if (s < 0) {
            s = s + 60;
            m = m - 1;
        }

        if (m < 0) {
            m = m + 60;
            h = h - 1;
        }

        return new Time(h, m, s);
    }

    void displayTime() {
        System.out.printf(+hours+":"+minutes+":"+seconds+"\n");
    }
}

public class L6Q5 {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 30, 40);

        Time sum = t1.addTime(t2);
        Time diff = t1.subtractTime(t2);

        System.out.print("1st time = ");
        t1.displayTime();

        System.out.print("2nd time = ");
        t2.displayTime();

        System.out.print("time sum = ");
        sum.displayTime();

        System.out.print("time sub = ");
        diff.displayTime();
    }
}
