package com.bridgelabz.logical;

import java.util.*;

public class StopWatch {
	public long startTimer = 0;
	public long stopTimer = 0;
	public long elapsed;

	// to start timer
	public void start() {
		startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTimer);
	}

	// to stop timer
	public void stop() {
		stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopTimer);
	}

	public long getElapsedTime() {
		elapsed = stopTimer - startTimer;
		return elapsed;
	}

	public static void main(String[] args) throws Exception {
		StopWatch sc = new StopWatch();
		Scanner u = new Scanner(System.in);
		System.out.println("Press '1' to Start Time: ");
		u.nextInt();
		sc.start();

		System.out.println("Press '2' to Stop Time: ");
		u.nextInt();
		sc.stop();

		long l = sc.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:" + l);
		System.out.println();
		System.out.println("Converting millisec to seconds: " + (int) (l / 1000) + " sec");
	}
}
