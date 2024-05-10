package tests.javafuzzer1693;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 01:44:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-82067213896489614L;
    public static double dFld=-1.127600;
    public static byte byFld=60;
    public static int iFld=-50238;
    public short sFld=14194;
    public static int iFld1=12;
    public static byte byArrFld[]=new byte[N];
    public int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-113);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public void vMeth1(int i4) {

        int i5=4, i7=-154, i8=-9, i9=6, i10=44037;
        float f2=63.280F;

        iArrFld[(i4 >>> 1) % N] = (int)Test.instanceCount;
        i5 = 1;
        while (++i5 < 372) {
            i4 = (int)Test.instanceCount;
            Test.instanceCount += (i5 | (long)f2);
            i4 += (((i5 * i5) + i5) - i4);
            Test.instanceCount = Test.instanceCount;
            switch ((i5 % 6) + 22) {
            case 22:
                i4 = i5;
                for (i7 = i5; 5 > i7; i7++) {
                    Test.instanceCount += i7;
                    iArrFld[i5 + 1] = i5;
                    for (i9 = 1; i9 < 1; ++i9) {
                        iArrFld[i9 - 1] -= i9;
                        i4 -= (int)Test.instanceCount;
                        iArrFld = iArrFld;
                    }
                }
                break;
            case 23:
                i10 *= i7;
                break;
            case 24:
                i8 += 12;
                break;
            case 25:
                Test.instanceCount = i8;
                break;
            case 26:
                if (i8 != 0) {
                    vMeth1_check_sum += i4 + i5 + Float.floatToIntBits(f2) + i7 + i8 + i9 + i10;
                    return;
                }
                break;
            case 27:
                i8 += (((i5 * i9) + i5) - Test.instanceCount);
            default:
            }
        }
        vMeth1_check_sum += i4 + i5 + Float.floatToIntBits(f2) + i7 + i8 + i9 + i10;
    }

    public int iMeth(int i1, int i2) {

        float f=106.656F, f1=-1.483F;
        int i3=182, i11=-8, i12=-243;
        boolean b1=false;
        byte by1=-109;

        for (f = 7; f < 153; f++) {
            if (b1) continue;
            Test.instanceCount += (long)f;
            f1 += f;
            vMeth1(i3);
            for (i11 = 11; 1 < i11; --i11) {
                iArrFld = iArrFld;
            }
            if (false) {
                i1 *= by1;
                Test.instanceCount = i11;
                Test.instanceCount &= i11;
                iArrFld[(int)(f + 1)] = i12;
            } else if (true) {
                i3 += (int)(f - i3);
                i3 = i12;
            } else {
                i3 *= i2;
            }
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f) + i3 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + i11 + i12 +
            by1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(boolean b) {

        int i=-11080, i13=26155, i14=198, i15=-41, i16=-5;

        for (byte by : Test.byArrFld) {
            i += iMeth(27872, i);
            for (i13 = 1; i13 < 4; i13++) {
                float f3=-20.801F;
                Test.dFld -= f3;
                i14 += (((i13 * i13) + i) - i14);
                if (b) break;
                for (i15 = 2; i15 > 1; --i15) {
                    lArrFld = lArrFld;
                    i -= (int)Test.dFld;
                    i += (i15 - Test.instanceCount);
                    i14 += i15;
                    i16 *= i16;
                    if (i13 != 0) {
                        vMeth_check_sum += (b ? 1 : 0) + i + i13 + i14 + i15 + i16;
                        return;
                    }
                    Test.dFld = Test.instanceCount;
                    i14 = i;
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i + i13 + i14 + i15 + i16;
    }

    public void mainTest(String[] strArr1) {

        boolean b2=false;
        int i17=-34295, i18=2, i19=7, i20=3, i21=61569, i22=-153, i23=-6;
        float f4=0.804F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 24.394F);

        vMeth(b2);
        for (i17 = 6; i17 < 168; i17++) {
            i18 += (((i17 * Test.instanceCount) + Test.instanceCount) - i18);
        }
        Test.byFld = (byte)63890;
        for (i19 = 15; i19 < 387; ++i19) {
            for (i21 = 3; 68 > i21; i21++) {
                i20 += (int)-14L;
                f4 += i21;
                i20 = (int)-239L;
                Test.instanceCount = i18;
                i18 = i22;
                i18 >>= i22;
                i23 = 1;
                do {
                    switch (((i19 % 1) * 5) + 70) {
                    case 72:
                        Test.instanceCount >>= Test.instanceCount;
                        iArrFld[i19] = Test.iFld;
                        i18 += (i23 + i20);
                        break;
                    default:
                        b2 = b2;
                    }
                    fArr[i23 + 1] = Test.instanceCount;
                    i18 += (i23 * i23);
                    i22 = (int)Test.dFld;
                } while (++i23 < 2);
                i18 += i21;
                iArrFld[i19 + 1] = Test.iFld;
                sFld = (short)Test.instanceCount;
            }
            Test.instanceCount = (long)Test.dFld;
            i18 += i19;
            Test.iFld1 += (-11 + (i19 * i19));
            Test.instanceCount = Test.iFld;
            f4 *= Test.byFld;
        }
        Test.byArrFld[(Test.iFld1 >>> 1) % N] = (byte)-166;


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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
