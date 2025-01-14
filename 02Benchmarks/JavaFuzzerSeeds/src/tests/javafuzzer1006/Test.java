package tests.javafuzzer1006;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:49:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=205L;
    public static float fFld=-3.363F;
    public static double dFld=0.120523;
    public static boolean bFld=false;
    public static byte byFld=73;
    public static volatile short sFld=-25375;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth1(float f, int i1) {

        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, 10);

        iArr[(i1 >>> 1) % N] *= (-(i1--));
        vMeth1_check_sum += Float.floatToIntBits(f) + i1 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth2(int i8) {

        int i9=5, i10=-227, i11=-11, i12=-13, i13=3, i14=-28893, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 32852);

        for (i9 = 352; i9 > 16; i9 -= 2) {
            for (i11 = i9; i11 < 9; ++i11) {
                Test.dFld *= 242;
                i12 = (int)Test.dFld;
                for (i13 = 1; i13 < 1; ++i13) {
                    i12 *= (int)Test.instanceCount;
                    if (Test.bFld) continue;
                }
                i12 += (-93 + (i11 * i11));
                i14 = -2;
            }
            i14 += i9;
            iArr1[i9 - 1] += (int)Test.instanceCount;
            if (true) break;
            i8 += i9;
            Test.fFld = i13;
        }
        i8 = 40254;
        vMeth2_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr1);
    }

    public static double dMeth(double d2, int i5, long l) {

        int i6=-250, i7=-3, i15=-55848, i16=-8, i17=202, i18=-4, iArr2[]=new int[N];
        short s=-23780;
        long l1=160L;

        FuzzerUtils.init(iArr2, -12);

        i5 = i5;
        for (i6 = 7; 212 > i6; ++i6) {
            vMeth2(i7);
            try {
                i5 = (i6 % i7);
                i7 = (i5 / -162);
                iArr2[i6 + 1] = (-51 / iArr2[i6 + 1]);
            } catch (ArithmeticException a_e) {}
            i5 <<= i6;
        }
        for (i15 = 8; i15 < 134; i15++) {
            i5 = -25;
            i16 += i17;
            i16 += i15;
            if (Test.bFld) {
                Test.instanceCount <<= i7;
            } else if (Test.bFld) {
                s >>= (short)-238;
                for (l1 = 1; l1 < 12; ++l1) {
                    l &= i5;
                    s = (short)Test.instanceCount;
                }
            } else {
                Test.byFld += (byte)(i15 + Test.fFld);
            }
        }
        long meth_res = Double.doubleToLongBits(d2) + i5 + l + i6 + i7 + i15 + i16 + i17 + s + l1 + i18 +
            FuzzerUtils.checkSum(iArr2);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth() {

        int i2=23, i3=-53811, i4=-12, i19=-152, i20=204;
        double d1=-2.124879, dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2218506035L);
        FuzzerUtils.init(dArr, 111.69680);

        vMeth1((-(Test.instanceCount - i2)) * lArr[(i2 >>> 1) % N], (int)((--Test.instanceCount) - ((i2 +
            Test.instanceCount) - Test.fFld)));
        dArr[(i2 >>> 1) % N] -= d1;
        i2 *= (int)(Test.instanceCount = (long)((i2 + d1) - Math.min(Test.instanceCount, 1L)));
        i3 = 1;
        while (++i3 < 189) {
            i4 = 1;
            do {
                i2 >>= i4;
                i2 += (i4 * i4);
                i2 -= (int)(((-11 - (i3 - i3)) + (d1 + i2)) + (-74 | i4));
                i2 -= (i2 -= i3);
                i2 += (int)((dMeth(d1, i3, Test.instanceCount) * i3) * Test.fFld);
            } while (++i4 < 8);
            i2 = i4;
            for (i19 = 1; i19 < 8; ++i19) {
                Test.sFld >>>= (short)i2;
                lArr[i19 + 1] += -13L;
                lArr[i19] = -76;
            }
        }
        vMeth_check_sum += i2 + Double.doubleToLongBits(d1) + i3 + i4 + i19 + i20 + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=1, i21=3, i22=1, i23=22464, i24=-49, i25=-25005, i26=22, i27=-162, i28=14529, i29=-38735, i30=-174,
            i31=-126, i32=-11275, iArr3[]=new int[N];
        double d=0.40034;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr3, 36113);
        FuzzerUtils.init(lArr1, -3686432546197853898L);

        i = (int)((i--) + ((--i) - (-(i * d))));
        vMeth();
        i21 = 1;
        do {
            i += (i21 + i22);
            for (i23 = 2; 175 > i23; ++i23) {
                for (i25 = 2; i21 < i25; i25--) {
                    if (Test.bFld) continue;
                    iArr3 = iArr3;
                    Test.fFld -= -956887765L;
                    i26 += (((i25 * i) + i26) - i24);
                    iArr3 = iArr3;
                }
                Test.instanceCount += i23;
                iArr3[i23] = (int)108.425F;
                i24 = (int)d;
            }
            i26 = i25;
            for (i27 = i21; i27 < 175; i27++) {
                i22 -= (int)Test.instanceCount;
            }
            for (i29 = 175; 5 < i29; i29--) {
                for (i31 = 1; i31 < 2; i31++) {
                    lArr1[i29] *= Test.instanceCount;
                    lArr1[i21 + 1] += i29;
                    iArr3[i29 + 1] ^= -13;
                    if (Test.bFld) {
                        i26 += i31;
                    } else if (true) {
                        Test.instanceCount = i27;
                        i32 -= (int)Test.dFld;
                        i28 = i23;
                    } else if (Test.bFld) {
                        Test.dFld += -16618;
                        iArr3[i29] = (int)Test.instanceCount;
                        Test.sFld *= (short)Test.instanceCount;
                    }
                }
            }
        } while (++i21 < 143);


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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
