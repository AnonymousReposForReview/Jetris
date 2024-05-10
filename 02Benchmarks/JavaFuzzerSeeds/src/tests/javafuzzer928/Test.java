package tests.javafuzzer928;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:49:57 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=2913L;
    public static byte byFld=-121;
    public static int iFld=-9;
    public static long lFld=-1103760955452382974L;
    public static short sFld=20457;
    public volatile boolean bFld=false;
    public static volatile int iArrFld[]=new int[N];
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -2);
        FuzzerUtils.init(Test.dArrFld, 100.125751);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth1(byte by, int i5, long l) {

        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -14L);

        i5 = (int)(lArr[(i5 >>> 1) % N] | (Test.instanceCount--));
        i5 -= i5;
        vMeth1_check_sum += by + i5 + l + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth2(int i6) {

        int i7=-2, i8=7, i9=-245, i10=154, i11=-33849, i12=99, i13=-46644;
        short s=26875;

        i6 = i6;
        i6 -= i6;
        i7 = 392;
        while (--i7 > 0) {
            i6 %= (int)(Test.instanceCount | 1);
            i6 = s;
            i6 = (int)-6039320446471677408L;
            i6 += (((i7 * i6) + i6) - i7);
            for (i8 = 1; i8 < 4; i8++) {
                i6 = i9;
                for (i10 = 1; i10 < 2; i10++) {
                    i11 += i10;
                }
                for (i12 = 1; i12 < 2; i12++) {
                    i6 += (i12 * i12);
                }
                Test.iArrFld[i7 - 1] = -211;
                Test.instanceCount -= i12;
            }
        }
        vMeth2_check_sum += i6 + i7 + s + i8 + i9 + i10 + i11 + i12 + i13;
    }

    public static int iMeth() {

        int i14=-42691, i15=-1, i16=59307, i17=7, i18=-40, i19=95;
        float f1=25.115F;
        boolean b=true;
        short s1=22490;
        double d=-74.21231;

        vMeth2(47218);
        for (i14 = 1; i14 < 283; i14++) {
            switch (((i15 >>> 1) % 6) + 68) {
            case 68:
            case 69:
                i15 -= (int)77.64F;
                if (true) {
                    for (i16 = i14; i16 < 6; i16++) {
                        try {
                            i15 = (4517 / i14);
                            Test.iArrFld[i14 - 1] = (-248 % Test.iFld);
                            Test.iFld = (-15260 / i16);
                        } catch (ArithmeticException a_e) {}
                        Test.instanceCount = (long)f1;
                        for (i18 = i14; i18 < 1; ++i18) {
                            Test.iFld = i18;
                            Test.iArrFld[i18 + 1] += i15;
                            Test.iFld >>= 37471;
                            if (i17 != 0) {
                            }
                            Test.byFld = (byte)Test.instanceCount;
                            Test.byFld >>= Test.byFld;
                        }
                    }
                } else if (b) {
                    i19 -= i18;
                } else if (b) {
                    Test.instanceCount -= Test.iFld;
                }
                break;
            case 70:
                Test.instanceCount -= Test.instanceCount;
                break;
            case 71:
                s1 <<= (short)i15;
                break;
            case 72:
                d -= Test.instanceCount;
                break;
            case 73:
                Test.iFld ^= (int)Test.lFld;
            }
        }
        long meth_res = i14 + i15 + i16 + i17 + Float.floatToIntBits(f1) + i18 + i19 + (b ? 1 : 0) + s1 +
            Double.doubleToLongBits(d);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, float f, int i1) {

        int i2=39, i3=-3145, i4=-47567, i20=6, i21=-56349;
        boolean b1=false, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        i2 = 1;
        while (++i2 < 255) {
            switch ((i2 % 9) + 68) {
            case 68:
                for (i3 = 1; 6 > i3; i3++) {
                    i1 = Math.max((int)((--i1) * (i2 * Test.instanceCount)), 12);
                    i4 = (int)Test.instanceCount;
                    f -= (((Test.iArrFld[i2 + 1] += i4) + (i2 + i)) + ((-(f++)) - (i1 + -4)));
                    i1 += (i3 * i3);
                    vMeth1(Test.byFld, (Integer.reverseBytes(145) * (i++)) * i3, Test.instanceCount);
                    i = (int)((++f) - (iMeth() - Test.lFld));
                    for (i20 = 1; i20 < 2; i20 += 3) {
                        bArr[i2 + 1] = true;
                        if (i != 0) {
                            vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + i2 + i3 + i4 + i20 + i21 + (b1 ? 1 :
                                0) + FuzzerUtils.checkSum(bArr);
                            return;
                        }
                        Test.iFld -= (int)f;
                        Test.lFld += i4;
                        i4 <<= i4;
                    }
                }
            case 69:
                if (b1) break;
            case 70:
                i = 0;
                break;
            case 71:
                Test.iArrFld[i2] *= Test.sFld;
            case 72:
                f = i2;
            case 73:
                Test.lFld <<= i;
                break;
            case 74:
                Test.iFld <<= i20;
            case 75:
            case 76:
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + i2 + i3 + i4 + i20 + i21 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        float f2=-28.403F;
        long l1=27994L, lArr1[]=new long[N];
        int i22=1, i23=17, i24=48, i25=10, i26=208, i27=0, i28=16017;

        FuzzerUtils.init(lArr1, 1500962995L);

        vMeth(Test.iFld, f2, Test.iFld);
        for (l1 = 14; l1 < 272; l1++) {
            i23 = 1;
            do {
                Test.iArrFld[i23] = Test.iFld;
                i22 += (i23 * i23);
                i22 += (int)f2;
                bFld = false;
                i22 *= i22;
                lArr1[(int)(l1)] += Test.iFld;
                i24 = 1;
                while (++i24 < 1) {
                    Test.instanceCount <<= Test.iFld;
                    Test.iFld <<= i22;
                    Test.iFld += i24;
                    i22 = i22;
                    f2 += (((i24 * Test.lFld) + i22) - i22);
                    if (bFld) continue;
                }
                f2 += (i23 * i23);
            } while (++i23 < 97);
            i25 = 1;
            while (++i25 < 97) {
                f2 -= i23;
                for (i26 = 1; i26 < 1; i26++) {
                    Test.lFld -= l1;
                    Test.instanceCount = l1;
                    Test.sFld += (short)(i26 - f2);
                    Test.iFld = i22;
                    i27 = i22;
                    i22 *= (int)f2;
                    switch (((i26 % 3) * 5) + 38) {
                    case 48:
                        if (bFld) break;
                        i27 *= i28;
                        break;
                    case 45:
                        Test.dArrFld[(int)(l1)] *= i23;
                        break;
                    case 40:
                        i22 = (int)-3L;
                    default:
                        Test.instanceCount += l1;
                    }
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}