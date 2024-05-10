package tests.javafuzzer130;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 22:51:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1238268005L;
    public static int iFld=-61058;
    public static byte byFld=-25;
    public float fFld=-2.483F;
    public volatile byte byArrFld[]=new byte[N];

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i3) {

        int i4=-1, i5=-9, i6=-14, i7=-7, i8=7, i9=-7116, iArr1[]=new int[N];
        double d1=-7.83131, d2=-13.113060;
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, 3L);
        FuzzerUtils.init(iArr1, -233);
        FuzzerUtils.init(fArr, 118.132F);

        for (i4 = 16; i4 < 313; i4++) {
            lArr[i4] = Test.instanceCount;
            iArr1[i4] += (int)d1;
            for (i6 = 1; i6 < 6; i6++) {
                switch ((i4 % 1) + 84) {
                case 84:
                    Test.iFld >>= i4;
                default:
                    i5 >>= Test.byFld;
                    i8 = 2;
                    do {
                        fArr = fArr;
                        fArr[i8] += (float)d1;
                    } while (--i8 > 0);
                    for (d2 = 1; 2 > d2; ++d2) {
                        short s=-29720;
                        Test.instanceCount += Test.instanceCount;
                        i7 -= i3;
                        i3 = i7;
                        s *= (short)Test.iFld;
                    }
                }
            }
        }
        long meth_res = i3 + i4 + i5 + Double.doubleToLongBits(d1) + i6 + i7 + i8 + Double.doubleToLongBits(d2) + i9 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(long l, boolean b, int i) {

        int i1=-33202, i2=52701, i10=48, i11=-6, i12=-2, iArr2[]=new int[N];
        double d=1.112497;
        float f1=2.520F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr2, 45989);
        FuzzerUtils.init(lArr1, 6L);

        for (i1 = 133; 6 < i1; i1 -= 3) {
            Test.instanceCount += i1;
            l = (long)(((10 + (d--)) - fMeth(i1)) * i1);
            if (b) break;
            i2 -= -107;
            l = i2;
            d *= i2;
            i10 = 36;
            do {
                i = (int)l;
                iArr2[i1 - 1] += i1;
                Test.instanceCount = Test.iFld;
                Test.instanceCount = i2;
            } while ((i10 -= 3) > 0);
            for (i11 = 2; i11 < 36; i11++) {
                f1 -= f1;
                lArr1 = lArr1;
            }
        }
        vMeth_check_sum += l + (b ? 1 : 0) + i + i1 + i2 + Double.doubleToLongBits(d) + i10 + i11 + i12 +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vSmallMeth() {

        float f=66.360F;
        boolean b1=false;

        f += Test.instanceCount;
        vMeth(Test.instanceCount, b1, Test.iFld);
        vSmallMeth_check_sum += Float.floatToIntBits(f) + (b1 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i13=-8, i14=3128, i15=33130, i16=5, i17=-94, i18=-109, i19=-13, iArr[]=new int[N];
        short s1=29725, sArr[]=new short[N];
        double d3=0.16662, dArr[]=new double[N];
        boolean b2=true;

        FuzzerUtils.init(iArr, 6993);
        FuzzerUtils.init(sArr, (short)15896);
        FuzzerUtils.init(dArr, 1.98068);

        iArr[(Test.iFld >>> 1) % N] += (int)Test.instanceCount;
        for (int smallinvoc=0; smallinvoc<102; smallinvoc++) vSmallMeth();
        i13 = 1;
        do {
            s1 += (short)(i13 + fFld);
            fFld *= i13;
            Test.iFld = Test.iFld;
            for (i14 = 2; i14 < 76; ++i14) {
                d3 = -71;
                Test.iFld = -233;
            }
            Test.instanceCount += (long)26.125937;
            Test.instanceCount += i13;
            Test.iFld += (i13 * i13);
            Test.instanceCount <<= Test.iFld;
            Test.iFld += i13;
        } while (++i13 < 330);
        sArr[(i13 >>> 1) % N] = (short)220;
        i15 += (int)Test.instanceCount;
        for (i16 = 3; i16 < 166; ++i16) {
            Test.iFld -= i16;
            Test.iFld = i15;
            try {
                i17 = (i16 % 21306);
                iArr[i16] = (95 % i15);
                Test.iFld = (i15 / i14);
            } catch (ArithmeticException a_e) {}
            switch (((i16 % 4) * 5) + 58) {
            case 77:
                Test.byFld += (byte)(i16 * i16);
                b2 = b2;
                Test.instanceCount += i13;
                Test.iFld >>>= Test.iFld;
                break;
            case 76:
                for (i18 = 8; i18 < 154; i18++) {
                    switch ((i16 % 1) + 38) {
                    case 38:
                        Test.iFld = (int)d3;
                        i15 = (int)Test.instanceCount;
                        dArr[i18 - 1] = 62.876F;
                        break;
                    default:
                        d3 += 13;
                    }
                }
            case 78:
                fFld = i17;
                break;
            case 71:
                Test.iFld += i16;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  fMeth ->  fMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
