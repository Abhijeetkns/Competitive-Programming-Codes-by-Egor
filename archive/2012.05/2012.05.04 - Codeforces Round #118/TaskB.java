package net.egork;

import net.egork.collections.CollectionUtils;
import net.egork.collections.sequence.Array;
import net.egork.io.IOUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskB {
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		double sum = in.readInt();
		double[] powers = IOUtils.readDoubleArray(in, 3);
		if (CollectionUtils.count(Array.wrap(powers), 0d) == 3)
			out.printLine("0 0 0");
		else {
			double sumPowers = 0;
			for (double p : powers)
				sumPowers += p;
			for (int i = 0; i < 3; i++)
				powers[i] *= sum / sumPowers;
			out.printLine(Array.wrap(powers).toArray());
		}
	}
}
