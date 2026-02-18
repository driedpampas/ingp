package lab.lab01;

public class Schedule {
    Class[][]  schedule;
    int conflicts=0;

    public Schedule() {
        schedule = new Class[5][12];
    }

    public Schedule(int days, int hours) {
        schedule = new Class[days][hours];
    }

    public void addClass(Class c, int day, int hour) {
        if (schedule[day][hour] != null) {
            IO.println("Conflict detected: " + schedule[day][hour].getName() + " is already scheduled");
            conflicts++;
        }
        schedule[day][hour] = c;
    }

    public void startClass(int day, int hour) {
        if (schedule[day][hour] != null) {
            schedule[day][hour].start();
        } else {
            IO.println("No class scheduled at this time.");
        }
    }

    public void printSchedule() {
        for (int day = 0; day < schedule.length; day++) {
            for (int hour = 0; hour < schedule[day].length; hour++) {
                if (schedule[day][hour] != null) {
                    IO.println(String.format("Day %d, Hour %d: %s", day, hour, schedule[day][hour].getName()));
                }
            }
        }
    }

    public int getConflicts() {
        return conflicts;
    }
}
