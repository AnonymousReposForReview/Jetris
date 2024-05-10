package tests.javafuzzer1767;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 03:13:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=752757786L;
    public static int iFld=-8;
    public static volatile boolean bFld=false;
    public int iFld1=-241;
    public long lFld=13L;
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        double d1=-1.126309;
        float f2=-6.229F;
        int i5=-14, i6=190, i8=199, i9=148, iArr1[]=new int[N];
        byte by=-26;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 621020595L);
        FuzzerUtils.init(iArr1, 169);

        d1 = f2;
        for (i5 = 128; 3 < i5; --i5) {
            lArr[i5 + 1] = (long)f2;
            i6 >>>= -15642;
        }
        i6 -= i6;
        i6 += (int)Test.instanceCount;
        f2 /= ((long)(f2) | 1);
        Test.instanceCount = i6;
        f2 -= i6;
        for (int i7 : iArr1) {
            by = (byte)49629;
            for (i8 = 1; i8 < 4; ++i8) {
                i7 = i5;
                i7 *= i7;
            }
            iArr1[(i6 >>> 1) % N] -= i9;
        }
        vMeth2_check_sum += Double.doubleToLongBits(d1) + Float.floatToIntBits(f2) + i5 + i6 + by + i8 + i9 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(boolean b, int i3, int i4) {

        int i10=-250, i11=-2, i12=55758, i13=91, i14=46606, i15=8;
        double d2=70.67272;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 268288108783141995L);

        vMeth2();
        for (long l : lArr1) {
            for (i10 = 1; i10 < 4; ++i10) {
                l -= i4;
                for (i12 = 1; i12 < 2; ++i12) {
                    Test.instanceCount ^= i13;
                    i11 = i4;
                    i4 += (int)Test.instanceCount;
                    Test.iFld = i4;
                    i11 = i12;
                }
                i3 += i10;
                Test.instanceCount = i10;
                for (i14 = 1; i14 < 2; ++i14) {
                    i4 = (int)d2;
                    Test.iFld <<= (int)l;
                }
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + i3 + i4 + i10 + i11 + i12 + i13 + i14 + i15 + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(lArr1);
    }

    public void vMeth(float f, short s) {

        float f1=2.738F;
        int i2=-142, i16=4, i17=-38677, i18=-198, i19=51900, i20=-44640, i21=-229;
        byte by1=51;

        for (f1 = 1; f1 < 173; f1++) {
            i2 -= (int)(-(--Test.instanceCount));
            vMeth1(Test.bFld, 612, Test.iFld);
        }
        for (i16 = 6; 188 > i16; ++i16) {
            i17 = i16;
            by1 *= (byte)i16;
        }
        i17 -= (int)Test.instanceCount;
        i17 *= Test.iFld;
        Test.instanceCount = (long)f;
        Test.iFld += i17;
        for (i18 = 4; 230 > i18; i18 += 3) {
            for (i20 = 1; i20 < 21; i20 += 3) {
                i2 += (((i20 * i19) + i18) - s);
                lArrFld = lArrFld;
                i17 += (i20 * i20);
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + s + Float.floatToIntBits(f1) + i2 + i16 + i17 + by1 + i18 + i19 +
            i20 + i21;
    }

    public void mainTest(String[] strArr1) {

        int i=11, i1=-5, i22=-86, i23=8, i24=-4959, i25=-171, i26=-19510, i27=14, iArr[]=new int[N];
        double d=21.49265, dArr[]=new double[N];
        float f3=-102.724F;
        byte by2=67;

        FuzzerUtils.init(iArr, 10690);
        FuzzerUtils.init(dArr, 62.90578);

        iArr[(i >>> 1) % N] -= (int)(Test.instanceCount--);
        for (d = 6; d < 181; d++) {
            vMeth(-8.743F, (short)(-17299));
            for (i22 = 8; i22 < 143; ++i22) {
                i1 -= (int)f3;
                if (Test.bFld) break;
                for (i24 = (int)(d); i24 < 2; i24++) {
                    short s1=24732;
                    iFld1 += (i24 | i23);
                    if (Test.bFld) break;
                    iFld1 = s1;
                    dArr[i22 - 1] = 184L;
                    f3 += lFld;
                    try {
                        Test.iFld = (-46689 / i23);
                        i23 = (1650510562 / i25);
                        iFld1 = (iArr[i24] % i);
                    } catch (ArithmeticException a_e) {}
                    Test.iFld += (i24 ^ Test.iFld);
                    s1 += (short)i24;
                }
                by2 = (byte)f3;
                iArr[(int)(d - 1)] *= i24;
                i -= (int)2.283F;
                for (i26 = 1; i26 < 2; i26++) {
                    i25 += (i26 + f3);
                    switch ((i26 % 6) + 127) {
                    case 127:
                        i1 ^= i24;
                        Test.iFld += i26;
                        Test.iFld += i26;
                        break;
                    case 128:
                        f3 += (float)d;
                        break;
                    case 129:
                        iFld1 = -42858;
                        i1 = i22;
                        break;
                    case 130:
                        i *= (int)lFld;
                        iFld1 -= (int)f3;
                        break;
                    case 131:
                        iFld1 = -188;
                        break;
                    case 132:
                        if (Test.bFld) continue;
                        break;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}