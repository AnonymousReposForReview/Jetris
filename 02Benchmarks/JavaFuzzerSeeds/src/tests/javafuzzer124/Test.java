package tests.javafuzzer124;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 22:46:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1251364563L;
    public static double dFld=-2.120920;
    public static volatile boolean bFld=true;
    public static float fFld=0.1006F;
    public static short sFld=-28423;
    public static int iFld=4464;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 215);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1, int i5, long l2) {

        short s=-5740;
        int i6=50528, i7=-17874, i8=9;
        double d=-119.63160;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)48);

        Test.bFld = Test.bFld;
        try {
            Test.fFld = l1;
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            l1 = s;
            i6 = 1;
            do {
                Test.iArrFld = FuzzerUtils.int1array(N, (int)36615);
                i7 = 1;
                do {
                    switch (((i7 % 4) * 5) + 13) {
                    case 16:
                        byArr[i7 + 1] -= (byte)i7;
                        for (d = 1; d < 1; d++) {
                            if (true) break;
                            i8 += (int)(d * d);
                        }
                        break;
                    case 27:
                        s -= (short)i6;
                        i8 += i7;
                        i5 = -125;
                        break;
                    case 30:
                        i8 |= (int)42417L;
                        break;
                    case 15:
                        Test.iArrFld = Test.iArrFld;
                    }
                } while (++i7 < 9);
            } while (++i6 < 173);
        }
        vMeth1_check_sum += l1 + i5 + l2 + s + i6 + i7 + Double.doubleToLongBits(d) + i8 + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth() {

        int i1=-155, i2=195, i3=-2385, i4=-207, i9=-6, i10=-32459, i11=20388;
        byte by=95;
        long lArr[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, 7679038335996896929L);
        FuzzerUtils.init(sArr, (short)-30554);

        for (i1 = 2; i1 < 291; ++i1) {
            for (i3 = 1; i3 < 6; i3++) {
                Test.iArrFld[i1 + 1] += (Test.iArrFld[i3]--);
                Test.dFld = Test.iArrFld[i1 - 1];
                vMeth1(-1483614411L, i2, Test.instanceCount);
                i4 |= -51280;
                for (i9 = 2; 1 < i9; --i9) {
                    lArr[i1 - 1] = (long)Test.fFld;
                    switch ((i3 % 2) + 99) {
                    case 99:
                        i4 += (((i9 * Test.sFld) + Test.instanceCount) - Test.fFld);
                        i11 <<= i3;
                        by -= (byte)0;
                        sArr[i9 + 1] -= (short)235;
                        break;
                    case 100:
                    default:
                        i2 *= i3;
                        i4 = i11;
                    }
                }
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + i9 + i10 + i11 + by + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, int i) {

        int iArr[][]=new int[N][N];

        FuzzerUtils.init(iArr, -13);

        i -= (int)(Long.reverseBytes(~iArr[(-191 >>> 1) % N][(-78 >>> 1) % N]) - iMeth());
        vMeth_check_sum += l + i + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i12=-12, i13=250, i14=1, i15=4420, i16=13583, i17=-47787;
        byte by1=57;
        long l3=4283795421L, l4=-7L, lArr1[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr1, -5234616830629942126L);
        FuzzerUtils.init(fArr, -5.220F);

        vMeth(Test.instanceCount, Test.iFld);
        for (i12 = 9; i12 < 223; i12++) {
            Test.iFld += (i12 + by1);
            i13 += i12;
            for (l3 = 7; l3 < 117; l3++) {
                i13 *= i12;
                if (Test.bFld) break;
                Test.fFld = i13;
                i14 = i12;
                if (Test.bFld) {
                    by1 += (byte)Test.instanceCount;
                    i13 -= 145;
                    if (Test.bFld) {
                        Test.iArrFld[i12] += i13;
                    } else {
                        for (l4 = 1; l4 < 2; ++l4) {
                            Test.fFld += (-107 + (l4 * l4));
                            Test.iArrFld[i12 + 1] += i13;
                            lArr1 = lArr1;
                            Test.instanceCount += (206 + (l4 * l4));
                            i13 = (int)l4;
                            Test.instanceCount = 7;
                        }
                    }
                    Test.iArrFld[(int)(l3 - 1)] = Test.sFld;
                } else {
                    for (i16 = 1; i16 < 2; ++i16) {
                        Test.iArrFld[i12 - 1] += Test.iFld;
                        lArr1[(int)(l3 + 1)] -= i13;
                        fArr[i12 - 1] += Test.iFld;
                        Test.sFld += (short)(i16 ^ i12);
                        lArr1[(int)(l3)] *= Test.instanceCount;
                    }
                }
                by1 -= (byte)i13;
            }
            i13 += i12;
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
