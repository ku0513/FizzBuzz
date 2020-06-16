TODO
=======================
## 重要度：　高、　テスト容易性：高

- [x] 数を文字に変換する
    - [x] 1を渡すと文字列"1"に変換数 -> 仮実装
    - [x] 2を渡すと文字列"2"に変換数 -> 三角測量

- [x] 3の倍数のときは数の代わりに「Fizz」に変換する
    - [x] 3を渡すと文字列"Fizz"に変換する -> 仮実装 -> 本実装

- [x] 5の倍数のときは数の代わりに「Buzz」に変換する
    - [x] 5を渡すと文字列"Buzz"に変換する -> 明白な実装

- [ ] 3と5両方の倍数のときは数の代わりに「FizzBuzz」に変換する

- [ ] 1からnまでの数

## 重要度：　低、　テスト容易性：低

- [ ] 1から100までの数
- [ ] プリントする

## 模範解答その１
```Java
    @Nested
    class convertメソッドは数を文字に変換する {
        @Nested
        class _3の倍数のときは数の代わりにFizzに変換する {
            @Test
            void _3を渡すと文字列Fizzに変換する() {
                assertEquals("Fizz", fizzbuzz.convert(3));
            }
        }

        @Nested
        class _5の倍数のときは数の代わりにFizzに変換する {
            @Test
            void _5を渡すと文字列Fizzに変換する() {
                assertEquals("Buzz", fizzbuzz.convert(5));
            }
        }

        @Nested
        class その他の数のときは数をそのまま文字列に変換する {
            @Test
            void _1を渡すと文字列1に変換する() {
                assertEquals("1", fizzbuzz.convert(1));
            }
        }
    }
```

## 模範解答その2
```Java
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
            void _境界値の1つ内側2を渡すと文字列1に変換する() {
                assertEquals("2", fizzbuzz.convert(2));
            }
            @Test
            void _境界値の1つ外側101を渡すと文字列1に変換する() {
                assertEquals("101", fizzbuzz.convert(101));
            }
        }
    }
```