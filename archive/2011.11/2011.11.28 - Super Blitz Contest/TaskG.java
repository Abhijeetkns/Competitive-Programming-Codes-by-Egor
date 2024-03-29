package net.egork;

import net.egork.datetime.Date;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskG {
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		int day = in.readInt();
		int month = in.readInt();
		int year = in.readInt();
		Date date = new Date(year, month, day);
		date = date.next().next();
		out.printLine(date.day, date.month, date.year);
	}
}
