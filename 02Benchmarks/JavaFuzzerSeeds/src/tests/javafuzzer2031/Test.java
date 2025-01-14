package tests.javafuzzer2031;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 07:43:51 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public static float fFld=1.740F;
    public static boolean bFld=true;
    public static double dFld=-89.129711;
    public static byte byFld=-52;
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i6) {

        int i7=158, i8=-34773, i9=221, i10=-39553, i11=0, i12=7, iArr1[]=new int[N];
        byte by=-34;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, 114);
        FuzzerUtils.init(dArr, -1.56346);

        for (i7 = 4; i7 < 155; i7++) {
            for (i9 = 1; i9 < 10; i9++) {
                for (i11 = 1; i11 < 2; i11++) {
                    iArr1 = iArr1;
                    Test.fFld += i11;
                    dArr[i11 + 1] *= i8;
                }
                i12 = i11;
                if (true) break;
                i12 = i11;
                switch (((i9 % 3) * 5) + 23) {
                case 32:
                    i12 += i12;
                    i8 += -5;
                    i6 -= by;
                    break;
                case 34:
                    Test.fFld += Test.instanceCount;
                    iArr1[i9 - 1] += i9;
                    break;
                case 30:
                    Test.instanceCount += i9;
                    break;
                default:
                    i8 += (i9 * i9);
                }
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + i10 + i11 + i12 + by + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i=-12, i2=-12, i3=-10, i4=-12, i5=-21791, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -11);

        Test.instanceCount *= ((--i) + i);
        for (int i1 : iArr) {
            for (i2 = 1; i2 < 4; i2++) {
                double d=-28.79632;
                i >>= i1;
                i1 = (++i);
                i |= (++i3);
                for (i4 = 1; i4 < 2; ++i4) {
                    iArr[i4 - 1] += (--i3);
                    Test.fFld = 223;
                    iArr[i2] = (int)lMeth(i2);
                }
                Test.instanceCount -= Test.instanceCount;
                i5 = (int)d;
                Test.instanceCount -= 19360;
                Test.instanceCount += (i2 * i2);
                i3 = i4;
            }
        }
        vMeth1_check_sum += i + i2 + i3 + i4 + i5 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l) {

        int i13=254, i14=65417, i15=8, i16=-40258, iArr2[]=new int[N];
        short s=-10001;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 28.479F);
        FuzzerUtils.init(iArr2, 234);

        vMeth1();
        for (i13 = 6; 239 > i13; ++i13) {
            Test.fFld *= i13;
            for (i15 = 1; i15 < 7; ++i15) {
                i14 -= i14;
                i14 *= i15;
                fArr[i13] -= 4051;
                s += (short)i15;
            }
            if (false) {
                iArr2[i13 + 1] <<= i14;
            } else if (Test.bFld) {
                i14 += i13;
                Test.fFld += (i13 - Test.fFld);
                Test.instanceCount += i14;
                l += i13;
            }
            i16 = (int)-1.929;
        }
        vMeth_check_sum += l + i13 + i14 + i15 + i16 + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i17=-12, i18=-3, i20=-63648, i21=9, i22=58638, i23=-4969, i24=-13, i25=26487, iArr3[]=new int[N];
        double d1=1.59950;
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr3, -11);
        FuzzerUtils.init(fArr1, 2.574F);

        vMeth(-4898099819779146661L);
        for (i17 = 327; i17 > 4; i17 -= 2) {
            Test.dFld %= (Test.instanceCount | 1);
            Test.byFld = (byte)Test.fFld;
            for (i20 = 1; i20 < 156; i20++) {
                for (i22 = 1; i22 < 2; i22++) {
                    i18 += i20;
                    lArrFld[i20 + 1] = (long)Test.dFld;
                    i21 = i18;
                    Test.instanceCount += i20;
                    if (Test.bFld) continue;
                    Test.fFld /= 2405946883L;
                }
                Test.fFld += i20;
                Test.instanceCount += (long)Test.dFld;
                iArr3[i17 - 1] *= (int)21L;
                i21 = -13;
                if (false) break;
                Test.fFld -= i23;
                i18 = (int)Test.fFld;
                Test.fFld += (i20 * i20);
                i21 += (0 + (i20 * i20));
            }
            i24 = 1;
            do {
                if (Test.bFld) break;
                i18 += (i24 | i20);
                for (d1 = 1; d1 < 1; d1++) {
                    fArr1 = fArr1;
                    Test.instanceCount = i23;
                }
                i21 -= i17;
                i25 += i24;
                i21 += (-8 + (i24 * i24));
            } while (++i24 < 156);
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
