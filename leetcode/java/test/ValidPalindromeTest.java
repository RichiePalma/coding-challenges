import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ValidPalindromeTest {

    record TestCase(String s, boolean expected) {}

    static Stream<ValidPalindromeTest.TestCase> provideTestCases() {
        return Stream.of(
                new ValidPalindromeTest.TestCase("A man, a plan, a canal: Panama", true),
                new ValidPalindromeTest.TestCase("race a car", false),
                new ValidPalindromeTest.TestCase( " ", true),
                new ValidPalindromeTest.TestCase( ".,", true),
                new ValidPalindromeTest.TestCase( "0P", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testValidateWithTwoPointers(TestCase tc) {
        ValidPalindrome vp = new ValidPalindrome();
        assertEquals(tc.expected, vp.validateWithTwoPointers(tc.s));
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testValidateWithHalfLoop(TestCase tc) {
        ValidPalindrome vp = new ValidPalindrome();
        assertEquals(tc.expected, vp.validateWithHalfLoop(tc.s));
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testValidateWithStringBuilder(TestCase tc) {
        ValidPalindrome vp = new ValidPalindrome();
        assertEquals(tc.expected, vp.validateWithStringBuilder(tc.s));
    }
}