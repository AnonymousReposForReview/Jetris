package tests.javafuzzer3394;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 07:20:43 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=4184L;
    public static volatile float fFld=45.292F;
    public static double dFld=2.117696;
    public int iFld=207;
    public static short sFld=-567;
    public volatile long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4) {

        int i5=57738, i6=51481, i7=-10, i8=1475, iArr[]=new int[N];
        boolean b=false;
        byte by1=-102;

        FuzzerUtils.init(iArr, -37358);

        iArr[(i4 >>> 1) % N] *= i4;
        switch ((((i4 >>> 1) % 3) * 5) + 78) {
        case 80:
            Test.dFld -= i4;
            for (i5 = 218; i5 > 11; i5--) {
                i6 = i5;
                Test.fFld += Test.instanceCount;
                Test.instanceCount = i5;
                if (b) {
                } else if (b) {
                    i4 += (i5 | i4);
                    i6 = i5;
                    i4 += i4;
                    for (i7 = 1; i7 < 8; ++i7) {
                        i4 -= i5;
                        Test.instanceCount = i6;
                        i6 += (((i7 * i5) + Test.fFld) - i6);
                    }
                } else if (b) {
                    i8 = i5;
                } else {
                    i8 = i4;
                }
            }
        case 89:
            by1 = (byte)i7;
            break;
        case 91:
            i4 -= i6;
            break;
        default:
            Test.dFld = Test.instanceCount;
        }
        vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + (b ? 1 : 0) + by1 + FuzzerUtils.checkSum(iArr);
    }

    public static float fMeth(byte by) {

        int i1=193, i2=-1, i3=-142, i9=10, i10=-202, iArr1[]=new int[N];
        short s=26847;

        FuzzerUtils.init(iArr1, -6);

        for (i1 = 7; i1 < 198; ++i1) {
            i2 = (s++);
            i3 = 1;
            while (++i3 < 8) {
                vMeth1(i1);
                iArr1 = FuzzerUtils.int1array(N, (int)39);
                i2 += (((i3 * s) + i1) - i1);
                i2 += (i3 * i3);
                iArr1[i3] = (int)Test.dFld;
                i2 += (6 + (i3 * i3));
            }
            i2 += (int)Test.instanceCount;
            Test.fFld += i1;
            for (i9 = 1; i9 < 8; i9++) {
                i10 += (i9 + i10);
                i10 = i3;
                Test.instanceCount /= (i10 | 1);
            }
        }
        long meth_res = by + i1 + i2 + s + i3 + i9 + i10 + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void vMeth(float f, double d) {

        int i=-114;
        byte by2=-45;

        Test.fFld = (Test.instanceCount |= ((i * Test.instanceCount) - (Test.instanceCount + i)));
        fMeth(by2);
        Test.dFld = i;
        i = by2;
        vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i + by2;
    }

    public void mainTest(String[] strArr1) {

        byte by3=-123;
        int i11=130, i12=18284, i13=17373, i14=-10, i15=-48964, i16=-183, i17=8, i18=-2, iArr2[]=new int[N];
        float f1=-1.834F;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr2, -16);
        FuzzerUtils.init(sArr, (short)-15046);

        vMeth(Test.fFld, Test.dFld);
        iArr2[(52653 >>> 1) % N] = iFld;
        try {
            iFld += (int)Test.dFld;
            by3 += (byte)0;
            i11 -= 49656;
        }
        catch (UserDefinedExceptionTest exc1) {
            iArr2 = iArr2;
        }
        i12 = 175;
        do {
            iArr2[i12] = i12;
            for (i13 = 7; i13 < 285; i13++) {
                i14 -= i12;
                for (i15 = 1; i15 < 2; i15++) {
                    iFld = (int)Test.fFld;
                    iArr2[i15 + 1] = (int)-14L;
                    iFld = iFld;
                    i11 += (i15 ^ (long)Test.fFld);
                    iArr2[i13] -= Test.sFld;
                    i16 *= Test.sFld;
                    Test.instanceCount >>>= i16;
                    switch (((i17 >>> 1) % 1) + 117) {
                    case 117:
                        iFld = i17;
                    }
                }
                for (f1 = 1; f1 < 2; f1++) {
                    i16 = (int)-42.6610;
                    i18 = (int)Test.fFld;
                    Test.instanceCount <<= Test.instanceCount;
                    Test.fFld = i18;
                    sArr[(int)(f1 - 1)] = (short)i16;
                }
            }
            i16 *= i17;
            lArrFld[i12 - 1] >>= 46583L;
            iArr2[i12 + 1] <<= i18;
        } while ((i12 -= 2) > 0);

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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
