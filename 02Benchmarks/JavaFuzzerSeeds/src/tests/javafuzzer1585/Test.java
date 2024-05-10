package tests.javafuzzer1585;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:23:49 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-14L;
    public volatile int iFld=-26611;
    public short sFld=-29799;
    public static float fFld=17.68F;
    public static int iFld1=-12;
    public static double dFld=-113.70141;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -76);
        FuzzerUtils.init(Test.fArrFld, 7.519F);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i11=190, i12=32059, i13=-118, i14=154, i15=-171, i16=104, i17=48806, i18=-211;
        boolean b=false;

        i11 = i11;
        for (i12 = 5; i12 < 161; i12++) {
            if (b) continue;
            for (i14 = 1; i14 < 10; i14++) {
                i16 = 1;
                while (++i16 < 2) {
                    Test.instanceCount = i15;
                    if (b) break;
                    i13 = i15;
                }
            }
            for (i17 = i12; i17 < 10; i17 += 2) {
                i18 &= i16;
                Test.iArrFld[i12 + 1] |= i17;
                i18 = (int)Test.instanceCount;
                Test.fFld += (i17 - i14);
                Test.instanceCount *= i13;
                i13 += i17;
            }
        }
        vMeth1_check_sum += i11 + i12 + i13 + (b ? 1 : 0) + i14 + i15 + i16 + i17 + i18;
    }

    public static void vMeth() {

        int i10=-4, i19=-30845, i20=-49891, i21=2, i22=-63;
        float f1=2.447F;
        double d1=-98.99759;

        i10 = (int)(++Test.instanceCount);
        vMeth1();
        for (f1 = 358; f1 > 8; f1--) {
            i19 %= (int)(i19 | 1);
            Test.iArrFld[(int)(f1)] += (int)Test.fFld;
            i19 += (int)(f1 * f1);
            Test.fArrFld = Test.fArrFld;
            for (i20 = 1; i20 < 5; ++i20) {
                for (d1 = 1; d1 < 2; ++d1) {
                    i22 += (int)d1;
                    i22 += (int)((long)d1 | i10);
                    i21 += (int)(d1 * d1);
                }
                i19 = i19;
            }
            i21 += (int)(f1 + Test.iFld1);
            Test.fFld *= i10;
        }
        vMeth_check_sum += i10 + Float.floatToIntBits(f1) + i19 + i20 + i21 + Double.doubleToLongBits(d1) + i22;
    }

    public static float fMeth() {

        int i6=123, i7=-42429, i8=49677, i23=8, i24=-19603, i25=-97, i26=-14484, iArr1[]=new int[N];
        short s=-23312;
        byte by1=-66;
        long l1=-4L;

        FuzzerUtils.init(iArr1, 52747);

        i6 += ((s <<= (short)(++i6)) * Math.min(i6 += i6, i6--));
        by1 -= (byte)(i6 + i6);
        Test.instanceCount >>>= i6;
        for (i7 = 8; i7 < 137; i7++) {
            vMeth();
            i8 += (i7 - Test.instanceCount);
        }
        Test.fFld -= i8;
        for (i23 = 2; i23 < 266; ++i23) {
            for (i25 = 1; i25 < 6; i25++) {
                Test.fArrFld[i23 - 1] += i6;
                i26 += (i25 * i25);
                l1 = 1;
                while (++l1 < 2) {
                    i26 -= i26;
                }
                Test.iFld1 += (i25 * l1);
                Test.iArrFld[i25 + 1] *= (int)Test.dFld;
            }
        }
        long meth_res = i6 + s + by1 + i7 + i8 + i23 + i24 + i25 + i26 + l1 + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=96, i1=-174, i2=15002, i3=14, i4=-1186, i5=1, i27=238, i28=591, iArr[]=new int[N];
        float f=-83.340F;
        byte by=-60;
        double d=94.8861;
        long l=8L, lArr[]=new long[N];
        boolean b1=false;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, 170);
        FuzzerUtils.init(lArr, -4783988975802834496L);
        FuzzerUtils.init(sArr, (short)9068);

        iArr[(iFld >>> 1) % N] ^= (int)lArr[(iFld >>> 1) % N];
        if (b1) {
            i = 1;
            while (++i < 383) {
                iArr[i - 1] = (int)-8918031661415799923L;
                iArr[i] <<= Math.max((int)((iFld = (int)Test.instanceCount) + (f * by)), iFld - (++iFld));
                iFld ^= (sFld += (short)(++iFld));
                i1 = 1;
                while (++i1 < 66) {
                    for (i2 = i; 1 > i2; ++i2) {
                        iFld -= (int)(-((++iArr[i2]) ^ (long)(d + i1)));
                        f += (((i2 * l) + l) - iFld);
                        i3 = iArr[i1];
                        iArr[i2] *= (++by);
                    }
                    for (i4 = 1; i4 < 1; i4++) {
                        by += (byte)(i4 * i4);
                        i5 *= (int)(fMeth() + i2);
                        iFld -= i5;
                    }
                    for (i27 = 1; i27 < 1; ++i27) {
                        Test.instanceCount += 14L;
                        sFld += (short)(i27 - i5);
                        b1 = b1;
                        Test.iArrFld[i] -= i3;
                    }
                    i5 &= Test.iFld1;
                    iFld -= (int)Test.dFld;
                    Test.instanceCount = i4;
                }
                switch (((248 >>> 1) % 2) + 111) {
                case 111:
                    switch ((i % 4) + 49) {
                    case 49:
                        iArr[i + 1] >>>= i3;
                        i3 += (i + i5);
                        iFld += i;
                        break;
                    case 50:
                        b1 = b1;
                        break;
                    case 51:
                        i28 += (int)Test.instanceCount;
                        break;
                    case 52:
                        Test.fFld += iFld;
                        break;
                    default:
                        sArr[i] = (short)i4;
                    }
                case 112:
                }
            }
        } else {
            iArr[(i1 >>> 1) % N] /= (int)(i | 1);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}