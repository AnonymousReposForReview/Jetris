package tests.javafuzzer2573;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:50:03 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2L;
    public int iFld=-2;
    public static float fFld=2.753F;
    public static double dFld=-1.77931;
    public static byte byFld=-82;
    public int iFld1=-5;
    public static int iFld2=-14;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth(int i, float f1, int i1) {

        double d=1.17496;

        i1 <<= (int)(d + (-Test.instanceCount));
        i = (int)(++Test.instanceCount);
        vMeth_check_sum += i + Float.floatToIntBits(f1) + i1 + Double.doubleToLongBits(d);
    }

    public static void vMeth1(long l1, int i3) {

        long l2=-8L, lArr[]=new long[N];
        int i4=-191, i5=-7, i6=213, i7=4, i8=7, i9=-122, i10=-208;

        FuzzerUtils.init(lArr, -8124418532839836543L);

        for (l2 = 15; 335 > l2; ++l2) {
            for (i5 = 1; i5 < 5; i5++) {
                for (i7 = 1; i7 < 2; ++i7) {
                    float f2=-1.864F;
                    vMeth(i3, f2, i7);
                    i4 = -3;
                    i8 += (int)(124.56F + (i7 * i7));
                    i4 *= 9;
                    i3 -= (int)l1;
                    lArr[(int)(l2 + 1)] = i9;
                    f2 -= i4;
                }
                i9 = (int)123.64672;
                i10 = i9;
                i8 += i5;
                Test.instanceCount -= Test.instanceCount;
                i3 += i5;
            }
        }
        vMeth1_check_sum += l1 + i3 + l2 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i2) {

        short s1=4920;
        byte by=-46;
        int i11=152, i12=13210, i13=2;
        long lArr1[]=new long[N], lArr2[][]=new long[N][N];

        FuzzerUtils.init(lArr1, -9196951290624594016L);
        FuzzerUtils.init(lArr2, -3365731963L);

        vMeth1(Test.instanceCount, i2);
        Test.fFld -= i2;
        Test.instanceCount &= i2;
        lArr1[(-171 >>> 1) % N] >>= i2;
        s1 <<= (short)i2;
        i2 *= -98;
        by = (byte)i2;
        i11 = 1;
        while (++i11 < 378) {
            i2 += i11;
        }
        for (i12 = 3; i12 < 329; ++i12) {
            i13 += 4;
            Test.instanceCount += (i12 * i12);
            Test.instanceCount += (i12 ^ (long)Test.fFld);
            Test.instanceCount += -82;
        }
        lArr2[(i12 >>> 1) % N][(i12 >>> 1) % N] -= by;
        long meth_res = i2 + s1 + by + i11 + i12 + i13 + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(lArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=106.759F;
        short s=26361;
        long l=-7577421383531048004L;
        int i14=-7, i15=13, i16=-25171, i17=66, iArr[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr, -65);

        iArr[(iFld >>> 1) % N] = (int)((long)(Math.min(iFld, iFld) - f) << (s % (iFld | 1)));
        l = 154;
        while (--l > 0) {
            vMeth(iMeth(iFld), Test.fFld, iFld);
            iFld += (int)(l - Test.instanceCount);
            iFld *= iFld;
            i14 -= (int)-44422L;
            i15 = 1;
            do {
                for (i16 = 1; i16 < 1; i16++) {
                    Test.dFld += l;
                    switch ((i16 % 7) + 104) {
                    case 104:
                        iFld += (i16 * i16);
                        Test.instanceCount &= 109;
                        break;
                    case 105:
                        switch (((iFld >>> 1) % 4) + 83) {
                        case 83:
                            iArr[(i16 >>> 1) % N] = i14;
                            break;
                        case 84:
                            Test.instanceCount -= Test.instanceCount;
                            Test.instanceCount = 126;
                            s = (short)iFld;
                        case 85:
                            Test.byFld >>>= Test.byFld;
                            break;
                        case 86:
                            Test.byFld = (byte)iFld1;
                            Test.instanceCount += i14;
                            break;
                        }
                        i17 = (int)f;
                        break;
                    case 106:
                        Test.iFld2 += iFld;
                        i17 &= Test.iFld2;
                    case 107:
                        iArr[(int)(l + 1)] = (int)Test.instanceCount;
                        if (b) {
                            iFld = (int)l;
                            Test.dFld = l;
                            i17 += Test.iFld2;
                            iArr[i16 - 1] |= (int)1871296679L;
                        } else {
                            iFld1 -= s;
                        }
                    case 108:
                        if (b) break;
                        break;
                    case 109:
                        iFld1 = (int)l;
                        break;
                    case 110:
                        iArr[i15 + 1] -= (int)l;
                        break;
                    }
                }
            } while (++i15 < 163);
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
//DEBUG  vMeth ->  vMeth mainTest vMeth1 iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
