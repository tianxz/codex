import org.junit.Assert;
import org.junit.Test;
import org.tinker.codex.utils.Str;

public class StrTest {
    @Test
    public void testMerge() {
        String result = Str.Companion.merge("tinker {}", "tian");
        Assert.assertEquals("tinker tian", result);
    }
}
