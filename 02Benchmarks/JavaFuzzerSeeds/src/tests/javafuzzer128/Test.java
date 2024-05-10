package tests.javafuzzer128;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 22:46:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1376L;
    public int iFld=-89;
    public short sFld=11366;
    public boolean bFld=true;
    public long lFld=-159L;
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-1318);
    }

    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public void vMeth1() {


        sFld += (short)Test.instanceCount;
        iFld = -136;
        iFld >>= iFld;
        vMeth1_check_sum += 0;
    }

    public boolean bMeth(int i, int i1, boolean b) {

        byte by1=-67;
        int i2=-201, i3=-135, i5=-241, iArr[]=new int[N], iArr1[][]=new int[N][N];
        float f=0.623F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2778518930L);
        FuzzerUtils.init(iArr, -9);
        FuzzerUtils.init(iArr1, 53915);

        vMeth1();
        by1 = (byte)i;
        lArr[(i >>> 1) % N] *= i1;
        iFld = (int)Test.instanceCount;
        for (i2 = 9; i2 < 302; i2++) {
            i1 = i1;
            Test.instanceCount -= Test.instanceCount;
            i3 <<= i;
            if (b) {
                switch ((i2 % 5) + 106) {
                case 106:
                    i5 = 1;
                    do {
                        iFld >>= (int)Test.instanceCount;
                        i += (int)2.256F;
                        i3 -= (int)7813150433903389473L;
                        f -= 9;
                    } while (++i5 < 6);
                    break;
                case 107:
                    Test.instanceCount -= i2;
                    break;
                case 108:
                    iArr = FuzzerUtils.int1array(N, (int)6);
                    break;
                case 109:
                    f += (((i2 * sFld) + i1) - i2);
                case 110:
                    i <<= (int)Test.instanceCount;
                    break;
                default:
                    i -= i2;
                }
            } else {
                iArr1 = iArr1;
            }
        }
        long meth_res = i + i1 + (b ? 1 : 0) + by1 + i2 + i3 + i5 + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void vMeth() {

        float f1=-18.971F;
        int i6=12076, i7=99, i8=56, iArr2[]=new int[N];
        double d=1.45841;

        FuzzerUtils.init(iArr2, -119);

        bMeth(-62, iFld, bFld);
        for (f1 = 4; 343 > f1; ++f1) {
            if (bFld) break;
            iFld = (int)lFld;
        }
        for (i7 = 1; 351 > i7; i7++) {
            i6 -= i8;
            i6 += (i7 * i7);
        }
        i6 <<= iFld;
        d = Test.instanceCount;
        Test.sArrFld[(i7 >>> 1) % N] += (short)2716909878118702098L;
        iArr2[(33303 >>> 1) % N] -= iFld;
        vMeth_check_sum += Float.floatToIntBits(f1) + i6 + i7 + i8 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        byte by=20;

        iFld += ((Math.max(iFld, iFld) + iFld) + (by++));
        vMeth();


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
//DEBUG  bMeth ->  bMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 bMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}