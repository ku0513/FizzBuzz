package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("FizzBuzz数列を表すFizzBuzzクラス")
public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;

    @BeforeEach
    void 前準備() {
        fizzbuzz = new FizzBuzz();
    }

    @Nested
    class convertメソッドは数を文字に変換する {
        @Nested
        class _3と5の倍数のときは数の代わりにFizzBuzzに変換する {
            @Test
            void _15を渡すと文字列FizzBuzzに変換する() {
                assertEquals("FizzBuzz", fizzbuzz.convert(15));
            }
            @Test
            void _境界値の1つ外側0を渡すと文字列FizzBuzzに変換する() {
                assertEquals("FizzBuzz", fizzbuzz.convert(0));
            }
        }

        @Nested
        class _3の倍数のときは数の代わりにFizzに変換する {
            @Test
            void _3を渡すと文字列Fizzに変換する() {
                assertEquals("Fizz", fizzbuzz.convert(3));
            }
            @Test
            void _境界値の1つ内側99を渡すと文字列Fizzに変換する() {
                assertEquals("Fizz", fizzbuzz.convert(99));
            }
        }

        @Nested
        class _5の倍数のときは数の代わりにFizzに変換する {
            @Test
            void _5を渡すと文字列Fizzに変換する() {
                assertEquals("Buzz", fizzbuzz.convert(5));
            }
            @Test
            void _境界値100を渡すと文字列Fizzに変換する() {
                assertEquals("Buzz", fizzbuzz.convert(100));
            }
        }

        @Nested
        class その他の数のときは数をそのまま文字列に変換する {
            @Test
            void _境界値1を渡すと文字列1に変換する() {
                assertEquals("1", fizzbuzz.convert(1));
            }
            @Test
            void _境界値の1つ内側2を渡すと文字列2に変換する() {
                assertEquals("2", fizzbuzz.convert(2));
            }
            @Test
            void _境界値の1つ外側101を渡すと文字列101に変換する() {
                assertEquals("101", fizzbuzz.convert(101));
            }
        }
    }
}
