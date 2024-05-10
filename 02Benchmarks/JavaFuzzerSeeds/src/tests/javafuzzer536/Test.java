package tests.javafuzzer536;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:23:52 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=28430L;
    public static int iFld=-47530;
    public static float fFld=-84.926F;
    public static byte byFld=-58;
    public static volatile short sFld=16305;
    public volatile int iArrFld[]=new int[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(long l2, long l3) {

        int i11=8, i12=1, i13=-13, i14=14, i15=-7973, iArr[]=new int[N];
        byte by=56;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(fArr, 43.625F);
        FuzzerUtils.init(lArr, -154L);

        iArr[(Test.iFld >>> 1) % N] = (int)Test.fFld;
        i11 = 1;
        while (++i11 < 126) {
            Test.iFld -= (int)Test.instanceCount;
            by -= by;
            fArr[i11 - 1] = l3;
            if (Test.iFld != 0) {
            }
            for (i12 = 12; i12 > 1; --i12) {
                switch (((i12 % 1) * 5) + 8) {
                case 10:
                    Test.iFld = i12;
                    i13 += i12;
                    i13 += i11;
                    for (i14 = 1; 2 > i14; i14 += 3) {
                        Test.iFld += i14;
                        lArr[i14] = Test.iFld;
                        Test.fFld -= l2;
                    }
                }
            }
        }
        long meth_res = l2 + l3 + i11 + by + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(long l1, int i4) {

        short s=-1371, sArr[]=new short[N];
        int i5=-4, i6=5, i7=-24133, i8=63, i9=16, i10=-227, iArr1[]=new int[N];
        float f=1.881F;
        double d=69.107653;

        FuzzerUtils.init(sArr, (short)29179);
        FuzzerUtils.init(iArr1, 185);

        s = (short)((--i4) * ((i4 - i4) + (sArr[(Test.iFld >>> 1) % N] = (short)i4)));
        for (i5 = 16; i5 < 289; i5++) {
            i4 = Test.iFld;
        }
        f *= i5;
        for (i7 = 7; 358 > i7; i7++) {
            for (i9 = 5; i9 > i7; i9 -= 2) {
                s = (short)(i7 - (dMeth(l1, l1) + Test.fFld));
                f -= i7;
                try {
                    Test.iFld = (Test.iFld % iArr1[i7 + 1]);
                    i4 = (Test.iFld / i10);
                    iArr1[i9] = (i7 % iArr1[i9]);
                } catch (ArithmeticException a_e) {}
                switch ((i7 % 1) + 107) {
                case 107:
                    s >>= (short)i5;
                    i8 -= (int)d;
                    l1 += (((i9 * Test.iFld) + i4) - i10);
                    break;
                default:
                    i4 += (i9 * i9);
                    Test.iFld += (((i9 * i7) + i8) - Test.byFld);
                }
            }
        }
        vMeth_check_sum += l1 + i4 + s + i5 + i6 + Float.floatToIntBits(f) + i7 + i8 + i9 + i10 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(long l, int i) {

        int i1=-24461, i2=-8, i3=-197;
        short s1=11927;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -2.515F);

        for (i1 = 2; 211 > i1; ++i1) {
            i3 = 1;
            while (++i3 < 8) {
                vMeth(Test.instanceCount, i3);
                if (i2 != 0) {
                }
                switch ((((i1 >>> 1) % 10) * 5) + 20) {
                case 59:
                    Test.iFld += i1;
                    i >>= (int)l;
                    break;
                case 53:
                    l += Test.iFld;
                    fArr1[i3 + 1] -= Test.iFld;
                    break;
                case 68:
                    l = Test.iFld;
                case 46:
                    i2 = 0;
                    i2 -= i3;
                    fArr1 = fArr1;
                    Test.instanceCount <<= Test.iFld;
                    break;
                case 24:
                    Test.fFld += (((i3 * Test.instanceCount) + Test.fFld) - i2);
                    break;
                case 49:
                    Test.iFld = Test.iFld;
                    break;
                case 62:
                    i2 >>= s1;
                    break;
                case 31:
                    if (i3 != 0) {
                    }
                case 26:
                    Test.iFld += (i3 | i3);
                    break;
                case 40:
                    i2 += (((i3 * s1) + i1) - i2);
                default:
                    i2 ^= i2;
                }
            }
        }
        long meth_res = l + i + i1 + i2 + i3 + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=-2, i17=99, i18=13, i19=-206, i20=-22347, i21=-20736, i22=23933, i23=-51603, i24=207;
        double d1=1.7361;
        boolean b=true;
        float fArr2[]=new float[N];
        short sArr1[]=new short[N];

        FuzzerUtils.init(fArr2, 1.776F);
        FuzzerUtils.init(sArr1, (short)30095);

        Test.iFld = (int)((14L * Test.iFld) - ((Test.fFld * Test.fFld) - iMeth(-5966L, i16)));
        for (d1 = 351; d1 > 7; d1--) {
            for (i18 = 3; 73 > i18; i18++) {
                Test.instanceCount += (13456 + (i18 * i18));
                i17 = i18;
                Test.instanceCount += (long)d1;
                Test.iFld = i16;
                iArrFld[(int)(d1 + 1)] = i18;
                Test.instanceCount %= (i17 | 1);
                i20 = 1;
                do {
                    Test.instanceCount -= (long)Test.fFld;
                    i19 = i20;
                    Test.fFld += i18;
                } while (++i20 < 2);
                Test.sFld = (short)Test.iFld;
                Test.instanceCount = 28533;
            }
            Test.instanceCount *= i17;
            for (i21 = (int)(d1); i21 < 73; i21++) {
                i23 = 1;
                while (++i23 < 1) {
                    long l4=-55329L;
                    if (b) continue;
                    switch ((int)((d1 % 9) + 50)) {
                    case 50:
                        Test.instanceCount = i20;
                        if (b) break;
                        switch (((i23 % 2) * 5) + 90) {
                        case 92:
                            i16 += (int)Test.fFld;
                            Test.instanceCount &= i20;
                            fArr2[(int)(d1)] = i18;
                            break;
                        case 94:
                            if (b) continue;
                            try {
                                i19 = (i16 % i19);
                                i17 = (iArrFld[i23 - 1] % iArrFld[i23]);
                                i16 = (iArrFld[i21] / i21);
                            } catch (ArithmeticException a_e) {}
                            break;
                        }
                        break;
                    case 51:
                        i19 >>= 29573;
                        sArr1[i21] -= (short)d1;
                    case 52:
                        Test.instanceCount += -127;
                        break;
                    case 53:
                        i24 = -12975;
                        break;
                    case 54:
                        i22 <<= -8;
                        break;
                    case 55:
                        i19 = (int)l4;
                        break;
                    case 56:
                        i16 = -27785;
                        break;
                    case 57:
                        Test.sFld += (short)(i23 * i23);
                        break;
                    case 58:
                        iArrFld[(int)(d1 + 1)] = -60409;
                        break;
                    }
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}