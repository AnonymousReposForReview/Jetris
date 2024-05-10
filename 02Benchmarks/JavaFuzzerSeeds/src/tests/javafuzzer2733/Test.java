package tests.javafuzzer2733;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:33:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-238L;
    public static int iFld=-7;
    public static double dFld=61.120581;
    public boolean bFld=false;
    public long lArrFld[]=new long[N];
    public static long lArrFld1[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld1, 9L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4) {

        float f2=-27.377F;
        int i5=-58, i6=-11, i7=30486, i8=-4, i9=-211, i10=-53894;
        short s=3318;

        for (f2 = 206; 4 < f2; f2--) {
            for (i6 = 8; i6 > f2; i6--) {
                Test.instanceCount -= i6;
            }
            for (i8 = 8; i8 > f2; i8 -= 2) {
                i4 = (int)-35.79484;
                i10 = 1;
                while (--i10 > 0) {
                    s = (short)Test.instanceCount;
                    Test.iFld = -36080;
                    i4 |= i8;
                    i5 -= i10;
                    s += (short)-226;
                }
                Test.instanceCount += i8;
                i4 += (int)f2;
                i4 += 33261;
                i9 += (5 + (i8 * i8));
            }
        }
        vMeth1_check_sum += i4 + Float.floatToIntBits(f2) + i5 + i6 + i7 + i8 + i9 + i10 + s;
    }

    public static void vMeth(float f1) {

        int i3=202, i11=4, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -11);

        Test.iFld *= (int)((++Test.iFld) + (-(1.386F + (--Test.iFld))));
        i3 = 1;
        while (++i3 < 248) {
            Test.iFld += (int)f1;
            Test.instanceCount += i3;
            vMeth1(Test.iFld);
            i11 = 1;
            do {
                Test.lArrFld1[i11 + 1] = Test.iFld;
                Test.instanceCount = i11;
                Test.iFld = Test.iFld;
                f1 += Test.iFld;
                Test.iFld += (i11 * i11);
                Test.iFld >>= (int)Test.instanceCount;
                Test.lArrFld1[i11 + 1] = Test.iFld;
                iArr1[i3] *= Test.iFld;
                Test.instanceCount = i3;
            } while (++i11 < 7);
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i3 + i11 + FuzzerUtils.checkSum(iArr1);
    }

    public int iMeth(boolean b) {

        int i=157, i1=88, i2=-14;
        float f=-1.492F;

        for (i = 4; i < 229; i++) {
            if (false) {
                f = (float)Test.dFld;
                i1 >>= (int)Test.instanceCount;
                i2 = 1;
                while (++i2 < 7) {
                    if (i1 != 0) {
                    }
                    Test.instanceCount = (Test.instanceCount++);
                    vMeth(f);
                    i1 = i2;
                    Test.iFld >>= i1;
                }
            } else {
                i1 += (i | Test.iFld);
                i1 += -6;
                Test.iFld += (i * i1);
                Test.iFld += (((i * f) + f) - Test.instanceCount);
            }
            Test.iFld += i;
        }
        long meth_res = (b ? 1 : 0) + i + i1 + Float.floatToIntBits(f) + i2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=0.35505;
        int i12=-110, i13=3275, i14=-13, i15=-54065, i16=-181, i17=-115, i18=-15301, i19=53397, i20=-191, i21=-1,
            i22=48518, i23=-159, iArr[]=new int[N];
        float f3=2.527F;
        byte by=-71;
        short s1=1308;

        FuzzerUtils.init(iArr, 25766);

        Test.iFld = (int)((Math.min(Test.instanceCount, Test.instanceCount) - 42675L) + (Test.instanceCount *
            (++iArr[(Test.iFld >>> 1) % N])));
        Test.iFld = (int)((Test.iFld--) - ((Test.iFld + d) + (lArrFld[(Test.iFld >>> 1) % N]++)));
        Test.iFld *= iMeth(bFld);
        iArr[(Test.iFld >>> 1) % N] += Test.iFld;
        for (i12 = 16; i12 < 338; i12 += 2) {
            i13 = i14;
            for (i15 = 1; i15 < 156; i15++) {
                for (i17 = 2; i17 > 1; i17--) {
                    iArr[i17] >>= -5;
                    i16 <<= i13;
                    i13 += Test.iFld;
                }
                f3 += i16;
                i18 += i13;
                iArr[i12] -= by;
                i16 += i15;
                i19 = 1;
                while (++i19 < 2) {
                    Test.instanceCount = (long)f3;
                    d -= Test.iFld;
                    Test.iFld += (i19 * i19);
                }
                i13 >>= s1;
                Test.instanceCount += (i15 + s1);
                i14 = Test.iFld;
            }
        }
        for (i20 = 16; i20 < 379; i20++) {
            i13 += i20;
        }
        for (i22 = 17; i22 < 295; ++i22) {
            i21 >>= Test.iFld;
            iArr[i22 - 1] >>= (int)Test.instanceCount;
        }
        s1 <<= (short)Test.instanceCount;
        iArr[(i19 >>> 1) % N] = (int)f3;
        Test.instanceCount += by;


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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
