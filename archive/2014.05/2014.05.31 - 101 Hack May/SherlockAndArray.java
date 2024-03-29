package net.egork;

import net.egork.io.IOUtils;
import net.egork.misc.ArrayUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class SherlockAndArray {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		int[] array = IOUtils.readIntArray(in, count);
		long[] partial = ArrayUtils.partialSums(array);
		for (int i = 0; i < count; i++) {
			if (partial[i] - partial[0] == partial[count] - partial[i + 1]) {
				out.printLine("YES");
				return;
			}
		}
		out.printLine("NO");
    }
}
