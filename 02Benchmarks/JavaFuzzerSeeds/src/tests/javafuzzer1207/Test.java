package tests.javafuzzer1207;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 16:33:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-47810L;
    public int iFld=-62;
    public static float fFld=1.495F;
    public static volatile int iFld1=-52024;
    public static boolean bFld=false;
    public volatile double dFld=2.80241;
    public byte byFld=-64;
    public static volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 4.672F);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i7, long l) {

        int i8=-194, i9=-10, iArr[]=new int[N];
        byte by=63;
        short s=-14311;

        FuzzerUtils.init(iArr, -225);

        i7 += i7;
        i8 = 1;
        do {
            l = i7;
            l = by;
            Test.iFld1 >>>= i8;
            iArr[i8 + 1] >>= i8;
            i7 += (int)l;
            i9 = 5;
            while (--i9 > 0) {
                Test.iFld1 >>>= i7;
                Test.fFld = Test.instanceCount;
                iArr = iArr;
                Test.fArrFld[i8] = i7;
            }
        } while (++i8 < 362);
        Test.iFld1 += (int)Test.instanceCount;
        Test.instanceCount += s;
        i7 += i8;
        long meth_res = i7 + l + i8 + by + i9 + s + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i4) {

        int i5=130, i6=-49222, i10=12, i11=-12018, i12=123, i13=25578, iArr1[]=new int[N];
        float f1=-44.463F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -4L);
        FuzzerUtils.init(iArr1, 2310);

        for (i5 = 7; i5 < 279; ++i5) {
            Test.fArrFld[i5] = (lArr[i5 - 1] = iMeth1(33858, Test.instanceCount));
            i4 = i4;
            i4 -= Test.iFld1;
            iArr1[i5 + 1] = i6;
            Test.iFld1 <<= 12538;
            i6 *= (int)Test.instanceCount;
            iArr1[i5 + 1] &= 207;
        }
        i4 <<= -59775;
        for (i10 = 160; i10 > 3; i10--) {
            for (i12 = 1; i12 < 10; i12++) {
                int i14=75;
                if (Test.bFld) continue;
                iArr1[i10 - 1] = i10;
                i14 += (((i12 * Test.iFld1) + i14) - f1);
            }
            iArr1[i10] -= (int)Test.instanceCount;
        }
        long meth_res = i4 + i5 + i6 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth() {

        int i=1, i1=2558, i2=-42020, i3=-79, i15=-68, i16=-55727;

        Test.iFld1 = (int)((Test.fArrFld[(5 >>> 1) % N]--) - (Float.intBitsToFloat(-13) + Test.iFld1));
        for (i = 12; 297 > i; ++i) {
            Test.instanceCount = 56393;
            Test.instanceCount = (i1--);
            for (i2 = 1; i2 < 6; i2 += 2) {
                i1 >>= (int)(iMeth(Test.iFld1) - Test.instanceCount);
            }
            if (Test.bFld) continue;
            i1 += Test.iFld1;
            Test.iFld1 += i;
            Test.instanceCount += (((i * i1) + i2) - Test.iFld1);
        }
        i1 = (int)Test.instanceCount;
        i15 = 1;
        while (++i15 < 126) {
            i16 = 1;
            while (++i16 < 12) {
                i1 /= (int)(Test.iFld1 | 1);
                i3 += (((i16 * Test.instanceCount) + i3) - Test.instanceCount);
            }
        }
        long meth_res = i + i1 + i2 + i3 + i15 + i16;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=-170, i18=-7, i19=-7, i20=8, i21=-55135, i22=5, i23=12, i24=-11, i25=12, i26=6, iArr2[]=new int[N];
        short s1=-16189;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr2, -8);
        FuzzerUtils.init(lArr1, 8L);

        Test.instanceCount -= (long)(((iFld - Test.fFld) - lMeth()) + iFld);
        for (i17 = 3; i17 < 127; ++i17) {
            iFld = i17;
            i18 -= -9;
            Test.iFld1 *= (int)Test.fFld;
            i18 += i17;
            Test.iFld1 *= i18;
            if (Test.bFld) {
                for (i19 = 4; 202 > i19; ++i19) {
                    iArr2 = iArr2;
                    Test.fFld *= (float)dFld;
                }
                for (i21 = 11; i21 < 202; i21++) {
                    Test.iFld1 += (i21 | (long)Test.fFld);
                }
                Test.instanceCount <<= i19;
            } else {
                iArr2[i17 + 1] ^= i22;
            }
            i23 = 1;
            do {
                lArr1 = lArr1;
                i18 -= (int)Test.instanceCount;
                switch (((5747 >>> 1) % 1) + 79) {
                case 79:
                    i18 = (int)Test.instanceCount;
                    for (i24 = i23; i24 < 1; i24++) {
                        i20 += (int)-26796L;
                        i18 += (int)Test.instanceCount;
                    }
                default:
                    lArr1[i23 + 1] -= (long)10.414F;
                    if (false) {
                        s1 *= (short)i23;
                        try {
                            i25 = (iArr2[i23 + 1] / 214);
                            i26 = (86911397 / Test.iFld1);
                            i20 = (i26 % iFld);
                        } catch (ArithmeticException a_e) {}
                        Test.fFld += (i23 + i18);
                        i18 += (i23 - byFld);
                    } else if (Test.bFld) {
                        i25 *= i22;
                    } else {
                        dFld = i26;
                    }
                }
            } while (++i23 < 202);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
