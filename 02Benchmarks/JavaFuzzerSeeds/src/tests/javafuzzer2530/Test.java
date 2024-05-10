package tests.javafuzzer2530;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:19:52 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=3986402478L;
    public static int iFld=8;
    public static float fFld=-66.624F;
    public boolean bFld=true;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(int i10, float f) {

        int i11=-148, i12=-8, i13=-54404, i14=197, i15=7, i16=29899, iArr[]=new int[N];
        short s1=-2618;
        byte by1=62;
        boolean b=false, b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -13L);
        FuzzerUtils.init(iArr, 30744);

        lArr[(i11 >>> 1) % N] += Test.iFld;
        i12 = 1;
        do {
            for (i13 = 1; i13 < 9; i13++) {
                if (b) {
                    i14 += (((i13 * i14) + Test.instanceCount) - i11);
                    s1 -= by1;
                    lArr[i13 + 1] -= i14;
                    iArr[i12] <<= (int)43928L;
                } else if (b1) {
                    i11 = Test.iFld;
                }
                for (i15 = 1; i15 < 2; i15 += 3) {
                    i11 = (int)f;
                    switch (((i15 >>> 1) % 4) + 35) {
                    case 35:
                        lArr[i12] *= i11;
                        Test.instanceCount -= (long)-72.13642;
                        Test.instanceCount = i16;
                        break;
                    case 36:
                    case 37:
                        iArr[i12] *= by1;
                        break;
                    case 38:
                        f += i10;
                        break;
                    default:
                        if (Test.iFld != 0) {
                        }
                    }
                }
            }
        } while (++i12 < 172);
        long meth_res = i10 + Float.floatToIntBits(f) + i11 + i12 + i13 + i14 + s1 + by1 + (b ? 1 : 0) + (b1 ? 1 : 0) +
            i15 + i16 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(int i4, byte by) {

        double d1=0.52977;
        int i5=-5, i6=5, i7=63326, i8=16990, i9=-4;
        short s=-21001;
        boolean b2=false;

        for (d1 = 3; 126 > d1; ++d1) {
            i5 = (--s);
            for (i6 = 1; i6 < 13; ++i6) {
                for (i8 = 1; i8 < 2; ++i8) {
                    Test.instanceCount = (long)(((i6 - i4) - (Test.instanceCount + 1229566055L)) * ((-dMeth(-18,
                        Test.fFld)) * i5));
                    Test.instanceCount += Test.instanceCount;
                    Test.fFld = i6;
                    i7 %= (int)((long)(Test.fFld) | 1);
                    if (b2) break;
                    Test.instanceCount |= by;
                    Test.instanceCount += by;
                    Test.iFld += i8;
                }
                i4 >>>= i6;
                i4 = (int)d1;
                i5 = i7;
            }
        }
        vMeth_check_sum += i4 + by + Double.doubleToLongBits(d1) + i5 + s + i6 + i7 + i8 + i9 + (b2 ? 1 : 0);
    }

    public static int iMeth(int i) {

        int i1=-12, i2=-7, i3=28780, i17=88, i18=-19592, i19=-12, i20=-123;
        double d=-2.117738;
        byte by2=58;
        boolean b3=false;

        Test.instanceCount = (Short.reverseBytes((short)(-i)) + ((i - 17848) + (Test.instanceCount -
            Test.instanceCount)));
        for (i1 = 8; i1 < 254; ++i1) {
            Test.instanceCount *= (-(--i2));
            for (d = 7; d > i1; d--) {
                i2 = (int)(Test.instanceCount * ((i - -5) * (--Test.fFld)));
                vMeth(i, by2);
                for (i17 = (int)(d); 1 > i17; ++i17) {
                    Test.iFld = 407;
                }
                b3 = b3;
                for (i19 = (int)(d); i19 < 1; i19++) {
                    i18 += i17;
                    Test.instanceCount = i3;
                    i3 += (-7 + (i19 * i19));
                    Test.instanceCount += (((i19 * Test.instanceCount) + Test.instanceCount) - i1);
                    by2 += (byte)(((i19 * i17) + i18) - Test.iFld);
                }
            }
        }
        long meth_res = i + i1 + i2 + Double.doubleToLongBits(d) + i3 + by2 + i17 + i18 + (b3 ? 1 : 0) + i19 + i20;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i21=-54, i22=155, i23=-69, i24=235, i25=13, i26=11164, i27=-90, i28=-132, i29=-10, iArr1[]=new int[N];
        short s2=-8247, sArr[]=new short[N];
        double d2=0.128453;
        boolean b5=false;
        byte by3=44;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 3622435190905328566L);
        FuzzerUtils.init(sArr, (short)-25299);
        FuzzerUtils.init(iArr1, 29010);

        Test.iFld = (int)(iMeth(Test.iFld) - Test.instanceCount);
        i21 = 223;
        while (--i21 > 0) {
            for (i22 = 5; i22 < 113; i22++) {
                lArr1[i21 - 1] = i23;
                Test.iFld = i21;
                for (i24 = 2; i24 > i22; --i24) {
                    boolean b4=false;
                    Test.instanceCount -= s2;
                    Test.instanceCount += (long)Test.fFld;
                    sArr[i21 + 1] ^= (short)i21;
                    d2 = Test.fFld;
                    Test.iFld += (((i24 * Test.instanceCount) + i25) - i23);
                    if (b4) continue;
                }
                i25 = i23;
            }
            Test.fFld += Test.iFld;
            if (true) {
                Test.iFld += (((i21 * Test.fFld) + i22) - Test.instanceCount);
                for (i26 = 6; i26 < 113; i26++) {
                    Test.instanceCount += i26;
                    i27 = (int)Test.instanceCount;
                    b5 = b5;
                    i27 *= (int)Test.instanceCount;
                    switch ((((i24 >>> 1) % 2) * 5) + 7) {
                    case 9:
                        if (bFld) break;
                        i25 += (((i26 * i21) + by3) - i21);
                        Test.iFld -= i23;
                        break;
                    case 11:
                    }
                    iArr1[(i22 >>> 1) % N] -= i26;
                }
                i23 = (int)Test.instanceCount;
            } else {
                for (i28 = 7; i28 < 113; i28++) {
                    Test.fFld *= i29;
                    i29 += (i28 * i29);
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
