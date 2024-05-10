package tests.javafuzzer1492;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:19:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4L;
    public static int iFld=218;
    public static volatile float fFld=-2.1012F;
    public float fFld1=37.789F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 4923497656350621396L);
        FuzzerUtils.init(Test.iArrFld, 61065);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, boolean b, byte by) {

        int i8=10, i9=52989, i10=-127, i11=6, i12=-6, iArr[]=new int[N];
        short s=-3736;
        float f=78.88F;
        double dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(dArr, 0.102739);
        FuzzerUtils.init(lArr, 2146100327452361752L);
        FuzzerUtils.init(iArr, 33);

        for (i8 = 6; i8 < 172; i8++) {
            if (b) continue;
            s *= (short)i9;
            i10 = 1;
            do {
                dArr[i8 + 1] = i9;
                i9 >>= i9;
                for (i11 = i10; i11 < 1; ++i11) {
                    i9 += i10;
                    if (b) continue;
                    lArr[i11 - 1] = i9;
                    i12 >>>= (int)-1455909973L;
                    i12 += i12;
                    i12 *= (int)-64.711F;
                    iArr = iArr;
                    f += f;
                }
            } while (++i10 < 10);
        }
        vMeth1_check_sum += i7 + (b ? 1 : 0) + by + i8 + i9 + s + i10 + i11 + i12 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i4) {

        int i5=8, i6=-6, i13=-6, i14=-235, i15=-3;
        boolean b1=true;
        byte by1=-73;
        float f1=-2.539F;
        double d=0.96983;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 3913866906L);

        Test.instanceCount *= i4;
        for (i5 = 7; i5 < 155; ++i5) {
            vMeth1(-46015, b1, by1);
            i4 = i5;
            for (f1 = i5; f1 < 11; ++f1) {
                Test.instanceCount += (18146 + (f1 * f1));
                Test.instanceCount <<= 132;
                i6 *= (int)Test.instanceCount;
                d = Test.iFld;
                i4 = 31;
                for (i14 = 1; i14 < 1; i14++) {
                    Test.fFld = (float)d;
                    i4 -= i13;
                    lArr1[(int)(f1)] = Test.instanceCount;
                    i4 = i15;
                }
            }
        }
        vMeth_check_sum += i4 + i5 + i6 + (b1 ? 1 : 0) + by1 + Float.floatToIntBits(f1) + i13 +
            Double.doubleToLongBits(d) + i14 + i15 + FuzzerUtils.checkSum(lArr1);
    }

    public static long lMeth(int i1, int i2, int i3) {

        int i16=-13, i18=-205, i19=-10;

        vMeth(i1);
        i16 = 1;
        do {
            Test.fFld += -42494;
            i3 += (i16 | (long)Test.fFld);
            Test.iFld <<= i1;
        } while (++i16 < 139);
        for (int i17 : Test.iArrFld) {
            i1 -= i2;
            Test.iArrFld = FuzzerUtils.int1array(N, (int)-228);
            Test.iArrFld[(i1 >>> 1) % N] = i1;
            for (i18 = 4; i18 > 1; i18 -= 2) {
                i1 -= i1;
                i2 -= (int)Test.fFld;
                i1 = i3;
                Test.iArrFld[i18] -= i18;
                i17 = 5;
            }
        }
        long meth_res = i1 + i2 + i3 + i16 + i18 + i19;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=177, i21=-198, i22=1578;
        double d1=0.9489;
        boolean b2=true;
        byte by2=-12;
        short s1=-23865;

        i = (int)((lMeth(Test.iFld, -55497, Test.iFld) - i) / ((long)(d1) | 1));
        Test.iFld = i;
        b2 = b2;
        Test.iArrFld[(i >>> 1) % N] <<= i;
        i += (int)d1;
        Test.instanceCount /= (i | 1);
        Test.fFld = -33935L;
        d1 -= 44.901F;
        i = by2;
        Test.iFld = -65216;
        Test.instanceCount += Test.instanceCount;
        Test.instanceCount -= 4;
        for (int i20 : Test.iArrFld) {
            Test.iArrFld[(i20 >>> 1) % N] += -1282;
            i20 = (int)-8282012091584731740L;
            Test.instanceCount -= 12;
            Test.iFld = i;
            Test.iFld <<= i;
            i = (int)Test.instanceCount;
            i20 >>= s1;
            switch (((-57861 >>> 1) % 7) + 63) {
            case 63:
                for (i21 = 2; i21 < 63; i21++) {
                    Test.iArrFld[i21] -= i21;
                    Test.iFld *= 152;
                    Test.fFld += i20;
                    Test.instanceCount += (i21 * i20);
                    Test.lArrFld[i21] -= -35;
                    i20 += (int)Test.instanceCount;
                    if (b2) break;
                    b2 = b2;
                }
                break;
            case 64:
                Test.iFld = i20;
            case 65:
                d1 *= Test.instanceCount;
                break;
            case 66:
                Test.iFld = Test.iFld;
                break;
            case 67:
                i22 = (int)1209664872L;
                break;
            case 68:
                Test.iArrFld[(i20 >>> 1) % N] >>= i20;
                break;
            case 69:
                i -= (int)fFld1;
                break;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
