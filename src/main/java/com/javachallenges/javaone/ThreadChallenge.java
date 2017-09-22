package com.javachallenges.javaone;

public class ThreadChallenge {
    private int wolverineAdrenaline = 10;

    public static void main(String[] args) {
        ThreadChallenge thread = new ThreadChallenge();

        thread.new Motorcycle("first bike").start();
        thread.new Motorcycle("second bike").start();
        thread.new Motorcycle("third bike").start();

        Motorcycle fastBike = thread.new Motorcycle("last bike");
        fastBike.setPriority(Thread.MAX_PRIORITY);
        fastBike.start();

        System.out.println(thread.wolverineAdrenaline);
    }

    // NoBugsProject
    class Motorcycle extends Thread {
        public Motorcycle(String bikeName) {
            this.setName(bikeName);
        }

        @Override
        public void run() {
            ++wolverineAdrenaline;
        }
    }

    // A 14    // B 10    // C 13    // D Undetermined

    // The answer depends on the jvm implementation
    // Play with the daemon flag
}
