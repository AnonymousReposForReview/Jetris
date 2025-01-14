package tests.javafuzzer3225;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 04:17:23 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=60998L;
    public static byte byFld=-16;
    public static float fFld=-73.814F;
    public static int iFld=12;
    public static int iFld1=-176;
    public double dArrFld[][]=new double[N][N];

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static long lMeth(boolean b) {

        int i7=-2;

        i7 = Test.byFld;
        long meth_res = (b ? 1 : 0) + i7;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i14=-42, i15=-14, i16=-3, i17=-34989, i18=-2669, i19=-5054, i20=196, i21=42389;
        short s2=-17965;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 81.513F);

        Test.iFld += Test.iFld;
        for (i14 = 1; i14 < 149; ++i14) {
            for (i16 = 11; i16 > 1; i16 -= 2) {
                i15 <<= -6;
                Test.instanceCount += (((i16 * i17) + Test.instanceCount) - Test.instanceCount);
                Test.fFld += (((i16 * Test.fFld) + Test.iFld) - Test.instanceCount);
                Test.iFld -= i17;
            }
            Test.instanceCount |= i16;
            Test.instanceCount -= i17;
            for (i18 = i14; i18 < 11; i18++) {
                Test.instanceCount = i19;
                fArr[i14 - 1] = i16;
                for (i20 = 1; i20 > 1; i20--) {
                    Test.instanceCount *= i20;
                    s2 = (short)8231246867919569084L;
                }
            }
        }
        vMeth1_check_sum += i14 + i15 + i16 + i17 + i18 + i19 + i20 + i21 + s2 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(int i8, int i9) {

        int i10=120, i11=2931, i12=50433, i13=11, i22=-14, i23=0, i24=-2, iArr1[]=new int[N];
        short s3=5417;
        float f=1.973F;
        byte byArr[]=new byte[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(byArr, (byte)123);
        FuzzerUtils.init(dArr, -55.44572);
        FuzzerUtils.init(iArr1, -1);

        for (i10 = 7; i10 < 343; ++i10) {
            for (i12 = 5; i12 > i10; i12 -= 3) {
                vMeth1();
                i9 += i12;
                Test.iFld1 += s3;
                i8 += -59;
            }
            Test.iFld1 += i9;
            Test.instanceCount = i12;
            for (i22 = 1; i22 < 5; i22++) {
                byArr[i22] += (byte)i22;
                dArr[i22] += i13;
                for (f = 2; f > 1; f -= 3) {
                    i11 += (int)Test.instanceCount;
                    Test.iFld1 = i24;
                    iArr1[(int)(f)] = -115;
                }
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + i12 + i13 + s3 + i22 + i23 + Float.floatToIntBits(f) + i24 +
            FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i3=-12316, i4=-206, i5=8559, i6=-10, i25=5, iArr2[]=new int[N];
        double d=-99.10348;
        short s1=5451;
        boolean b1=false;

        FuzzerUtils.init(iArr2, -36085);

        for (i3 = 9; i3 < 144; i3++) {
            Test.instanceCount += (((i3 * Test.fFld) + Test.byFld) - i3);
            i4 += (i3 ^ Test.instanceCount);
            i4 = (int)(--d);
            Test.instanceCount += ((--i4) - (--i4));
            i4 += (((i3 * s1) + i3) - s1);
            Test.instanceCount = i3;
        }
        for (i5 = 10; i5 < 350; i5++) {
            i6 = (int)(Double.longBitsToDouble(lMeth(b1)) + iMeth(i5, i5));
            try {
                iArr2[i5] = (-128 / iArr2[i5 - 1]);
                iArr2[i5 + 1] = (Test.iFld / 131);
                iArr2[i5] = (-61510 % i3);
            } catch (ArithmeticException a_e) {}
            s1 += (short)(i5 * i5);
            i25 = 1;
            do {
                Test.fFld += s1;
                s1 *= (short)-60371;
                if (false) break;
            } while (++i25 < 5);
        }
        vMeth_check_sum += i3 + i4 + Double.doubleToLongBits(d) + s1 + i5 + i6 + (b1 ? 1 : 0) + i25 +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=-56, i2=2, i26=36714, i27=-208, i28=92, i29=14, i30=39995, i31=41474, iArr[]=new int[N];
        short s=-20943;
        double d1=-1.46990;
        boolean b2=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -16339);
        FuzzerUtils.init(lArr, -3310395601403812786L);

        i = 363;
        do {
            int i1=124;
            s >>>= (short)i;
            i1 += (-252 + (i * i));
            Test.instanceCount = (Test.byFld = (byte)(Test.instanceCount--));
        } while ((i -= 2) > 0);
        i2 *= (int)((-iArr[(i2 >>> 1) % N]) - ((i2 - i2) - lArr[(i2 >>> 1) % N]));
        vMeth();
        i2 <<= i2;
        lArr[(i2 >>> 1) % N] = (long)Test.fFld;
        Test.instanceCount = Test.iFld;
        Test.iFld -= (int)Test.fFld;
        for (i26 = 20; i26 < 351; i26++) {
            Test.iFld1 += (int)Test.instanceCount;
            Test.iFld1 += (int)961137892L;
            Test.iFld *= i2;
            i27 = i26;
            for (i28 = i26; i28 < 76; i28++) {
                d1 = 43262609L;
                for (i30 = 1; i30 < 1; ++i30) {
                    Test.iFld <<= i;
                    i29 -= (int)Test.instanceCount;
                    if (b2) {
                        i2 = i31;
                        d1 -= Test.iFld;
                        Test.fFld = i26;
                        Test.fFld *= -2;
                    } else {
                        lArr[i28 - 1] = Test.instanceCount;
                        dArrFld[i30][i28] = i26;
                        d1 = 29466;
                        Test.instanceCount += i27;
                    }
                    i2 = (int)Test.instanceCount;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
