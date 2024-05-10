package tests.javafuzzer2536;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:26:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=7367666561493175635L;
    public float fFld=-41.449F;
    public static boolean bFld=true;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 18.75647);
        FuzzerUtils.init(Test.iArrFld, -12);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i5, int i6) {

        int i7=-10, i8=8, i9=-3, i10=-114, i11=61368, iArr1[]=new int[N];
        float f=2.419F, f1=-1.728F;
        boolean b=false;

        FuzzerUtils.init(iArr1, 2);

        for (i7 = 11; i7 < 190; i7++) {
            i8 = (int)0L;
            for (i9 = i7; i9 < 9; i9++) {
                f += i9;
                Test.instanceCount <<= i10;
                i11 = 1;
                do {
                    if (b) continue;
                    i5 += (((i11 * i9) + i5) - i5);
                    f1 -= 5;
                    i5 += (int)1.701F;
                    Test.instanceCount = i8;
                    i8 = i7;
                } while (++i11 < 1);
                iArr1[i9 - 1] *= i8;
                i5 = i11;
            }
            i6 += i9;
        }
        vMeth_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f) + i11 + (b ? 1 : 0) +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth1(int i2) {

        int i3=-88, i4=4, i12=-26051, i13=-8809, iArr[]=new int[N];
        byte by=99;
        float f2=2.270F, fArr[]=new float[N];
        double d1=-35.3918;
        boolean b1=true;

        FuzzerUtils.init(iArr, -59063);
        FuzzerUtils.init(fArr, 12.325F);

        if (b1) {
            for (i3 = 11; i3 < 211; i3++) {
                if (true) {
                    by = (byte)(((iArr[i3 - 1]--) % (i4 | 1)) * (Test.instanceCount--));
                    try {
                        iArr[i3 + 1] = (-111 / i4);
                        i4 = (i4 % i3);
                        i2 = (-19144 % i2);
                    } catch (ArithmeticException a_e) {}
                    vMeth(56728, i3);
                }
                f2 -= 13;
                i4 += (((i3 * i3) + i2) - i2);
                d1 *= Test.instanceCount;
                fArr[i3] += i3;
                for (i12 = 1; i12 < 8; ++i12) {
                    i13 *= (int)Test.instanceCount;
                    i13 *= i2;
                }
            }
            i2 = i4;
        } else {
            Test.instanceCount -= Test.instanceCount;
        }
        long meth_res = i2 + i3 + i4 + by + Float.floatToIntBits(f2) + Double.doubleToLongBits(d1) + i12 + i13 + (b1 ?
            1 : 0) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i1, long l, long l1) {

        float f3=1.744F, f5=-106.534F;
        int i14=-114, i15=13, i16=3, i17=-221, i18=-134, i19=180;
        short s1=-6320;
        double d2=0.83465;

        iMeth1(i1);
        i1 |= i1;
        i1 = -49;
        for (f3 = 10; f3 < 377; ++f3) {
            for (i15 = 1; i15 < 5; i15++) {
                float f4=-80.275F;
                Test.dArrFld[i15] -= i14;
                l1 -= i15;
                Test.iArrFld = Test.iArrFld;
                f4 = f5;
            }
            s1 += (short)(f3 * f3);
        }
        i17 = 1;
        do {
            for (i18 = 1; i18 < 7; ++i18) {
                i19 += (((i18 * i14) + l1) - i16);
                i19 = i14;
            }
            d2 = l1;
        } while (++i17 < 226);
        long meth_res = i1 + l + l1 + Float.floatToIntBits(f3) + i14 + i15 + i16 + Float.floatToIntBits(f5) + s1 + i17
            + i18 + i19 + Double.doubleToLongBits(d2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=89.35050, d3=-40.112342;
        int i=700, i20=-3, i21=226, i22=3, i23=252;
        short s2=-13788;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 209L);

        for (d = 15; d < 261; d++) {
            short s=-28855;
            s += (short)(i - -7488823678844028250L);
            i ^= iMeth(-82, Test.instanceCount, Test.instanceCount);
            i += (int)(((d * i) + Test.instanceCount) - i);
            for (i20 = 2; i20 < 102; ++i20) {
                for (i22 = 1; i22 < 2; i22++) {
                    i21 += (i22 * i22);
                    i23 = i23;
                    i = i23;
                    i += i22;
                    switch ((int)((d % 8) + 24)) {
                    case 24:
                        d3 = i22;
                        d3 -= i20;
                        s2 += (short)45397;
                        d3 -= s;
                        break;
                    case 25:
                        Test.instanceCount += (long)(2.379F + (i22 * i22));
                        i23 -= s2;
                    case 26:
                        Test.iArrFld[i22 + 1] -= i;
                        break;
                    case 27:
                        i23 -= i22;
                        i += (((i22 * i21) + i23) - Test.instanceCount);
                        Test.instanceCount += (i22 | s2);
                    case 28:
                        i += (int)fFld;
                        switch (((i20 >>> 1) % 2) + 47) {
                        case 47:
                            Test.bFld = false;
                            switch ((int)(((d % 4) * 5) + 16)) {
                            case 20:
                            case 27:
                                s = (short)i21;
                                Test.bFld = Test.bFld;
                                lArr[i22] >>= -30;
                                i = i20;
                                break;
                            case 24:
                                Test.iArrFld[i20 - 1] = i;
                                break;
                            case 31:
                                Test.instanceCount = Test.instanceCount;
                            default:
                                d3 += i23;
                            }
                            break;
                        case 48:
                            d3 += 183;
                            break;
                        }
                        break;
                    case 29:
                        Test.instanceCount <<= -20;
                        break;
                    case 30:
                        s >>= (short)i20;
                    case 31:
                        i21 += (i22 * i22);
                        break;
                    default:
                        i21 <<= i22;
                    }
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}