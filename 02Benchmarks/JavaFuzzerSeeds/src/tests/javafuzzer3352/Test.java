package tests.javafuzzer3352;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:37:50 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-62L;
    public static volatile float fFld=-1.1019F;
    public static int iFld=30884;
    public static long lFld=2567272447L;
    public static short sFld=-30561;
    public float fArrFld[]=new float[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i1=-10, i2=-50, i3=-1;
        byte by=-68;
        short s1=7043;
        double dArr[]=new double[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(dArr, 64.57495);
        FuzzerUtils.init(fArr, -110.964F);

        i1 *= (int)Test.instanceCount;
        Test.fFld *= Test.iFld;
        i1 += (int)Test.instanceCount;
        by = (byte)Test.instanceCount;
        s1 += (short)Test.instanceCount;
        Test.iFld -= Test.iFld;
        Test.iFld = (int)60704L;
        for (double d : dArr) {
            i1 = (int)8814656921421830008L;
            Test.fFld = Test.instanceCount;
            i1 = (int)Test.instanceCount;
            for (i2 = 1; i2 < 4; i2++) {
                fArr[i2 - 1] -= Test.instanceCount;
                i3 = (int)Test.fFld;
                dArr = dArr;
            }
        }
        long meth_res = i1 + by + s1 + i2 + i3 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i=-35, iArr[][]=new int[N][N];
        short s=14934;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -11);
        FuzzerUtils.init(lArr, 41599739282942050L);

        i = (int)(((i - Test.fFld) + (iArr[(i >>> 1) % N][(i >>> 1) % N]++)) * (s++));
        iArr[(i >>> 1) % N][(i >>> 1) % N] = (i - (++i));
        Test.fFld *= ((lArr[(i >>> 1) % N] * (-lMeth())) + Test.instanceCount);
        i -= Test.iFld;
        vMeth1_check_sum += i + s + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth() {


        vMeth1();
        Test.instanceCount = Test.iFld;
        Test.instanceCount = Test.iFld;
        vMeth_check_sum += 0;
    }

    public void mainTest(String[] strArr1) {

        int i4=-4, i5=-12, i6=-5079, i7=-81, i8=-24, i9=-29987, i10=16938, i11=-38443, iArr1[]=new int[N];
        byte by1=-88, by2=32;
        double d1=118.1345, dArr1[]=new double[N];
        boolean b=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 14471);
        FuzzerUtils.init(lArr1, -173L);
        FuzzerUtils.init(dArr1, -2.74277);

        vMeth();
        for (i4 = 2; i4 < 256; ++i4) {
            Test.instanceCount <<= Test.iFld;
            Test.iFld -= i4;
        }
        if (b) {
            i6 = 1;
            do {
                Test.instanceCount -= i4;
                for (i7 = 3; i7 < 65; ++i7) {
                    i5 += i7;
                    by1 += (byte)(((i7 * by2) + i7) - i6);
                    Test.lFld = i7;
                    Test.sFld += by2;
                    Test.iFld += i7;
                    Test.instanceCount = i8;
                    Test.lFld = Test.lFld;
                    Test.instanceCount += (i7 + i4);
                    by2 += (byte)i6;
                    d1 += i4;
                }
                Test.sFld -= (short)Test.iFld;
                i9 = 1;
                while (++i9 < 65) {
                    iArr1[i9] += Test.iFld;
                    iArr1[i9] -= (int)Test.fFld;
                    Test.iFld = i6;
                    i5 *= (int)Test.lFld;
                    switch ((i9 % 10) + 41) {
                    case 41:
                        for (i10 = 1; i10 < 1; i10++) {
                            iArr1[i6 + 1] >>= 20096;
                            i11 += (((i10 * Test.instanceCount) + i10) - i11);
                            Test.iFld += (i10 ^ Test.instanceCount);
                            lArr1[i10 + 1] -= i5;
                        }
                    case 42:
                        i5 >>= i4;
                        break;
                    case 43:
                        Test.iFld ^= (int)355107795L;
                    case 44:
                        dArr1[i9 + 1] = Test.lFld;
                    case 45:
                        Test.fFld = i4;
                        break;
                    case 46:
                        i5 = i10;
                        break;
                    case 47:
                        Test.lFld >>= i4;
                    case 48:
                        fArrFld[i6] -= i5;
                        break;
                    case 49:
                        i8 = i8;
                        break;
                    case 50:
                        Test.lFld = i9;
                        break;
                    default:
                        iArr1[i9 - 1] = -103;
                    }
                }
            } while (++i6 < 390);
        } else if (b) {
            d1 -= i5;
        } else {
            i11 += i9;
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
