package tests.javafuzzer829;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:32:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6L;
    public static double dFld=1.33137;
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i7=55844, i8=5, i9=12522, i10=-11, i11=-28548, i12=-13, iArr1[]=new int[N];
        boolean b=false;
        float f1=-39.59F;

        FuzzerUtils.init(iArr1, -137);

        for (i7 = 7; i7 < 132; i7++) {
            for (i9 = i7; i9 < 13; ++i9) {
                i8 <<= i7;
                b = b;
            }
            iArr1[i7 + 1] = (int)Test.instanceCount;
            f1 *= (float)Test.dFld;
            i8 -= -105;
            i8 >>= i9;
            iArr1[i7 - 1] -= (int)-1659383365L;
            for (i11 = 1; i11 < 13; i11++) {
                switch (((i8 >>> 1) % 3) + 70) {
                case 70:
                case 71:
                    f1 = i8;
                    i10 -= -38;
                    i8 += i9;
                    break;
                case 72:
                }
                f1 = (float)Test.dFld;
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + (b ? 1 : 0) + Float.floatToIntBits(f1) + i11 + i12 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i3) {

        int i4=219, i5=54804, i6=-21, iArr[]=new int[N];
        long l=3L;
        float f=-57.524F;

        FuzzerUtils.init(iArr, 41651);

        i4 = 1;
        do {
            i3 = i4;
            for (i5 = 1; i5 < 11; i5++) {
                switch ((((i4 + -51514) >>> 1) % 1) + 127) {
                case 127:
                    l = 1;
                    while (++l < 2) {
                        Test.instanceCount += (l | i3);
                    }
                    i6 = (int)(((f -= i3) * (++i3)) + ((i4 + -111.266F) - (i5 + i6)));
                    i6 += 18;
                    break;
                }
            }
            f += (i3--);
            iArr[i4] -= iMeth();
            Test.instanceCount = i5;
            iArr = iArr;
            Test.instanceCount >>= Test.instanceCount;
            Test.instanceCount >>>= i6;
            i6 += i4;
        } while (++i4 < 142);
        long meth_res = i3 + i4 + i5 + i6 + l + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i=-154, i1=167, i2=-63273, i13=-8, i14=-4, i15=236, i16=14, i17=-63;
        float f2=-1.633F, fArr[]=new float[N];
        double d=-99.56385;
        boolean b1=false;

        FuzzerUtils.init(fArr, 71.963F);

        fArr[(i >>> 1) % N] *= i;
        for (i1 = 276; i1 > 7; i1 -= 3) {
            lMeth(i2);
            i2 += (i1 * f2);
            i = (int)Test.instanceCount;
            i2 = i1;
            Test.instanceCount = -43;
        }
        for (d = 1; d < 140; d++) {
            for (i14 = 1; 11 > i14; i14++) {
                int i18=-1;
                i ^= i2;
                if (b1) {
                    for (i16 = 1; i16 < 2; i16 += 2) {
                        short s=-23468;
                        i13 -= (int)Test.instanceCount;
                        Test.instanceCount += i16;
                        Test.instanceCount += (((i16 * i16) + s) - i13);
                    }
                } else if (b1) {
                    i13 <<= i18;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d) + i13 + i14 + i15 + i16
            + i17 + (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i19=61407;

        vMeth();
        lArrFld[(i19 >>> 1) % N] *= i19;
        i19 -= 20;


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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
