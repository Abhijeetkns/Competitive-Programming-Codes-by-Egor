package on2012_3_22.selectionfortrainingcamps;

import net.egork.chelper.tester.Tester;
import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!Tester.test("net.egork.utils.io.InputReader",
			"on2012_3_22.selectionfortrainingcamps.SelectionForTrainingCamps",
			"MULTI_NUMBER",
			"2/__3/__3 4/__5 5/__4 3/__6/__7 7/__4 7/__5 5/__1 2/__3 4/__2 1/__;;2/__1 2/__4/__1 2 1 2/__;;true",
			"net.egork.utils.io.OutputWriter"))
		{
			Assert.fail();
		}
	}
}
