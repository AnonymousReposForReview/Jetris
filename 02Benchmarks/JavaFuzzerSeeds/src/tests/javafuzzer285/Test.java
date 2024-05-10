package tests.javafuzzer285;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:09:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public static int iFld=-140;
    public static volatile double dFld=24.128953;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -39125);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i3=-219, i4=5, i5=-13, i6=13, i7=-25409, iArr1[]=new int[N];
        double d=0.41552;
        short s=-15432;
        float f2=-2.926F;
        byte by=81;
        long l=2L, lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 8977);
        FuzzerUtils.init(lArr, 11L);

        i3 = 1;
        do {
            Test.iFld ^= (int)7L;
            d += Test.instanceCount;
            Test.iFld *= i3;
            for (i4 = 1; i4 < 5; ++i4) {
                s = (short)i5;
                switch ((i4 % 9) + 59) {
                case 59:
                    for (i6 = 1; i6 < 2; ++i6) {
                        Test.instanceCount -= i3;
                        iArr1[i4 - 1] >>= i6;
                        i7 += (i6 * i6);
                        i5 <<= i3;
                        d = Test.instanceCount;
                        i5 += (-124 + (i6 * i6));
                        Test.iFld = i5;
                    }
                case 60:
                    f2 += i4;
                    break;
                case 61:
                case 62:
                    try {
                        i5 = (41 % iArr1[i3]);
                        i5 = (Test.iFld % -1932949788);
                        i7 = (i3 % Test.iFld);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 63:
                    by += (byte)Test.iFld;
                    break;
                case 64:
                    lArr[i3 + 1] += i4;
                case 65:
                    f2 += (i4 - f2);
                    break;
                case 66:
                    Test.instanceCount = Test.iFld;
                    break;
                case 67:
                    l -= Test.instanceCount;
                    break;
                }
            }
        } while (++i3 < 348);
        vMeth_check_sum += i3 + Double.doubleToLongBits(d) + i4 + i5 + s + i6 + i7 + Float.floatToIntBits(f2) + by + l
            + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i2) {


        vMeth();
        Test.instanceCount = Test.iFld;
        long meth_res = i2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(int i1) {

        short s1=271;
        int iArr[][]=new int[N][N];

        FuzzerUtils.init(iArr, 7);

        i1 = iArr[(i1 >>> 1) % N][(-93 >>> 1) % N];
        iArr[(-9 >>> 1) % N][(i1 >>> 1) % N] += ((iMeth(12) - s1) * Test.iFld);
        vSmallMeth_check_sum += i1 + s1 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        float f=-97.249F, f1=-1.929F, fArr[]=new float[N];
        int i=17475, i8=170, i9=5, i10=-86, i11=-204, i12=-9, i13=35808;
        short s2=9967;
        double d1=-99.109444;

        FuzzerUtils.init(fArr, 93.435F);

        for (f = 6; f < 205; ++f) {
            fArr[(int)(f)] = (Integer.reverseBytes(33939) - (Math.min(i, i) % (((long)(f1--)) | 1)));
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(Test.iFld);
            s2 |= (short)Test.instanceCount;
            Test.instanceCount = Test.iFld;
            for (i8 = 5; i8 < 126; ++i8) {
                Test.iArrFld = FuzzerUtils.int1array(N, (int)-195);
            }
            Test.iArrFld = Test.iArrFld;
            i9 -= i;
            for (d1 = 7; d1 < 126; d1++) {
                Test.instanceCount = (long)1.502F;
                i9 = (int)Test.instanceCount;
                Test.instanceCount -= 135;
            }
            i -= Test.iFld;
            Test.iArrFld = Test.iArrFld;
        }
        for (i11 = 2; i11 < 210; ++i11) {
            i13 = 1;
            do {
                i10 <<= i11;
                Test.instanceCount <<= i12;
                Test.dFld -= Test.instanceCount;
                switch ((((i >>> 1) % 1) * 5) + 42) {
                case 47:
                    i10 *= i12;
                    i ^= (int)4166588888L;
                default:
                    i10 ^= i11;
                    s2 = (short)Test.instanceCount;
                }
                Test.instanceCount = Test.instanceCount;
                i -= i9;
                Test.iArrFld[i11 + 1] <<= i13;
                f1 = Test.iFld;
            } while (++i13 < 121);
            i = s2;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
