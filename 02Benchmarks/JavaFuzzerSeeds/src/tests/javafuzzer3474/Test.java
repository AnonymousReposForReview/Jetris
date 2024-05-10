package tests.javafuzzer3474;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 09:05:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-68L;
    public short sFld=3363;
    public double dFld=-2.7040;
    public static float fFld=2.329F;
    public boolean bFld=true;
    public int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 120.715F);
        FuzzerUtils.init(Test.dArrFld, -2.5910);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i10, float f) {

        int i11=13, i12=13, i13=36185, i14=22139, i15=0, i16=-6609, iArr[]=new int[N];
        double d2=115.71433;
        boolean b=true;

        FuzzerUtils.init(iArr, -47);

        i10 = (int)Test.instanceCount;
        for (i11 = 8; i11 < 149; i11++) {
            iArr[i11] -= (int)d2;
            if (b) continue;
            d2 += 43L;
            i12 += (-64169 + (i11 * i11));
            for (i13 = 1; i13 < 11; ++i13) {
                i14 -= (int)d2;
                f = i11;
            }
            Test.instanceCount = 37932;
            if (false) continue;
            for (i15 = i11; i15 < 11; ++i15) {
                d2 -= i10;
            }
            iArr = iArr;
            try {
                i14 = (i12 % i10);
                iArr[i11] = (i16 / -55867);
                i10 = (i14 % i10);
            } catch (ArithmeticException a_e) {}
        }
        long meth_res = i10 + Float.floatToIntBits(f) + i11 + i12 + Double.doubleToLongBits(d2) + (b ? 1 : 0) + i13 +
            i14 + i15 + i16 + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i2, int i3) {

        int i4=25183, i5=200, i6=70, i7=32107, i8=-208, i9=-231, i17=1, i18=13, iArr1[]=new int[N];
        double d1=108.13628;
        float f1=1.937F;
        boolean b1=false;
        byte by=-110, byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-38);
        FuzzerUtils.init(iArr1, 7);

        for (i4 = 6; i4 < 304; i4++) {
            for (i6 = 6; i6 > 1; --i6) {
                short s1=27566;
                Test.fArrFld[i4 + 1] -= (float)Test.dArrFld[i6 + 1];
                switch (((((int)(i6 * d1)) >>> 1) % 8) + 119) {
                case 119:
                    i3 += (((i2 = i3) * (s1 - i6)) * (i5 - i7));
                    for (i8 = i4; i8 < 2; ++i8) {
                        i7 |= iMeth1(i7, f1);
                        switch ((i6 % 1) + 87) {
                        case 87:
                            i3 = i7;
                            break;
                        }
                    }
                case 120:
                    for (i17 = 1; 2 > i17; ++i17) {
                        Test.instanceCount += (i17 * Test.instanceCount);
                        byArr[i4 + 1] -= (byte)i8;
                    }
                    Test.instanceCount += i6;
                    break;
                case 121:
                    i3 = i3;
                    i3 >>= (int)Test.instanceCount;
                    break;
                case 122:
                    b1 = b1;
                case 123:
                    iArr1[i6] -= (int)d1;
                    break;
                case 124:
                    Test.instanceCount += (i6 + by);
                case 125:
                case 126:
                    i9 = -5;
                }
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d1) + i8 + i9 + Float.floatToIntBits(f1)
            + i17 + i18 + (b1 ? 1 : 0) + by + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public int iMeth(int i1) {

        int i19=-50317, i20=-57148, i21=25255, i22=-3, i23=2;

        iArrFld[(i1 >>> 1) % N] >>= (int)lMeth(i1, i1);
        i1 = i1;
        for (i19 = 19; i19 < 305; i19++) {
            Test.instanceCount = (long)87.4221;
            for (i21 = 1; 6 > i21; ++i21) {
                sFld = (short)i22;
                i23 = 1;
                do {
                    dFld = i19;
                    i22 += (int)Test.fFld;
                    if (i20 != 0) {
                    }
                    i1 *= (int)Test.fFld;
                } while (++i23 < 2);
                i20 = i22;
                Test.instanceCount += i20;
                i22 = i19;
                iArrFld[i21] -= i20;
            }
        }
        long meth_res = i1 + i19 + i20 + i21 + i22 + i23;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=1, i24=-12473, i25=8299, i26=-15062, i27=10, i28=92, i29=172, i30=-39967, i31=-99;
        double d=7.35869;
        short s=-17845, sArr[]=new short[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(sArr, (short)-19199);
        FuzzerUtils.init(bArr, false);

        Test.instanceCount += sArr[(i >>> 1) % N];
        i = i;
        d = 1;
        while (++d < 297) {
            Test.instanceCount <<= s;
            iArrFld[(int)(d - 1)] = (int)((iMeth(i) + Test.instanceCount) * Test.instanceCount);
            if (bFld) break;
            i += (int)(((d * Test.fFld) + Test.fFld) - i);
            for (i24 = (int)(d); 85 > i24; ++i24) {
                i += i24;
                for (i26 = 1; i26 > 1; i26--) {
                    dFld = 3356762982L;
                    Test.dArrFld[i26 - 1] -= i27;
                    Test.fFld -= i27;
                    i25 *= i25;
                    Test.fFld += (i26 * i26);
                    Test.instanceCount = i24;
                }
                bArr[(int)(d)] = true;
                i27 = i26;
                for (i28 = 1; i28 < 1; i28 += 2) {
                    i29 = i28;
                }
                for (i30 = 1; i30 < 1; i30++) {
                    i31 = i30;
                    Test.dArrFld[i30 + 1] -= i30;
                    i27 = i;
                    i31 >>= 60;
                    Test.instanceCount += (i30 * sFld);
                    iArrFld[i30 - 1] -= i30;
                }
                Test.instanceCount = i;
            }
        }
        iArrFld[(i26 >>> 1) % N] = (int)254965831450810334L;
        Test.instanceCount = i30;


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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}