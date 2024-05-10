package tests.javafuzzer1150;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 15:54:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=137L;
    public int iFld=-6;
    public static int iFld1=8;
    public static double dFld=0.102221;
    public static int iFld2=-15929;
    public static volatile boolean bFld=true;
    public long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];
    public boolean bArrFld[]=new boolean[N];

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public long lMeth(long l1) {


        lArrFld[(iFld >>> 1) % N] <<= Math.max(--iFld, --iFld);
        long meth_res = l1;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i10, int i11, int i12) {

        int i13=-90, i14=-9, i15=-34140, i16=13, i17=26985, i18=49, i19=-57837, i20=209, iArr1[]=new int[N];
        float f1=2.968F;
        boolean b=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -5716474796296045884L);
        FuzzerUtils.init(iArr1, -38045);

        switch ((((i10 >>> 1) % 7) * 5) + 92) {
        case 105:
            lArr1 = lArr1;
            i13 = 1;
            while (++i13 < 130) {
                i12 >>= (int)1L;
            }
        case 107:
            for (i14 = 3; i14 < 171; i14 += 3) {
                i15 -= 20957;
                for (i16 = 1; i16 < 27; i16 += 2) {
                    for (i18 = 1; i18 < 3; i18++) {
                        i11 = (int)-152L;
                        i15 = i12;
                        i15 -= i17;
                        Test.iFld1 = (int)f1;
                    }
                    i20 = 1;
                    do {
                        if (true) break;
                        b = b;
                    } while (++i20 < 3);
                }
            }
            break;
        case 97:
            i17 <<= i15;
            break;
        case 98:
            lArr1[(i16 >>> 1) % N] += i13;
            break;
        case 115:
            iArr1[(Test.iFld1 >>> 1) % N] &= i14;
            break;
        case 118:
        case 96:
            Test.instanceCount -= i16;
        }
        vMeth1_check_sum += i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19 + Float.floatToIntBits(f1) + i20
            + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(long l2, int i4) {

        int i5=49, i6=12, i7=-164, i8=-36535, i9=18296, iArr[]=new int[N];
        short s=-4833;
        float f=1.679F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 182);
        FuzzerUtils.init(lArr, -18859L);

        for (i5 = 361; i5 > 16; --i5) {
            if ((~(i5 * (i6 + Test.instanceCount))) != Integer.reverseBytes(i5)) break;
            i4 += (int)(l2 + (++iArr[i5]));
            Test.instanceCount += (~(Math.min(Test.instanceCount, Test.instanceCount) + Test.instanceCount));
            i7 = 5;
            while (--i7 > 0) {
                s <<= (short)(-3 * i4);
                lArr[(0 >>> 1) % N] *= i6;
                for (i8 = 1; i8 < 1; ++i8) {
                    i4 &= (i4++);
                    i9 += (i8 * i8);
                }
                l2 += i7;
                i6 += i7;
                f += (((i7 * Test.instanceCount) + i6) - f);
                vMeth1(i4, 3, i9);
                Test.iFld1 = i6;
            }
        }
        long meth_res = l2 + i4 + i5 + i6 + i7 + s + i8 + i9 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i1, long l) {

        int i2=-26, i3=45953, i21=15948, i22=48, i23=40, i24=-13, i25=4;
        byte by=91;
        float f2=-44.192F;
        short s1=10882;

        for (i2 = 314; i2 > 16; --i2) {
            lMeth((iFld += iFld) + (iMeth(l, Test.iFld1) / (by | 1)));
            Test.iFld1 >>= by;
            i1 += (int)-13L;
            for (i21 = i2; i21 < 6; ++i21) {
                for (i23 = 1; 1 > i23; ++i23) {
                    i3 += Test.iFld1;
                    Test.iFld1 += (((i23 * i25) + iFld) - Test.iFld1);
                    i22 += (((i23 * f2) + i1) - i3);
                    i24 += (((i23 * i23) + i22) - i23);
                    Test.dFld *= i21;
                }
                iFld = i21;
                s1 = (short)Test.instanceCount;
                Test.iFld2 = i22;
            }
            Test.iFld2 = 103;
        }
        vMeth_check_sum += i1 + l + i2 + i3 + by + i21 + i22 + i23 + i24 + i25 + Float.floatToIntBits(f2) + s1;
    }

    public void mainTest(String[] strArr1) {

        int i=-4, i26=-37897, i27=-2958, i29=-64334, i30=29103, i31=-155, i32=-63449, i33=-14103, i34=-35638, i35=8344;
        float f3=-2.204F;
        byte by1=98;
        short s2=-23821;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -100.13938);

        switch (((((i + i) >>> 1) % 4) * 5) + 95) {
        case 112:
            vMeth(iFld, Test.instanceCount);
            Test.instanceCount -= (long)f3;
            i26 = 1;
            while (++i26 < 231) {
                switch (((Test.iFld2 >>> 1) % 2) + 107) {
                case 107:
                    Test.instanceCount >>= -53232L;
                    Test.instanceCount = Test.instanceCount;
                    switch ((i26 % 2) + 86) {
                    case 86:
                        i27 = 1;
                        do {
                            int i28=-26619;
                            iFld += i27;
                            Test.iFld2 += (int)f3;
                            Test.instanceCount += i27;
                            try {
                                Test.iFld1 = (i28 / 613758633);
                                Test.iFld1 = (Test.iFld1 % i28);
                                i = (i27 % -63061);
                            } catch (ArithmeticException a_e) {}
                        } while (++i27 < 109);
                        for (i29 = 6; i29 < 109; i29++) {
                            by1 += (byte)(i29 * i29);
                            s2 += (short)(i29 * i29);
                            f3 -= -24272L;
                        }
                        i30 = i;
                        for (i31 = i26; 109 > i31; ++i31) {
                            f3 = Test.instanceCount;
                            Test.iFld2 += (i31 | Test.instanceCount);
                        }
                        break;
                    case 87:
                        i33 = 1;
                        do {
                            dArr[i33 + 1] += i;
                            for (i34 = 1; i34 < 1; i34++) {
                                f3 += i34;
                                i30 += (i34 * i34);
                                i30 = (int)1171659073921229522L;
                                iArrFld[i34] = (int)Test.dFld;
                                i32 = i35;
                                f3 += i26;
                            }
                        } while (++i33 < 109);
                        break;
                    default:
                        iFld >>>= iFld;
                    }
                case 108:
                }
            }
            break;
        case 113:
            bArrFld[(i26 >>> 1) % N] = Test.bFld;
            break;
        case 96:
            iFld += by1;
            break;
        case 114:
            Test.dFld *= i30;
            break;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}