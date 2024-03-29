package net.egork;

import net.egork.numbers.IntegerUtils;
import net.egork.string.StringUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class PalindromeMagic {
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		int digits = in.readInt();
		int index = in.readInt();
		long first = IntegerUtils.power(10, (digits -1) >> 1);
		first += index - 1;
		out.print(first);
		out.printLine(StringUtils.reverse(Long.toString(first).substring(0, digits - ((digits + 1) >> 1))));
	}
}
