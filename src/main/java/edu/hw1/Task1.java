package edu.hw1;

class Task1 {

    private Task1() {}

    private final static int SECONDS_PER_MINUTE = 60;

    public static int minutesToSeconds(String strtime) {
        String[] parts = strtime.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        if (seconds >= SECONDS_PER_MINUTE) {
            return -1;
        }
        return minutes * SECONDS_PER_MINUTE + seconds;
    }

}
