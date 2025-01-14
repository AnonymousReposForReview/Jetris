package tests.javafuzzer3095;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:35:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7L;
    public static float fFld=1.679F;
    public static volatile byte byFld=-112;
    public static boolean bFld=false;
    public static short sFld=-29399;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -15822);
        FuzzerUtils.init(Test.lArrFld, -3711824041L);
        FuzzerUtils.init(Test.fArrFld, -1.134F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(byte by, short s, double d1) {

        int i4=-13418, i5=7, i6=0, i7=4, i8=42, i9=-13;
        short sArr[]=new short[N];
        float fArr[]=new float[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(sArr, (short)-21688);
        FuzzerUtils.init(fArr, 0.692F);
        FuzzerUtils.init(byArr, (byte)69);

        for (i4 = 9; 388 > i4; i4++) {
            i5 = (int)d1;
            for (i6 = 1; i6 < 4; ++i6) {
                sArr[i6 - 1] |= by;
                for (i8 = 1; i8 < 2; ++i8) {
                    Test.lArrFld[i6] = Test.instanceCount;
                    Test.instanceCount = Test.instanceCount;
                    Test.fFld -= i5;
                    switch ((i8 % 7) + 99) {
                    case 99:
                        Test.instanceCount -= i4;
                    case 100:
                        fArr[i8] = s;
                        by -= (byte)Test.instanceCount;
                        break;
                    case 101:
                        i9 += i8;
                        i5 = (int)Test.instanceCount;
                        break;
                    case 102:
                        i7 = 4259;
                        break;
                    case 103:
                        s = (short)i9;
                        break;
                    case 104:
                        byArr[i8] = (byte)d1;
                        break;
                    case 105:
                        i9 &= i6;
                        break;
                    default:
                        Test.iArrFld[i6] = i9;
                    }
                }
            }
        }
        vMeth1_check_sum += by + s + Double.doubleToLongBits(d1) + i4 + i5 + i6 + i7 + i8 + i9 +
            FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth(boolean b, int i3) {

        double d=-71.62887;

        d += (--Test.fFld);
        vMeth1(Test.byFld, (short)(2216), 13.90933);
        vMeth_check_sum += (b ? 1 : 0) + i3 + Double.doubleToLongBits(d);
    }

    public static int iMeth(long l) {

        int i1=2, i2=1518, i10=-6123, i11=-26156, i12=112, i13=1;

        i1 -= (int)((i1 = (--i1)) - (--Test.fFld));
        i2 = 1;
        do {
            vMeth(Test.bFld, i1);
            Test.iArrFld[i2] -= i2;
            i10 = 1;
            do {
                if (Test.bFld) continue;
                if (false) continue;
                i1 += i10;
                Test.iArrFld[i2] = (int)13L;
            } while (++i10 < 4);
        } while (++i2 < 385);
        Test.sFld -= (short)i2;
        i11 = 1;
        while (++i11 < 202) {
            for (i12 = i11; 8 > i12; i12++) {
                Test.fFld += i1;
                i13 |= (int)Test.instanceCount;
                Test.fArrFld[i11 - 1] += Test.sFld;
            }
        }
        long meth_res = l + i1 + i2 + i10 + i11 + i12 + i13;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=62, i14=128, i15=-56011, i16=-82, i17=173;
        double d2=-1.110606, d3=-2.36211, dArr[]=new double[N];
        float f=-60.956F;
        long l1=-8L;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(dArr, -70.19661);
        FuzzerUtils.init(bArr, true);

        i = (int)(((i--) - (-Test.instanceCount)) << ((7 - (--i)) * (-Test.iArrFld[(-7 >>> 1) % N])));
        Test.iArrFld[(i >>> 1) % N] >>= iMeth(Test.instanceCount);
        i += (int)Test.instanceCount;
        i14 = 1;
        do {
            dArr[i14] *= 3690152999L;
            Test.fFld -= (float)d2;
        } while (++i14 < 363);
        for (d3 = 6; d3 < 218; d3++) {
            d2 -= Test.byFld;
            i *= i15;
            i16 = 1;
            do {
                i %= (int)(i15 | 1);
                if (Test.bFld) {
                    d2 += 27.940F;
                } else {
                    i -= (int)Test.instanceCount;
                    Test.instanceCount += i15;
                    for (f = (float)(d3); f < 1; f++) {
                        bArr = bArr;
                        Test.fFld += (((f * i) + Test.byFld) - l1);
                        Test.fFld -= 0.931F;
                        i17 = Test.sFld;
                        l1 -= 0L;
                        if (Test.bFld) break;
                    }
                    Test.sFld += (short)i16;
                }
                l1 = i15;
                i15 = i16;
                i += (i16 ^ l1);
                Test.iArrFld[i16] += i15;
                i17 = (int)42.83F;
                d2 *= 2.15881;
                i += (i16 + i16);
            } while (++i16 < 118);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
