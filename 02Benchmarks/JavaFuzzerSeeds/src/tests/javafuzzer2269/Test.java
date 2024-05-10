package tests.javafuzzer2269;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:12:40 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=84L;
    public static volatile short sFld=-25593;
    public static boolean bFld=true;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static void vSmallMeth(long l, int i5) {


        i5 += i5;
        vSmallMeth_check_sum += l + i5;
    }

    public static long lMeth(long l2, int i13) {


        i13 *= i13;
        vSmallMeth(Test.instanceCount, i13);
        i13 = i13;
        long meth_res = l2 + i13;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i6, long l1) {

        int i7=-12, i8=-6999, i9=-63870, i10=-43, i11=-11, i12=-1533, i14=-50759, i15=-9, i16=-206, i17=-62062,
            iArr[]=new int[N];
        float f1=-2.698F;
        byte by=-69;

        FuzzerUtils.init(iArr, -17062);

        for (i7 = 1; i7 < 205; ++i7) {
            iArr[i7] -= (int)(((i6 + 39) * (i6 - i8)) * (f1 * (i7 - f1)));
            by -= by;
            for (i9 = 1; i9 < 8; ++i9) {
                for (i11 = i7; i11 < 2; ++i11) {
                    vSmallMeth(Long.reverseBytes(lMeth(l1, i8)), i9);
                }
                try {
                    i6 = (i8 / i11);
                    i12 = (i8 / i10);
                    i12 = (i12 % i7);
                } catch (ArithmeticException a_e) {}
                i14 = 2;
                while (--i14 > 0) {
                    Test.sFld &= (short)i11;
                    iArr[i7] *= i8;
                    i8 <<= i7;
                    i12 *= (int)2418817473L;
                }
                for (i15 = i9; i15 < 2; i15++) {
                    l1 -= i17;
                    i12 -= (int)l1;
                }
            }
        }
        vMeth_check_sum += i6 + l1 + i7 + i8 + Float.floatToIntBits(f1) + by + i9 + i10 + i11 + i12 + i14 + i15 + i16 +
            i17 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-18, i1=25914, i2=0, i3=162, i4=-28592, i18=-4, i19=-7, i20=-10, i21=-205, iArr1[]=new int[N];
        float f=-101.982F;
        short s=-2138;
        byte by1=-72;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 70L);
        FuzzerUtils.init(iArr1, 40527);

        i >>>= (int)((-(f - Test.instanceCount)) + (0.91816 - (i - f)));
        i <<= (int)Test.instanceCount;
        for (i1 = 2; 346 > i1; i1 += 3) {
            for (i3 = 8; i3 < 220; i3++) {
                Test.instanceCount += (i3 + Test.instanceCount);
                f += (((i3 * i1) + f) - i4);
            }
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(lArr[i1 - 1], i - i1);
            s += (short)(i1 - i3);
            vMeth(i1, Test.instanceCount);
            i -= i;
            by1 += (byte)(((i1 * f) + i) - Test.instanceCount);
            if (Test.bFld) break;
            for (i18 = 4; i18 < 220; i18++) {
                iArr1[i18 - 1] = i;
                i2 += (i18 * i18);
                Test.instanceCount += -6L;
                Test.instanceCount += i18;
                iArr1[i18] -= by1;
                for (i20 = 1; i20 < 2; ++i20) {
                    f *= s;
                    switch ((((i3 >>> 1) % 2) * 5) + 56) {
                    case 60:
                        iArr1[i20 + 1] = i;
                        i19 -= (int)Test.instanceCount;
                        Test.instanceCount += Test.instanceCount;
                        i19 *= i18;
                        break;
                    case 58:
                        by1 += (byte)(i20 + i20);
                        Test.instanceCount = i2;
                        i4 <<= i2;
                        try {
                            i21 = (iArr1[i1 + 1] % i20);
                            i4 = (i20 % i2);
                            i19 = (i19 / i18);
                        } catch (ArithmeticException a_e) {}
                        break;
                    default:
                        i2 *= i20;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth lMeth
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}