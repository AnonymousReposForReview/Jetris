package tests.javafuzzer2563;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:39:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=41883L;
    public static short sFld=-12450;
    public static volatile double dFld=3.119335;
    public volatile float fFld=6.559F;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public void vMeth(double d, long l) {

        boolean b=false;

        b = b;
        vMeth_check_sum += Double.doubleToLongBits(d) + l + (b ? 1 : 0);
    }

    public static void vMeth2(byte by) {

        int i4=-59902, i5=38181, i6=28, i7=-1, i8=-175, i9=38712;
        float f=2.363F;
        double d2=-99.43142;

        i4 = 1;
        while (++i4 < 319) {
            i5 += i4;
            i5 >>= i4;
            Test.sFld += (short)(i4 * i4);
            for (i6 = i4; i6 < 5; ++i6) {
                i5 = i4;
                Test.instanceCount = (long)f;
                if (i5 != 0) {
                    vMeth2_check_sum += by + i4 + i5 + i6 + i7 + Float.floatToIntBits(f) + i8 + i9 +
                        Double.doubleToLongBits(d2);
                    return;
                }
                f *= i6;
                for (i8 = 1; i8 < 1; i8++) {
                    if (false) continue;
                }
                i9 = -6931;
                i9 -= (int)d2;
            }
            i9 *= i8;
        }
        i9 = i8;
        vMeth2_check_sum += by + i4 + i5 + i6 + i7 + Float.floatToIntBits(f) + i8 + i9 + Double.doubleToLongBits(d2);
    }

    public static void vMeth1(int i3, long l1) {

        int i10=4, i11=49177, i12=10, i13=10959, i14=-63008, i15=52445;
        float f1=28.666F;
        long lArr[]=new long[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(lArr, 1734450506382959655L);
        FuzzerUtils.init(bArr, true);

        vMeth2((byte)(-34));
        for (i10 = 10; i10 < 214; i10 += 3) {
            for (i12 = 1; i12 < 23; ++i12) {
                for (i14 = 1; i14 < 2; ++i14) {
                    lArr[i10 + 1] *= i13;
                    i11 += (i14 - f1);
                    i13 += (((i14 * Test.instanceCount) + i14) - i14);
                    bArr[i12 + 1] = true;
                }
                switch ((((i3 >>> 1) % 2) * 5) + 11) {
                case 12:
                    l1 += (((i12 * i3) + i13) - f1);
                    Test.dFld *= i12;
                    l1 = i14;
                    break;
                case 15:
                    i11 = (int)4602923776502487919L;
                    i13 += (i12 * i12);
                    break;
                default:
                }
                l1 += i12;
            }
        }
        vMeth1_check_sum += i3 + l1 + i10 + i11 + i12 + i13 + i14 + i15 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
    }

    public int iMeth(int i1, int i2) {


        vMeth1(i1, Test.instanceCount);
        long meth_res = i1 + i2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d1=-55.37853;
        int i=9, i16=38551, i17=45628, i18=0, i19=-10, i20=3, i21=35290, i22=-30563, i23=-174, i24=59905, i25=-240,
            i26=14, i27=50195, iArr[]=new int[N];
        boolean b1=false;

        FuzzerUtils.init(iArr, 113);

        vMeth(d1 -= Math.max(i, iMeth(i, i)), Test.instanceCount);
        i -= (int)fFld;
        for (i16 = 1; i16 < 185; ++i16) {
            for (i18 = 8; i18 < 136; i18++) {
                b1 = b1;
                fFld *= i16;
            }
            try {
                iArr[i16 - 1] = (i19 % i19);
                i = (i18 % iArr[i16 - 1]);
                i19 = (iArr[i16 - 1] % -77);
            } catch (ArithmeticException a_e) {}
            i19 += (((i16 * i) + i) - i16);
            Test.instanceCount = i16;
            for (i20 = 1; i20 < 136; ++i20) {
                i21 -= i17;
                i17 += i20;
                Test.dFld *= fFld;
                i17 += -2;
                i17 |= i20;
            }
            i19 = (int)Test.instanceCount;
            i += (int)(-53629L + (i16 * i16));
            try {
                i19 = (58294 / i);
                i17 = (i17 % 48207);
                iArr[i16] = (i / i16);
            } catch (ArithmeticException a_e) {}
            i19 += i19;
        }
        i19 -= (int)Test.instanceCount;
        i22 = 1;
        do {
            if (b1) break;
        } while (++i22 < 240);
        for (i23 = 12; i23 < 337; ++i23) {
            for (i25 = 77; i25 > 3; --i25) {
                Test.instanceCount *= (long)fFld;
                i27 = 1;
                do {
                    i19 += (i27 - i23);
                    iArr[i27 + 1] = i20;
                    if (b1) continue;
                    Test.dFld += 7;
                } while ((i27 += 3) < 2);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
