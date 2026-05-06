class Time {
    int hours;
    int minutes;
    int seconds;

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
        int h = hours + t.hours;
        int m = minutes + t.minutes;
        int s = seconds + t.seconds;

        if (s >= 60) {
            m = m + (s / 60);
            s = s % 60;
        }

        if (m >= 60) {
            h = h + (m / 60);
            m = m % 60;
        }

        return new Time(h, m, s);
    }

    Time subtractTime(Time t) {
        int total1 = hours * 3600 + minutes * 60 + seconds;
        int total2 = t.hours * 3600 + t.minutes * 60 + t.seconds;

        int diff = total1 - total2;

        if (diff < 0) {
            diff = -diff;
        }

        int h = diff / 3600;
        diff = diff % 3600;

        int m = diff / 60;
        int s = diff % 60;

        return new Time(h, m, s);
    }
}

public class L6Q5 {
    public static void main(String[] args) {

        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 20, 30);

        Time sum = t1.addTime(t2);
        Time difference = t1.subtractTime(t2);

        System.out.println("Added Time:");
        System.out.println(sum.hours + ":" + sum.minutes + ":" + sum.seconds);

        System.out.println("Subtracted Time:");
        System.out.println(difference.hours + ":" + difference.minutes + ":" + difference.seconds);
    }
}