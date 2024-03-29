package net.egork;

import net.egork.numbers.IntegerUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class ChefAndRainbowArray2 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		out.printLine(IntegerUtils.binomialCoefficient((in.readInt() - 1) / 2, 6, (long) (1e9 + 7)));
    }
}
