package tests.javafuzzer1897;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:27:51 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=11L;
    public static double dFld=-4.90934;
    public static int iFld=12;
    public volatile int iFld1=12;
    public boolean bFld=true;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 8256);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4) {

        int i5=233, i6=115, i7=33649, i8=-248, i9=-35;
        double d=-2.53997;
        byte by=-58;
        long lArr1[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr1, 27930L);
        FuzzerUtils.init(fArr, -1.692F);

        for (i5 = 12; i5 < 335; ++i5) {
            boolean b=true;
            if (b) break;
            i6 += (i5 * i4);
            for (d = 1; d < 5; ++d) {
                for (i8 = (int)(d); 2 > i8; i8++) {
                    Test.instanceCount -= i9;
                    lArr1[(int)(d + 1)] = -206;
                    i9 += (-185 + (i8 * i8));
                    i7 *= (int)d;
                    i9 += (((i8 * i5) + i4) - Test.instanceCount);
                    fArr[i5] += i5;
                    Test.instanceCount <<= i4;
                    by *= by;
                }
            }
            i4 *= (int)-3024581977813348430L;
            b = b;
        }
        long meth_res = i4 + i5 + i6 + Double.doubleToLongBits(d) + i7 + i8 + i9 + by + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i1, int i2, int i3) {

        boolean b1=true;
        float f1=0.655F, fArr1[]=new float[N];
        int i10=5, i11=-42645, i12=-5, i13=10067, i14=4;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -9L);
        FuzzerUtils.init(fArr1, -86.761F);

        i3 = (--i2);
        lArr[(i3 >>> 1) % N] >>>= iMeth(i1);
        b1 = true;
        f1 -= i2;
        i2 -= i2;
        i10 = 1;
        while (++i10 < 297) {
            i11 = 1;
            while (++i11 < 6) {
                Test.iArrFld[i10 + 1] -= -56487;
                i2 -= i1;
            }
            fArr1[i10 - 1] -= (float)Test.dFld;
            i12 = 1;
            while ((i12 += 3) < 6) {
                i1 = (int)f1;
                for (i13 = 1; i13 < 3; i13 += 2) {
                    if (true) break;
                    lArr[i10] += i10;
                }
            }
        }
        vMeth1_check_sum += i1 + i2 + i3 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + i14 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void vMeth(float f, int i) {

        int i15=-11;
        byte by1=0;
        short s=-7441;
        boolean b2=true;

        vMeth1(4069, i, i);
        i15 = 1;
        do {
            Test.iArrFld = Test.iArrFld;
            if (false) {
                by1 = (byte)s;
                f -= -8L;
                i += i15;
                Test.instanceCount = i;
            } else {
            }
            i ^= i;
            if (b2) {
                i += (int)-231L;
                by1 -= (byte)Test.instanceCount;
                i -= (int)f;
                i -= i15;
            } else {
                if (i != 0) {
                    vMeth_check_sum += Float.floatToIntBits(f) + i + i15 + by1 + s + (b2 ? 1 : 0);
                    return;
                }
            }
        } while (++i15 < 358);
        vMeth_check_sum += Float.floatToIntBits(f) + i + i15 + by1 + s + (b2 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        float f2=-110.280F, fArr2[]=new float[N];
        int i16=6, i17=101, i18=-54, i19=138, i20=-12, i21=-198, i22=-55300;
        short s1=6087;
        long lArr2[]=new long[N];

        FuzzerUtils.init(fArr2, -97.890F);
        FuzzerUtils.init(lArr2, 6L);

        vMeth(f2, Test.iFld);
        for (i16 = 6; i16 < 205; i16++) {
            i17 -= (int)Test.instanceCount;
            Test.iFld = -56815;
            Test.instanceCount += (-11948 + (i16 * i16));
            Test.iArrFld[i16 - 1] = iFld1;
            Test.iFld *= (int)-7923L;
            for (i18 = 3; 126 > i18; ++i18) {
                Test.instanceCount += Test.instanceCount;
                i17 = i18;
                iFld1 = 2;
                switch ((((-196 >>> 1) % 9) * 5) + 52) {
                case 73:
                    i19 += -58144;
                    i20 = 1;
                    do {
                        Test.instanceCount >>= Test.iFld;
                        Test.iArrFld[i20] ^= i19;
                        try {
                            Test.iFld = (i19 % 81);
                            i17 = (i19 / Test.iArrFld[i20]);
                            iFld1 = (i16 / 51123);
                        } catch (ArithmeticException a_e) {}
                        bFld = bFld;
                        Test.iArrFld[i20] &= i20;
                        Test.instanceCount += i20;
                        iFld1 *= (int)Test.instanceCount;
                        i19 *= i20;
                        bFld = bFld;
                        f2 = iFld1;
                    } while (++i20 < 2);
                case 62:
                    Test.iFld = i20;
                    for (i21 = i18; i21 < 2; i21++) {
                        i17 = (int)Test.instanceCount;
                        fArr2[i16 + 1] *= iFld1;
                    }
                    break;
                case 58:
                    if (bFld) break;
                    lArr2 = lArr2;
                    break;
                case 60:
                    i17 = s1;
                    break;
                case 82:
                    if (bFld) break;
                case 95:
                    Test.instanceCount = -25961;
                    break;
                case 66:
                    Test.instanceCount -= Test.instanceCount;
                    break;
                case 70:
                    Test.iFld >>>= i21;
                    break;
                case 89:
                    iFld1 = i16;
                    break;
                default:
                    s1 <<= (short)Test.instanceCount;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
