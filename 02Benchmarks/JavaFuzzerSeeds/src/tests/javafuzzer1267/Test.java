package tests.javafuzzer1267;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:34:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-380017339L;
    public static boolean bFld=true;
    public static volatile double dFld=2.129363;
    public byte byFld=-97;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -47456);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static void vSmallMeth(int i, double d) {

        long lArr[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, -15L);
        FuzzerUtils.init(sArr, (short)9108);

        Test.instanceCount = (long)(Double.longBitsToDouble(lArr[(i >>> 1) % N]) * sArr[(i >>> 1) % N]);
        vSmallMeth_check_sum += i + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth2(short s) {

        int i3=7689, i4=-213, i5=-56010, i6=51814;
        float f2=0.884F;
        double d1=-79.36729;
        byte by=-16;

        i3 -= i3;
        i3 -= (int)f2;
        d1 = 1;
        do {
            i3 += (-24691 + (d1 * d1));
            for (i4 = 1; i4 < 9; ++i4) {
                i6 = 2;
                while (--i6 > 0) {
                    i3 >>= s;
                    Test.instanceCount = i5;
                    i5 >>= i6;
                    i3 = -2;
                    switch ((i6 % 6) + 72) {
                    case 72:
                        by *= (byte)i3;
                        Test.instanceCount = i5;
                    case 73:
                        Test.instanceCount -= i4;
                        Test.instanceCount += Test.instanceCount;
                    case 74:
                        by += (byte)(((i6 * Test.instanceCount) + i6) - i6);
                        break;
                    case 75:
                    case 76:
                        if (i4 != 0) {
                        }
                    case 77:
                        i5 = i6;
                        break;
                    default:
                        Test.instanceCount -= 62986;
                    }
                }
            }
        } while (++d1 < 170);
        long meth_res = s + i3 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d1) + i4 + i5 + i6 + by;
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1() {

        short s1=29804;

        Test.instanceCount >>= iMeth2(s1);
        long meth_res = s1;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, int i1, int i2) {

        float f1=0.946F, f3=-1.761F;
        int i7=0, i8=-11, i9=-13, i10=5, i11=7;

        f1 = i2;
        i1 = (iMeth1() * i2);
        if (Test.bFld) {
            i2 = (int)f1;
            for (f3 = 20; f3 < 322; ++f3) {
                i7 += (int)(f3 - l);
                for (i8 = (int)(f3); i8 < 5; ++i8) {
                    f1 = i8;
                    switch (((i8 % 5) * 5) + 104) {
                    case 118:
                        Test.iArrFld[(int)(f3)] &= (int)l;
                        i1 += (7 + (i8 * i8));
                        Test.iArrFld[i8 + 1] -= (int)l;
                        break;
                    case 108:
                        for (i10 = i8; i10 < 1; i10++) {
                            if (Test.bFld) continue;
                            i2 = i9;
                        }
                        break;
                    case 117:
                        Test.instanceCount = -13961;
                    case 111:
                        Test.instanceCount += 7;
                        break;
                    case 123:
                    }
                }
            }
        } else if (false) {
            l = 85;
        } else if (Test.bFld) {
            i2 = -25;
        } else {
            i11 += (int)Test.instanceCount;
        }
        long meth_res = l + i1 + i2 + Float.floatToIntBits(f1) + Float.floatToIntBits(f3) + i7 + i8 + i9 + i10 + i11;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=45.848F, fArr[]=new float[N];
        int i13=6, i14=4, i15=-38754, i16=-3, i17=-11, i18=11, i19=13, i20=55, i21=-14, i22=2, i23=-59975;
        short s2=-11721;

        FuzzerUtils.init(fArr, -2.160F);

        for (int smallinvoc=0; smallinvoc<968; smallinvoc++) vSmallMeth((int)((f - iMeth(Test.instanceCount, 200, i13))
            - i13), Test.dFld);
        for (i14 = 5; i14 < 299; i14++) {
            i13 += i14;
            i15 -= s2;
        }
        i15 = (int)-28.72F;
        i15 = (int)80.252F;
        for (i16 = 6; i16 < 373; i16++) {
            s2 = (short)i17;
            byFld += (byte)i14;
            i13 += (((i16 * i13) + i16) - Test.instanceCount);
            i15 += i13;
        }
        i15 = 11;
        i17 = i15;
        for (i18 = 6; i18 < 281; i18++) {
            switch (((i18 >>> 1) % 8) + 22) {
            case 22:
            case 23:
                for (i20 = i18; i20 < 91; ++i20) {
                    s2 = (short)-2;
                    i13 = (int)Test.instanceCount;
                    if (Test.bFld) {
                        Test.dFld *= Test.instanceCount;
                        if (Test.bFld) break;
                        s2 *= (short)i14;
                        i22 = 1;
                        do {
                            switch (((i20 % 8) * 5) + 60) {
                            case 83:
                                Test.instanceCount += (i22 | i21);
                                if (true) continue;
                                fArr[i20] -= i14;
                                i21 += -4;
                                break;
                            case 80:
                                Test.instanceCount = (long)f;
                                f *= i16;
                                break;
                            case 73:
                                i19 -= 19;
                                break;
                            case 67:
                                f += i15;
                                break;
                            case 68:
                                i19 += (i22 | Test.instanceCount);
                                break;
                            case 79:
                            case 95:
                                if (Test.bFld) continue;
                                break;
                            case 81:
                                if (Test.bFld) continue;
                            default:
                                Test.iArrFld[i22 - 1] = i23;
                            }
                        } while (++i22 < 1);
                    } else if (Test.bFld) {
                        i19 |= i16;
                    }
                }
                break;
            case 24:
                i13 = i18;
                break;
            case 25:
                Test.dFld = i16;
                break;
            case 26:
                Test.dFld -= Test.dFld;
                break;
            case 27:
                i13 += i18;
                break;
            case 28:
                if (Test.bFld) break;
                break;
            case 29:
                f += byFld;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
