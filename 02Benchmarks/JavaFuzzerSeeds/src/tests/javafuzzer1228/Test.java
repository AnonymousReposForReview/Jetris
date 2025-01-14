package tests.javafuzzer1228;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 16:43:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-19673869L;
    public volatile int iFld=-26596;
    public static float fFld=19.100F;
    public static boolean bFld=true;
    public volatile int iArrFld[]=new int[N];

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(float f1, int i2) {

        long l=2837497253L;
        int i3=-19319, i4=108, i6=-59360, iArr[]=new int[N];
        short s1=1673;
        double d1=-14.19695;
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr, -63854);
        FuzzerUtils.init(fArr1, 10.790F);

        l = 1;
        while (++l < 282) {
            int i5=-56023;
            iArr[(int)(l + 1)] = (int)Test.instanceCount;
            for (i3 = 1; i3 < 6; i3++) {
                i2 -= i3;
                s1 -= (short)d1;
                d1 = -2811667149L;
            }
            i4 = (int)f1;
            i5 = i4;
            iArr[(int)(l)] *= i4;
            f1 = 11L;
            i6 = 1;
            while (++i6 < 6) {
                switch ((i5 >>> 1) % 2) {
                case 0:
                    iArr[i6] = i2;
                    i4 *= -12;
                    s1 = (short)Test.instanceCount;
                    break;
                case 1:
                    d1 += i6;
                default:
                    fArr1[i6 + 1] = i2;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i2 + l + i3 + i4 + s1 + Double.doubleToLongBits(d1) + i6 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static int iMeth1(short s, int i1) {

        int i7=91, i8=-26496, i9=65250, iArr1[]=new int[N];
        byte by=-58;
        float f2=-1.151F;
        boolean b=true;

        FuzzerUtils.init(iArr1, 3);

        vMeth(Test.fFld, -1);
        for (i7 = 3; i7 < 167; ++i7) {
            if (i8 != 0) {
            }
            i9 = 1;
            do {
                by = (byte)i8;
                i1 += i9;
                Test.fFld += (i9 * Test.fFld);
                f2 = 1;
                do {
                    i8 ^= 53269;
                    i8 *= i7;
                    if (b) {
                        Test.instanceCount += (long)f2;
                        iArr1[i7] += i8;
                        Test.instanceCount -= i1;
                    } else if (b) {
                        i8 >>= -51995;
                    } else if (b) {
                        Test.instanceCount += i1;
                    } else {
                        s = (short)10;
                    }
                } while (++f2 < 1);
            } while (++i9 < 10);
        }
        long meth_res = s + i1 + i7 + i8 + i9 + by + Float.floatToIntBits(f2) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        float f=0.985F, fArr[]=new float[N];
        int i=-17886, i10=14, i11=13, i12=14, i13=-444;
        short s2=-6936;

        FuzzerUtils.init(fArr, -10.167F);

        Test.instanceCount += (long)((f--) + ((--fArr[(i >>> 1) % N]) - iMeth1(s2, i)));
        Test.fFld += -8071;
        Test.instanceCount -= (long)-75.494F;
        switch (((i >>> 1) % 10) + 7) {
        case 7:
            i = i;
            i = i;
            for (i10 = 12; i10 < 322; ++i10) {
                for (i12 = 1; i12 < 5; ++i12) {
                    Test.fFld += i12;
                    Test.instanceCount -= i11;
                    i13 = i12;
                    if (true) break;
                    i11 ^= (int)-77L;
                    i <<= i13;
                    i %= -216;
                }
            }
            break;
        case 8:
            i13 += i12;
            break;
        case 9:
        case 10:
            i11 *= i11;
            break;
        case 11:
            i -= i;
            break;
        case 12:
            f = Test.instanceCount;
            break;
        case 13:
            i11 >>= (int)-248L;
            break;
        case 14:
        case 15:
            i13 += (int)Test.instanceCount;
            break;
        case 16:
            Test.instanceCount = -104;
            break;
        }
        long meth_res = Float.floatToIntBits(f) + i + s2 + i10 + i11 + i12 + i13 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=-18.129113;
        int i14=50694, i15=-63796, i16=-150, i17=235, i18=2, i19=-128, i20=124;
        byte by1=42;
        short s3=12712;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -696957791L);

        d *= ((iFld >>>= iArrFld[(iFld >>> 1) % N]) - ((iFld--) - iFld));
        iFld <<= (iMeth() - -164);
        iFld -= (int)Test.fFld;
        for (i14 = 1; i14 < 265; i14++) {
            by1 >>= (byte)Test.instanceCount;
            i16 = 1;
            do {
                i15 &= i15;
                lArr = lArr;
                for (i17 = 1; i17 < 1; i17 += 2) {
                    Test.instanceCount -= i14;
                    Test.instanceCount = i14;
                    Test.bFld = false;
                    iArrFld[i16 + 1] -= i17;
                    i15 -= i14;
                }
                for (i19 = 1; i19 < 1; i19 += 3) {
                    switch (((i16 % 2) * 5) + 23) {
                    case 33:
                        i20 = (int)Test.instanceCount;
                        break;
                    case 27:
                        i18 *= (int)Test.instanceCount;
                        i20 *= iFld;
                        break;
                    default:
                    }
                    iArrFld[i19 + 1] *= s3;
                    i18 += (((i19 * Test.instanceCount) + i15) - i16);
                    i15 = -24421;
                    if (Test.bFld) break;
                    Test.bFld = Test.bFld;
                    iArrFld = iArrFld;
                    Test.fFld -= i18;
                    i15 /= (int)(i17 | 1);
                    i18 >>= i18;
                }
            } while (++i16 < 95);
            iArrFld[i14] -= i18;
            i15 = i20;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
