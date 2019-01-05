import org.junit.Assert;
import org.junit.Test;
import org.tinker.codex.utils.BitStatus;

public class BitStatusTest {
    @Test
    public void testToArray() {
        String bitStr = "推荐=2^0,游戏=2^1,报刊杂志=2^2,财务=2^3,参考=2^4,导航=2^5,工具=2^6,购物=2^7,健康健美=2^8,教育=2^9,旅游=2^10,美食=2^11,商务=2^12,设计=2^13,摄影=2^14,录像=2^15,生活=2^16,体育=2^17,天气=2^18,图书=2^19,效率=2^20,新闻=2^21,医疗=2^22,音乐=2^23,娱乐=2^24,其他=2^25,其他=2^26,其他=2^27,其他=2^28,其他=2^29,其他=2^30,其他=2^31,其他=2^32,其他=2^33,其他=2^34,其他=2^35,其他=2^36,其他=2^37,其他=2^38,其他=2^39,其他=2^40,其他=2^41,其他=2^42,其他=2^43,其他=2^44,其他=2^45,其他=2^46,其他=2^47,其他=2^48,其他=2^49,其他=2^50,其他=2^51,其他=2^52,其他=2^53,其他=2^54,其他=2^55,其他=2^56,其他=2^57,其他=2^58,其他=2^59,其他=2^60,其他=2^61,其他=2^62,自定义=2^63";
        String[] result = BitStatus.Companion.toArray(bitStr);
        Assert.assertEquals("推荐", result[0]);
        Assert.assertEquals("娱乐", result[24]);
        Assert.assertEquals("自定义", result[63]);
    }

    @Test
    public void testBitPow() {
        Assert.assertEquals(1, BitStatus.Companion.bitPow(0));
        Assert.assertEquals(2, BitStatus.Companion.bitPow(1));
        Assert.assertEquals(4, BitStatus.Companion.bitPow(2));
        Assert.assertEquals(16, BitStatus.Companion.bitPow(4));
        Assert.assertEquals(4611686018427387904L, BitStatus.Companion.bitPow(62));
        Assert.assertEquals(-9223372036854775808L, BitStatus.Companion.bitPow(63));
    }

    @Test
    public void testToString() {
        //region init data
        String[] array = new String[64];
        array[0] = "推荐";
        array[1] = "游戏";
        array[2] = "报刊杂志";
        array[3] = "财务";
        array[4] = "参考";
        array[5] = "导航";
        array[6] = "工具";
        array[7] = "购物";
        array[8] = "健康健美";
        array[9] = "教育";
        array[10] = "旅游";
        array[11] = "美食";
        array[12] = "商务";
        array[13] = "设计";
        array[14] = "摄影";
        array[15] = "录像";
        array[16] = "生活";
        array[17] = "体育";
        array[18] = "天气";
        array[19] = "图书";
        array[20] = "效率";
        array[21] = "新闻";
        array[22] = "医疗";
        array[23] = "音乐";
        array[24] = "娱乐";
        array[25] = "其他";
        array[26] = "其他";
        array[27] = "其他";
        array[28] = "其他";
        array[29] = "其他";
        array[30] = "其他";
        array[31] = "其他";
        array[32] = "其他";
        array[33] = "其他";
        array[34] = "其他";
        array[35] = "其他";
        array[36] = "其他";
        array[37] = "其他";
        array[38] = "其他";
        array[39] = "其他";
        array[40] = "其他";
        array[41] = "其他";
        array[42] = "其他";
        array[43] = "其他";
        array[44] = "其他";
        array[45] = "其他";
        array[46] = "其他";
        array[47] = "其他";
        array[48] = "其他";
        array[49] = "其他";
        array[50] = "其他";
        array[51] = "其他";
        array[52] = "其他";
        array[53] = "其他";
        array[54] = "其他";
        array[55] = "其他";
        array[56] = "其他";
        array[57] = "其他";
        array[58] = "其他";
        array[59] = "其他";
        array[60] = "其他";
        array[61] = "其他";
        array[62] = "其他";
        array[63] = "自定义";
        //endregion
        String result = BitStatus.Companion.toString(array);
        Assert.assertEquals("推荐=2^0,游戏=2^1,报刊杂志=2^2,财务=2^3,参考=2^4,导航=2^5,工具=2^6,购物=2^7,健康健美=2^8,教育=2^9,旅游=2^10,美食=2^11,商务=2^12,设计=2^13,摄影=2^14,录像=2^15,生活=2^16,体育=2^17,天气=2^18,图书=2^19,效率=2^20,新闻=2^21,医疗=2^22,音乐=2^23,娱乐=2^24,其他=2^25,其他=2^26,其他=2^27,其他=2^28,其他=2^29,其他=2^30,其他=2^31,其他=2^32,其他=2^33,其他=2^34,其他=2^35,其他=2^36,其他=2^37,其他=2^38,其他=2^39,其他=2^40,其他=2^41,其他=2^42,其他=2^43,其他=2^44,其他=2^45,其他=2^46,其他=2^47,其他=2^48,其他=2^49,其他=2^50,其他=2^51,其他=2^52,其他=2^53,其他=2^54,其他=2^55,其他=2^56,其他=2^57,其他=2^58,其他=2^59,其他=2^60,其他=2^61,其他=2^62,自定义=2^63", result);
    }
}
