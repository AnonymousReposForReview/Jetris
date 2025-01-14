package tests.javafuzzer1277;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:39:45 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1577L;
    public static float fFld=0.691F;
    public double dFld=1.74043;
    public static short sFld=7513;
    public byte byFld=-47;
    public int iFld=-9;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2) {

        int i3=-2, i5=-13, i6=-3734, iArr[]=new int[N];
        boolean b=true;
        double d=0.114302, d1=0.115506;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -215);
        FuzzerUtils.init(lArr, -31683L);

        i2 |= i2;
        i3 = 1;
        do {
            b = b;
            i2 = (int)2.15491;
            i2 += i3;
            if (b) break;
            d = 1;
            do {
                int i4=135;
                i2 -= (int)-1.244F;
                i2 = i3;
                d1 = Test.instanceCount;
                i2 = i4;
                iArr[(int)(d - 1)] |= (int)Test.instanceCount;
            } while (++d < 6);
        } while (++i3 < 265);
        for (i5 = 10; 167 > i5; i5++) {
            lArr[i5 + 1] = i3;
            Test.fFld += i2;
        }
        vMeth2_check_sum += i2 + i3 + (b ? 1 : 0) + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i5 + i6
            + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth1(long l1, long l2) {

        int i7=-3, i8=-90, i9=-120, i10=49292, iArr1[]=new int[N];
        float f=0.396F;
        byte by=-29;
        double d2=2.34749;
        short s=12659;

        FuzzerUtils.init(iArr1, 18763);

        vMeth2(-88);
        i7 <<= i7;
        for (f = 18; f < 388; f++) {
            by *= (byte)i8;
            i7 = i7;
            d2 -= -15.530F;
            Test.fFld = i7;
            for (i9 = 5; i9 > f; --i9) {
                iArr1[i9 - 1] = i10;
                iArr1[(int)(f - 1)] >>= (int)l2;
                by *= (byte)l1;
                i8 += (i9 - s);
                iArr1[i9] = (int)l1;
                i7 = (int)l2;
                i8 -= (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += l1 + l2 + i7 + Float.floatToIntBits(f) + i8 + by + Double.doubleToLongBits(d2) + i9 + i10 +
            s + FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth(int i, int i1, long l) {

        int i11=-152, i12=-24524, i13=3, i14=0, iArr2[][]=new int[N][N];
        boolean b1=false;
        byte byArr[]=new byte[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(byArr, (byte)-26);
        FuzzerUtils.init(lArr1, -14391L);
        FuzzerUtils.init(iArr2, 12);

        vMeth1(l, l);
        i -= i1;
        i -= (int)dFld;
        for (byte by1 : byArr) {
            i1 >>= i1;
        }
        i1 += i;
        lArr1 = lArr1;
        try {
            for (i11 = 14; 282 > i11; ++i11) {
                Test.instanceCount = -6;
                if (b1) {
                    i1 = Test.sFld;
                } else {
                    for (i13 = 1; i13 < 6; i13++) {
                        iArr2[i13] = iArr2[i13 - 1];
                        i1 += (i13 + l);
                    }
                }
            }
        }
        catch (NullPointerException exc1) {
            byFld = (byte)dFld;
        }
        vMeth_check_sum += i + i1 + l + i11 + i12 + (b1 ? 1 : 0) + i13 + i14 + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i15=64548, i16=1, i17=-14, i18=44317, i19=-28441, i20=10, iArr3[]=new int[N];
        long l3=-155L;
        boolean b2=true;
        double dArr[]=new double[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(dArr, 3.108860);
        FuzzerUtils.init(iArr3, 12577);
        FuzzerUtils.init(fArr, -2.829F);

        vMeth(iFld, iFld, 23180L);
        for (i15 = 141; i15 > 2; --i15) {
            byFld *= (byte)21721;
            dArr = FuzzerUtils.double1array(N, (double)-92.122454);
            dArr[i15 - 1] += i16;
            Test.fFld = Test.sFld;
            Test.instanceCount += (long)Test.fFld;
            for (i17 = 6; i17 < 180; i17++) {
                i16 -= i15;
                iFld += (((i17 * Test.instanceCount) + iFld) - iFld);
                i18 += i17;
                iArr3[i15] >>= iFld;
                Test.instanceCount &= i15;
                i16 = (int)3543777956L;
            }
            iArr3[i15 + 1] >>>= (int)Test.instanceCount;
            dFld -= Test.instanceCount;
            for (l3 = 1; l3 < 180; l3++) {
                i18 >>= i18;
                iFld += (int)l3;
                i20 = 1;
                do {
                    i19 += (((i20 * i16) + i20) - i18);
                    i16 += i19;
                    Test.instanceCount = l3;
                    i19 += (int)l3;
                    i18 += i20;
                    Test.instanceCount |= i18;
                    i16 = iFld;
                    dFld -= Test.instanceCount;
                } while (++i20 < 2);
                if (b2) break;
                fArr[i15 + 1] -= i19;
            }
        }


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
