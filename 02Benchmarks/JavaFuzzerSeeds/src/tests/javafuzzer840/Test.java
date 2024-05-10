package tests.javafuzzer840;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:52:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3339913866L;
    public float fFld=-84.168F;
    public static volatile boolean bFld=true;
    public static short sFld=-10717;
    public static double dFld=-19.55134;
    public static boolean bArrFld[]=new boolean[N];
    public volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public static long vMeth3_check_sum = 0;

    public static void vMeth1() {

        int i3=-3;

        i3 <<= (int)(Test.instanceCount++);
        vMeth1_check_sum += i3;
    }

    public static void vMeth3() {

        int i9=18061, i10=-30, i11=-229, i12=121, i13=-109, i14=-67, i15=74;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2125153747268893157L);

        Test.bFld = Test.bFld;
        Test.instanceCount = i9;
        for (i10 = 11; i10 < 307; ++i10) {
            i11 = i11;
            Test.instanceCount -= -43143;
            i9 += (i10 | i10);
            for (i12 = i10; 6 > i12; i12++) {
                float f=-114.621F;
                i11 = (int)Test.instanceCount;
                i9 -= (int)f;
                i9 = i10;
                for (i14 = 1; i14 < 1; ++i14) {
                    i11 *= i14;
                    i13 *= i14;
                    i13 += i14;
                    lArr[i14] += (long)1.104772;
                }
            }
        }
        vMeth3_check_sum += i9 + i10 + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth2(int i5, int i6) {

        int i7=20, i8=44784, i16=-14, i17=51907;
        float f1=2.174F;

        for (i7 = 2; i7 < 218; i7++) {
            vMeth3();
            i16 = 1;
            while (++i16 < 7) {
                double d1=-5.86899;
                d1 -= -75;
                Test.sFld >>= (short)i5;
                Test.instanceCount += 5949522064794239683L;
                i6 ^= (int)Test.instanceCount;
                f1 = i7;
                i5 = Test.sFld;
                i5 *= (int)f1;
                i6 = i5;
                i8 += i16;
            }
            i17 = 1;
            while (++i17 < 7) {
                i6 += (((i17 * i6) + i6) - i6);
                i8 += i17;
            }
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + i16 + Float.floatToIntBits(f1) + i17;
    }

    public void vMeth() {

        int i4=-11875, i18=-9, i19=-77, i20=71, i21=-63219, i22=60191, iArr[]=new int[N];
        float f2=0.158F;

        FuzzerUtils.init(iArr, -39921);

        vMeth1();
        vMeth1();
        i4 |= (int)((fFld * (-(-(++iArr[(i4 >>> 1) % N])))) * (--iArr[(-4 >>> 1) % N]));
        vMeth2(i4, -13);
        for (i18 = 1; i18 < 290; ++i18) {
            i4 *= Test.sFld;
            i19 &= i19;
        }
        for (i20 = 5; i20 < 152; ++i20) {
            i19 = i21;
            i4 <<= i4;
            Test.sFld += (short)(((i20 * fFld) + i18) - Test.instanceCount);
            for (f2 = 1; 11 > f2; ++f2) {
                iArr[(int)(f2 - 1)] >>= i18;
                iArr[(int)(f2 - 1)] += (int)Test.instanceCount;
                Test.dFld += 1963;
            }
        }
        vMeth_check_sum += i4 + i18 + i19 + i20 + i21 + Float.floatToIntBits(f2) + i22 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=2, i1=57129, i2=65450, i23=16877, i24=-111, i25=-10, i26=-150, i27=3, i28=7, i29=-4, i30=0;
        double d=-79.9127;
        byte by=45, byArr[]=new byte[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.595F);
        FuzzerUtils.init(byArr, (byte)40);

        i <<= (int)Test.instanceCount;
        for (i1 = 16; i1 < 370; i1 += 3) {
            d += Test.instanceCount;
            vMeth();
            fFld -= Test.instanceCount;
        }
        fArr[(i >>> 1) % N] -= i2;
        for (i23 = 11; i23 < 311; i23++) {
            i2 += (((i23 * Test.instanceCount) + Test.instanceCount) - i2);
            byArr = byArr;
            for (i25 = 84; i23 < i25; i25 -= 2) {
                Test.instanceCount >>= i24;
                i += (i25 * i25);
            }
            Test.instanceCount += (i23 * i23);
            for (i27 = 84; i27 > i23; i27 -= 2) {
                Test.instanceCount &= Test.instanceCount;
                switch ((i23 % 9) + 65) {
                case 65:
                case 66:
                    i28 += (int)d;
                    i >>= i2;
                    i24 = i2;
                    i24 += (((i27 * i27) + i1) - i23);
                    break;
                case 67:
                    Test.bArrFld[i23 - 1] = Test.bFld;
                    fArr = fArr;
                    break;
                case 68:
                    iArrFld[i23] <<= i1;
                    Test.instanceCount = i24;
                    break;
                case 69:
                    i26 = 251;
                case 70:
                    i26 ^= i25;
                    fArr = fArr;
                    for (i29 = 1; i29 < 1; i29 += 2) {
                        i2 += i26;
                        i28 = by;
                    }
                    break;
                case 71:
                    i += (int)(-1.812F + (i27 * i27));
                    break;
                case 72:
                    by += (byte)(((i27 * Test.instanceCount) + i29) - i2);
                    break;
                case 73:
                    Test.instanceCount += (long)(-79.947F + (i27 * i27));
                default:
                    try {
                        i28 = (iArrFld[i27 + 1] % i23);
                        iArrFld[i27] = (i23 / i24);
                        iArrFld[i23 + 1] = (-80 % i24);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth mainTest
//DEBUG  vMeth3 ->  vMeth3 vMeth2 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}