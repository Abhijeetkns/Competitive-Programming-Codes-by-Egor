package net.egork;

import net.egork.io.IOUtils;
import net.egork.misc.ArrayUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		int[] wantToPlay = IOUtils.readIntArray(in, count);
		long sum = ArrayUtils.sumArray(wantToPlay);
		long answer = Math.max(ArrayUtils.maxElement(wantToPlay), (sum - 1) / (count - 1) + 1);
		out.printLine(answer);
    }
}
