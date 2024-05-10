package tests.javafuzzer3035;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:04:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3156167826L;
    public static int iFld=152;
    public static double dFld=1.52203;
    public static short sFld=12640;
    public static byte byFld=-65;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, 61314L);
        FuzzerUtils.init(Test.iArrFld, 107);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(int i11) {

        int i12=7, i13=79, i14=-21, i15=48368, i16=-20, i17=-40609, i18=-12, iArr2[][]=new int[N][N];
        short s=-32360;
        byte by=45;

        FuzzerUtils.init(iArr2, -87);

        for (i12 = 3; i12 < 168; i12++) {
            s *= (short)-80;
            iArr2[i12 + 1][i12] = (int)Test.instanceCount;
            i14 = 1;
            do {
                i11 -= (int)Test.instanceCount;
                i13 = -29;
                for (i15 = 1; i15 < 1; i15++) {
                    i13 = i15;
                    i16 = (int)Test.instanceCount;
                }
                for (i17 = 1; i17 < 1; ++i17) {
                    switch (((i15 >>> 1) % 4) + 93) {
                    case 93:
                        s += (short)i18;
                        Test.instanceCount += (i17 | i15);
                        Test.instanceCount = i15;
                        break;
                    case 94:
                        i18 -= i15;
                    case 95:
                        i18 -= i16;
                        break;
                    case 96:
                        i16 += i12;
                        break;
                    default:
                        i16 = by;
                    }
                }
            } while (++i14 < 10);
        }
        long meth_res = i11 + i12 + i13 + s + i14 + i15 + i16 + i17 + i18 + by + FuzzerUtils.checkSum(iArr2);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static int iMeth1(int i5, int i6, int i7) {

        float f1=-21.429F;
        int i8=1, i9=-61630, i10=7, i19=10, i20=-204, i21=214, i22=-10, iArr1[][]=new int[N][N];
        double d1=-1.111501;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 92);
        FuzzerUtils.init(lArr, -1L);

        for (f1 = 4; f1 < 315; ++f1) {
            for (i9 = 5; i9 > 1; i9 -= 3) {
                iArr1[(i10 >>> 1) % N][(int)(f1 - 1)] -= byMeth(-14523);
                i6 = i7;
                i19 = 1;
                while (++i19 < 5) {
                    i10 >>= (int)4989L;
                    Test.instanceCount += Test.instanceCount;
                }
                i6 = i8;
                for (i20 = 1; i20 < 5; ++i20) {
                    switch ((int)((f1 % 1) + 80)) {
                    case 80:
                        lArr[i9 - 1] -= i21;
                        i21 += (((i20 * f1) + i8) - i22);
                    default:
                        try {
                            i5 = (-1598359346 % iArr1[i9 - 1][(int)(f1)]);
                            i5 = (62 / i19);
                            iArr1[i20][i9] = (i20 % i8);
                        } catch (ArithmeticException a_e) {}
                        d1 = f1;
                        Test.instanceCount = Test.instanceCount;
                    }
                }
            }
        }
        long meth_res = i5 + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i19 + i20 + i21 + i22 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        boolean b=true, bArr[]=new boolean[N];
        int i23=-6, i24=-58592;
        double dArr[]=new double[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(dArr, -1.114336);

        iMeth1(Test.iFld, -9, 238);
        Test.instanceCount *= (long)-1.11699;
        Test.iFld *= Test.iFld;
        Test.lArrFld[(Test.iFld >>> 1) % N] <<= Test.iFld;
        bArr[(-92 >>> 1) % N] = true;
        Test.iFld &= Test.iFld;
        dArr[(Test.iFld >>> 1) % N] = 144;
        Test.iFld <<= (int)Test.instanceCount;
        b = false;
        Test.iFld = (int)92.1002F;
        Test.iFld = Test.iFld;
        for (i23 = 201; 11 < i23; i23 -= 3) {
            float f2=0.926F;
            f2 -= (float)Test.dFld;
        }
        Test.lArrFld = FuzzerUtils.long1array(N, (long)-3L);
        long meth_res = (b ? 1 : 0) + i23 + i24 + FuzzerUtils.checkSum(bArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=116, i1=-2, i2=360, i3=5, i4=68, i25=-14, iArr[]=new int[N];
        double d=-1.51979;
        float f=-2.48F, f3=2.938F, fArr[]=new float[N];
        boolean b1=true;
        long l=-12L;
        short sArr[]=new short[N];

        FuzzerUtils.init(fArr, 0.484F);
        FuzzerUtils.init(iArr, -10);
        FuzzerUtils.init(sArr, (short)13093);

        i = 1;
        do {
            for (i1 = 89; i1 > i; --i1) {
                d -= (--fArr[i - 1]);
                i2 += -11;
                Test.instanceCount += i1;
                for (i3 = i; i3 < 1; i3++) {
                    iArr[i3 - 1] -= (int)(Test.instanceCount >>= (i4++));
                    i2 = (int)(iArr[i - 1] = (int)((++f) + iArr[(i3 >>> 1) % N]));
                    iArr[i3 + 1] = iMeth();
                    iArr[i3 + 1] = (int)Test.instanceCount;
                    i4 <<= Test.sFld;
                    f -= i4;
                    i4 <<= (int)Test.instanceCount;
                    iArr = iArr;
                    Test.lArrFld[i3 - 1] = Test.iFld;
                    i4 -= i4;
                }
            }
            if (true) continue;
            f3 = 1;
            do {
                if (b1) continue;
                Test.instanceCount = -227;
                f -= i3;
                for (l = 1; l < 1; l++) {
                    d += i4;
                    Test.iArrFld = FuzzerUtils.int2array(N, (int)-20150);
                    i25 += (int)Test.instanceCount;
                }
                Test.instanceCount -= -253;
            } while (++f3 < 89);
            Test.instanceCount += (2692662418220948047L + (i * i));
            Test.instanceCount = i25;
        } while (++i < 282);
        Test.byFld = (byte)43931;
        sArr[(i25 >>> 1) % N] += (short)Test.instanceCount;



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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  byMeth ->  byMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}