package tests.javafuzzer1086;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:16:24 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-617325247L;
    public static int iFld=-13;
    public static boolean bFld=true;
    public int iFld1=47919;
    public static float fFld=-72.539F;
    public static volatile float fArrFld[]=new float[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 22.440F);
        FuzzerUtils.init(Test.dArrFld, 1.52848);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i2=-156, i3=46836, i4=-54154, i5=13, i6=-92;
        float f=107.852F, fArr[]=new float[N];
        double d1=1.109227;
        short s=-9990;

        FuzzerUtils.init(fArr, -110.1F);

        i2 = 165;
        while ((i2 -= 2) > 0) {
            for (i3 = 1; i3 < 19; ++i3) {
                f = 1;
                do {
                    i4 = i3;
                    i4 = Test.iFld;
                    i4 -= i4;
                    i4 *= i3;
                    Test.iFld = -31697;
                    i4 <<= -20027;
                    Test.instanceCount = i3;
                    if (Test.bFld) break;
                    i4 -= i4;
                } while (++f < 2);
                for (i5 = 1; i5 < 2; i5++) {
                    d1 -= s;
                }
                fArr[i3] -= (float)-113.36868;
            }
        }
        long meth_res = i2 + i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + Double.doubleToLongBits(d1) + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i=-11, i1=12, i7=32892, i8=-59646, i9=-29143, i10=-22, iArr1[]=new int[N];
        float f1=-2.451F;

        FuzzerUtils.init(iArr1, 112);

        Test.iFld -= (int)(((-(-(Test.iFld * Test.instanceCount))) - 114L) + ((--iArr1[(Test.iFld >>> 1) % N]) +
            (Test.instanceCount--)));
        for (i = 6; 138 > i; i++) {
            iArr1[i - 1] -= (int)(((Test.instanceCount - 6L) * (i - Test.iFld)) - (lMeth() + f1));
            i1 += i;
            i1 -= i;
            for (i7 = 1; i7 < 12; i7 += 3) {
                iArr1[i] *= i8;
                Test.instanceCount = Test.instanceCount;
                for (i9 = 1; 4 > i9; i9++) {
                    i1 *= 225;
                    if (Test.bFld) {
                        Test.bFld = true;
                        Test.iFld -= i10;
                    } else if (Test.bFld) {
                        Test.iFld = (int)Test.instanceCount;
                        Test.instanceCount -= i9;
                    } else if (Test.bFld) {
                        if (Test.bFld) break;
                    } else {
                        Test.instanceCount += (((i9 * i7) + i8) - i8);
                    }
                }
            }
        }
        vMeth1_check_sum += i + i1 + Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth() {

        double d=0.9287, dArr[]=new double[N];
        int i11=-20465, i12=32837, i13=-8, i14=-54712, i15=253, i16=-48245, i17=8, iArr[]=new int[N];
        long l=1911770933L;

        FuzzerUtils.init(iArr, -63);
        FuzzerUtils.init(dArr, 0.19073);

        Test.iFld &= (int)((iArr[(5 >>> 1) % N] >>= (Test.iFld - Test.iFld)) - (d + Math.min(Test.instanceCount, 87L)));
        Test.instanceCount = (long)(-d);
        vMeth1();
        Test.iFld -= (int)Test.instanceCount;
        for (i11 = 6; 333 > i11; ++i11) {
            for (i13 = 5; i13 > i11; --i13) {
                Test.instanceCount -= i11;
                for (i15 = 1; i15 < 1; i15 += 3) {
                    i14 += (((i15 * i16) + Test.instanceCount) - Test.instanceCount);
                }
                i16 = i13;
                i17 = 1;
                while (--i17 > 0) {
                    float f2=-75.703F;
                    switch ((((i13 >>> 1) % 8) * 5) + 107) {
                    case 145:
                        iArr[i17 - 1] *= i14;
                        dArr = FuzzerUtils.double1array(N, (double)0.9612);
                    case 124:
                        Test.instanceCount += (((i17 * i16) + Test.instanceCount) - i12);
                        break;
                    case 118:
                        Test.instanceCount = 174;
                    case 123:
                        l += -136007630L;
                        break;
                    case 119:
                        l += (long)(-68.460F + (i17 * i17));
                        break;
                    case 129:
                        i16 += (int)d;
                        break;
                    case 136:
                        l >>>= i13;
                        break;
                    case 146:
                        f2 = i16;
                    default:
                        i12 += i17;
                    }
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 + i15 + i16 + i17 + l +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i18=4, i20=-14, i21=8, i22=-125, i23=11865, i24=-1, i25=25, i26=-1, i27=-2, i28=10, i29=-11, iArr2[]=new
            int[N];
        double d2=0.100622;
        short s1=-11994;

        FuzzerUtils.init(iArr2, 0);

        vMeth();
        i18 = 1;
        do {
            for (i20 = 201; 10 < i20; i20--) {
                byte by=-80;
                for (i22 = 1; i22 < 2; i22++) {
                    Test.fArrFld[i22 + 1] += i22;
                    i21 = i22;
                    Test.instanceCount <<= Test.instanceCount;
                    Test.dArrFld[i22 - 1] = d2;
                    iArr2[i20 - 1] >>= -1;
                    Test.fArrFld[i20 - 1] += Test.iFld;
                }
                Test.instanceCount ^= Test.iFld;
                iFld1 -= (int)Test.instanceCount;
                i21 += i20;
                Test.instanceCount += by;
                Test.fFld += iFld1;
                by += (byte)Test.instanceCount;
                for (i24 = 1; i24 < 2; ++i24) {
                    try {
                        iFld1 = (-35109 / Test.iFld);
                        i21 = (-39656 / i25);
                        Test.iFld = (iArr2[i20 + 1] % -37066);
                    } catch (ArithmeticException a_e) {}
                    i23 >>>= (int)Test.instanceCount;
                    iArr2[i18 - 1] *= (int)d2;
                }
            }
            switch (((i18 % 2) * 5) + 103) {
            case 110:
                if (Test.bFld) break;
                s1 >>= (short)-24;
                for (i26 = 10; i26 < 201; i26++) {
                    s1 += (short)(i26 * i26);
                }
                break;
            case 111:
                for (i28 = 10; i28 < 201; ++i28) {
                    Test.iFld = 10;
                }
                Test.dArrFld[i18 - 1] += 103;
                i27 -= i27;
                Test.iFld *= i26;
            default:
                Test.iFld = (int)Test.fFld;
            }
        } while (++i18 < 125);



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