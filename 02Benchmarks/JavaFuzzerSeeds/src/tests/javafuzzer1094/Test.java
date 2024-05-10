package tests.javafuzzer1094;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:25:37 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1L;
    public static float fFld=0.206F;
    public static double dFld=-2.32695;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 60538);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        long l=9909L;
        int i4=9, i5=-12603, i6=11, i7=-6, i8=12, i9=-52699;
        double d1=31.16992;
        short s=31112;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)102);

        for (l = 12; 389 > l; l++) {
            for (i5 = 1; i5 < 4; i5++) {
                i4 += (i5 * Test.instanceCount);
                byArr[i5 - 1] = (byte)i5;
                i4 *= (int)d1;
                Test.fFld += Test.fFld;
                for (i7 = 1; 2 > i7; ++i7) {
                    i6 = i9;
                    if (i8 != 0) {
                    }
                    i8 |= (int)l;
                    i4 = i7;
                    i9 *= 12;
                    i8 *= (int)Test.instanceCount;
                }
                i9 <<= s;
                i4 += i5;
            }
        }
        long meth_res = l + i4 + i5 + i6 + Double.doubleToLongBits(d1) + i7 + i8 + i9 + s + FuzzerUtils.checkSum(byArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3) {

        double d=72.31094;
        byte by=-99;
        int i10=8784, i11=-22156, i12=-145;

        i3 ^= (int)Long.reverseBytes(Test.instanceCount <<= (long)(d + i3));
        i3 -= (iMeth1() - by);
        Test.iArrFld[(i3 >>> 1) % N] >>= (int)Test.instanceCount;
        i3 = by;
        Test.instanceCount = i3;
        for (i10 = 2; 290 > i10; i10++) {
            i11 = 13;
            Test.instanceCount += 12;
            Test.fFld += i10;
            i12 = 1;
            while (++i12 < 6) {
                d -= 32933;
                i11 >>>= i11;
                Test.dFld *= i3;
                if (false) break;
                if (Test.bFld) continue;
            }
        }
        vMeth_check_sum += i3 + Double.doubleToLongBits(d) + by + i10 + i11 + i12;
    }

    public static int iMeth(int i2) {

        int i13=13, i14=182, i15=-127, i16=-1, i17=191, i18=114, i19=-43521, i20=109;
        byte by1=-48;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -2429164546L);

        vMeth(i2);
        try {
            for (i13 = 2; i13 < 325; i13++) {
                Test.instanceCount -= Test.instanceCount;
                Test.iArrFld[i13 + 1] += (int)Test.fFld;
            }
            Test.dFld -= i2;
        }
        catch (ArithmeticException exc1) {
            i2 = (int)-1924404806706908603L;
            for (i15 = 8; i15 < 277; ++i15) {
                for (i17 = 1; i17 < 6; i17++) {
                    for (i19 = 2; i19 > 1; i19 -= 3) {
                        Test.iArrFld[i19 + 1] = i20;
                        if (Test.bFld) break;
                    }
                    i2 = i17;
                    lArr1[i15] >>= i14;
                    Test.instanceCount += i18;
                }
            }
        }
        finally {
            by1 = (byte)Test.instanceCount;
        }
        long meth_res = i2 + i13 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + by1 + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i1=2, i21=-36462, i22=64775, i23=9, i24=119, i25=56209;
        boolean b=false;
        float f=1.808F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 31572L);

        for (i = 1; 178 > i; i++) {
            b = (((i + i) - (i1 - i1)) < (i1 - (--lArr[i - 1])));
        }
        f -= (-(Test.instanceCount += (long)1.917F));
        Test.instanceCount = (long)(iMeth(i) * f);
        i21 = 1;
        while (++i21 < 139) {
            lArr[i21] = i21;
            switch ((((i >>> 1) % 2) * 5) + 98) {
            case 100:
                Test.iArrFld[i21 - 1] = (int)Test.instanceCount;
                for (i22 = 5; 180 > i22; ++i22) {
                    lArr[i21 - 1] -= i1;
                    Test.iArrFld[i21] = (int)67L;
                    for (i24 = 1; 2 > i24; i24++) {
                        int i26=-4953;
                        switch ((i24 % 2) + 112) {
                        case 112:
                            switch ((i24 % 9) + 70) {
                            case 70:
                                i26 += (int)Test.instanceCount;
                                Test.iArrFld[i24] = i22;
                                i26 += (i24 ^ (long)f);
                                Test.dFld -= 0.50244;
                                break;
                            case 71:
                                i26 = i1;
                                switch (((i21 >>> 1) % 2) + 22) {
                                case 22:
                                    i1 = i25;
                                    i25 = i1;
                                    i1 = i23;
                                    break;
                                case 23:
                                    if (Test.bFld) continue;
                                    Test.instanceCount -= Test.instanceCount;
                                    i26 += (int)-1.80318;
                                    if (Test.bFld) {
                                        i23 = (int)Test.dFld;
                                        i1 = -13;
                                    }
                                default:
                                    lArr[i24] += i23;
                                }
                                break;
                            case 72:
                                f = Test.instanceCount;
                                break;
                            case 73:
                                f += i26;
                                break;
                            case 74:
                                if (false) break;
                                break;
                            case 75:
                            case 76:
                                Test.instanceCount += i26;
                            case 77:
                                i23 -= i;
                            case 78:
                                b = Test.bFld;
                                break;
                            }
                        case 113:
                            i25 <<= -39;
                            break;
                        }
                    }
                }
                break;
            case 108:
                i1 += (((i21 * Test.instanceCount) + i21) - i1);
            default:
                if (true) break;
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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
