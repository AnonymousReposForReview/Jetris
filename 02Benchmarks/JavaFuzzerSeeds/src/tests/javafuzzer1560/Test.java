package tests.javafuzzer1560;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 22:57:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=52446740L;
    public float fFld=1.567F;
    public static short sFld=-18389;
    public static volatile byte byFld=127;
    public volatile int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth(float f, int i6) {

        long l1=5396476360542718191L;
        int i7=-3059;

        for (l1 = 9; 213 > l1; l1++) {
            Test.instanceCount += (i7--);
        }
        long meth_res = Float.floatToIntBits(f) + i6 + l1 + i7;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth1(int i10, int i11) {


        iMeth(fFld, i10);
        long meth_res = i10 + i11;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(long l, int i2, int i3) {

        int i4=0, i5=128, i8=-38, i9=-75, i12=8;
        long l2=-1339341039L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, 48969L);

        for (i4 = 1; 330 > i4; ++i4) {
            l += (long)(fFld += ((i2++) * (iArrFld[i4 + 1] = i3)));
            fFld -= iMeth(fFld--, iArrFld[i4]);
        }
        l2 -= (++i2);
        for (i8 = 3; i8 < 256; ++i8) {
            i5 = iMeth1(i3, i5);
            i3 = 7;
            l = i8;
        }
        i12 = 124;
        while ((i12 -= 2) > 0) {
            i5 -= i2;
            iArrFld[i12] = i8;
            i2 += i9;
            i3 += i2;
            i2 += Test.sFld;
            lArr = lArr;
        }
        vMeth_check_sum += l + i2 + i3 + i4 + i5 + l2 + i8 + i9 + i12 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=247, i1=-12, i13=-26143, i14=-8, i15=0, i16=-4, i17=-2, i18=9, i19=-200, i20=14, i21=52485;
        double d=-90.92744;

        i >>>= i1;
        vMeth(Test.instanceCount, i1, i1);
        for (i13 = 8; i13 < 243; i13++) {
            i <<= (int)Test.instanceCount;
            i1 *= (int)Test.instanceCount;
            i14 ^= (int)Test.instanceCount;
            i1 = -5;
            for (i15 = 2; i15 < 107; ++i15) {
                boolean b=true;
                if (b) break;
                for (i17 = i15; i17 < 2; ++i17) {
                    b = b;
                }
                Test.instanceCount = Test.instanceCount;
                i18 *= (int)fFld;
                i18 *= i13;
                i >>= (int)Test.instanceCount;
                i -= i15;
                switch ((i13 % 2) + 91) {
                case 91:
                    i = (int)Test.instanceCount;
                case 92:
                    for (i19 = 1; i19 < 2; ++i19) {
                        Test.sFld = (short)d;
                        d = 11505L;
                        if (b) break;
                        iArrFld[i13] <<= i18;
                        try {
                            i16 = (i20 % i20);
                            i16 = (i20 / 156);
                            i21 = (i15 / -61889);
                        } catch (ArithmeticException a_e) {}
                        switch (((i19 % 1) * 5) + 105) {
                        case 109:
                            i21 += (i19 + i1);
                            i14 = i19;
                            Test.instanceCount >>>= i16;
                            break;
                        default:
                            d = -68.115524;
                            i18 = i18;
                        }
                    }
                    break;
                default:
                    i20 = Test.byFld;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest iMeth1
//DEBUG  iMeth1 ->  iMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
