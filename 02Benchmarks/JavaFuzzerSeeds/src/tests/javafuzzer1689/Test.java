package tests.javafuzzer1689;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 01:44:35 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-23060L;
    public short sFld=-17801;
    public static int iFld=-10731;
    public long lFld=-179L;
    public boolean bFld=true;
    public static double dFld=-54.107031;
    public volatile float fFld=0.11F;
    public int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 63223L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l, double d, boolean b) {

        int i3=-31967, i4=247, i5=-161, i6=-171;
        double d1=0.53797;
        float f=38.619F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 79.71F);

        try {
            for (i3 = 7; i3 < 252; ++i3) {
                b = b;
                fArr[i3] = (float)2.92964;
                i4 = (int)Test.instanceCount;
                if (b) break;
                for (d1 = i3; d1 < 7; ++d1) {
                    i6 = 1;
                    while (++i6 < 1) {
                        if (b) continue;
                        i4 *= (int)l;
                        i4 = -5829;
                        i4 += (int)l;
                        i4 *= (int)f;
                        i4 += Test.iFld;
                        i5 += (((i6 * i4) + i5) - i3);
                    }
                }
            }
        }
        catch (NegativeArraySizeException exc1) {
            i4 *= (int)Test.instanceCount;
        }
        long meth_res = l + Double.doubleToLongBits(d) + (b ? 1 : 0) + i3 + i4 + Double.doubleToLongBits(d1) + i5 + i6
            + Float.floatToIntBits(f) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i2) {

        double d2=13.41944;
        boolean b1=true;
        int i7=-13, i8=-30, i9=11, i10=9, i11=15004, i12=105, i13=24638, iArr[]=new int[N];
        float f1=-2.842F;

        FuzzerUtils.init(iArr, -168);

        sFld = (short)(iMeth1(-59420L, d2, b1) * Test.instanceCount);
        for (i7 = 15; i7 < 355; i7++) {
            iArr[i7 + 1] += i7;
        }
        for (i9 = 319; i9 > 11; i9--) {
            switch ((i9 % 2) + 42) {
            case 42:
                switch (((i9 % 6) * 5) + 48) {
                case 67:
                    iArr[i9 - 1] -= Test.iFld;
                    f1 += i2;
                    for (i11 = 1; i11 < 5; ++i11) {
                        Test.iFld -= 193;
                        Test.iFld = (int)Test.instanceCount;
                        i13 = 1;
                        while (++i13 < 2) {
                            try {
                                Test.iFld = (32644 % i8);
                                Test.iFld = (i12 % -2002404967);
                                iArr[i13 - 1] = (i8 % 8);
                            } catch (ArithmeticException a_e) {}
                            Test.instanceCount += (0 + (i13 * i13));
                            Test.instanceCount -= i8;
                        }
                    }
                    break;
                case 76:
                case 53:
                    Test.instanceCount += i7;
                    break;
                case 75:
                    Test.iFld += i9;
                    break;
                case 61:
                    Test.instanceCount >>>= 3;
                    break;
                case 70:
                    Test.instanceCount = i11;
                    break;
                }
            case 43:
                lFld <<= i10;
            default:
                i10 = i11;
            }
        }
        long meth_res = i2 + Double.doubleToLongBits(d2) + (b1 ? 1 : 0) + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1)
            + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth() {

        int i1=-142, i14=5, i15=-223, i16=8, i17=-6;
        float f2=-114.298F;
        double d3=91.79196;

        i1 = ((-iMeth(i1)) * 162);
        for (i14 = 6; i14 < 280; ++i14) {
            if (bFld) continue;
            bFld = bFld;
            i16 = 1;
            while (++i16 < 6) {
                bFld = bFld;
                bFld = bFld;
                if (bFld) break;
                i15 = i16;
                Test.iFld = i16;
                i17 = 1;
                do {
                    Test.instanceCount = (long)f2;
                    if (true) {
                        i15 += (int)lFld;
                    } else if (bFld) {
                        i1 += i17;
                    } else {
                        d3 -= i15;
                    }
                } while (++i17 < 1);
            }
        }
        vMeth_check_sum += i1 + i14 + i15 + i16 + i17 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d3);
    }

    public void mainTest(String[] strArr1) {

        byte by=-92, byArr[]=new byte[N];
        int i=0, i19=-5, i20=1, i21=-98, i22=-1;

        FuzzerUtils.init(byArr, (byte)-36);

        by = (byte)((--i) + (++sFld));
        vMeth();
        for (int i18 : iArrFld) {
            Test.instanceCount = i;
            i18 &= Test.iFld;
            i18 <<= (int)lFld;
            for (i19 = 3; i19 < 63; ++i19) {
                for (i21 = 2; i21 > 1; --i21) {
                    if (bFld) {
                        by >>= (byte)i18;
                        i20 -= (int)Test.dFld;
                    } else {
                        Test.iFld = (int)fFld;
                        by = (byte)i18;
                        i20 = 21;
                        Test.instanceCount += (i21 - i);
                    }
                    iArrFld[i21 + 1] >>>= i21;
                    Test.iFld += (((i21 * Test.instanceCount) + fFld) - i18);
                    iArrFld[i21 - 1] = -41464;
                    i = i20;
                    Test.instanceCount = i;
                    switch ((i21 % 4) + 109) {
                    case 109:
                        try {
                            Test.iFld = (i21 % 205);
                            i = (-9772 % i20);
                            iArrFld[i21 + 1] = (i22 / iArrFld[i19 - 1]);
                        } catch (ArithmeticException a_e) {}
                        lFld = 88;
                        break;
                    case 110:
                        Test.iFld = (int)113.33630;
                        break;
                    case 111:
                        Test.iFld = -29478;
                        Test.lArrFld[i19 + 1] = -14111;
                        i18 >>= i18;
                        Test.instanceCount >>>= i;
                        break;
                    case 112:
                        byArr[i21] *= (byte)-2.65F;
                        break;
                    }
                }
            }
        }
        i22 = i19;


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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}