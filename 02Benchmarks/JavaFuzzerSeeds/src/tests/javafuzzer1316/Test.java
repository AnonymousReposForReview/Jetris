package tests.javafuzzer1316;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:10:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=10L;
    public static double dFld=48.72478;
    public static boolean bFld=false;
    public static float fFld=2.209F;
    public byte byFld=59;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, long l1) {

        int i6=-41, i7=13, i8=-35, i9=189;
        short s=7721;
        float f=2.996F, fArr[]=new float[N];
        double d=47.100452;
        byte by=-14;

        FuzzerUtils.init(fArr, -124.527F);

        Test.bFld = false;
        for (i6 = 6; i6 < 130; ++i6) {
            s -= (short)f;
            d = 1;
            do {
                i7 += (int)(d - i6);
                i7 += (int)(160L + (d * d));
                for (i8 = i6; 1 > i8; i8 += 3) {
                    i7 |= -34765;
                    i9 = (int)l;
                    fArr[i6 + 1] *= -117;
                    i7 -= (int)l;
                    if (Test.bFld) {
                        if (Test.bFld) {
                            i7 = by;
                        } else {
                            by += (byte)i8;
                        }
                    } else {
                        l1 += (((i8 * i9) + i8) - i9);
                    }
                }
            } while (++d < 13);
        }
        vMeth2_check_sum += l + l1 + i6 + i7 + s + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i8 + i9 + by
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(int i5) {

        int i10=-32343, i11=60949, i12=11, i13=-19236, i14=11775, iArr[]=new int[N];
        double d1=108.83831, dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(dArr, 101.69039);
        FuzzerUtils.init(lArr, -9398L);
        FuzzerUtils.init(iArr, -32005);

        dArr[(i5 >>> 1) % N] = Math.abs((int)((Test.instanceCount % ((long)(Test.dFld) | 1)) - (--Test.instanceCount)));
        i5 -= (int)lArr[(i5 >>> 1) % N];
        vMeth2(Test.instanceCount, Test.instanceCount);
        Test.instanceCount -= Test.instanceCount;
        iArr[(i5 >>> 1) % N] = (int)Test.fFld;
        for (i10 = 18; i10 < 370; i10++) {
            for (d1 = 5; 1 < d1; d1 -= 2) {
                Test.fFld += Test.instanceCount;
                for (i13 = 1; i13 < 3; i13++) {
                    Test.fFld += (((i13 * i5) + i10) - Test.instanceCount);
                }
                if (false) {
                    i12 += (0 + (d1 * d1));
                }
                i12 -= 3;
                Test.bFld = Test.bFld;
                i5 = i10;
            }
        }
        vMeth1_check_sum += i5 + i10 + i11 + Double.doubleToLongBits(d1) + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i) {

        int i1=-13, i2=-10, i3=3783, i4=0, i15=94;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -1432884942L);

        for (i1 = 9; i1 < 368; ++i1) {
            for (i3 = 1; i3 < 5; i3 += 3) {
                Test.instanceCount *= (++Test.instanceCount);
            }
        }
        vMeth1(i1);
        i15 = 1;
        do {
            lArr1 = FuzzerUtils.long1array(N, (long)-3L);
        } while (++i15 < 143);
        Test.instanceCount = 101;
        i *= i4;
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i15 + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i16=-51256, i17=27, i18=-7, i19=-9, i20=3, i21=-48883, i22=12, i23=2948, iArr1[][]=new int[N][N];
        long l2=-46774L, lArr2[]=new long[N];
        float f1=-61.292F;
        short s1=2051;

        FuzzerUtils.init(lArr2, 2L);
        FuzzerUtils.init(iArr1, -60014);

        vMeth(i16);
        i16 = (int)Test.dFld;
        i16 <<= 41473;
        i16 >>>= i16;
        lArr2 = lArr2;
        l2 = 1;
        do {
            i16 *= (int)Test.instanceCount;
            i16 = byFld;
            i17 += (int)(77.305F + (l2 * l2));
            Test.instanceCount += l2;
            i16 += (int)l2;
        } while (++l2 < 174);
        Test.fFld += i17;
        for (i18 = 8; i18 < 204; i18++) {
            Test.dFld /= (i17 | 1);
            i16 -= -29;
            for (i20 = 4; i20 < 128; i20++) {
                iArr1[i18 - 1][i20 + 1] *= (int)Test.instanceCount;
                lArr2[i18 + 1] += 10786L;
                i16 -= i20;
                switch ((((i18 >>> 1) % 2) * 5) + 59) {
                case 65:
                    Test.instanceCount += i17;
                    i21 = (int)f1;
                    Test.dFld = s1;
                    break;
                case 63:
                    i16 += (int)l2;
                    break;
                }
                iArr1[i20 + 1][i20 + 1] *= 59911;
            }
            i22 = 128;
            while (--i22 > 0) {
                i21 = i18;
                i23 = 1;
                while (++i23 < 1) {
                    i21 *= (int)Test.instanceCount;
                    i17 += (((i23 * i20) + i22) - i20);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
