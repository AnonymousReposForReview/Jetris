package tests.javafuzzer3132;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 02:27:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8L;
    public static double dFld=1.77893;
    public int iFld=-1;
    public static boolean bFld=true;
    public static volatile float fFld=0.559F;
    public long lArrFld[]=new long[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public void vMeth(int i) {


        Test.instanceCount += lArrFld[(i >>> 1) % N];
        vMeth_check_sum += i;
    }

    public static void vMeth1(boolean b) {

        int i4=1957, i5=-50174, i6=6, i7=246, i8=-149, iArr[]=new int[N];
        float f1=0.974F;

        FuzzerUtils.init(iArr, -13);

        i4 = 183;
        do {
            i5 = i4;
            Test.instanceCount += 2842484824711380648L;
            i5 = i4;
            try {
                i5 = (i4 % i4);
                iArr[i4] = (i5 / 180);
                i5 = (iArr[i4 + 1] % i4);
            } catch (ArithmeticException a_e) {}
            i5 *= i4;
            for (i6 = 1; i6 < 17; ++i6) {
                i8 = 1;
                while (++i8 < 2) {
                    if (b) {
                        i5 <<= i5;
                        i7 += (i8 - i4);
                        iArr[i6] *= -28093;
                    }
                    i7 ^= i7;
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount -= (long)f1;
                }
            }
        } while ((i4 -= 2) > 0);
        vMeth1_check_sum += (b ? 1 : 0) + i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr);
    }

    public int iMeth1(float f, double d, long l) {

        int i1=-11, i2=8641, i3=8, i9=60359, i10=223, i11=10, i12=17022, i13=-57, i14=5, i15=170;
        double d1=0.15945;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        for (i1 = 11; i1 < 264; i1++) {
            for (d1 = 6; d1 > 1; d1--) {
                vMeth1(false);
                i2 = i1;
            }
            if (Test.bFld) continue;
            for (i9 = 1; i9 < 6; ++i9) {
                bArr[i9] = Test.bFld;
            }
        }
        f += l;
        for (i11 = 1; i11 < 391; ++i11) {
            i2 += (int)f;
        }
        Test.instanceCount -= iFld;
        i13 = 370;
        while ((i13 -= 3) > 0) {
            for (i14 = 1; i14 < 13; ++i14) {
                i10 += i2;
                i15 += iFld;
            }
        }
        long meth_res = Float.floatToIntBits(f) + Double.doubleToLongBits(d) + l + i1 + i2 +
            Double.doubleToLongBits(d1) + i3 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(bArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        float f2=-1.536F;

        vMeth(Math.max(iFld, iMeth1(f2, Test.dFld, Test.instanceCount)));
        long meth_res = Float.floatToIntBits(f2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=45254, i17=-2, i18=-54297, i19=-74, i20=107, i21=-201, i22=51311, iArr1[]=new int[N];
        float f3=2.656F, fArr[]=new float[N];
        short s=-21299;
        byte by=118;

        FuzzerUtils.init(iArr1, -11);
        FuzzerUtils.init(fArr, -1.272F);

        Test.dFld *= iMeth();
        for (i16 = 5; i16 < 181; i16++) {
            i17 -= 0;
            Test.instanceCount -= i16;
            try {
                iArr1[i16] = (i17 / iFld);
                i17 = (i17 / i16);
                i17 = (i17 % i16);
            } catch (ArithmeticException a_e) {}
            i17 += (int)f3;
            iFld = (int)-2.617F;
            switch (((i16 % 1) * 5) + 56) {
            case 58:
                iFld += (9419 + (i16 * i16));
                lArrFld[i16] = Test.instanceCount;
                for (i18 = 143; i18 > 1; i18--) {
                    f3 += (i18 * i17);
                    iFld += i18;
                    iFld += iFld;
                    Test.fFld %= (iFld | 1);
                    i19 += (int)Test.instanceCount;
                    i17 += i17;
                    i19 <<= s;
                    for (i20 = 1; i20 < 2; i20 += 3) {
                        fArr = fArr;
                        f3 = i20;
                        i19 *= by;
                        Test.instanceCount &= Test.instanceCount;
                        iArr1[i18 + 1] = i19;
                        Test.instanceCount *= i19;
                    }
                    switch ((((i17 >>> 1) % 2) * 5) + 29) {
                    case 34:
                        try {
                            i17 = (i17 % i18);
                            i19 = (i18 / -24104);
                            i22 = (235 % i20);
                        } catch (ArithmeticException a_e) {}
                        iFld >>= (int)Test.instanceCount;
                        iFld *= (int)f3;
                        Test.instanceCount &= -190;
                    case 36:
                        i22 = 210;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
