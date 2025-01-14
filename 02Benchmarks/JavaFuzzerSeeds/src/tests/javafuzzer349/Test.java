package tests.javafuzzer349;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 02:37:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-876089703269325595L;
    public static int iFld=-2;
    public static float fFld=-29.604F;
    public static int iFld1=9981;
    public boolean bFld=false;
    public float fArrFld[]=new float[N];

    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l2) {

        int i1=-10, i2=6, i3=204, i4=74, i5=-23923, i6=0, i7=-11, i8=37, i9=0, i10=-5, i11=-147, iArr[]=new int[N];
        double d=-2.71656;

        FuzzerUtils.init(iArr, -90);

        for (i1 = 18; i1 < 342; i1++) {
            Test.iFld += (int)(63685L + (i1 * i1));
            for (i3 = 5; i3 > 1; --i3) {
                Test.instanceCount += (i3 - i5);
                i4 += (i3 * i3);
                for (i6 = 1; i6 < 2; ++i6) {
                    l2 += (i6 - Test.fFld);
                    l2 *= Test.instanceCount;
                    d %= (i6 | 1);
                    iArr[i3] = (int)Test.instanceCount;
                }
            }
            i4 -= (int)l2;
            for (i8 = 1; i8 < 5; ++i8) {
                for (i10 = 1; i10 < 2; i10++) {
                    i9 += (int)Test.instanceCount;
                    Test.iFld1 += (220 + (i10 * i10));
                }
            }
        }
        vMeth_check_sum += l2 + i1 + i2 + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + i8 + i9 + i10 + i11 +
            FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(long l, int i, long l1) {

        int i12=8, i13=-1, i15=-40957, i16=128, i17=56, i18=-24317, iArr1[]=new int[N];
        boolean b1=true;
        byte by1=33;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -242);
        FuzzerUtils.init(lArr, -199L);

        vMeth(l);
        for (i12 = 23; i12 < 389; i12++) {
            iArr1[i12] -= i13;
            for (i15 = 5; i15 > 1; --i15) {
                l += l1;
                for (i17 = i12; i17 < 2; i17 += 2) {
                    Test.iFld1 += (i17 ^ i17);
                    if (b1) continue;
                    i18 += Test.iFld1;
                    lArr[i12 + 1] -= Test.iFld;
                    Test.iFld1 += (i17 * l1);
                    lArr = lArr;
                    l1 = i18;
                    by1 = (byte)i17;
                    i += i17;
                }
            }
        }
        long meth_res = l + i + l1 + i12 + i13 + i15 + i16 + i17 + i18 + (b1 ? 1 : 0) + by1 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth() {

        byte by=-50;
        boolean b=true, bArr[]=new boolean[N];
        int i19=12, i20=5, i21=-14;
        long l3=3820482577781380867L, lArr1[]=new long[N];
        double d1=-92.37924;
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(sArr, (short)17805);
        FuzzerUtils.init(lArr1, -41995L);
        FuzzerUtils.init(bArr, false);

        Test.iFld += (int)Math.abs(Test.fFld - (Test.instanceCount + by));
        b = (!(b = b));
        Test.iFld = Test.iFld;
        Test.iFld = (int)(Test.iFld + (Test.instanceCount--));
        sArr[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N] *= (short)(((Test.iFld * Test.iFld) + (Test.iFld *
            Test.iFld)) * (Math.abs(Test.iFld) + (--Test.iFld)));
        Test.iFld = (int)Test.fFld;
        Test.iFld = iMeth(Test.instanceCount, Test.iFld1, Test.instanceCount);
        lArr1 = lArr1;
        for (i19 = 3; i19 < 210; i19++) {
            if (i20 != 0) {
            }
            for (l3 = 8; l3 > 1; l3--) {
                Test.iFld += -18566;
                i20 >>= i20;
                d1 = by;
                bArr[i19 + 1] = b;
            }
        }
        long meth_res = by + (b ? 1 : 0) + i19 + i20 + l3 + i21 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(bArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=0.110F;
        int i22=631, i23=-150, i24=166, i25=-28565, i26=195, i27=63978, i28=7, iArr2[]=new int[N];
        byte by2=34;

        FuzzerUtils.init(iArr2, 0);

        f = (Test.iFld = (int)fMeth());
        Test.instanceCount = -4;
        Test.iFld1 += Test.iFld;
        for (i22 = 16; i22 < 301; i22++) {
            i23 += i22;
            if (bFld) {
                Test.iFld1 = by2;
                Test.iFld -= i23;
            } else {
                Test.iFld += Test.iFld1;
                Test.iFld1 = (int)Test.instanceCount;
                Test.iFld = Test.iFld1;
                i24 = 1;
                do {
                    switch ((i24 % 7) + 65) {
                    case 65:
                        Test.iFld1 = Test.iFld;
                        Test.iFld1 <<= Test.iFld;
                        iArr2[i22 + 1] >>>= (int)Test.instanceCount;
                        break;
                    case 66:
                        for (i25 = 1; i25 > 1; --i25) {
                            Test.iFld1 += (int)Test.instanceCount;
                            iArr2[i24] = i23;
                            Test.instanceCount += Test.iFld;
                            fArrFld[i22 + 1] = Test.iFld;
                            i26 += i25;
                        }
                        if (true) continue;
                        break;
                    case 67:
                        if (bFld) continue;
                    case 68:
                        for (i27 = 1; i27 < 1; i27++) {
                            i26 += (i27 * Test.instanceCount);
                            switch (((3 >>> 1) % 2) + 25) {
                            case 25:
                                Test.instanceCount ^= i23;
                                Test.iFld1 -= i27;
                                i23 += (20383 + (i27 * i27));
                                break;
                            case 26:
                                i28 += (((i27 * i26) + i22) - i28);
                                break;
                            }
                        }
                    case 69:
                        Test.iFld1 = i23;
                    case 70:
                        fArrFld[i24 - 1] += f;
                    case 71:
                        f /= 9;
                    }
                } while (++i24 < 88);
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
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
