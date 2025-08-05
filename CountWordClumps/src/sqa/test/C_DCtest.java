package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import sqa.main.CountWordClumps;

class C_DCtest{
	CountWordClumps test;

	@BeforeEach
	void setup() {
		test = new CountWordClumps();
	}

	@ParameterizedTest
	@MethodSource("testcase")
	void C_DC_wordclumps_test(int[] nums, int expected) {
		assertEquals(expected, CountWordClumps.countClumps(nums));
	}

	static Stream<Arguments> testcase() {
		return Stream.of(
				Arguments.of(null, 0),
				Arguments.of(new int[] {}, 0),
				Arguments.of(new int[] {1}, 0),
				Arguments.of(new int[] {1,1}, 1),
				Arguments.of(new int[] {2,3}, 0),
				Arguments.of(new int[] {3,3,4}, 1)
		);
	}
}