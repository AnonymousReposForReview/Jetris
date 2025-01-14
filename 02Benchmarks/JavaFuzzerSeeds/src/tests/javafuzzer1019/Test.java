package tests.javafuzzer1019;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:55:13 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4L;
    public static float fFld=-15.584F;
    public boolean bFld=true;
    public byte byFld=-34;
    public double dFld=-1.87999;
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 3548773316974848520L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1, float f) {

        int i11=187, i12=42920, i13=-40694, i14=-28349, i15=-46, iArr[]=new int[N];
        byte by=18;
        boolean b2=true;

        FuzzerUtils.init(iArr, 60827);

        i11 = 1;
        while (++i11 < 201) {
            for (i12 = i11; i12 < 8; ++i12) {
                l1 = i11;
                switch ((i12 % 2) + 120) {
                case 120:
                    switch (((i11 % 4) * 5) + 67) {
                    case 71:
                        for (i14 = 1; i14 > 1; --i14) {
                            double d1=78.91282;
                            if (i11 != 0) {
                            }
                            l1 += (((i14 * Test.instanceCount) + i15) - f);
                            by += (byte)-80;
                            b2 = b2;
                            d1 -= d1;
                            i15 -= i14;
                            i13 = i14;
                            if (b2) continue;
                            i15 |= i11;
                        }
                    case 84:
                        iArr[i12 + 1] >>= -60779;
                        break;
                    case 75:
                        i13 += i12;
                    case 83:
                        iArr[i12 - 1] *= i12;
                    default:
                        i13 >>>= i11;
                    }
                    break;
                case 121:
                    i15 >>= i12;
                }
            }
        }
        long meth_res = l1 + Float.floatToIntBits(f) + i11 + i12 + i13 + i14 + i15 + by + (b2 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(double d, int i7, int i8) {

        int i9=10, i10=55234;
        boolean b1=true;
        short s=15875;

        for (i9 = 6; i9 < 356; i9++) {
            if (b1) continue;
            iMeth(Test.instanceCount, 44.53F);
            i7 -= (int)Test.instanceCount;
            i7 <<= i10;
            d = s;
            i10 >>>= i8;
            Test.fFld = Test.fFld;
            i8 *= 2;
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + (b1 ? 1 : 0) + s;
    }

    public static long lMeth(boolean b, long l, int i4) {

        int i5=149, i6=-192;
        double d2=-1.53822;

        Test.instanceCount = (long)((Test.fFld++) - ((i4 = i4) * i4));
        for (i5 = 3; i5 < 283; i5++) {
            vMeth(d2, i5, -12);
        }
        i4 = 188;
        long meth_res = (b ? 1 : 0) + l + i4 + i5 + i6 + Double.doubleToLongBits(d2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-26, i1=2, i2=-14, i3=3, i16=3341, i17=56911, i18=23061, i19=9, i20=42451, iArr1[][]=new int[N][N];
        short s1=14447;
        float f1=0.884F, f2=-38.231F, fArr[]=new float[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, 27);
        FuzzerUtils.init(fArr, 2.733F);
        FuzzerUtils.init(dArr, -2.82756);

        for (i = 6; i < 186; i++) {
            for (i2 = 5; i2 < 139; i2++) {
                Test.lArrFld[i] = (((121 * lMeth(bFld, Test.instanceCount, 13)) * i1) * i1);
                i3 -= -59894;
            }
            for (i16 = 139; i16 > i; --i16) {
                i1 += i16;
                i18 = 1;
                while (++i18 < 1) {
                    Test.instanceCount <<= Test.instanceCount;
                }
                Test.fFld *= s1;
                i3 += (((i16 * Test.fFld) + Test.instanceCount) - i3);
                iArr1[(i18 >>> 1) % N][i16 + 1] >>= byFld;
                i17 *= 6;
                i1 -= i2;
                i3 += i2;
                for (f1 = 1; 1 > f1; f1++) {
                    iArrFld[(int)(f1)] += (int)f1;
                    if (bFld) break;
                    f2 = byFld;
                    fArr = FuzzerUtils.float1array(N, (float)0.735F);
                    dFld -= -121.158F;
                    i19 += (int)f1;
                }
                i19 >>= -2;
            }
        }
        i20 = 359;
        while (--i20 > 0) {
            i19 *= s1;
            if (bFld) break;
            i19 += (i20 * i20);
        }
        dFld -= i20;
        dArr[(i18 >>> 1) % N] -= Test.instanceCount;
        i19 = i17;
        i17 = i3;


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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
