package tests.javafuzzer2389;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 13:59:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=788741454L;
    public static byte byFld=-111;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -98.559F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1, long l) {

        int i7=240, i8=0, i9=-14, i10=-2, i11=2, iArr1[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr1, -19402);

        for (i7 = 3; i7 < 230; ++i7) {
            i8 += (i7 + i8);
            i8 |= (int)-1733452187L;
            Test.fArrFld[i7 - 1] += i7;
            i9 = 1;
            do {
                i8 *= Test.byFld;
                for (i10 = 1; i10 < 1; i10++) {
                    if (b) continue;
                    f1 += (float)0.124640;
                    i11 >>= i7;
                    i11 += i8;
                    iArr1 = iArr1;
                }
                i11 = i8;
                i8 = (int)-25.579F;
                f1 -= Test.instanceCount;
            } while (++i9 < 7);
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + l + i7 + i8 + i9 + i10 + i11 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i6=-238, i12=-12, i13=-7, i14=-8, i15=-46, i16=20084, i17=53;
        float f2=-60.195F;

        i6 = 1;
        do {
            vMeth1(75.754F, Test.instanceCount);
        } while (++i6 < 224);
        for (i12 = 1; i12 < 195; ++i12) {
            i13 >>= i12;
            i13 >>= -4;
            i13 += (((i12 * f2) + i13) - i13);
            for (i14 = 1; 8 > i14; i14++) {
                f2 += i13;
                for (i16 = 1; 2 > i16; ++i16) {
                    f2 -= -7;
                    i13 *= (int)Test.instanceCount;
                }
                i17 *= i16;
                i13 = (int)Test.instanceCount;
                f2 = Test.instanceCount;
                Test.instanceCount >>>= -12;
            }
        }
        vMeth_check_sum += i6 + i12 + i13 + Float.floatToIntBits(f2) + i14 + i15 + i16 + i17;
    }

    public static int iMeth(int i4, double d, int i5) {

        short s=23443;
        float f=-59.66F;
        int i18=6, i19=40, i20=13484, i21=55, i22=198, i23=-60771, iArr[]=new int[N];
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(lArr, 33225L);

        if (b1) {
            iArr[(13 >>> 1) % N] = (int)(((iArr[(i5 >>> 1) % N] -= s) + (f - i5)) * i4);
            vMeth();
            i5 = (int)Test.instanceCount;
        } else if (b1) {
            i5 = Test.byFld;
            for (i18 = 7; i18 < 200; ++i18) {
                f = i4;
                Test.instanceCount += i18;
                for (i20 = 8; i20 > 1; --i20) {
                    for (i22 = 1; i22 < 2; i22++) {
                        Test.instanceCount *= i20;
                    }
                    lArr[(i18 >>> 1) % N] += Test.instanceCount;
                    d += Test.instanceCount;
                    if (i22 != 0) {
                    }
                    i4 = i21;
                }
            }
        } else if (b1) {
            b1 = true;
        } else {
            i21 += i4;
        }
        long meth_res = i4 + Double.doubleToLongBits(d) + i5 + s + Float.floatToIntBits(f) + i18 + i19 + i20 + i21 +
            i22 + i23 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-19920, i1=4, i2=212, i3=-30871, i24=-128, i25=46344, i26=-125, i27=-8, i28=-54171, i29=-13016,
            iArr2[]=new int[N];
        boolean b2=false;
        long l1=-3158983185L, l2=60602L, lArr1[]=new long[N];
        float f4=-102.553F;
        double d1=-1.30411;

        FuzzerUtils.init(lArr1, -6541521576696930724L);
        FuzzerUtils.init(iArr2, 46246);

        for (i = 125; i > 3; --i) {
            for (i2 = 3; i2 < 205; ++i2) {
                i1 = (int)((Math.max(Test.instanceCount, Test.instanceCount) - i3) + ((--i3) + iMeth(i3, -63.46786,
                    i24)));
                i1 ^= i;
            }
            if (b2) break;
        }
        lArr1[(i2 >>> 1) % N] = i3;
        for (i25 = 6; i25 < 337; i25++) {
            float f3=2.372F;
            Test.instanceCount += i1;
            l1 += (long)f3;
        }
        for (i27 = 7; i27 < 168; i27++) {
            i1 = (int)l1;
            i28 += 16084;
            i29 = 1;
            do {
                f4 *= i1;
                f4 /= (i2 | 1);
                i26 = i27;
                i24 += -121;
                if (true) break;
                i24 += (int)d1;
                i3 >>= (int)l1;
                l2 = 1;
                do {
                    f4 *= 110;
                    f4 *= f4;
                    Test.instanceCount <<= i3;
                    l1 = i25;
                    i1 += (int)(((l2 * i2) + i24) - Test.instanceCount);
                    iArr2[(i28 >>> 1) % N] = i29;
                    f4 += (((l2 * i24) + i29) - Test.byFld);
                    try {
                        i26 = (i24 / 108);
                        i26 = (iArr2[i27] % iArr2[i27]);
                        i28 = (i24 % 1729866913);
                    } catch (ArithmeticException a_e) {}
                } while (++l2 < 1);
                f4 *= i;
            } while (++i29 < 156);
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
