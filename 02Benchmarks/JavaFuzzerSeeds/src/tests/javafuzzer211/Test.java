package tests.javafuzzer211;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:09:30 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-577483391L;
    public static boolean bFld=true;
    public float fFld=-1.734F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 10L);
        FuzzerUtils.init(Test.iArrFld, -6);
        FuzzerUtils.init(Test.byArrFld, (byte)36);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth() {

        int i10=54442, i11=-45866, i12=-14, i13=-4620, i14=-242, i16=56, i17=-8014, iArr1[]=new int[N];
        short s=16919;
        boolean b=false;

        FuzzerUtils.init(iArr1, -1);

        iArr1[(i10 >>> 1) % N] *= s;
        for (i11 = 8; 322 > i11; ++i11) {
            Test.lArrFld[i11 + 1] += 0;
            i12 = i10;
            i13 = 5;
            while (--i13 > 0) {
                i12 += (int)Test.instanceCount;
                i14 = 1;
                while (++i14 < 1) {
                    int i15=54;
                    i12 /= (int)(i15 | 1);
                    Test.instanceCount <<= i12;
                }
                i10 >>= -34784;
                for (i16 = i11; i16 < 1; i16++) {
                    if (b) {
                        i10 = i13;
                        i17 /= (int)(Test.instanceCount | 1);
                        if (true) break;
                    }
                }
            }
        }
        long meth_res = i10 + s + i11 + i12 + i13 + i14 + i16 + i17 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth() {

        int i9=-24952, i18=-26998, i19=-2;
        double d=1.110844;
        float f=-76.656F, f1=-1.739F;

        i9 = i9;
        d /= ((sMeth() * i9) | 1);
        i9 = (int)d;
        Test.iArrFld[(186 >>> 1) % N] = (int)Test.instanceCount;
        for (f = 2; f < 341; f++) {
            Test.instanceCount *= i18;
            i9 = i9;
            Test.instanceCount -= i18;
            i9 = i18;
        }
        f1 = i9;
        i19 = 1;
        while (++i19 < 270) {
            short s1=-19074;
            if (Test.bFld) {
                i9 += (((i19 * i9) + i18) - s1);
                i9 += (i19 * i19);
                i9 = (int)-40L;
            } else if (Test.bFld) {
                Test.iArrFld[i19 - 1] >>= i19;
            } else if (Test.bFld) {
                Test.instanceCount += i19;
            } else {
                if (i19 != 0) {
                    vMeth_check_sum += i9 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i18 +
                        Float.floatToIntBits(f1) + i19;
                    return;
                }
            }
        }
        vMeth_check_sum += i9 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i18 + Float.floatToIntBits(f1) +
            i19;
    }

    public static int iMeth(int i6) {

        int i7=5, i8=65471, i20=-4, iArr[]=new int[N];
        float f2=-89.891F;
        short s2=3657;

        FuzzerUtils.init(iArr, -4);

        for (i7 = 5; i7 < 292; ++i7) {
            i6 += i7;
            Test.instanceCount |= (-(-6L - (--Test.instanceCount)));
            i8 %= (int)(Math.abs((int)((Test.instanceCount + Test.instanceCount) - (-(i8 - i8)))) | 1);
            i6 = (++iArr[i7]);
            vMeth();
            Test.lArrFld[i7] -= i6;
            i6 <<= i8;
            Test.iArrFld[i7 - 1] = (int)Test.instanceCount;
            i20 = 1;
            do {
                f2 = i6;
                f2 += s2;
                Test.lArrFld[i20] = i7;
                Test.iArrFld[i20 + 1] -= i8;
                Test.instanceCount += i20;
            } while (++i20 < 6);
        }
        long meth_res = i6 + i7 + i8 + i20 + Float.floatToIntBits(f2) + s2 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=11, i1=-64, i2=12843, i3=-10, i4=171, i5=36060, i21=-134, i22=9, i23=-48640, i24=-15786, i25=-25958,
            i26=98;
        double d1=-1.27381;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.654F);

        for (i = 6; 351 > i; ++i) {
            for (i2 = 4; i2 < 73; ++i2) {
                for (i4 = 1; 2 > i4; i4++) {
                    i5 >>= ((++i5) + iMeth(i2));
                    i3 *= i21;
                    i1 += (int)fFld;
                    Test.instanceCount = (long)d1;
                    i21 *= i21;
                }
                if (Test.bFld) {
                    Test.byArrFld[i + 1] += (byte)i;
                    Test.instanceCount += i2;
                    Test.lArrFld = Test.lArrFld;
                } else if (Test.bFld) {
                    for (i22 = 2; i22 > 1; i22--) {
                        fArr[i22] += Test.instanceCount;
                        Test.instanceCount = i22;
                        Test.bFld = Test.bFld;
                        Test.byArrFld = Test.byArrFld;
                        i21 *= i24;
                        i21 -= i3;
                        Test.bFld = Test.bFld;
                    }
                    Test.instanceCount = i21;
                    i21 += (int)d1;
                    fFld -= i;
                } else if (true) {
                    for (i25 = 1; i25 < 2; i25++) {
                        if (Test.bFld) {
                            i26 = i3;
                            Test.iArrFld[i] += i25;
                            Test.lArrFld[i2] *= i21;
                            i1 -= i1;
                        } else {
                            i26 += i25;
                        }
                    }
                } else {
                    i1 = (int)fFld;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  sMeth ->  sMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
