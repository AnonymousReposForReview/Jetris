package tests.javafuzzer287;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:19:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=310048293L;
    public static int iFld=-93;
    public static int iFld1=142;
    public static volatile short sFld=-28769;
    public static boolean bFld=true;
    public static float fFld=-36.169F;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 1737008824L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i1) {

        int iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 763);

        i1 += (int)Test.instanceCount;
        Test.lArrFld[(8 >>> 1) % N] = i1;
        iArr1[(i1 >>> 1) % N] += i1;
        vMeth2_check_sum += i1 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(short s, float f) {

        int i2=236, i3=-211, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, -123);

        vMeth2(Test.iFld);
        for (long l : Test.lArrFld) {
            for (i2 = 1; 4 > i2; i2++) {
                iArr2[i2 + 1] = -193;
                if (true) break;
                Test.lArrFld[(i3 >>> 1) % N] += 6;
                f += 2.367F;
                i3 += (i2 * Test.iFld);
                if (false) continue;
                Test.iFld = i2;
                l = i3;
            }
            Test.iFld1 >>>= Test.iFld;
            Test.iFld += Test.iFld;
            iArr2[(i3 >>> 1) % N] += (int)f;
            if (i2 != 0) {
                vMeth1_check_sum += s + Float.floatToIntBits(f) + i2 + i3 + FuzzerUtils.checkSum(iArr2);
                return;
            }
        }
        vMeth1_check_sum += s + Float.floatToIntBits(f) + i2 + i3 + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(int i) {

        double d=50.47835;
        byte by=98;
        float f1=-1.628F, f2=1.982F;
        int i4=-79, i5=-129, i6=56, i7=-83, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 19890);

        d = (((i * -5) + iArr[(-154 >>> 1) % N]) - Math.min(-Math.min(-24789, i), ++i));
        iArr[(i >>> 1) % N] += (((i + i) / ((i + 205) | 1)) + (by + (i - i)));
        iArr = (iArr = FuzzerUtils.int1array(N, (int)53085));
        vMeth1(Test.sFld, f1);
        Test.iFld <<= (int)5L;
        if (Test.bFld) {
            for (i4 = 12; i4 < 263; i4 += 2) {
                by += (byte)(-14 + (i4 * i4));
                Test.iFld1 -= (int)Test.instanceCount;
            }
            iArr[(i5 >>> 1) % N] = i;
            for (i6 = 2; i6 < 147; i6++) {
                Test.instanceCount += -47194;
            }
            f2 = 1;
            do {
                if (Test.bFld) continue;
                Test.iFld += (int)f2;
            } while (++f2 < 395);
        } else {
            Test.lArrFld[(i6 >>> 1) % N] = -8;
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + by + Float.floatToIntBits(f1) + i4 + i5 + i6 + i7 +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i8=1, i9=-57309, i10=7, i11=-44863, i12=-178, i13=35942, i14=-60388, i15=-17480, i16=0, i17=-11, i18=11,
            iArr3[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -29.747F);
        FuzzerUtils.init(iArr3, -12);

        vMeth(Test.iFld);
        Test.iFld1 >>>= Test.iFld;
        for (i8 = 3; i8 < 214; i8++) {
            Test.iFld = Test.iFld;
            Test.fFld -= Test.iFld1;
            fArr[i8 + 1] = Test.instanceCount;
            Test.bFld = Test.bFld;
            i10 = 1;
            while (++i10 < 119) {
                fArr = fArr;
                i9 -= i8;
                Test.iFld += (i10 * i10);
                Test.fFld += i10;
            }
            Test.instanceCount = Test.iFld;
            if (Test.bFld) break;
            switch ((((-237 >>> 1) % 7) * 5) + 83) {
            case 99:
                Test.fFld += i8;
                Test.iFld1 &= -44318;
                i11 = Test.iFld;
                try {
                    i12 = (i10 % i10);
                    iArr3[i8] = (i11 / i12);
                    i12 = (i11 % 28660);
                } catch (ArithmeticException a_e) {}
                break;
            case 112:
            case 88:
                i13 = 1;
                while (++i13 < 119) {
                    Test.iFld1 += (int)Test.instanceCount;
                }
                Test.iFld1 += (int)Test.instanceCount;
                for (i14 = 119; 7 < i14; --i14) {
                    byte by1=52;
                    i15 += (i14 * i12);
                    for (i16 = 2; i16 > 1; i16--) {
                        i11 += i13;
                        i15 = i18;
                        i12 -= (int)Test.instanceCount;
                    }
                    by1 += (byte)i14;
                    i15 += i14;
                }
                break;
            case 102:
                i9 = Test.iFld1;
                break;
            case 111:
                i18 = i18;
                break;
            case 109:
                iArr3[i8 + 1] >>>= -13859;
                break;
            case 84:
                Test.fFld /= (Test.instanceCount | 1);
                break;
            default:
                iArr3 = FuzzerUtils.int1array(N, (int)14);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
