package net.egork;

import net.egork.geometry.Line;
import net.egork.geometry.Point;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		Line[] lines = new Line[2];
		for (int i = 0; i < 2; i++) {
			Point point = Point.readPoint(in);
			int degreeDirection = in.readInt();
			double angle = Math.PI / 2 - degreeDirection / 180d * Math.PI;
			lines[i] = new Line(point, angle);
		}
		Point answer = lines[0].intersect(lines[1]);
		out.printFormat("%.4f %.4f\n", answer.x, answer.y);
    }
}
