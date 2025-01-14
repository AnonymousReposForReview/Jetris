package tests.javafuzzer1;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 20:59:28 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-11L;
    public static float fFld=-127.68F;
    public static double dFld=24.47943;
    public static boolean bFld=true;
    public int iArrFld[][]=new int[N][N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i3) {


        i3 = i3;
        long meth_res = i3;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i2=87, i4=-195, i5=168, i7=-43, i8=39625, i9=-43, iArr[]=new int[N];
        byte by=111;
        float f=0.364F;
        double d=-1.25410;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -21183);
        FuzzerUtils.init(lArr, 2158073770651481704L);

        i2 = (-iMeth(i2));
        i2 = i2;
        for (i4 = 2; i4 < 148; ++i4) {
            for (i7 = 1; i7 < 11; ++i7) {
                i8 += i8;
            }
            by -= (byte)f;
            i8 >>= i2;
            for (d = 1; d < 11; d++) {
                i5 = (int)Test.instanceCount;
                i9 |= 21785;
                Test.instanceCount *= Test.instanceCount;
                i9 = i5;
                i5 += (int)(((d * i8) + i9) - i4);
                lArr[i4] += -207L;
                i5 += (int)(d * d);
            }
        }
        vMeth1_check_sum += i2 + i4 + i5 + i7 + i8 + by + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i9 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i, int i1, long l) {

        int iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -23555);

        vMeth1();
        Test.instanceCount -= 0;
        iArr1[(i1 >>> 1) % N] <<= i1;
        i1 *= i;
        vMeth_check_sum += i + i1 + l + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i10=7, i11=-46771, i12=-159, i13=-234, i14=-35342, i15=9;
        float f1=0.411F, fArr[]=new float[N];
        boolean b=false;
        byte by1=-68;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 77.41908);
        FuzzerUtils.init(fArr, 2.81F);

        vMeth(i10, i10, Test.instanceCount);
        f1 = 271;
        while ((f1 -= 3) > 0) {
            for (i11 = 12; i11 < 275; ++i11) {
                i12 = (int)f1;
                i10 = 12;
                Test.instanceCount += i10;
                Test.instanceCount = Test.instanceCount;
                i10 += i10;
                dArr[i11 - 1] = i11;
                if (b) continue;
                i13 = i10;
                switch ((int)((f1 % 8) + 117)) {
                case 117:
                    i12 <<= i11;
                    break;
                case 118:
                    for (i14 = 1; 2 > i14; i14++) {
                        i12 = i10;
                        if (false) break;
                        fArr[(int)(f1 - 1)] *= i10;
                        i12 ^= -62;
                        i12 += (((i14 * Test.instanceCount) + i11) - i11);
                        i15 += (i14 * i14);
                        b = false;
                        i10 <<= i11;
                        i12 += (((i14 * i15) + i12) - i10);
                    }
                    Test.fFld += (-92 + (i11 * i11));
                    Test.dFld = i14;
                    break;
                case 119:
                    Test.instanceCount += (i11 * i11);
                    if (Test.bFld) {
                        by1 += (byte)-2.987F;
                        Test.instanceCount += i13;
                        Test.fFld -= i14;
                    } else {
                        i15 += i15;
                    }
                    break;
                case 120:
                case 121:
                    i15 = 0;
                case 122:
                    i12 >>= -172;
                    break;
                case 123:
                    i15 = i11;
                    break;
                case 124:
                    iArrFld = iArrFld;
                    break;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
