package tests.javafuzzer280;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:09:37 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=232L;
    public static float fFld=-102.248F;
    public int iFld=-3116;
    public static long lFld=-18597L;
    public boolean bFld=false;
    public static byte byFld=66;
    public int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 250L);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1) {

        int i1=81, i2=7266, i3=0, iArr[]=new int[N];
        short s=-22043;
        byte by=-92;
        boolean b1=false;

        FuzzerUtils.init(iArr, -212);

        if (b1) {
            for (long l2 : Test.lArrFld) {
                i1 = i1;
                Test.lArrFld[(i1 >>> 1) % N] *= i1;
                i1 -= i1;
                Test.fFld += l1;
                i1 *= s;
                l1 += (long)Test.fFld;
                i2 = 1;
                while (++i2 < 4) {
                    i3 += (-43007 + (i2 * i2));
                    i1 += i2;
                    if (i1 != 0) {
                        vMeth1_check_sum += l1 + i1 + s + i2 + i3 + by + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    i1 = i3;
                    l2 -= i2;
                    iArr[i2 + 1] = by;
                }
            }
            vMeth1_check_sum += l1 + i1 + s + i2 + i3 + by + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
            return;
        } else {
            Test.instanceCount = Test.lFld;
        }
        vMeth1_check_sum += l1 + i1 + s + i2 + i3 + by + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(long l, boolean b, double d) {

        int i=-11;

        Test.fFld += Test.fFld;
        i += (int)(Test.fFld * Long.reverseBytes(Test.instanceCount++));
        vMeth1(Test.lFld);
        long meth_res = l + (b ? 1 : 0) + Double.doubleToLongBits(d) + i;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth() {

        double d1=108.119339;
        long l3=-994805438L;
        int i4=-65133, i5=-217, i6=7, i7=12, i8=-1;
        short s1=-24144;

        iFld >>= (int)(((iArrFld[(-117 >>> 1) % N]++) + (28.116032 - lMeth(Test.lFld, bFld, d1))) + iFld);
        for (l3 = 5; l3 < 307; l3++) {
            i4 <<= i4;
            for (i5 = 5; 1 < i5; --i5) {
                Test.lFld += (0 + (i5 * i5));
                iFld += i5;
                i4 += i5;
                Test.lArrFld[(int)(l3)] /= (l3 | 1);
                i6 = (int)Test.lFld;
                for (i7 = 1; i7 < 2; ++i7) {
                    Test.fFld += i6;
                    switch ((i7 % 2) + 14) {
                    case 14:
                        i4 += (((i7 * l3) + i8) - Test.instanceCount);
                        Test.byFld += (byte)(((i7 * l3) + i7) - Test.instanceCount);
                        s1 = (short)7;
                        break;
                    case 15:
                        i4 += i7;
                    default:
                        i6 += Test.byFld;
                    }
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d1) + l3 + i4 + i5 + i6 + i7 + i8 + s1;
    }

    public void mainTest(String[] strArr1) {

        int i9=0, i10=-5, i11=-56018, i12=11, i15=-15588, i16=196, i17=-2;
        double d2=-81.18996, dArr[][]=new double[N][N];
        short sArr[]=new short[N];

        FuzzerUtils.init(dArr, 98.70219);
        FuzzerUtils.init(sArr, (short)-31607);

        Test.fFld -= (iArrFld[(iFld >>> 1) % N] = (++iArrFld[(6 >>> 1) % N]));
        vMeth();
        for (i9 = 17; i9 < 358; i9++) {
            if (true) continue;
            for (i11 = 3; i11 < 74; ++i11) {
                i10 = i12;
                Test.fFld += Test.fFld;
                iArrFld[i11 + 1] += i10;
                Test.lFld += i9;
                Test.fFld += i12;
            }
        }
        iFld *= (int)d2;
        Test.fFld *= i12;
        d2 -= i11;
        for (int i13 : iArrFld) {
            iFld -= i9;
            Test.instanceCount >>= 31306;
            dArr[(i13 >>> 1) % N] = dArr[(i9 >>> 1) % N];
        }
        i10 = i9;
        for (int i14 : iArrFld) {
            switch (((169 >>> 1) % 4) + 104) {
            case 104:
                sArr[(i9 >>> 1) % N] *= (short)i15;
            case 105:
                i15 >>>= i12;
                i10 *= i12;
                iFld = i15;
                try {
                    iArrFld[(i10 >>> 1) % N] = (i12 / i14);
                    i10 = (-238 % i12);
                    iFld = (i9 % -29414);
                } catch (ArithmeticException a_e) {}
                break;
            case 106:
                iArrFld[(i12 >>> 1) % N] += -39;
                Test.bArrFld = Test.bArrFld;
                for (i16 = 2; 63 > i16; i16++) {
                    Test.instanceCount >>= i15;
                    i10 += (((i16 * iFld) + i9) - i11);
                }
                break;
            case 107:
                i10 *= (int)d2;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
