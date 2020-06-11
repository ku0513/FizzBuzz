package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;

    @BeforeEach
    void 前準備() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    void _1を渡すと文字列1に変換する() {
        assertEquals("1", fizzbuzz.convert(1));
    }

    @Test
    void _2を渡すと文字列1に変換する() {
        assertEquals("2", fizzbuzz.convert(2));
    }

    @Test
    void _3を渡すと文字列Fizzに変換する() {
        assertEquals("Fizz", fizzbuzz.convert(3));
    }

    @Test
    void _5を渡すと文字列Fizzに変換する() {
        assertEquals("Buzz", fizzbuzz.convert(5));
    }
}
