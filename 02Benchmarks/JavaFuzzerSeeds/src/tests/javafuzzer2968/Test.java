package tests.javafuzzer2968;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:02:31 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=755849393L;
    public static int iFld=-189;
    public static double dFld=1.121178;
    public static boolean bFld=true;
    public static float fFld=2.886F;
    public static volatile long lArrFld[][]=new long[N][N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 5550961632811570480L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i4) {

        int i5=102, i6=-59604, i7=-189, i8=27262;
        float f=80.410F;

        for (i5 = 11; i5 < 391; ++i5) {
            for (i7 = 4; i7 > 1; i7 -= 3) {
                f = i8;
                Test.iFld += (int)Test.instanceCount;
                Test.instanceCount += (-44112 + (i7 * i7));
                if (false) continue;
                i8 >>= (int)0L;
                i6 -= (int)0L;
                i8 -= (int)Test.instanceCount;
                Test.dFld = -2183934524L;
            }
            i8 = i7;
            Test.lArrFld[i5][i5 + 1] += Test.instanceCount;
            if (i4 != 0) {
            }
            Test.instanceCount = i7;
            i6 += i7;
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i9=-23619, i10=729, i12=-37, i13=-51178, i14=-11, i15=-4, iArr1[]=new int[N];
        float f1=0.795F;
        long lArr[]=new long[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(lArr, -2L);
        FuzzerUtils.init(iArr1, 105);
        FuzzerUtils.init(bArr, true);

        lArr[(Test.iFld >>> 1) % N] ^= lMeth(Test.iFld);
        for (i9 = 3; i9 < 347; i9++) {
            switch ((((-223 >>> 1) % 2) * 5) + 113) {
            case 116:
            case 122:
                i10 = Test.iFld;
                break;
            default:
                for (i12 = 1; i12 < 5; i12++) {
                    i10 = Test.iFld;
                    i14 = 1;
                    do {
                        i13 = i9;
                        Test.iFld += (i14 + Test.instanceCount);
                        iArr1[i12 + 1] += (int)-157L;
                        Test.iFld += (i14 - i9);
                        switch (((-63061 >>> 1) % 9) + 15) {
                        case 15:
                            bArr[i14] = Test.bFld;
                            i15 = (int)Test.dFld;
                            f1 -= -11;
                        case 16:
                            iArr1[(-173 >>> 1) % N] += i12;
                            break;
                        case 17:
                            i15 *= i13;
                            break;
                        case 18:
                            i15 += i14;
                            break;
                        case 19:
                            i15 += i14;
                            break;
                        case 20:
                            Test.instanceCount -= i14;
                        case 21:
                            lArr[i12 - 1] = Test.iFld;
                        case 22:
                            Test.instanceCount = 15221L;
                        case 23:
                            i15 >>>= i9;
                            break;
                        }
                    } while (++i14 < 2);
                }
            }
        }
        vMeth1_check_sum += i9 + i10 + i12 + i13 + i14 + i15 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(byte by) {

        int i=-231, i1=-160, i2=-1627, i3=7790, i16=15284, i17=54008, i18=32895, i19=10852, i20=22129, iArr[]=new
            int[N];
        short s=-18697;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 110.16855);
        FuzzerUtils.init(iArr, 19399);

        dArr[(Test.iFld >>> 1) % N] = (((Test.iFld++) * Float.intBitsToFloat(Test.iFld)) - (iArr[(193 >>> 1) % N] +
            Test.iFld));
        for (i = 13; 358 > i; i++) {
            for (i2 = 1; i2 < 5; i2 += 3) {
                vMeth1();
                Test.iFld -= 22082;
                Test.iFld <<= i2;
                iArr[i2 - 1] -= -61;
            }
            Test.fFld = i3;
            for (i16 = 1; i16 < 5; i16 += 2) {
                i3 = i1;
            }
            s += (short)165;
        }
        i18 >>= s;
        for (i19 = 4; 353 > i19; i19++) {
            if (i3 != 0) {
                vMeth_check_sum += by + i + i1 + i2 + i3 + i16 + i17 + s + i18 + i19 + i20 +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
                return;
            }
            Test.instanceCount -= (long)Test.fFld;
        }
        vMeth_check_sum += by + i + i1 + i2 + i3 + i16 + i17 + s + i18 + i19 + i20 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        byte by1=13;
        int i21=-8, i22=-63911;

        vMeth(by1);
        for (double d : dArrFld) {
            Test.instanceCount -= 96;
        }
        Test.iFld = -23801;
        for (i21 = 1; i21 < 197; i21++) {
            i22 -= 63121;
        }
        Test.instanceCount *= Test.instanceCount;



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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
