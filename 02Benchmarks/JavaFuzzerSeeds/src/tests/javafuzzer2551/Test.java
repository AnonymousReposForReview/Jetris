package tests.javafuzzer2551;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:28:28 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5409605586782544119L;
    public static int iFld=17596;
    public static volatile byte byFld=-111;
    public static boolean bFld=false;
    public static int iFld1=-9164;
    public static long lFld=-5L;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i5, long l2) {

        int i6=21976, i7=-253, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -13399);

        for (i6 = 2; i6 < 333; i6++) {
            iArr1[i6] = Test.iFld;
            i7 += (((i6 * i7) + i5) - Test.iFld);
        }
        long meth_res = i5 + l2 + i6 + i7 + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l1) {

        int i3=5, i4=-8, i8=-50162, i9=-35912, i10=11, i11=169, i12=-11, iArr[]=new int[N];
        double d=1.31824;

        FuzzerUtils.init(iArr, -10);

        for (i3 = 1; i3 < 129; ++i3) {
            float f1=120.701F;
            iArr[i3] >>= (int)(((l1++) * i4) - iMeth1(Test.iFld, 7L));
            Test.iFld += (i3 | i8);
            f1 = Test.instanceCount;
            try {
                Test.iFld = (212 / i8);
                Test.iFld = (47842 / i4);
                i4 = (-10102 % i3);
            } catch (ArithmeticException a_e) {}
            d -= Test.byFld;
            Test.iFld = (int)-114.369F;
            for (i9 = 1; i9 < 12; ++i9) {
                switch (((i9 >>> 1) % 2) + 31) {
                case 31:
                case 32:
                    for (i11 = i3; 2 > i11; i11++) {
                        iArr[i11 - 1] += (int)Test.instanceCount;
                        Test.instanceCount -= Test.instanceCount;
                        f1 += (((i11 * i3) + i11) - i12);
                        Test.iFld = (int)l1;
                        l1 = i9;
                    }
                    break;
                default:
                    l1 = i9;
                }
            }
        }
        long meth_res = l1 + i3 + i4 + i8 + Double.doubleToLongBits(d) + i9 + i10 + i11 + i12 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f, long l) {

        int i2=-23990, i13=-13, i14=-8, i15=-29, i16=-34, i17=-1, i18=-10, iArr2[]=new int[N];
        double d1=121.75251;
        short s=-14744, sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(sArr, (short)-24365);
        FuzzerUtils.init(lArr, 25136L);
        FuzzerUtils.init(iArr2, 63039);

        i2 += (int)(iMeth(l) / (l | 1));
        f -= (float)d1;
        if (Test.bFld) {
            for (i13 = 1; 137 > i13; ++i13) {
                Test.byFld += (byte)i13;
                Test.iFld /= 50;
                sArr = sArr;
                i14 >>>= i13;
            }
            l = Test.iFld;
            for (i15 = 195; i15 > 2; i15 -= 3) {
                int i19=12;
                switch ((i15 % 9) + 80) {
                case 80:
                    for (i17 = 1; i17 < 24; i17++) {
                        l += (i17 * f);
                    }
                    Test.bFld = Test.bFld;
                    i18 *= i13;
                    break;
                case 81:
                case 82:
                    i16 -= i18;
                    break;
                case 83:
                    i2 += (i15 + i19);
                    break;
                case 84:
                    i14 = i14;
                case 85:
                    i19 >>= (int)l;
                    break;
                case 86:
                    i19 += (int)(-21.820F + (i15 * i15));
                case 87:
                    s = (short)10;
                case 88:
                    i19 -= 10;
                    break;
                default:
                    lArr[i15 + 1] <<= Test.instanceCount;
                }
            }
        } else if (Test.bFld) {
            iArr2[(-165 >>> 1) % N] >>= (int)Test.instanceCount;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + l + i2 + Double.doubleToLongBits(d1) + i13 + i14 + i15 + i16 + i17
            + i18 + s + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=-90, i1=-49658, i20=16010, i21=-117, i22=11, i23=-12, i24=14, i25=0, iArr3[][]=new int[N][N];
        float f2=-115.947F;
        double d2=-44.12249;
        long l4=-2213727757L;

        FuzzerUtils.init(iArr3, -225);

        for (i = 3; i < 376; i++) {
            switch (((i % 1) * 5) + 20) {
            case 21:
                switch (((i % 4) * 5) + 77) {
                case 96:
                    vMeth(f2, 600445742L);
                    Test.iFld += (i - Test.instanceCount);
                    for (i20 = 4; i20 < 68; i20 += 3) {
                        d2 += -77;
                        Test.bFld = Test.bFld;
                        i21 += i20;
                        f2 += i1;
                    }
                    d2 = 87.615F;
                    break;
                case 86:
                    d2 = -172;
                    break;
                case 83:
                    i1 %= (int)(Test.iFld | 1);
                    d2 *= Test.instanceCount;
                    i22 = 1;
                    while (++i22 < 68) {
                        Test.iFld1 >>= (int)Test.instanceCount;
                        for (i23 = 1; i23 < 1; i23++) {
                            f2 -= f2;
                            Test.iFld = i;
                            Test.iFld *= i1;
                            if (Test.bFld) break;
                            f2 += i23;
                            f2 = Test.instanceCount;
                            iArr3[i23 - 1][i23] >>= i21;
                        }
                        Test.bFld = Test.bFld;
                        for (l4 = 1; l4 < 1; l4 += 3) {
                            i1 ^= i25;
                            iArr3[(int)(l4)][i22 - 1] = (int)Test.lFld;
                            i1 += (int)(((l4 * i) + i23) - Test.iFld);
                            Test.lFld = i;
                        }
                    }
                    break;
                case 82:
                    i24 >>= i21;
                    break;
                }
                break;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}