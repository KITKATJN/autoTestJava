import org.junit.Assert;
import org.junit.Test;

import static main.StringReverse.stringReverse;

public class TestStringReverse {

    @Test
    public void test1() {
        Assert.assertEquals(new StringBuilder("aaa").reverse().toString(), stringReverse("aaa"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(new StringBuilder("\088").reverse().toString(), stringReverse("\088"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(new StringBuilder("a56aa\0TTT").reverse().toString(), stringReverse("a56aa\0TTT"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(new StringBuilder("aaa438234f9821@!#13x213x21x4TTT").reverse().toString(), stringReverse("aaa438234f9821@!#13x213x21x4TTT"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(new StringBuilder("\0\0\0\0\0\0").reverse().toString(), stringReverse("\0\0\0\0\0\0"));
    }

    @Test
    public void test6() {
        Assert.assertNull(stringReverse(null));
    }

    @Test
    public void test7() {
        Assert.assertEquals(new StringBuilder("%TGBNH^^&JM").reverse().toString(), stringReverse("%TGBNH^^&JM"));
    }

}
