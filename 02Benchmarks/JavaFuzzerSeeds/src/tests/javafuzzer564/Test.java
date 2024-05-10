package tests.javafuzzer564;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:58:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=29665L;
    public static int iFld=-7;
    public static double dFld=-19.28885;
    public static float fFld=109.398F;
    public static boolean bArrFld[]=new boolean[N];
    public byte byArrFld[]=new byte[N];
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.lArrFld, -10L);
        FuzzerUtils.init(Test.fArrFld, 0.386F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i4, int i5, int i6) {

        short s=21467, sArr[]=new short[N];
        byte by1=53;
        int i7=12425, i8=-12, i9=-2331, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 41);
        FuzzerUtils.init(sArr, (short)-30840);

        Test.dFld += -117.59F;
        s -= (short)Test.fFld;
        Test.instanceCount += i5;
        Test.iFld = by1;
        for (i7 = 5; 129 > i7; i7++) {
            Test.lArrFld[i7 - 1] |= i5;
            iArr2[i7] -= (int)Test.fFld;
            Test.fFld += i8;
            i8 = i7;
            i9 = 1;
            while (++i9 < 13) {
                i5 = i7;
                if (i9 != 0) {
                }
                sArr[i9 - 1] = (short)Test.fFld;
                s += (short)(i9 * i9);
                i5 /= (int)((long)(Test.fFld) | 1);
            }
        }
        long meth_res = i4 + i5 + i6 + s + by1 + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(sArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i10=-65, i11=59019, i12=-3, i13=16038, i14=249, i15=-53588, i16=175, iArr1[]=new int[N];
        boolean b1=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr1, 14773);
        FuzzerUtils.init(fArr, -109.21F);

        iArr1[(Test.iFld >>> 1) % N] *= (int)((iMeth1(Test.iFld, 5314, Test.iFld) - Test.fFld) * Test.iFld);
        if (b1) {
            Test.fFld += Test.iFld;
            for (i10 = 7; i10 < 245; i10++) {
                iArr1 = iArr1;
                for (i12 = 7; 1 < i12; --i12) {
                    Test.lArrFld = Test.lArrFld;
                }
                for (i14 = i10; 7 > i14; ++i14) {
                    i13 >>= i15;
                    i16 = 1;
                    while (++i16 < 1) {
                        short s1=12953;
                        Test.fFld += (((i16 * Test.fFld) + Test.instanceCount) - i13);
                        i11 = i13;
                        i11 *= s1;
                        i11 |= i11;
                        if (true) break;
                    }
                }
            }
        } else if (b1) {
            fArr[(i11 >>> 1) % N] = i13;
        } else {
            i15 = -1;
        }
        long meth_res = i10 + i11 + i12 + i13 + i14 + i15 + i16 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(byte by, int i, long l) {

        float f=-1.347F;
        int i1=-107, i2=-51707, i3=-9, iArr[]=new int[N];
        boolean b=true;
        double d=97.25254;

        FuzzerUtils.init(iArr, -8);

        i = Test.iFld;
        i = (int)22L;
        for (f = 11; f < 189; ++f) {
            Test.iFld |= iArr[(int)(f)];
            i2 = 1;
            while (++i2 < 9) {
                i3 = 1;
                while (++i3 < 1) {
                    b = Test.bArrFld[i2];
                    i1 = (int)((-iArr[i3 - 1]) + ((i1--) - (Test.iFld - l)));
                    l -= (l = (++Test.iFld));
                    i += i3;
                    Test.instanceCount >>= (long)(i3 - d);
                    byArrFld[(int)(f)] = (byte)((iArr[(int)(f)]++) - (i1 *= iMeth()));
                    Test.iFld += i3;
                    Test.iFld = i1;
                    Test.instanceCount = 26918;
                }
            }
        }
        vMeth_check_sum += by + i + l + Float.floatToIntBits(f) + i1 + i2 + i3 + (b ? 1 : 0) +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        byte by2=-6;
        int i17=-195, i18=-16118, i19=59821, i20=-11326, i21=-31103;
        float f1=30.514F, f2=2.778F;
        boolean b2=true;
        short s2=24692;

        vMeth(by2, Test.iFld, 65221L);
        Test.dFld = Test.iFld;
        for (i17 = 10; i17 < 228; i17++) {
            Test.instanceCount &= Test.instanceCount;
            Test.iFld = Test.iFld;
            f1 = 1;
            do {
                i18 += (0 + (f1 * f1));
                if (b2) continue;
                i18 += i17;
                switch (((i17 % 3) * 5) + 85) {
                case 96:
                    switch ((i17 % 5) + 35) {
                    case 35:
                        Test.iFld += (int)(f1 * i17);
                        Test.fArrFld[i17] += 101.582F;
                        break;
                    case 36:
                        i18 = -171;
                        break;
                    case 37:
                        iArrFld[i17 + 1] &= (int)Test.instanceCount;
                        break;
                    case 38:
                        for (i19 = (int)(f1); i19 < 1; ++i19) {
                            iArrFld[(int)(f1 - 1)] *= i17;
                            Test.dFld -= -3;
                            Test.iFld /= (int)(by2 | 1);
                            i18 += (i19 * i19);
                            Test.iFld -= i19;
                            Test.lArrFld[i19 + 1] = i20;
                            Test.lArrFld[i17] = Test.iFld;
                            Test.instanceCount <<= i20;
                        }
                    case 39:
                    }
                    Test.instanceCount ^= i19;
                    break;
                case 88:
                    if (false) break;
                    for (f2 = 1; 1 > f2; ++f2) {
                        s2 *= (short)Test.fFld;
                        i18 >>= (int)Test.instanceCount;
                        i18 = i17;
                    }
                case 87:
                    i20 = Test.iFld;
                }
            } while (++f1 < 115);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
