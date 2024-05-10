package tests.javafuzzer2730;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:23:50 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8819L;
    public static short sFld=8136;
    public static int iFld=67;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -59695);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i5=-181;
        boolean b=false, b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 18156L);

        i5 = i5;
        b = b;
        b1 = b;
        lArr = lArr;
        vMeth2_check_sum += i5 + (b ? 1 : 0) + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1() {

        int i1=157, i2=-51, i3=8, i4=-1, i6=29774, i7=-48313, i8=163;
        byte by=-50;
        float f=-120.997F, fArr[]=new float[N];
        double dArr[]=new double[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(dArr, 2.73295);
        FuzzerUtils.init(lArr1, 1080058038L);
        FuzzerUtils.init(fArr, 117.539F);

        dArr[(i1 >>> 1) % N] = Math.abs(i1 + (i1 - i1));
        i2 = 1;
        while (++i2 < 247) {
            by *= (byte)(((i1 = i2) % ((long)(Float.intBitsToFloat(i2)) | 1)) * ((i2 - i2) + (i1 * i1)));
            Test.instanceCount >>>= -1346359538L;
        }
        for (i3 = 19; 391 > i3; i3++) {
            i1 += (-128 + (i3 * i3));
        }
        vMeth2();
        Test.instanceCount *= i2;
        for (f = 6; f < 337; ++f) {
            lArr1[(int)(f + 1)] &= i2;
            i4 -= (int)f;
            i1 = (int)Test.instanceCount;
            for (i7 = 1; i7 < 5; ++i7) {
                fArr[(int)(f - 1)] = 7;
                Test.iArrFld[i7 - 1] = Test.sFld;
            }
        }
        vMeth1_check_sum += i1 + i2 + by + i3 + i4 + Float.floatToIntBits(f) + i6 + i7 + i8 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth() {

        int i9=-230, i10=32217, i11=10, i12=-11;
        boolean b2=false;

        vMeth1();
        Test.instanceCount = i9;
        i9 += i9;
        Test.iArrFld[(i9 >>> 1) % N] = i9;
        if (b2) {
            i9 = i9;
        } else if (true) {
            i9 *= i9;
            i9 += i9;
        } else {
            for (i10 = 3; i10 < 251; ++i10) {
                i11 += (((i10 * i10) + i11) - Test.sFld);
                i11 += (i10 * i10);
                i12 = 7;
                while ((i12 -= 2) > 0) {
                    Test.instanceCount += i12;
                    Test.instanceCount += (i12 * i12);
                    i9 = i9;
                }
            }
        }
        vMeth_check_sum += i9 + (b2 ? 1 : 0) + i10 + i11 + i12;
    }

    public void mainTest(String[] strArr1) {

        int i=1, i13=-126, i14=30828, i15=-12, i16=39016, i17=22440, i18=-175, i19=0, i20=8;
        byte by1=47;
        float f1=-99.490F;
        long lArr2[]=new long[N];
        double dArr1[]=new double[N];

        FuzzerUtils.init(lArr2, 440695674L);
        FuzzerUtils.init(dArr1, 0.125858);

        i = 1;
        do {
            vMeth();
            i13 = -38689;
            i14 = 1;
            while (++i14 < 348) {
                Test.instanceCount = Test.instanceCount;
                Test.iArrFld[i14 + 1] *= i;
                Test.instanceCount <<= -60L;
                Test.instanceCount <<= i14;
                lArr2[i14 - 1] = i14;
                Test.iArrFld[i14 - 1] = i13;
                i13 = i14;
                Test.instanceCount += (((i14 * i13) + Test.instanceCount) - by1);
            }
            switch ((i % 4) + 116) {
            case 116:
                for (i15 = 20; i15 < 348; i15 += 2) {
                    i16 -= -1678;
                    Test.iArrFld[i + 1] += 69;
                    Test.instanceCount = i16;
                    i16 -= i16;
                    dArr1[i] *= -47020;
                }
                i13 = (int)-1144343269L;
                Test.instanceCount = Test.instanceCount;
                i16 += i15;
                break;
            case 117:
                i13 /= (int)(i13 | 1);
                for (i17 = 21; i17 < 348; i17++) {
                    for (i19 = 1; i19 < 2; ++i19) {
                        i18 += Test.iFld;
                        switch ((i19 % 2) + 15) {
                        case 15:
                            i16 = i;
                            f1 -= i13;
                            i18 = i15;
                            break;
                        case 16:
                            i20 += (i19 * i19);
                        }
                    }
                }
            case 118:
                dArr1[i - 1] -= 9;
                break;
            case 119:
                i20 += (((i * i) + i15) - f1);
            }
        } while ((i += 3) < 218);



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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
