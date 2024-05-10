package tests.javafuzzer1403;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 19:46:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=507195504L;
    public static short sFld=11895;
    public float fFld=1.667F;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static void vMeth(int i3) {

        float f=-2.63F;

        f = f;
        vMeth_check_sum += i3 + Float.floatToIntBits(f);
    }

    public static byte byMeth(int i10) {

        float f2=-2.182F;
        int i11=-52806, i12=-53419, i13=193, i14=15957, iArr1[]=new int[N];
        byte by1=27, byArr[]=new byte[N];
        boolean b=true;
        double d1=-25.85615;

        FuzzerUtils.init(iArr1, -23976);
        FuzzerUtils.init(byArr, (byte)-28);

        i10 |= 4;
        i10 = (int)-2.94F;
        f2 += i10;
        for (i11 = 3; i11 < 183; i11++) {
            i12 *= i12;
            i12 -= by1;
            Test.instanceCount = i12;
            i12 >>= i11;
            b = b;
            for (i13 = 1; i13 < 9; i13++) {
                i12 >>= i12;
                switch ((i13 % 2) + 93) {
                case 93:
                    f2 += Test.instanceCount;
                    try {
                        iArr1[i13 - 1] = (477426838 % i10);
                        i12 = (i12 / i11);
                        iArr1[i13 - 1] = (199 / i13);
                    } catch (ArithmeticException a_e) {}
                    byArr[i13 + 1] -= (byte)d1;
                    break;
                case 94:
                    i10 += i11;
                default:
                    iArr1[i11 - 1] -= Test.sFld;
                }
            }
        }
        long meth_res = i10 + Float.floatToIntBits(f2) + i11 + i12 + by1 + (b ? 1 : 0) + i13 + i14 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth1(int i4) {

        int i5=-42031, i6=44285, i7=-3, i8=-7926, i9=-6, iArr[]=new int[N];
        float f1=0.59F;
        byte by=3;
        double d=0.89417;
        long l=4220405339L;

        FuzzerUtils.init(iArr, 5);

        for (i5 = 8; i5 < 140; ++i5) {
            i6 *= i6;
            i6 = Test.sFld;
            Test.instanceCount *= (long)(i5 * ((Test.instanceCount - -207724649394972187L) + (f1 - by)));
            Test.sFld += (short)(i5 + i5);
            d = ((++f1) + (iArr[(i4 >>> 1) % N] - (i4 % 4063817945161879048L)));
            for (l = 1; l < 12; ++l) {
                i4 = i5;
                i7 += (int)(((l * i7) + i7) - Test.instanceCount);
            }
            for (i8 = 12; i5 < i8; i8--) {
                iArr[i8 - 1] += i6;
                i9 += (((i8 * Test.instanceCount) + Test.instanceCount) - i9);
            }
            d -= byMeth(i7);
            by = (byte)l;
            iArr[i5 - 1] = i6;
        }
        vMeth1_check_sum += i4 + i5 + i6 + Float.floatToIntBits(f1) + by + Double.doubleToLongBits(d) + l + i7 + i8 +
            i9 + FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth(int i, int i1, int i2) {


        vMeth(-i1);
        vMeth1(i2);
        vSmallMeth_check_sum += i + i1 + i2;
    }

    public void mainTest(String[] strArr1) {

        int i15=-40825, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 35658);

        for (int smallinvoc=0; smallinvoc<819; smallinvoc++) vSmallMeth(i15, i15, i15);
        iArr2[(49 >>> 1) % N] += (int)fFld;


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
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vSmallMeth mainTest Test
//DEBUG  byMeth ->  byMeth vMeth1 vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}