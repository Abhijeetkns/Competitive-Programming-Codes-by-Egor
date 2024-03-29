package net.egork;

import net.egork.collections.sequence.Array;
import net.egork.collections.sequence.ListUtils;
import net.egork.io.IOUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.*;

public class TaskE {
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		int size = in.readInt();
		int count = in.readInt();
		int[] row = new int[count];
		final int[] column = new int[count];
		IOUtils.readIntArrays(in, row, column);
		for (int i = 0; i < count; i++)
			row[i] = size + 1 - row[i];
		Integer[] order = ListUtils.order(Array.wrap(row));
		int index = 0;
		Queue<Integer> queue = new PriorityQueue<Integer>(count, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return column[o1] - column[o2];
			}
		});
		List<Integer> answer = new ArrayList<Integer>();
		for (int i = 1; i <= size; i++) {
			while (!queue.isEmpty() && column[queue.peek()] < i)
				queue.poll();
			while (index != count && row[order[index]] == i)
				queue.add(order[index++]);
			if (!queue.isEmpty())
				answer.add(queue.poll() + 1);
		}
		out.printLine(answer.size());
		out.printLine(answer.toArray());
	}
}
