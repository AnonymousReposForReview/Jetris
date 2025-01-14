package tests.javafuzzer1382;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 19:15:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1854794907L;
    public static boolean bFld=false;
    public float fFld=-2.794F;
    public static short sFld=14230;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 101);
        FuzzerUtils.init(Test.lArrFld, -9L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2) {

        float f1=120.450F, fArr[]=new float[N];
        int i3=-14, i4=6, i5=94, i6=-29745, iArr[]=new int[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-69);
        FuzzerUtils.init(iArr, 181);
        FuzzerUtils.init(fArr, -105.790F);

        byArr[(i2 >>> 1) % N] = (byte)i2;
        iArr[(i2 >>> 1) % N] = (int)Test.instanceCount;
        i2 -= i2;
        f1 -= (float)25.90143;
        i3 = 1;
        while (++i3 < 218) {
            Test.instanceCount = i3;
            if (i2 != 0) {
            }
            for (i4 = 1; i4 < 7; ++i4) {
                i2 += (((i4 * Test.instanceCount) + Test.instanceCount) - i5);
                i6 = 1;
                while (++i6 < 2) {
                    i5 >>= (int)Test.instanceCount;
                    i5 = i4;
                    i2 += i6;
                    fArr = fArr;
                    i5 += (int)(15.360F + (i6 * i6));
                }
            }
        }
        long meth_res = i2 + Float.floatToIntBits(f1) + i3 + i4 + i5 + i6 + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        double d=-32.113458;
        int i7=-54071;
        byte by=58;
        float f2=-2.657F;

        d = (iMeth(i7) - Test.instanceCount);
        if (Test.bFld) {
            by += (byte)f2;
        } else {
            Test.iArrFld[(i7 >>> 1) % N] = i7;
            i7 <<= i7;
        }
        i7 = (int)Test.instanceCount;
        Test.iArrFld = FuzzerUtils.int1array(N, (int)129);
        i7 = (int)d;
        Test.iArrFld = FuzzerUtils.int1array(N, (int)13);
        f2 += (float)d;
        vMeth1_check_sum += Double.doubleToLongBits(d) + i7 + by + Float.floatToIntBits(f2);
    }

    public static void vMeth(int i, int i1, float f) {

        boolean b=false;
        short s=6637;
        int i8=-42609, i9=-178, i10=-57079, i11=9;
        double d1=0.110115;
        long l=20284L;

        b = b;
        vMeth1();
        i1 |= s;
        i = i;
        for (i8 = 6; i8 < 132; ++i8) {
            i += (((i8 * i8) + i8) - Test.instanceCount);
            for (i10 = 1; i10 < 12; ++i10) {
                i9 = i;
                Test.iArrFld[i10] >>>= (int)Test.instanceCount;
                d1 = -24215;
                Test.instanceCount = i8;
                i9 -= i9;
                l &= i1;
                Test.iArrFld[i10 - 1] += s;
                i11 -= i9;
            }
        }
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f) + (b ? 1 : 0) + s + i8 + i9 + i10 + i11 +
            Double.doubleToLongBits(d1) + l;
    }

    public void mainTest(String[] strArr1) {

        int i12=136, i13=-3567, i14=149, i15=114, i16=-155, i17=200, i18=3, i19=12461;
        double d2=120.28681, d3=-21.63977;

        vMeth(i12, i12, fFld);
        i13 = 1;
        do {
            for (d2 = 2; d2 < 87; d2 += 3) {
                i15 = 4;
                while ((i15 -= 3) > 0) {
                    if (Test.bFld) continue;
                    i12 = i14;
                    i14 &= -4481;
                    i14 = (int)d2;
                    i12 -= (int)fFld;
                    fFld += -1566285345L;
                    Test.lArrFld[(int)(d2 - 1)] += i15;
                    Test.lArrFld[i13] = Test.sFld;
                    i12 += (i15 - i14);
                    if (false) break;
                }
                i14 += (int)d2;
                Test.instanceCount <<= 8107;
                i14 += (45 + (d2 * d2));
                Test.iArrFld[i13] |= i15;
                i12 += 12;
                d3 += i12;
            }
            for (i16 = 2; i16 < 87; i16++) {
                Test.instanceCount %= ((long)(fFld) | 1);
                if (Test.bFld) break;
                i17 -= 4760;
                for (i18 = 2; i16 < i18; --i18) {
                    Test.instanceCount = i19;
                    if (Test.bFld) continue;
                    i19 = (int)Test.instanceCount;
                    i17 -= 3687;
                    i19 = (int)d3;
                }
            }
        } while (++i13 < 289);


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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
