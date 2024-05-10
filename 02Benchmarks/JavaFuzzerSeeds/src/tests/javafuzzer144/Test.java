package tests.javafuzzer144;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:01:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-228L;
    public static volatile double dFld=1.24234;
    public boolean bFld=false;
    public short sFld=31794;
    public double dArrFld[]=new double[N];

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(long l1, int i3) {

        int i4=151, i5=-168, i6=7053, i7=62426, i8=61731, i9=14;
        short s1=-19030;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -8159L);

        for (i4 = 3; i4 < 187; ++i4) {
            for (i6 = 1; i6 < 9; ++i6) {
                i7 = (int)-135L;
                l1 -= i6;
                i7 *= i6;
                Test.instanceCount = l1;
                lArr[i6 - 1] /= (l1 | 1);
                i5 += (int)1191898397L;
                i3 = i3;
                for (i8 = 1; i8 < 2; ++i8) {
                    i9 -= i4;
                    i3 ^= s1;
                    i9 += i8;
                    if (i4 != 0) {
                    }
                    i3 -= (int)1.93F;
                }
            }
        }
        long meth_res = l1 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + s1 + FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(double d, long l) {

        int i1=9, i2=-7, i10=-4, i11=1, iArr[]=new int[N];
        boolean b1=true, bArr[]=new boolean[N];
        float f=2.232F;
        long l2=2110647543115694227L, lArr1[]=new long[N];
        byte by=86;

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr, -10267);
        FuzzerUtils.init(lArr1, -144L);

        i1 = 1;
        do {
            if ((b1 = b1) && (b1 = ((i2--) != (i1 - l)))) break;
            if ((--i2) != (fMeth(l, 9) + Test.instanceCount)) continue;
            bArr[i1] = b1;
        } while (++i1 < 136);
        for (f = 6; 395 > f; ++f) {
            for (l2 = (long)(f); l2 < 4; l2++) {
                i10 = (int)-7L;
                iArr[(int)(l2 + 1)] /= (int)((long)(f) | 1);
                i10 >>>= i2;
                Test.instanceCount -= i1;
                i10 += i10;
                lArr1 = lArr1;
                i2 >>>= 15710;
                by += (byte)(-10 + (l2 * l2));
                b1 = b1;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + l + i1 + (b1 ? 1 : 0) + i2 + Float.floatToIntBits(f) + i10 + l2
            + i11 + by + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vSmallMeth(short s, boolean b, int i) {


        vMeth(Test.dFld, 12L);
        vSmallMeth_check_sum += s + (b ? 1 : 0) + i;
    }

    public void mainTest(String[] strArr1) {

        int i12=-7, i13=13, i14=41, i15=-21, i16=79, i17=6, i18=-184, i19=42029, i20=-2, i21=-5, i22=-11, i23=40743,
            iArr1[]=new int[N];
        float f1=119.101F;
        byte by1=-44;

        FuzzerUtils.init(iArr1, 3);

        for (int smallinvoc=0; smallinvoc<881; smallinvoc++) vSmallMeth((short)(741), bFld, i12);
        i12 = (int)f1;
        for (i13 = 3; 125 > i13; ++i13) {
            Test.instanceCount += (-6 + (i13 * i13));
            for (i15 = 9; i15 < 205; ++i15) {
                Test.instanceCount += (i15 | i17);
                i14 -= i13;
                i17 -= (int)f1;
                by1 >>= (byte)i12;
            }
        }
        i18 = 1;
        while (++i18 < 334) {
            dArrFld[i18 + 1] -= 51.1669;
            i19 = 1;
            do {
                f1 -= Test.instanceCount;
                Test.instanceCount = -37L;
                for (i20 = i18; 1 > i20; i20++) {
                    Test.instanceCount += (i20 + i14);
                    sFld += (short)(((i20 * Test.instanceCount) + Test.instanceCount) - i13);
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount = 7;
                }
                Test.dFld *= i20;
                iArr1[(i17 >>> 1) % N] -= (int)Test.instanceCount;
                iArr1[i18] += (int)f1;
                f1 += i14;
                i16 -= (int)Test.instanceCount;
                i17 ^= 191;
                i12 -= (int)f1;
            } while (++i19 < 75);
        }
        Test.instanceCount += 57;
        for (i22 = 7; i22 < 203; i22++) {
            Test.instanceCount += (i22 - Test.instanceCount);
            i16 += i14;
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
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  fMeth ->  fMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
