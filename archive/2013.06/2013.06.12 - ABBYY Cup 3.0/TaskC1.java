package net.egork;

import net.egork.graph.Graph;
import net.egork.graph.MinCostFlow;
import net.egork.io.IOUtils;
import net.egork.misc.MiscUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskC1 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int rowCount = in.readInt();
		int columnCount = in.readInt();
		int[][] type = IOUtils.readIntTable(in, rowCount, columnCount);
		Graph graph = new Graph(rowCount * columnCount + 2);
		int source = graph.vertexCount() - 2;
		int sink = graph.vertexCount() - 1;
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				int index = i * columnCount + j;
				if (((i + j) & 1) == 0) {
					graph.addFlowEdge(source, index, 1);
					for (int k = 0; k < 4; k++) {
						int row = i + MiscUtils.DX4[k];
						int column = j + MiscUtils.DY4[k];
						if (MiscUtils.isValidCell(row, column, rowCount, columnCount)) {
							graph.addFlowWeightedEdge(index, row * columnCount + column, type[i][j] == type[row][column] ? 0 : 1, 1);
						}
					}
				} else {
					graph.addFlowEdge(index, sink, 1);
				}
			}
		}
		out.printLine(new MinCostFlow(graph, source, sink, false).minCostMaxFlow().first);
    }
}
