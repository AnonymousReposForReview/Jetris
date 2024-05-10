package tests.javafuzzer2883;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 22:11:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=115610905L;
    public static int iFld=-36146;
    public byte byFld=-35;
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[][]=new byte[N][N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -1);
        FuzzerUtils.init(Test.byArrFld, (byte)97);
        FuzzerUtils.init(Test.lArrFld, 744127189L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i11, byte by, double d) {

        int i12=69, i13=-28190, i15=-231, i16=-81, i17=36923;
        float f=0.555F;
        short s1=-11445;

        for (i12 = 216; 13 < i12; --i12) {
            Test.instanceCount -= (long)f;
            for (i15 = 1; i15 < 8; i15++) {
                d *= i11;
                Test.iFld >>= i12;
                Test.iFld = 27383;
                i11 *= s1;
                i17 = 1;
                while (++i17 < 2) {
                    boolean b=false;
                    f *= i17;
                    s1 -= (short)Test.iFld;
                    if (b) continue;
                    i11 <<= by;
                    Test.iArrFld[i17] >>= (int)Test.instanceCount;
                    d = i12;
                    if (i12 != 0) {
                    }
                }
            }
        }
        long meth_res = i11 + by + Double.doubleToLongBits(d) + i12 + i13 + Float.floatToIntBits(f) + i15 + i16 + s1 +
            i17;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i6=4, i7=-54, i8=95, i9=4, i10=226, i18=-212;
        byte by1=-3;
        double d1=1.21042;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 68.867F);

        Test.iFld = (int)((Test.iFld - Test.iFld) + (Test.iFld * (Test.instanceCount + Test.iFld)));
        i6 = 1;
        while (++i6 < 233) {
            for (i7 = 1; i7 < 7; i7++) {
                i8 = (int)(-(i8 -= (int)(i6 - 0L)));
                for (i9 = 2; i9 > 1; --i9) {
                    Test.iFld += (i9 * i9);
                    switch (((iMeth(i7, by1, d1) >>> 1) % 2) + 115) {
                    case 115:
                        Test.iArrFld[i7 + 1] = i7;
                        Test.byArrFld = Test.byArrFld;
                        i8 = (int)2496182981L;
                        break;
                    case 116:
                        try {
                            Test.iArrFld[i7] = (25 % Test.iFld);
                            Test.iFld = (i18 / -33536);
                            i8 = (-200 / Test.iFld);
                        } catch (ArithmeticException a_e) {}
                        Test.iArrFld[i9] = i9;
                        i8 -= i7;
                    default:
                        Test.instanceCount = i8;
                    }
                    fArr[(24815 >>> 1) % N] = i10;
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + i10 + by1 + Double.doubleToLongBits(d1) + i18 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i2, int i3, short s) {

        int i4=0, i5=-25342, i19=-22, i20=39169, i21=0;
        float f1=-1.337F;
        double d2=0.41148, dArr[]=new double[N];
        boolean b1=false;

        FuzzerUtils.init(dArr, -2.73575);

        Test.iArrFld[(i2 >>> 1) % N] -= (Test.iFld++);
        for (i4 = 8; i4 < 221; ++i4) {
            switch ((i4 % 9) + 83) {
            case 83:
            case 84:
                vMeth1();
                f1 -= i2;
                dArr[i4 + 1] += d2;
            case 85:
                i19 = 8;
                do {
                    for (i20 = 3; i20 > 1; i20 -= 3) {
                        i2 ^= -131;
                        i5 *= i2;
                        f1 += (i20 * Test.instanceCount);
                        try {
                            i3 = (247 % Test.iFld);
                            i5 = (Test.iFld / 61758);
                            Test.iArrFld[i20 + 1] = (i21 % 118);
                        } catch (ArithmeticException a_e) {}
                        f1 *= Test.instanceCount;
                    }
                    d2 -= i4;
                    if (b1) continue;
                } while ((i19 -= 3) > 0);
                break;
            case 86:
                i21 -= (int)Test.instanceCount;
                break;
            case 87:
                Test.lArrFld[i4 + 1] = -4;
                break;
            case 88:
                Test.iArrFld[i4] = i5;
                break;
            case 89:
                Test.iFld += (int)d2;
                break;
            case 90:
                Test.instanceCount ^= 19;
            case 91:
                i21 = (int)Test.instanceCount;
            default:
                i2 += i4;
            }
        }
        vMeth_check_sum += i2 + i3 + s + i4 + i5 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d2) + i19 + i20 +
            i21 + (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-160, i1=-239, i22=9, i23=-15036, i24=62869, i25=-7, i26=15, i27=-67, i28=6, i29=-2, i30=22136, i31=41847;
        short s2=32134;
        float f2=46.496F, f3=2.893F;
        double d3=-81.46030, d4=2.30486;
        boolean b2=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -3379929399504500057L);

        Test.iArrFld[(i >>> 1) % N] = (int)lArr[(i1 >>> 1) % N];
        vMeth(i, i1, s2);
        f2 += Test.instanceCount;
        Test.instanceCount += 65;
        i1 += Test.iFld;
        Test.iArrFld[(-10 >>> 1) % N] &= (int)703661789L;
        for (d3 = 5; d3 < 383; ++d3) {
            for (f3 = 2; f3 < 67; f3++) {
                Test.instanceCount += (long)(f3 - i22);
                i23 *= byFld;
            }
            for (i24 = 67; i24 > d3; i24 -= 2) {
                byFld += (byte)f3;
                for (i26 = 1; 1 > i26; ++i26) {
                    Test.instanceCount += (-116L + (i26 * i26));
                    Test.iArrFld[i26] -= i;
                    i1 = i25;
                }
                Test.iFld ^= i26;
                Test.iArrFld[i24] *= (int)-57178L;
                Test.iFld += (i24 - i25);
                i >>>= i26;
                for (i28 = 1; i28 < 1; ++i28) {
                    i29 = Test.iFld;
                }
                for (i30 = 1; i30 > 1; --i30) {
                    i *= i30;
                    d4 = i;
                    i23 = (int)2.52343;
                    Test.iArrFld[i30 + 1] *= (int)f3;
                    if (b2) continue;
                    Test.iFld += (((i30 * Test.iFld) + f3) - i24);
                    try {
                        Test.iArrFld[(int)(d3 + 1)] = (i % i1);
                        i29 = (i30 % 3224);
                        Test.iFld = (i25 / Test.iArrFld[i24 - 1]);
                    } catch (ArithmeticException a_e) {}
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}