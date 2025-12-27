import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ReverseLinkedListTest {
    record TestCase(ListNode head, ListNode expected){}

    static Stream<TestCase> provideTestCases() {
        return Stream.of(
                new TestCase(new ListNode(new int[]{2,7,11,15}), new ListNode(new int[]{15,11,7,2})),
                new TestCase(new ListNode(new int[]{1,2,3,4,5}), new ListNode(new int[]{5,4,3,2,1})),
                new TestCase(new ListNode(new int[]{1,2}), new ListNode(new int[]{2,1})),
                new TestCase(new ListNode(new int[]{}), new ListNode(new int[]{}))
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testReverseListIteratively(TestCase tc) {
        ReverseLinkedList rll = new ReverseLinkedList();
        assertEquals(tc.expected, rll.reverseListIteratively(tc.head));
    }
}