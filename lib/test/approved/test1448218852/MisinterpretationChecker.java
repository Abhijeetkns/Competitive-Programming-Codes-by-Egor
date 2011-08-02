package approved.test1448218852;

import net.egork.utils.checker.Checker;
import net.egork.utils.io.InputReader;
import net.egork.utils.test.Test;

import java.util.Collection;
import java.util.Collections;

public class MisinterpretationChecker extends Checker {
	@Override
	public String check(InputReader input, InputReader expectedOutput, InputReader actualOutput) {
		return tokenCheck(expectedOutput, actualOutput);
	}

	@Override
	public double getCertainty() {
		return 0;
	}

	@Override
	public Collection<Test> generateTests() {
		return Collections.emptySet();
	}
}

