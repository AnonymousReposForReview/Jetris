package tests.javafuzzer2053;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 08:02:43 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static int iFld=-199;
    public static int iFld1=-235;
    public static float fFld=-13.585F;
    public double dFld=77.109356;
    public short sFld=-23447;
    public double dArrFld[]=new double[N];

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3, int i4) {

        int i5=60470, i6=29, i7=68, i8=13, iArr1[]=new int[N];
        short s=28853;
        byte by=55;
        float f=-46.492F;
        double dArr[]=new double[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(dArr, -83.24717);
        FuzzerUtils.init(iArr1, 14);
        FuzzerUtils.init(lArr1, 12383L);

        for (i5 = 14; i5 < 250; ++i5) {
            s += (short)(i5 | Test.instanceCount);
            i4 += (int)Test.instanceCount;
            by >>= (byte)Test.instanceCount;
            f += i3;
            dArr[i5 + 1] -= i6;
            s = (short)Test.iFld;
        }
        i3 -= Test.iFld;
        i4 += i5;
        for (i7 = 256; i7 > 12; i7--) {
            Test.instanceCount += i7;
            iArr1[i7 + 1] = i8;
            Test.instanceCount /= (Test.iFld | 1);
            lArr1[i7] >>= Test.instanceCount;
        }
        i3 -= (int)Test.instanceCount;
        vMeth1_check_sum += i3 + i4 + i5 + i6 + s + by + Float.floatToIntBits(f) + i7 + i8 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(long l, int i2) {

        int i9=8, i10=-7, i11=8, i12=29268, i13=13, iArr2[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr2, -19275);

        vMeth1(Test.iFld, Test.iFld);
        i2 >>= i2;
        i9 = 1;
        while (++i9 < 381) {
            Test.iFld1 += (((i9 * l) + Test.fFld) - i2);
            for (i10 = 1; i10 < 4; i10++) {
                Test.iFld -= i11;
                for (i12 = 2; 1 < i12; i12--) {
                    Test.iFld *= (int)Test.instanceCount;
                    Test.iFld += i12;
                    if (b) {
                        iArr2[i10 - 1] >>= (int)l;
                        if (true) {
                            i2 = Test.iFld1;
                            try {
                                i13 = (1135107791 % i9);
                                i11 = (-1048485677 % i2);
                                i2 = (iArr2[i12 - 1] / i11);
                            } catch (ArithmeticException a_e) {}
                            Test.iFld += i10;
                        } else {
                            Test.iFld -= (int)Test.fFld;
                        }
                    } else {
                        b = false;
                    }
                }
            }
        }
        vMeth_check_sum += l + i2 + i9 + i10 + i11 + i12 + i13 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vSmallMeth() {

        int i1=-2885;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3454664480077076460L);

        lArr[(i1 >>> 1) % N] += i1;
        vMeth(Test.instanceCount, 59585);
        vSmallMeth_check_sum += i1 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-7, i14=3, i15=2, i16=-8, i17=56940, i18=-7384, i19=11, i20=40899, i21=-46943, iArr[]=new int[N];
        long l1=-8724988651867648983L, lArr2[]=new long[N];
        boolean b1=true;

        FuzzerUtils.init(iArr, -44128);
        FuzzerUtils.init(lArr2, -100713501L);

        iArr[(i >>> 1) % N] = (int)Float.intBitsToFloat(iArr[(i >>> 1) % N]);
        for (int smallinvoc=0; smallinvoc<415; smallinvoc++) vSmallMeth();
        i >>= (int)Test.instanceCount;
        for (i14 = 8; i14 < 167; ++i14) {
            dFld *= i;
            Test.instanceCount -= Test.instanceCount;
            i15 *= (int)Test.fFld;
            Test.iFld = Test.iFld1;
        }
        for (i16 = 12; i16 < 265; i16 += 2) {
            for (l1 = 5; l1 < 199; ++l1) {
                Test.fFld = 0.371F;
                Test.instanceCount = Test.instanceCount;
                try {
                    Test.iFld = (20 % i17);
                    i17 = (8325 / Test.iFld);
                    Test.iFld1 = (i16 / -94);
                } catch (ArithmeticException a_e) {}
                for (i19 = 1; i19 < 2; i19++) {
                    b1 = true;
                    switch ((((i14 >>> 1) % 5) * 5) + 41) {
                    case 44:
                        i21 -= i14;
                        i15 += (int)44212L;
                        iArr = iArr;
                    case 53:
                        b1 = b1;
                        Test.instanceCount = i19;
                        lArr2[i16] += (long)dFld;
                        i20 -= i16;
                        break;
                    case 64:
                        dArrFld[i16 + 1] += i16;
                        i18 += i19;
                        if (b1) break;
                        switch (((i21 >>> 1) % 2) + 30) {
                        case 30:
                            Test.fFld += (((i19 * Test.iFld1) + Test.fFld) - i20);
                            break;
                        case 31:
                            sFld -= (short)Test.iFld;
                            break;
                        }
                        break;
                    case 52:
                        lArr2[(int)(l1 + 1)] >>= i20;
                    case 63:
                        i18 += (i19 * i19);
                        break;
                    default:
                        if (b1) continue;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}