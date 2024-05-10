package tests.javafuzzer3079;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:32:43 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-29098L;
    public static int iFld=-60454;
    public static float fFld=2.761F;
    public volatile short sFld=8340;
    public static double dFld=0.6040;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -244);
        FuzzerUtils.init(Test.dArrFld, 2.100000);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        double d1=0.121587;
        int i11=-7, i12=-23355, i13=-2, i14=-12, i15=30, i16=6, i17=12721;
        float f4=-2.705F;
        boolean b=true;
        short s=-1552;

        for (d1 = 7; d1 < 165; d1++) {
            i12 = 1;
            while (++i12 < 10) {
                for (i13 = i12; i13 < 1; ++i13) {
                    Test.iArrFld[(int)(d1 + 1)] = i14;
                    Test.instanceCount += i13;
                }
            }
            Test.instanceCount += i13;
            for (f4 = 1; f4 < 10; ++f4) {
                Test.iFld = i14;
                Test.fFld = Test.instanceCount;
                i15 = i14;
            }
            Test.dArrFld[(int)(d1)] += i11;
            b = b;
            for (i16 = 1; i16 < 10; ++i16) {
                Test.iFld = (int)Test.instanceCount;
                Test.iFld += (((i16 * Test.iFld) + s) - Test.instanceCount);
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i11 + i12 + i13 + i14 + Float.floatToIntBits(f4) + i15 + (b ? 1 :
            0) + i16 + i17 + s;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(long l2, long l3, int i5) {

        double d=0.96922;
        int i6=-12, i7=-63, i8=-4, i9=0, i10=53331;
        float f2=99.747F, f3=54.317F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 6L);

        for (d = 6; d < 180; d++) {
            i6 += (((i6 - i6) * i6) - ((-35588 - i5) * Test.iFld));
            Test.iFld += (int)(((d * Test.iFld) + Test.iFld) - Test.iFld);
            for (f2 = 1; f2 < 9; f2++) {
                for (f3 = 1; 2 > f3; f3++) {
                    Test.iArrFld[(int)(d)] <<= (int)(((l3--) + l3) * ((lArr[(int)(d)]++) + (f2 - i7)));
                }
                if (i6 != 0) {
                }
                i8 -= (int)(l3++);
                i8 = (int)(((i6 - l2) * (i5 * i5)) + (lArr[(int)(f2 + 1)]--));
                l3 = (long)(((i7 = -33) - (i5 - i8)) * (f2 * (130 + l3)));
                for (i9 = 1; 2 > i9; ++i9) {
                    i5 -= (int)d;
                    i8 *= (int)(Test.fFld--);
                    l3 *= (36628 + lMeth());
                    Test.iArrFld[i9 + 1] *= (int)l2;
                }
            }
        }
        long meth_res = l2 + l3 + i5 + Double.doubleToLongBits(d) + i6 + Float.floatToIntBits(f2) + i7 +
            Float.floatToIntBits(f3) + i8 + i9 + i10 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3, long l1) {

        float f1=95.722F;
        int i4=-27604, i18=56371, i19=-211, i20=206;
        boolean b1=false;

        i3 = (int)(--Test.instanceCount);
        Test.iFld &= (int)(((-72.70384 * (++i3)) % (((long)(--f1)) | 1)) - ((Test.instanceCount * 11) * (l1 %
            (Test.iFld | 1))));
        i4 = 1;
        do {
            if (i4 != 0) {
                vMeth_check_sum += i3 + l1 + Float.floatToIntBits(f1) + i4 + i18 + i19 + i20 + (b1 ? 1 : 0);
                return;
            }
            iMeth(l1, l1, i4);
            for (i18 = 1; 8 > i18; ++i18) {
                l1 -= l1;
                i20 = 1;
                do {
                    l1 = i19;
                } while (++i20 < 2);
            }
            b1 = b1;
            l1 = Test.instanceCount;
        } while ((i4 += 2) < 389);
        vMeth_check_sum += i3 + l1 + Float.floatToIntBits(f1) + i4 + i18 + i19 + i20 + (b1 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i=12, i1=-39298, i2=12, iArr[][]=new int[N][N];
        long l=13L, lArr1[]=new long[N];
        float f=0.87F;
        byte by=-33;
        boolean b2=true;

        FuzzerUtils.init(lArr1, -8L);
        FuzzerUtils.init(iArr, -12);

        Test.iArrFld[(Test.iFld >>> 1) % N] <<= Test.iArrFld[(Test.iFld >>> 1) % N];
        for (i = 15; i < 343; i++) {
            i1 *= Test.iFld;
            l = 77;
            while (--l > 0) {
                for (f = 1; f < 1; f++) {
                    vMeth(Test.iFld, Test.instanceCount);
                    Test.fFld += f;
                    i1 = sFld;
                    i2 *= (int)l;
                    Test.iArrFld[i + 1] -= (int)-15L;
                    Test.fFld += f;
                    i1 *= i;
                    if (b2) {
                        i1 += 11;
                        switch ((int)((f % 6) + 28)) {
                        case 28:
                            i1 = (int)-48090L;
                            Test.instanceCount -= Test.iFld;
                            Test.instanceCount = 3L;
                            Test.fFld -= (float)Test.dFld;
                        case 29:
                            Test.iFld |= (int)l;
                            break;
                        case 30:
                            Test.fFld += f;
                            Test.iFld = (int)l;
                            lArr1[(int)(l + 1)] += Test.iFld;
                            break;
                        case 31:
                            i2 -= Test.iFld;
                            i1 += (int)(((f * i) + Test.fFld) - i1);
                            iArr = iArr;
                            Test.iFld *= Test.iFld;
                            break;
                        case 32:
                            by += (byte)(((f * Test.instanceCount) + i1) - i);
                        case 33:
                            Test.fFld += (13 + (f * f));
                            Test.instanceCount = Test.iFld;
                            break;
                        }
                    } else if (b2) {
                        i1 += (int)Test.fFld;
                    } else {
                        Test.iFld *= (int)f;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}