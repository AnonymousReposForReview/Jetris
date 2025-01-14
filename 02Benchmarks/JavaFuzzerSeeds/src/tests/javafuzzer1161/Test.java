package tests.javafuzzer1161;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 15:55:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1556300566L;
    public static double dFld=-77.23042;
    public static float fFld=-2.6F;
    public boolean bFld=false;
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-10714);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i7) {

        byte by=-45;
        int i8=2, i9=-14, i10=3758, iArr1[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr1, 51);

        l *= by;
        i8 = 1;
        do {
            switch (((i8 % 2) * 5) + 88) {
            case 91:
                i7 = (int)Test.dFld;
                i7 += (((i8 * i8) + Test.fFld) - l);
                i7 = i7;
            case 96:
                i7 += (i8 - Test.instanceCount);
                break;
            default:
                for (i9 = 8; i9 > i8; i9--) {
                    switch ((i9 % 2) + 123) {
                    case 123:
                    case 124:
                        iArr1[i8] = (int)l;
                        i7 += i10;
                    default:
                        i10 += i7;
                        try {
                            i10 = (i9 / i10);
                            i7 = (-281409321 / i9);
                            i10 = (i10 % 253);
                        } catch (ArithmeticException a_e) {}
                        b = b;
                    }
                    iArr1 = FuzzerUtils.int1array(N, (int)72);
                }
            }
        } while (++i8 < 210);
        vMeth1_check_sum += l + i7 + by + i8 + i9 + i10 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i5, int i6) {

        int i11=107, i12=15890, i13=-18186, iArr2[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -119.931F);
        FuzzerUtils.init(iArr2, -225);

        vMeth1(Test.instanceCount, -90);
        i5 <<= i5;
        for (i11 = 7; i11 < 314; ++i11) {
            i13 = 1;
            while (++i13 < 5) {
                short s1=32342;
                Test.fFld -= (float)Test.dFld;
                Test.dFld *= i11;
                i12 += (((i13 * i6) + Test.fFld) - i11);
                fArr[i13 - 1] = Test.fFld;
                i6 += (i13 * Test.instanceCount);
                Test.instanceCount = i13;
                if (true) break;
                switch ((i11 % 1) + 122) {
                case 122:
                    Test.dFld = i13;
                    iArr2[i11] = i6;
                    iArr2[i13 - 1] = i13;
                    break;
                default:
                    s1 += (short)(i13 + i5);
                }
            }
        }
        vMeth_check_sum += i5 + i6 + i11 + i12 + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr2);
    }

    public static float fMeth(int i2) {

        int i3=-11, i4=243, i14=13, i15=1, i16=161, i17=674, iArr3[]=new int[N];
        short s2=-6405;
        double dArr[]=new double[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr3, 50678);
        FuzzerUtils.init(dArr, 2.48043);
        FuzzerUtils.init(fArr1, 0.360F);

        for (i3 = 20; i3 < 356; i3++) {
            i2 = (int)(((Test.instanceCount + 18255) + (i2 &= i4)) + Test.instanceCount);
            vMeth(i4, 16040);
            Test.instanceCount = (long)Test.fFld;
            switch (((i3 % 1) * 5) + 49) {
            case 51:
                for (i14 = 1; i14 < 5; ++i14) {
                    i2 += 0;
                    i4 /= (int)(Test.instanceCount | 1);
                    Test.instanceCount -= 53666;
                    i15 += (((i14 * i2) + s2) - Test.fFld);
                    iArr3 = iArr3;
                }
                for (i16 = 1; i16 < 5; i16++) {
                    iArr3[i3 + 1] += i2;
                    dArr[i3 + 1] -= 107.83736;
                    i15 = i16;
                }
                break;
            default:
                Test.fFld -= i17;
            }
        }
        long meth_res = i2 + i3 + i4 + i14 + i15 + s2 + i16 + i17 + FuzzerUtils.checkSum(iArr3) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=5, i1=3, i18=-14, i19=15990, i20=-42444, i21=-27, i22=246, i23=0, i24=-2, i25=26465, i26=-2296,
            iArr[]=new int[N];
        short s=17976;
        long l1=12L, lArr[]=new long[N];
        boolean b1=false;
        double d=0.16632;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, 1);
        FuzzerUtils.init(byArr, (byte)27);
        FuzzerUtils.init(lArr, -3231945234L);

        for (i = 11; 282 > i; ++i) {
            float f=-68.678F;
            f += (0 + (i * i));
            iArr[i - 1] >>= Math.min(i1--, -(i1 * 8));
            s = (short)fMeth(i);
            for (i18 = 5; i18 < 93; i18++) {
                byte by1=51;
                l1 -= i18;
                if (b1) continue;
                if (b1) {
                    i19 += (((i18 * by1) + i18) - i19);
                }
                for (i20 = 1; i20 < 2; ++i20) {
                    if (bFld) {
                        Test.sArrFld[i] >>= (short)191;
                    }
                    iArr[i - 1] = -13;
                    l1 += (i20 ^ i19);
                    byArr[i20 - 1] %= (byte)(Test.instanceCount | 1);
                    lArr[i20 - 1] = i19;
                }
                i19 = i21;
            }
        }
        for (i22 = 16; 303 > i22; i22++) {
            Test.instanceCount += i;
        }
        i24 = 1;
        while (++i24 < 240) {
            d = 1;
            while ((d += 3) < 105) {
                i23 = s;
                s *= (short)Test.fFld;
                s += (short)(((d * i23) + Test.fFld) - Test.instanceCount);
                switch (((i24 % 2) * 5) + 93) {
                case 102:
                    Test.instanceCount += i22;
                case 97:
                    for (i25 = 1; i25 < 3; ++i25) {
                        lArr[i25] = i26;
                        i21 += (int)Test.fFld;
                        i23 -= (int)Test.fFld;
                    }
                    break;
                default:
                    i21 -= (int)Test.dFld;
                }
            }
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
