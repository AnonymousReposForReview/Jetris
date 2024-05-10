package tests.javafuzzer1768;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 03:13:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-26881L;
    public static int iFld=11;
    public static boolean bFld=false;
    public static float fFld=-27.967F;

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(float f, int i3, long l) {

        boolean b=false;
        int i4=-9, i5=153;
        double d2=1.34931;

        b = b;
        b = false;
        for (i4 = 5; i4 < 292; ++i4) {
            if (b) continue;
            l >>>= Test.instanceCount;
            i3 = i5;
            i5 |= (int)Test.instanceCount;
            i5 -= i5;
            i3 -= (int)f;
            i5 += i4;
            i3 += (int)d2;
            l = l;
            if (b) {
                l *= i4;
                i3 += (((i4 * i5) + i3) - l);
            }
        }
        long meth_res = Float.floatToIntBits(f) + i3 + l + (b ? 1 : 0) + i4 + i5 + Double.doubleToLongBits(d2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static double dMeth(int i) {

        int i1=21, i2=6, i6=166, i8=34, i9=-57333, iArr[]=new int[N];
        float f1=1.303F;
        double d3=2.55807;

        FuzzerUtils.init(iArr, -17074);

        for (i1 = 299; i1 > 17; --i1) {
            i = (int)(Test.instanceCount++);
            i = (int)(~(Test.instanceCount + (i = i)));
        }
        i += (int)fMeth(f1, 607, 8405469516274707273L);
        for (d3 = 14; 239 > d3; ++d3) {
            i2 = (int)f1;
            i6 = i2;
            f1 = i;
            switch ((int)((d3 % 2) + 36)) {
            case 36:
                i2 -= i6;
                f1 += -4;
                break;
            case 37:
                i += (int)d3;
                for (i8 = (int)(d3); i8 < 7; i8++) {
                    i = i8;
                    i9 = -46698;
                }
            default:
                iArr[(int)(d3 - 1)] = i8;
            }
        }
        long meth_res = i + i1 + i2 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d3) + i6 + i8 + i9 +
            FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(double d, double d1) {

        int i10=11, i11=225, i12=10, i13=66, i14=-65095, i15=5, iArr1[][]=new int[N][N];
        float f2=1.109F, f3=0.297F;
        short s=-23755;

        FuzzerUtils.init(iArr1, 16792);

        dMeth(Test.iFld);
        Test.instanceCount *= 5L;
        i10 = 1;
        do {
            f2 += i10;
            for (i11 = 1; i11 < 5; i11++) {
                Test.iFld += i11;
                i13 = 2;
                do {
                    iArr1[i13 + 1][i10] = (int)Test.instanceCount;
                    f2 *= Test.iFld;
                } while (--i13 > 0);
                Test.instanceCount = Test.iFld;
                switch (((i10 % 1) * 5) + 52) {
                case 55:
                    if (Test.bFld) {
                        for (f3 = 2; f3 > 1; f3--) {
                            Test.iFld += i13;
                        }
                        Test.instanceCount *= s;
                    } else if (Test.bFld) {
                        i14 += i11;
                    } else if (Test.bFld) {
                        Test.iFld += (i11 + i10);
                    } else {
                        i15 = (int)Test.instanceCount;
                    }
                    break;
                }
            }
        } while (++i10 < 327);
        long meth_res = Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i10 + Float.floatToIntBits(f2) + i11
            + i12 + i13 + Float.floatToIntBits(f3) + i14 + s + i15 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d4=96.73455;
        int i16=10, i17=-65, i18=-38080, i19=-11, i20=89, i21=215, i22=-242, i23=24043, i24=-12, iArr2[]=new int[N];
        byte by=-65;
        float f4=2.39F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr2, 6);
        FuzzerUtils.init(lArr, 2518005187L);

        iMeth(d4, d4);
        for (i16 = 9; i16 < 183; ++i16) {
            i17 -= by;
            i18 = 144;
            while ((i18 -= 2) > 0) {
                Test.instanceCount = i17;
                Test.instanceCount += (i18 * i18);
                if (Test.bFld) {
                    Test.instanceCount %= (Test.iFld | 1);
                    Test.iFld >>= Test.iFld;
                } else if (Test.bFld) {
                    Test.instanceCount *= i16;
                    if (Test.bFld) continue;
                } else if (Test.bFld) {
                    Test.fFld += i18;
                }
                i17 = i18;
            }
            i17 >>>= (int)Test.instanceCount;
        }
        i19 = 1;
        while (++i19 < 180) {
            Test.iFld = -16509;
            for (f4 = i19; f4 < 139; f4++) {
                for (i21 = 1; i21 > 1; --i21) {
                    i17 = i21;
                    Test.instanceCount = i19;
                    Test.iFld -= i17;
                    iArr2[i21] += (int)Test.instanceCount;
                    Test.fFld -= i19;
                }
                for (i23 = 1; i23 < 1; i23 += 3) {
                    i17 += (((i23 * Test.instanceCount) + i24) - Test.instanceCount);
                    Test.instanceCount = i16;
                    i24 += (((i23 * f4) + i19) - i22);
                    Test.instanceCount = i20;
                    i17 >>= i18;
                    lArr[i19] *= i24;
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
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}