package tests.javafuzzer1803;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 03:26:37 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=0L;
    public static boolean bFld=true;
    public static short sFld=-7462;
    public static volatile double dFld=-1.126279;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -12);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long bMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i3, int i4, int i5) {

        double d=56.34902, dArr[]=new double[N];
        int i6=4, i7=-7, i8=12, i9=-8046, i10=196, i11=-8, i12=72, i13=58777, iArr[][]=new int[N][N];
        float f1=-2.774F;

        FuzzerUtils.init(dArr, 52.113050);
        FuzzerUtils.init(iArr, -28724);

        d += d;
        for (i6 = 11; i6 < 373; i6++) {
            f1 += i4;
            dArr[i6 - 1] = Test.instanceCount;
            i4 /= (int)(i4 | 1);
            for (i8 = 1; i8 < 5; ++i8) {
                i4 += i7;
                i7 *= (int)Test.instanceCount;
                for (i10 = 1; i10 < 2; ++i10) {
                    i5 = i9;
                }
                iArr[i6][i8 + 1] = i10;
                for (i12 = 1; i12 < 2; ++i12) {
                    if (i7 != 0) {
                        vMeth_check_sum += i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 +
                            Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12 + i13 +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    i3 <<= (int)Test.instanceCount;
                    i7 >>>= 4;
                }
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 +
            i10 + i11 + i12 + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth() {

        int i14=45720;

        vMeth(i14, i14, 32917);
        long meth_res = i14;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static boolean bMeth() {

        int i=205, i1=51303, i2=3, i15=205, iArr1[]=new int[N];
        float f=0.1002F;

        FuzzerUtils.init(iArr1, 35701);

        Test.bFld = false;
        for (i = 352; 1 < i; --i) {
            i2 = 1;
            while (++i2 < 5) {
                i1 /= (int)(Test.instanceCount | 1);
                i1 = (int)((++f) + ((i1 + Test.instanceCount) - iMeth()));
                i1 += (i2 * i2);
                try {
                    i1 = (i2 % -21245);
                    i1 = (i1 % i1);
                    iArr1[i] = (-46986 / i2);
                } catch (ArithmeticException a_e) {}
                i15 = 1;
                do {
                    i1 &= (int)Test.instanceCount;
                    Test.sFld = (short)i;
                } while (++i15 < 1);
            }
            i1 = i;
            i1 += i1;
            i1 += (int)Test.instanceCount;
            i1 = i2;
            Test.dFld -= i;
        }
        long meth_res = i + i1 + i2 + Float.floatToIntBits(f) + i15 + FuzzerUtils.checkSum(iArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i16=-12, i17=-11, i18=-152, i19=10, i20=21323, i21=-1, i22=-85, i23=-173, iArr2[]=new int[N];
        float f2=-8.350F, fArr[]=new float[N];
        long l=2540060238L;
        byte byArr[]=new byte[N];
        short sArr[]=new short[N];
        double dArr1[]=new double[N];

        FuzzerUtils.init(fArr, 55.527F);
        FuzzerUtils.init(byArr, (byte)60);
        FuzzerUtils.init(sArr, (short)-29339);
        FuzzerUtils.init(iArr2, 9149);
        FuzzerUtils.init(dArr1, -2.27414);

        bMeth();
        for (i16 = 7; i16 < 315; ++i16) {
            i17 = -4;
            for (i18 = 2; 82 > i18; i18++) {
                Test.instanceCount = Test.instanceCount;
                f2 *= i17;
                Test.iArrFld = Test.iArrFld;
                Test.instanceCount *= -3042;
                fArr[i18] *= i17;
                i19 += (((i18 * i18) + i16) - i18);
            }
            for (l = 2; l < 82; ++l) {
                if (Test.bFld) {
                    Test.iArrFld[(int)(l + 1)] <<= i19;
                    i21 = 2;
                    while ((i21 -= 2) > 0) {
                        i19 = (int)Test.instanceCount;
                        Test.bArrFld = Test.bArrFld;
                        i17 -= (int)l;
                        Test.iArrFld[i21] += (int)Test.instanceCount;
                        fArr[i16 - 1] *= f2;
                        byArr[i21 - 1] /= (byte)(l | 1);
                        i20 += i21;
                        i19 += (-789 + (i21 * i21));
                        sArr[(int)(l + 1)] *= (short)i20;
                    }
                    switch ((int)((l % 1) + 73)) {
                    case 73:
                        i20 *= (int)l;
                        break;
                    default:
                        for (i22 = 1; i22 < 2; i22++) {
                            Test.iArrFld[(int)(l + 1)] >>= i20;
                            i23 = (int)f2;
                            try {
                                i20 = (iArr2[i22] % iArr2[i16]);
                                i17 = (i18 / -26555);
                                i20 = (i18 / i16);
                            } catch (ArithmeticException a_e) {}
                            dArr1[(int)(l)] *= Test.instanceCount;
                        }
                    }
                } else if (Test.bFld) {
                    i23 = i19;
                } else {
                    i23 += (int)(l | (long)f2);
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  iMeth ->  iMeth bMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}