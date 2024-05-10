package tests.javafuzzer3285;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:39:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-35660L;
    public float fFld=2.695F;
    public static int iFld=-213;
    public boolean bFld=true;
    public static volatile long lArrFld[]=new long[N];
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 1288512958L);
        FuzzerUtils.init(Test.dArrFld, -8.39302);
        FuzzerUtils.init(Test.iArrFld, 161);
    }

    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i8, int i9) {

        byte by=94;
        int i10=-12, i12=-13, i13=11, iArr1[]=new int[N];
        float f1=-2.793F;
        double d1=-2.80203, d2=85.22988;

        FuzzerUtils.init(iArr1, 38575);

        i9 += by;
        i10 = 1;
        while (++i10 < 396) {
            f1 -= Test.instanceCount;
            switch ((i10 % 2) + 83) {
            case 83:
            case 84:
                i8 -= (int)-3496388598019898961L;
                for (i12 = i10; i12 < 4; ++i12) {
                    switch ((i12 % 1) + 51) {
                    case 51:
                        i8 = 1;
                        d1 *= i9;
                        Test.instanceCount = i13;
                        break;
                    default:
                        i9 |= i10;
                        Test.dArrFld[i12] += Test.instanceCount;
                        d2 = 1;
                        do {
                            if (i13 != 0) {
                            }
                            by += (byte)(d2 - i9);
                        } while (++d2 < 1);
                    }
                }
                break;
            default:
                iArr1[i10 + 1] += i13;
            }
        }
        long meth_res = i8 + i9 + by + i10 + Float.floatToIntBits(f1) + i12 + i13 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l) {

        int i5=4761, i6=-1, i7=-10, i14=8, i15=-11, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 31431);

        for (i5 = 9; i5 < 383; i5++) {
            i7 = 5;
            while (--i7 > 0) {
                i6 -= iMeth1(Test.iFld, i6);
                for (i14 = 1; 1 > i14; i14++) {
                    switch (((i14 % 1) * 5) + 108) {
                    case 112:
                        Test.instanceCount -= i7;
                        iArr2[i7 - 1] = (int)Test.instanceCount;
                        break;
                    default:
                        Test.iFld = (int)1.513F;
                    }
                    iArr2[i5] -= i5;
                    i15 -= i15;
                    Test.iFld -= (int)Test.instanceCount;
                    iArr2[i14] -= (int)l;
                    Test.instanceCount = i14;
                }
                i6 *= (int)Test.instanceCount;
                i15 += i7;
            }
        }
        long meth_res = l + i5 + i6 + i7 + i14 + i15 + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(float f, int i3, int i4) {

        double d3=106.40958;
        int i16=9, i17=-4, i18=26407, i19=1;
        boolean b=true;
        byte by2=-105;

        Test.instanceCount += (long)(((i3 - i3) - (i4 - f)) - iMeth(Test.instanceCount));
        if (b) {
            Test.iArrFld[(Test.iFld >>> 1) % N] = (int)d3;
            if (b) {
                for (i16 = 388; i16 > 8; i16--) {
                    byte by1=-115;
                    i3 += (((i16 * i4) + by1) - i4);
                    Test.iFld *= (int)Test.instanceCount;
                    f = f;
                }
                b = b;
                by2 += (byte)Test.instanceCount;
                for (i18 = 1; i18 < 140; i18++) {
                    switch ((i18 % 9) + 77) {
                    case 77:
                        Test.instanceCount += i17;
                        Test.iArrFld[i18 + 1] += i19;
                        i19 += (int)-191L;
                        break;
                    case 78:
                        i17 = i18;
                    case 79:
                        i17 += i18;
                        break;
                    case 80:
                        if (b) continue;
                        break;
                    case 81:
                        Test.iArrFld[i18 - 1] += Test.iFld;
                        break;
                    case 82:
                        i3 -= (int)f;
                    case 83:
                    case 84:
                        Test.iArrFld[i18] = i17;
                        break;
                    case 85:
                        f *= (float)d3;
                        break;
                    }
                }
            } else {
                i4 *= (int)d3;
            }
        } else {
            i19 = by2;
        }
        long meth_res = Float.floatToIntBits(f) + i3 + i4 + Double.doubleToLongBits(d3) + i16 + i17 + (b ? 1 : 0) + by2
            + i18 + i19;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=7, i1=-6, i2=-107, i20=-3, i21=3, i22=-13921, i23=30, iArr[]=new int[N];
        short s=-2471;
        double d=40.1472, d4=1.72123;

        FuzzerUtils.init(iArr, 9);

        Test.lArrFld[(i >>> 1) % N] = (long)(fFld * ((s--) * (i - Test.instanceCount)));
        i += (iArr[(i >>> 1) % N]++);
        for (i1 = 7; i1 < 287; ++i1) {
            iArr[i1 - 1] = (int)((++Test.instanceCount) - ((3 * (fFld++)) / (i1 | 1)));
            Test.instanceCount += i1;
            i2 -= i;
        }
        d *= -45921;
        iArr[(i1 >>> 1) % N] = (int)(dMeth(fFld, i2, i2) - Test.iFld);
        for (d4 = 13; d4 < 389; d4++) {
            for (i21 = (int)(d4); i21 < 67; ++i21) {
                i >>>= (int)Test.instanceCount;
                Test.instanceCount = 8;
                bArrFld[i21] = true;
                i2 = i2;
                i23 = 1;
                do {
                    int i24=-10;
                    if (bFld) {
                        Test.lArrFld[(int)(d4)] = Test.instanceCount;
                    } else {
                        Test.instanceCount = i22;
                        i20 += (i23 * i23);
                        i2 = i24;
                        if (bFld) {
                            i <<= i21;
                            i24 = i23;
                        } else if (bFld) {
                            Test.iFld = (int)Test.instanceCount;
                            Test.iFld &= (int)Test.instanceCount;
                            fFld += i23;
                            i = 22590;
                        }
                    }
                    Test.instanceCount = Test.instanceCount;
                    i24 += (i23 * Test.instanceCount);
                    Test.instanceCount = 14589;
                } while (++i23 < 1);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
