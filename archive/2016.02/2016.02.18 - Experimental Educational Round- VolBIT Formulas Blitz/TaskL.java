package net.egork;

import net.egork.numbers.IntegerUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;
import static net.egork.io.IOUtils.*;
import static net.egork.misc.MiscUtils.*;
import static net.egork.misc.ArrayUtils.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class TaskL {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readString();
        StringBuilder builder = new StringBuilder();
        builder.append(s.charAt(0));
        builder.append(s.charAt(2));
        builder.append(s.charAt(4));
        builder.append(s.charAt(3));
        builder.append(s.charAt(1));
        out.printFormat("%05d\n", IntegerUtils.power(Integer.parseInt(builder.toString()), 5, 100000));
    }
}
