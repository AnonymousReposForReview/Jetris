package tests.javafuzzer1600;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:37:30 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4285913228L;
    public int iFld=-213;
    public static double dFld=1.68834;
    public static float fFld=-47.634F;
    public static short sFld=-31031;
    public static byte byArrFld[]=new byte[N];
    public int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)78);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(byte by) {

        int i7=-81, i8=-174, i9=39369, i10=-87, i11=-59968;
        float f=2.685F;
        boolean b1=true;

        for (i7 = 13; i7 < 222; i7++) {
            for (f = 8; f > 1; f--) {
                Test.instanceCount -= i8;
                if (b1) continue;
                for (i10 = 2; i10 > 1; i10--) {
                    i9 *= (int)Test.instanceCount;
                    i11 <<= i9;
                    i8 = i10;
                    Test.fFld *= Test.fFld;
                    i11 *= i8;
                    i8 += (i10 - i8);
                    i9 += (((i10 * Test.instanceCount) + i9) - i10);
                    Test.byArrFld[i10] -= (byte)Test.dFld;
                }
            }
            if (b1) break;
            Test.instanceCount += (i7 - i9);
        }
        vMeth_check_sum += by + i7 + i8 + Float.floatToIntBits(f) + i9 + (b1 ? 1 : 0) + i10 + i11;
    }

    public static long lMeth(int i4, int i5, int i6) {

        int i12=207, i13=4, i14=210, i15=-54195, i16=-9139, i17=-49286, i18=151, i19=60, i20=-39351;
        short s=-26681;
        float f1=1.486F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 20.901F);

        vMeth((byte)(38));
        i6 = i4;
        for (i12 = 3; 302 > i12; i12++) {
            boolean b2=true;
            if (b2) break;
            Test.dFld = i4;
            s += (short)i6;
        }
        fArr[(i5 >>> 1) % N] -= (float)Test.dFld;
        for (f1 = 8; f1 < 271; f1++) {
            Test.instanceCount = Test.instanceCount;
            for (i15 = 1; i15 < 6; i15++) {
                for (i17 = 1; 2 > i17; i17++) {
                    i18 *= -7;
                }
                for (i19 = 1; i19 < 2; ++i19) {
                    i14 = i19;
                    Test.fFld = i19;
                }
            }
        }
        long meth_res = i4 + i5 + i6 + i12 + i13 + s + Float.floatToIntBits(f1) + i14 + i15 + i16 + i17 + i18 + i19 +
            i20 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public int iMeth(int i2, int i3, long l1) {

        double d=-43.104382;
        int i21=39202, i22=8, i23=-11124, i24=2;
        long l2=0L;

        Test.dFld *= lMeth(-7, i3, i2);
        for (d = 4; d < 351; ++d) {
            for (l2 = 1; l2 < 5; ++l2) {
                i3 = i3;
                Test.fFld += (l2 * l2);
                Test.instanceCount *= i22;
                for (i23 = 1; 2 > i23; i23++) {
                    if (false) break;
                }
                iArrFld[(int)(d - 1)] ^= 11;
                i2 >>= (int)l2;
                Test.sFld = (short)i21;
                Test.instanceCount = Test.instanceCount;
            }
            i22 = i23;
            i3 <<= (int)l1;
            i3 += i22;
        }
        long meth_res = i2 + i3 + l1 + Double.doubleToLongBits(d) + i21 + l2 + i22 + i23 + i24;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-25282, i1=-31190, i25=-113, i26=154, i27=-10, i28=7915, i29=32, i30=-12, i31=8, i32=-54;
        boolean b=true;
        long l=-60L, l3=14L, l4=-64787L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, 6L);

        i = 307;
        do {
            b = ((++iFld) >= Test.instanceCount);
            for (l = i; l < 243; ++l) {
                Test.dFld += Math.max(++iFld, iMeth(i, i1, l) - i);
                l3 *= Test.sFld;
                iFld += (int)(((l * Test.fFld) + i1) - i1);
                iArrFld[i + 1] += Test.sFld;
                i25 = 1;
                do {
                    dArrFld[(int)(l - 1)] = i1;
                    i1 >>= iFld;
                } while (++i25 < 1);
            }
        } while ((i -= 3) > 0);
        l4 = 1;
        while (++l4 < 239) {
            l3 = i;
            i1 *= iFld;
        }
        for (i26 = 10; i26 < 191; i26 += 2) {
            byte by1=125;
            iFld *= i28;
            i1 |= by1;
            iFld *= iFld;
            iFld *= i28;
            for (i29 = 10; i29 < 278; ++i29) {
                i27 = (int)Test.fFld;
                for (i31 = 1; i31 < 2; i31++) {
                    Test.sFld -= (short)i26;
                    iArrFld = iArrFld;
                    l3 += (((i31 * Test.fFld) + l3) - i31);
                    Test.fFld = i31;
                    i1 -= (int)l;
                    if (b) continue;
                    iFld ^= (int)l;
                    i1 *= (int)110.147F;
                    lArr[i31 + 1] = Test.instanceCount;
                }
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
