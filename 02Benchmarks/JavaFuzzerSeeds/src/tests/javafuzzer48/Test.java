package tests.javafuzzer48;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:37:29 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-20914L;
    public static float fFld=49.476F;
    public short sFld=31476;
    public double dFld=-1.129543;
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-7636);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i4=-3164, i5=5, i6=70, i7=1, i8=-8, iArr1[]=new int[N];
        short s=-13064;

        FuzzerUtils.init(iArr1, -3);

        i4 = 1;
        while (++i4 < 253) {
            Test.instanceCount += 119;
            for (i5 = i4; i5 < 6; ++i5) {
                i6 += (int)Test.instanceCount;
                switch ((i4 % 5) + 94) {
                case 94:
                    i6 = i5;
                    s = (short)91;
                    i7 += (((i5 * i5) + i5) - i5);
                    break;
                case 95:
                    i6 >>= (int)Test.instanceCount;
                    i6 |= i6;
                    i8 = 1;
                    while (++i8 < 1) {
                        i6 *= (int)Test.instanceCount;
                        i7 += i6;
                        i7 *= (int)Test.fFld;
                        i7 = 33637;
                    }
                case 96:
                    iArr1[i5 + 1] ^= i8;
                    break;
                case 97:
                    Test.instanceCount += i5;
                    break;
                case 98:
                    iArr1[i5] >>= (int)Test.instanceCount;
                    break;
                }
            }
        }
        long meth_res = i4 + i5 + i6 + s + i7 + i8 + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(double d) {

        int i3=9, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 35832);

        i3 += (iArr[(i3 >>> 1) % N]++);
        i3 >>= (int)((i3++) - (iMeth1() - Test.instanceCount));
        long meth_res = Double.doubleToLongBits(d) + i3 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i2=-145;
        float f=-71.518F;
        double d1=-2.52092;

        i2 += (i2--);
        i2 |= (int)(Test.instanceCount *= (long)(f + iMeth(0.85579)));
        d1 = i2;
        i2 = i2;
        i2 = (int)Test.instanceCount;
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1);
    }

    public void mainTest(String[] strArr1) {

        int i=26225, i1=14169, i9=44169, i10=7299, i11=2, i12=55880, iArr2[]=new int[N];
        byte byArr[]=new byte[N];
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(byArr, (byte)65);
        FuzzerUtils.init(iArr2, 130);
        FuzzerUtils.init(dArr, 1.67082);

        for (i = 15; i < 368; ++i) {
            vMeth();
            i1 += (int)Test.instanceCount;
            for (i9 = i; i9 < 71; i9++) {
                for (i11 = 1; i11 > 1; i11--) {
                    i10 += (i11 * i11);
                    i12 = i1;
                    byArr[i11] -= (byte)i;
                    i10 = i12;
                    switch ((((i9 >>> 1) % 5) * 5) + 22) {
                    case 35:
                        Test.fFld += i12;
                        sFld ^= (short)Test.instanceCount;
                    case 36:
                        i10 = i11;
                        i1 += i11;
                        Test.sArrFld[i] -= (short)Test.instanceCount;
                        Test.fFld += i11;
                    case 23:
                        Test.sArrFld[i9 + 1] <<= (short)i1;
                        Test.instanceCount += (long)Test.fFld;
                        iArr2[i9] <<= (int)Test.instanceCount;
                        sFld >>= (short)i;
                        break;
                    case 26:
                        Test.instanceCount += i12;
                        break;
                    case 37:
                        i10 = 99;
                        dFld = i12;
                        i10 = sFld;
                        Test.fFld /= (i12 | 1);
                    }
                    dArr[i9 - 1][i] -= i;
                }
                i10 ^= i12;
                i10 += (int)dFld;
            }
            Test.instanceCount += -52L;
        }
        i12 += i9;

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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
