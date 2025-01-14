package tests.javafuzzer2602;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 17:14:47 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-95L;
    public static double dFld=-104.77473;
    public static volatile int iFld=-243;
    public static double dFld1=0.57714;
    public static volatile short sFld=-6962;
    public static float fFld=0.45F;
    public static int iFld1=-10;
    public static volatile long lArrFld[]=new long[N];
    public static byte byArrFld[]=new byte[N];
    public volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 3L);
        FuzzerUtils.init(Test.byArrFld, (byte)-76);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public void vMeth(int i, long l, long l1) {

        float f=60.763F;

        Test.instanceCount -= (long)(i - ((f += f) * (i++)));
        vMeth_check_sum += i + l + l1 + Float.floatToIntBits(f);
    }

    public static int iMeth(long l2) {

        byte by1=116;
        int i7=75, i8=46690, i9=41758, i10=96, iArr1[]=new int[N];
        long l3=175L;
        boolean b=false;

        FuzzerUtils.init(iArr1, -169);

        by1 *= (byte)145;
        Test.fFld = Test.iFld;
        for (i7 = 22; 362 > i7; ++i7) {
            i8 -= (int)l3;
            if (false) break;
        }
        for (i9 = 19; 358 > i9; i9++) {
            i10 >>= 7;
            switch (((i9 % 6) * 5) + 13) {
            case 43:
            case 19:
                i10 = Test.iFld;
                if (b) continue;
                Test.iFld >>= i9;
                break;
            case 16:
                if (true) break;
                Test.lArrFld[i9] += i7;
                break;
            case 30:
                iArr1[i9 - 1] >>= i7;
                Test.fFld = Test.iFld;
                break;
            case 21:
                Test.fFld += (((i9 * i8) + Test.instanceCount) - i10);
                break;
            case 41:
            default:
                l2 *= Test.instanceCount;
            }
        }
        long meth_res = l2 + by1 + i7 + i8 + l3 + i9 + i10 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i2) {

        int i3=-58590, i4=-10, i5=-33, i6=51154, i12=3926, i13=-22107, i14=9, i15=-60, i16=-13, iArr[]=new int[N];
        byte by=-24;

        FuzzerUtils.init(iArr, -109);

        for (i3 = 10; i3 < 277; i3++) {
            for (i5 = 1; i5 < 6; i5++) {
                Test.sFld = (short)(--iArr[i3 + 1]);
                by += (byte)iMeth(3788849868L);
                i4 += (int)(4978604186533093135L + (i5 * i5));
                i4 = i2;
            }
            for (i12 = 1; i12 < 6; i12 += 3) {
                i13 -= i2;
                if (Test.iFld != 0) {
                    vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + by + i12 + i13 + i14 + i15 + i16 +
                        FuzzerUtils.checkSum(iArr);
                    return;
                }
                i14 = 1;
                do {
                    if (i3 != 0) {
                        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + by + i12 + i13 + i14 + i15 + i16 +
                            FuzzerUtils.checkSum(iArr);
                        return;
                    }
                } while (++i14 < 6);
                for (i15 = 1; 6 > i15; i15++) {
                    Test.instanceCount += (long)Test.fFld;
                    iArr[i15] = i2;
                    i13 *= 183;
                }
            }
        }
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + by + i12 + i13 + i14 + i15 + i16 + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(short s) {

        int i17=-26492, i18=-1682, i19=-216, i20=46, i21=9, i22=-5, i23=58, i24=-136, i25=236, i26=-50971, iArr2[]=new
            int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr2, -11);
        FuzzerUtils.init(lArr, 82L);

        Test.dFld += (-Float.intBitsToFloat((int)(Test.iFld * Test.dFld1)));
        vMeth1(12);
        for (i17 = 10; i17 < 179; i17 += 3) {
            iArr2[i17 - 1] -= i17;
            for (i19 = i17; i19 < 27; ++i19) {
                for (i21 = 1; i21 < 1; i21++) {
                    i22 *= (int)Test.instanceCount;
                }
                lArr[i17] = i19;
                Test.instanceCount = Test.iFld;
            }
            for (i23 = 1; i23 < 27; i23++) {
                Test.instanceCount += (((i23 * i23) + Test.fFld) - i21);
            }
            for (i25 = 1; i25 < 27; i25++) {
                Test.instanceCount *= Test.instanceCount;
                i18 = (int)76.674F;
                Test.fFld = Test.instanceCount;
            }
        }
        long meth_res = s + i17 + i18 + i19 + i20 + i21 + i22 + i23 + i24 + i25 + i26 + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=-1, i27=0, i28=11228, i29=-8, i30=-249, i31=-107, i32=12239, i33=-8;
        boolean b1=true;
        long l5=2009063818L;
        double d=87.51431;
        float f1=-8.361F;

        vMeth(Integer.reverseBytes(++i1), lMeth((short)(-4442)) + 1, Test.instanceCount);
        i1 += (int)Test.instanceCount;
        i27 = 1;
        do {
            if (b1) {
                Test.fFld += 10;
                if (b1) {
                    i1 = (int)-2.60754;
                } else if (b1) {
                    Test.iFld >>>= -177;
                    for (i28 = 1; i28 < 63; i28++) {
                        for (i30 = 1; i30 < 2; ++i30) {
                            i1 >>= i28;
                            Test.byArrFld[i30] *= (byte)-4;
                            b1 = b1;
                            Test.instanceCount += i30;
                            l5 <<= -10L;
                            Test.iFld = 10822;
                            Test.fFld = i1;
                            if (b1) continue;
                        }
                    }
                }
            } else {
                for (d = 2; d < 63; d++) {
                    Test.fFld += -251;
                }
                l5 *= 54425L;
                Test.iFld1 >>>= i31;
                i33 = 1;
                while (++i33 < 63) {
                    i31 ^= i27;
                    f1 = 1;
                    while (--f1 > 0) {
                        Test.iFld = i31;
                        if (b1) continue;
                    }
                    i29 -= i32;
                    Test.instanceCount = 0;
                    iArrFld[i33 + 1] = (int)l5;
                }
            }
        } while (++i27 < 397);



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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
