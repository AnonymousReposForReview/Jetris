package tests.javafuzzer2940;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 23:25:35 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8591569453891522354L;
    public static int iFld=29739;
    public static float fFld=-86.307F;
    public static int iFld1=-201;
    public static short sFld=-31459;
    public double dFld=31.76032;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static volatile byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 14);
        FuzzerUtils.init(Test.byArrFld, (byte)96);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i8) {

        int i9=165, i10=-184, i11=8;
        boolean b=true;
        float f4=-92.96F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 16356L);

        for (i9 = 14; i9 < 324; ++i9) {
            if (b) {
                Test.fFld += Test.instanceCount;
                i10 = i10;
            } else if (false) {
                try {
                    Test.iArrFld[i9] = (9 % i9);
                    i8 = (Test.iFld % i9);
                    Test.iFld = (i10 % 50412);
                } catch (ArithmeticException a_e) {}
                Test.iArrFld[i9 + 1] -= i10;
                i10 *= (int)Test.fFld;
            }
            Test.instanceCount -= Test.instanceCount;
            Test.iFld -= 0;
        }
        for (f4 = 13; f4 < 212; ++f4) {
            Test.fFld -= i8;
            Test.iArrFld[(int)(f4 + 1)] -= i8;
            i8 >>= 8;
            lArr[(int)(f4 + 1)] = Test.instanceCount;
        }
        Test.instanceCount -= Test.iFld;
        long meth_res = i8 + i9 + i10 + (b ? 1 : 0) + Float.floatToIntBits(f4) + i11 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(byte by) {

        float f2=-13.255F, f3=-63.194F, fArr[]=new float[N];
        int i5=210, i6=4, i7=-185;
        double d=2.92644, dArr[]=new double[N];
        short s1=15648;

        FuzzerUtils.init(fArr, -87.717F);
        FuzzerUtils.init(dArr, 80.64732);

        Test.instanceCount *= Test.iFld;
        by = (byte)37;
        f2 = (Test.iFld * (Test.iFld--));
        for (f3 = 19; 326 > f3; ++f3) {
            for (i6 = (int)(f3); 5 > i6; i6++) {
                by <<= (byte)(Test.iFld * ((++Test.instanceCount) + (f2 += 0)));
                if (((Test.iArrFld[(i7 >>> 1) % N] - iMeth(Test.iFld)) | i7) > i6) continue;
                d += Test.instanceCount;
                fArr[(int)(f3 + 1)] = -552508722L;
                Test.instanceCount *= Test.iFld;
            }
        }
        i5 <<= i6;
        dArr[(Test.iFld >>> 1) % N] += s1;
        Test.instanceCount = i5;
        i7 = i5;
        i5 -= (int)d;
        vMeth_check_sum += by + Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + i5 + i6 + i7 +
            Double.doubleToLongBits(d) + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static long lMeth() {

        int i3=2;
        short s=30459;
        byte by1=105;
        boolean b1=false, bArr[][]=new boolean[N][N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr1, -5398506989522681444L);

        Test.iArrFld[(i3 >>> 1) % N] += (int)(Test.instanceCount <<= (i3++));
        for (int i4 : Test.iArrFld) {
            i3 /= (int)((++s) | 1);
            i4 -= i3;
            vMeth(by1);
            b1 = b1;
            i3 &= Test.iFld;
            Test.instanceCount -= s;
            if (b1) break;
            if (b1) {
                bArr[(Test.iFld1 >>> 1) % N][(Test.iFld1 >>> 1) % N] = b1;
                Test.iFld1 = (int)-1533948980L;
            } else if (b1) {
                lArr1[(-175 >>> 1) % N] = Test.iFld1;
            } else {
                Test.iFld >>= Test.iFld;
                s -= (short)Test.instanceCount;
            }
        }
        long meth_res = i3 + s + by1 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-8, i1=-85, i2=33728, i12=-14, i13=-1, i14=2607, i15=19170, i16=208, i17=12, i18=-7, i19=-18, i20=-8,
            i21=173, i22=6336;
        float f=1.194F, f1=-1.305F, fArr1[][]=new float[N][N];

        FuzzerUtils.init(fArr1, 1.115F);

        for (i = 8; i < 330; ++i) {
            f *= (++i1);
        }
        for (f1 = 7; f1 < 145; f1++) {
            i2 += (int)((--i1) * (lMeth() * Test.instanceCount));
            for (i12 = (int)(f1); i12 < 182; ++i12) {
                Test.iFld += (134 + (i12 * i12));
            }
            f = 0.274F;
            Test.sFld = (short)i2;
            Test.iArrFld[(i2 >>> 1) % N] = (int)Test.instanceCount;
            Test.iFld *= i2;
        }
        for (i14 = 4; i14 < 161; i14++) {
            Test.instanceCount = Test.instanceCount;
            for (i16 = 5; i16 < 160; ++i16) {
                Test.iFld -= (int)dFld;
                Test.instanceCount += (i16 * i16);
                for (i18 = 1; i18 < 2; ++i18) {
                    fArr1[i14 - 1] = fArr1[i14 + 1];
                }
            }
            for (i20 = 7; 160 > i20; i20++) {
                Test.byArrFld = Test.byArrFld;
                i22 = 1;
                do {
                    i2 = i19;
                    f += Test.iFld;
                    i15 = -166;
                    if (Test.bFld) {
                        Test.iFld = (int)Test.instanceCount;
                        dFld = -1.92920;
                        dFld *= i;
                        Test.instanceCount += -8;
                    }
                    if (Test.bFld) continue;
                    Test.instanceCount += (((i22 * i1) + i18) - i17);
                } while (++i22 < 2);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}