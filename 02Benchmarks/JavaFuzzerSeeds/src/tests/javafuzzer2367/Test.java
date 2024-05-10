package tests.javafuzzer2367;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 13:39:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-426074856L;
    public static int iFld=-254;
    public static float fFld=2.894F;
    public static double dFld=0.108555;
    public static byte byFld=83;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1) {

        int i7=1, i8=175, i9=52132, i10=238, i11=14, i12=3;
        short s=-23549;
        boolean b1=false;

        Test.iFld += Test.iFld;
        i7 = 1;
        while (++i7 < 168) {
            for (i8 = i7; i8 < 9; ++i8) {
                for (i10 = 1; i10 < 1; ++i10) {
                    float f=48.864F;
                    switch (((i8 % 2) * 5) + 8) {
                    case 13:
                        s = (short)i11;
                        i11 += (i10 ^ i10);
                        if (b1) continue;
                        s = (short)l1;
                        break;
                    case 18:
                        f -= i12;
                        i9 = -13173;
                        l1 <<= Test.iFld;
                        l1 = i8;
                        break;
                    default:
                        if (b1) break;
                    }
                    Test.instanceCount += (((i10 * Test.iFld) + f) - i11);
                }
            }
        }
        vMeth1_check_sum += l1 + i7 + i8 + i9 + i10 + i11 + s + (b1 ? 1 : 0) + i12;
    }

    public static void vMeth(int i4, int i5, int i6) {

        int i13=-1, i14=-8638, i15=-71, i16=95, i17=41429, iArr1[]=new int[N];
        long l2=-14210L;
        double d=1.24514;

        FuzzerUtils.init(iArr1, 110);

        vMeth1(Test.instanceCount);
        for (i13 = 6; i13 < 353; ++i13) {
            switch (((i13 % 2) * 5) + 35) {
            case 40:
                i5 >>>= i4;
                for (l2 = i13; l2 < 5; ++l2) {
                    Test.iFld -= (int)Test.fFld;
                    for (i16 = 1; i16 > 1; --i16) {
                        Test.fFld += i5;
                        i4 -= i17;
                        switch (((i17 >>> 1) % 2) + 78) {
                        case 78:
                            i15 -= -237;
                            iArr1 = iArr1;
                            break;
                        case 79:
                            i4 += i5;
                            d -= Test.fFld;
                            break;
                        default:
                            Test.instanceCount *= (long)Test.fFld;
                        }
                    }
                }
                break;
            case 42:
                Test.iFld -= Test.iFld;
                break;
            default:
                i4 = i6;
            }
        }
        vMeth_check_sum += i4 + i5 + i6 + i13 + i14 + l2 + i15 + i16 + i17 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(int i, int i1, long l) {

        int i2=-10, i3=-56957, i18=-190, i19=197, i20=-122, iArr[]=new int[N];
        double d1=-106.42776;
        short s1=-21380;
        boolean b2=false, bArr[]=new boolean[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(lArr, 2851582752880814901L);
        FuzzerUtils.init(bArr, true);

        i += i1;
        iArr[(-6 >>> 1) % N] /= (int)((++l) | 1);
        for (i2 = 5; i2 < 344; ++i2) {
            vMeth(Test.iFld, i1, i2);
            Test.fFld -= i1;
            iArr[i2] &= (int)Test.instanceCount;
            if (i1 != 0) {
            }
            for (d1 = 1; 5 > d1; d1 += 2) {
                for (i19 = 1; i19 < 3; ++i19) {
                    lArr[i19] >>= s1;
                    iArr[(int)(d1 - 1)] |= 1;
                    switch (((i19 % 3) * 5) + 63) {
                    case 70:
                        Test.iFld >>>= (int)Test.instanceCount;
                        i1 = 26;
                        l += (((i19 * i20) + s1) - Test.fFld);
                    case 66:
                        i1 -= -1;
                    case 64:
                        bArr[(int)(d1 - 1)] = b2;
                        break;
                    default:
                        i18 += (i19 ^ Test.instanceCount);
                    }
                }
            }
        }
        long meth_res = i + i1 + l + i2 + i3 + Double.doubleToLongBits(d1) + i18 + i19 + i20 + s1 + (b2 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        boolean b=false;
        int i21=-25949, i22=27796, i23=-221, i24=-239, i25=14, i26=46639, i27=7808, i28=-46229, i29=-13, i30=0,
            iArr2[][]=new int[N][N];

        FuzzerUtils.init(iArr2, 62);

        b = (iMeth(Test.iFld, -91, Test.instanceCount) <= 52.544F);
        Test.instanceCount >>>= Test.iFld;
        Test.fFld = Test.iFld;
        Test.instanceCount |= Test.iFld;
        Test.iFld += (int)-2.48845;
        for (i21 = 10; i21 < 165; ++i21) {
            Test.instanceCount = Test.iFld;
            Test.iFld -= (int)Test.instanceCount;
            i22 *= (int)Test.dFld;
        }
        for (i23 = 18; i23 < 313; ++i23) {
            for (i25 = 1; i25 < 85; ++i25) {
                i22 >>>= (int)Test.instanceCount;
                for (i27 = 1; i27 < 2; ++i27) {
                    Test.byFld = (byte)i24;
                    Test.dFld *= -13.73055;
                    Test.instanceCount += i27;
                    i24 *= Test.byFld;
                    i26 *= 247;
                    i26 <<= i22;
                    Test.iFld >>= 14245;
                    i22 += i23;
                }
                for (i29 = 2; i29 > 1; i29 -= 2) {
                    b = b;
                    iArr2[i25 + 1][i25] >>= (int)46L;
                    Test.iFld >>= Test.iFld;
                    i24 = (int)Test.fFld;
                    Test.instanceCount -= i28;
                }
                i24 += (int)Test.instanceCount;
                i28 += i25;
                Test.instanceCount -= Test.instanceCount;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
