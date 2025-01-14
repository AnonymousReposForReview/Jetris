package tests.javafuzzer814;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:21:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1445907173L;
    public static int iFld=-8;
    public static byte byFld=-11;
    public static boolean bArrFld[]=new boolean[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.fArrFld, 99.129F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(float f1) {

        int i2=-45672, i3=-166, i4=-31, i5=54646, iArr[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 9L);
        FuzzerUtils.init(iArr, 8);

        i2 = 1;
        while (++i2 < 289) {
            Test.instanceCount <<= 12507;
            Test.iFld = i2;
            lArr[i2] *= i2;
            f1 += -169;
            iArr[i2 + 1] &= Test.iFld;
        }
        i3 -= -50556;
        switch ((((i2 >>> 1) % 6) * 5) + 36) {
        case 64:
            Test.instanceCount = i2;
            Test.instanceCount += i2;
            for (i4 = 4; i4 < 272; ++i4) {
                lArr = lArr;
                lArr[i4] *= Test.instanceCount;
                lArr[i4 + 1] <<= Test.iFld;
            }
            break;
        case 37:
            Test.iFld <<= (int)Test.instanceCount;
            break;
        case 46:
            iArr[(i2 >>> 1) % N] = i3;
        case 63:
            Test.byFld = (byte)i5;
            break;
        case 49:
            iArr = FuzzerUtils.int1array(N, (int)0);
            break;
        case 57:
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i2 + i3 + i4 + i5 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(long l) {

        int i=-3, i1=-14537, i6=-10909, i7=43, i8=56578, i9=-6, iArr1[]=new int[N];
        double d=25.24046;

        FuzzerUtils.init(iArr1, -57538);

        for (i = 7; i < 142; ++i) {
            float f2=-1.192F;
            vMeth(f2);
            Test.iFld = i6;
            i1 = (int)-223L;
            f2 += i;
            i6 = 5968;
        }
        i7 = 1;
        while ((i7 += 3) < 332) {
            if (i != 0) {
            }
            for (i8 = 14; 1 < i8; i8--) {
                d = i8;
                l += (-679077421135799425L + (i8 * i8));
                try {
                    Test.iFld = (99 % iArr1[i7 - 1]);
                    i9 = (Test.iFld % 53925);
                    Test.iFld = (i7 % -1092509143);
                } catch (ArithmeticException a_e) {}
                i6 += (((i8 * i7) + Test.iFld) - i8);
                i6 += (103 + (i8 * i8));
                iArr1 = FuzzerUtils.int1array(N, (int)14);
            }
        }
        long meth_res = l + i + i1 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(float f) {


        Test.instanceCount &= iMeth(Test.instanceCount);
        vSmallMeth_check_sum += Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr1) {

        double d1=-42.43106, d2=1.71464;
        float f3=-55.252F, f4=-2.197F;
        int i10=-5, i11=-233, iArr2[]=new int[N];
        boolean b=false;
        short s=19248;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -3831045451L);
        FuzzerUtils.init(iArr2, -14);

        for (int smallinvoc=0; smallinvoc<229; smallinvoc++) vSmallMeth(-106.345F);
        d1 = 290;
        while (--d1 > 0) {
            d2 = 1;
            while (++d2 < 87) {
                lArr1[(int)(d2 + 1)] = Test.iFld;
                for (f3 = 1; 1 < f3; f3 -= 2) {
                    Test.iFld += -25;
                    switch (((Test.iFld >>> 1) % 8) + 97) {
                    case 97:
                        i10 += (int)f3;
                        break;
                    case 98:
                        Test.instanceCount += Test.iFld;
                        iArr2[(int)(d1 - 1)] *= Test.byFld;
                        Test.instanceCount += (long)(((f3 * Test.instanceCount) + Test.instanceCount) - f3);
                        Test.iFld -= i11;
                        break;
                    case 99:
                        Test.instanceCount += Test.instanceCount;
                        iArr2 = iArr2;
                    case 100:
                        if (b) {
                            b = b;
                        } else if (b) {
                            i10 >>= -108;
                            Test.instanceCount *= Test.byFld;
                            Test.instanceCount = Test.instanceCount;
                        }
                        i11 += (int)Test.instanceCount;
                        switch ((int)(((f3 % 7) * 5) + 112)) {
                        case 114:
                            if (b) continue;
                            i10 ^= Test.iFld;
                            i11 = 196;
                            break;
                        case 140:
                        case 136:
                            lArr1[(int)(d1 - 1)] += Test.iFld;
                            Test.iFld += (int)((long)f3 | Test.instanceCount);
                        case 135:
                            Test.instanceCount -= Test.iFld;
                            break;
                        case 146:
                            i10 <<= 4;
                            break;
                        case 147:
                            Test.bArrFld[(int)(d2)] = b;
                            break;
                        case 145:
                            lArr1 = FuzzerUtils.long1array(N, (long)4843845191958644660L);
                        }
                    case 101:
                        if (b) continue;
                        break;
                    case 102:
                        Test.fArrFld = FuzzerUtils.float1array(N, (float)0.16F);
                        break;
                    case 103:
                        f4 = s;
                        break;
                    case 104:
                        i10 += i10;
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
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
