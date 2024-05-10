package tests.javafuzzer112;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 22:26:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=22053L;
    public static boolean bFld=true;
    public static byte byFld=-94;
    public static float fArrFld[]=new float[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.55F);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static void vMeth() {

        int i2=-61;
        float f=-115.113F;

        i2 = (int)f;
        i2 *= (int)(Test.instanceCount * Integer.reverseBytes((int)(Test.instanceCount * 11)));
        vMeth_check_sum += i2 + Float.floatToIntBits(f);
    }

    public static long lMeth1() {

        double d1=1.28338;
        int i11=-5, i12=-238, i13=33106, i14=-52, i15=6248, iArr2[]=new int[N];
        float f2=-1.246F;
        short s=3971;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 5L);
        FuzzerUtils.init(iArr2, -224);

        vMeth();
        for (d1 = 1; d1 < 151; ++d1) {
            i11 >>>= 66;
            Test.byFld = (byte)d1;
        }
        for (i12 = 12; i12 < 237; i12++) {
            if (i11 != 0) {
            }
            i11 <<= i11;
            switch ((i12 % 6) + 59) {
            case 59:
                lArr1[i12 + 1] += i13;
                Test.instanceCount += (((i12 * f2) + i11) - i12);
                break;
            case 60:
                for (i14 = i12; i14 < 7; ++i14) {
                    iArr2[i12 - 1] = (int)Test.instanceCount;
                    Test.fArrFld[i12 - 1] *= i13;
                    i15 <<= (int)135L;
                    s = (short)i15;
                }
                break;
            case 61:
                i11 += (int)Test.instanceCount;
                break;
            case 62:
                i15 += (((i12 * i14) + i11) - i12);
                break;
            case 63:
                try {
                    i13 = (iArr2[i12] % i13);
                    i13 = (-11613 / i14);
                    i13 = (iArr2[i12 + 1] % i11);
                } catch (ArithmeticException a_e) {}
                break;
            case 64:
                Test.instanceCount &= 4L;
                break;
            default:
                iArr2[i12] = 2;
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i11 + i12 + i13 + Float.floatToIntBits(f2) + i14 + i15 + s +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(long l, float f1, int i4) {

        int i5=13, i6=3420, i7=-156, i8=197, i9=5, i10=-119, iArr1[]=new int[N];
        byte by=125;
        double d=-95.13067;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 31321L);
        FuzzerUtils.init(iArr1, 0);

        for (i5 = 3; 201 > i5; ++i5) {
            i7 = 8;
            do {
                f1 *= ((l = i7) + lArr[i5 + 1]);
                for (i8 = 1; i8 < 1; ++i8) {
                    if (i7 != 0) {
                    }
                    i9 -= (i4--);
                    iArr1[i7 - 1] ^= (int)(((Test.instanceCount + i7) - Test.instanceCount) - ((i7 + by) + (i8 - i10)));
                    f1 += i8;
                    Test.instanceCount += (((i8 * i9) + i4) - i4);
                }
            } while (--i7 > 0);
            i10 *= (Math.max((int)(d + i8), Integer.reverseBytes(i6)) - ((115 - i4) - (-(i8 | i8))));
            vMeth();
            i9 >>= (int)lMeth1();
            i4 = (int)f1;
            i9 -= -7;
            f1 += -2.170F;
        }
        long meth_res = l + Float.floatToIntBits(f1) + i4 + i5 + i6 + i7 + i8 + i9 + by + i10 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=58, i1=-183, i3=13, i16=119, i17=39, i18=-1, i19=152, i20=105, i21=24435, i22=1, iArr[]=new int[N];
        float f3=-33.309F;
        double d2=10.4939, dArr[]=new double[N];
        long l1=29331L;

        FuzzerUtils.init(iArr, 14);
        FuzzerUtils.init(dArr, 0.42408);

        for (i = 138; i > 5; i -= 3) {
            if (Test.bFld = ((true && (true && Test.bFld)) || ((!(i != Test.instanceCount)) | (Test.bFld && true))))
                break;
            vMeth();
            i3 = 1;
            do {
                i1 += i3;
                iArr[i + 1] += i3;
                i1 = (int)(lMeth(Test.instanceCount, f3, i1) >> i1);
                i1 = 158;
            } while (++i3 < 336);
            d2 -= i;
            if (Test.bFld) {
                i1 += (int)f3;
                lArrFld[i] -= i3;
            }
            for (i16 = 11; i16 < 285; ++i16) {
                i1 += (i16 | Test.instanceCount);
                for (i18 = 1; 3 > i18; i18++) {
                    f3 %= (i16 | 1);
                    i17 = i1;
                    Test.byFld *= (byte)119;
                    lArrFld[i16 + 1] >>= i17;
                    Test.byFld += (byte)(i18 ^ i1);
                    dArr[i16 - 1] += i16;
                }
            }
            if (Test.bFld) continue;
            lArrFld[i - 1] -= (long)f3;
            Test.bFld = Test.bFld;
        }
        for (i20 = 3; i20 < 125; i20++) {
            for (l1 = 6; l1 < 205; ++l1) {
                iArr[i20 + 1] = (int)f3;
                Test.instanceCount <<= i18;
                iArr[(int)(l1 - 1)] = -3;
                d2 += i19;
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
//DEBUG  vMeth ->  vMeth mainTest lMeth lMeth1
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}