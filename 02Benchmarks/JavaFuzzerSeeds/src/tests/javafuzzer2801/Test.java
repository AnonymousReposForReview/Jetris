package tests.javafuzzer2801;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 20:29:23 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2228826518L;
    public static int iFld=-202;
    public static boolean bFld=false;
    public static short sFld=29074;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 4);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(int i11, int i12, int i13) {

        int i14=-12, i15=924, i16=14, i17=-13, i18=12, i19=-25818, i20=-12;
        short s=8119;
        float f1=-1.627F;
        boolean b=false;

        if (b) {
            for (i14 = 17; i14 < 350; ++i14) {
                for (i16 = 1; i16 < 5; i16++) {
                    switch (((i16 % 10) * 5) + 43) {
                    case 62:
                        for (i18 = 1; i18 < 2; i18++) {
                            i17 += (i18 | i13);
                            i12 += i11;
                            i15 = s;
                            i13 = i14;
                        }
                        i11 = (int)111.24F;
                        break;
                    case 61:
                        i20 = 1;
                        while (++i20 < 2) {
                            i12 = 210;
                            Test.instanceCount *= i19;
                            i12 += (int)f1;
                            i19 <<= s;
                        }
                    case 68:
                        Test.instanceCount = -4L;
                        break;
                    case 87:
                        Test.iArrFld[i14 + 1] = i13;
                        break;
                    case 74:
                        Test.iFld = i19;
                        break;
                    case 69:
                    case 48:
                        i13 >>>= i18;
                        break;
                    case 59:
                        i12 = -2;
                        break;
                    case 47:
                        i17 = (int)Test.instanceCount;
                        break;
                    case 73:
                        Test.iFld = (int)Test.instanceCount;
                        break;
                    default:
                        i17 = i18;
                    }
                }
            }
        } else {
            i11 |= (int)Test.instanceCount;
        }
        long meth_res = i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19 + s + i20 + Float.floatToIntBits(f1) + (b ?
            1 : 0);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static int iMeth(long l2, int i8) {

        int i9=35372, i10=-166, i21=-1, i22=-20897, i23=-63254, i24=6023, i25=13;
        float f2=0.237F;
        double d=0.126351;
        byte by=-19;

        for (i9 = 3; i9 < 312; i9 += 2) {
            i8 |= (int)(l2--);
        }
        l2 = byMeth(i10, i10, 13388);
        for (f2 = 275; f2 > 7; --f2) {
            i8 &= Test.iFld;
            switch ((int)((f2 % 5) + 92)) {
            case 92:
                d += -14;
                l2 = Test.instanceCount;
                i21 += (int)(f2 * f2);
                break;
            case 93:
                for (i22 = (int)(f2); i22 < 6; ++i22) {
                    Test.iFld *= (int)f2;
                    i8 -= i23;
                    for (i24 = 1; i24 < 1; ++i24) {
                        Test.instanceCount += (57 + (i24 * i24));
                        if (Test.bFld) break;
                    }
                }
                break;
            case 94:
                if (Test.bFld) continue;
                break;
            case 95:
                i10 += by;
            case 96:
                Test.iFld = (int)l2;
                break;
            default:
                Test.iArrFld = Test.iArrFld;
            }
        }
        long meth_res = l2 + i8 + i9 + i10 + Float.floatToIntBits(f2) + i21 + Double.doubleToLongBits(d) + i22 + i23 +
            i24 + i25 + by;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l1, int i6) {

        int i7=6, i26=60999, i27=-47895;
        float f=25.305F;
        long l3=-128L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, -205L);

        i7 = 1;
        while (++i7 < 190) {
            f += i6;
            Test.instanceCount = (++lArr[i7]);
            l1 += (iMeth(l3, Test.iFld) + Test.iFld);
            for (i26 = i7; i26 < 8; ++i26) {
                i6 += (((i26 * Test.instanceCount) + i6) - i7);
                Test.iArrFld[i7] *= (int)l3;
                if (Test.bFld) continue;
                l3 *= Test.iFld;
            }
        }
        Test.iFld <<= i6;
        l3 &= i6;
        f = f;
        i6 -= i7;
        Test.instanceCount = i7;
        i6 -= (int)f;
        vMeth_check_sum += l1 + i6 + i7 + Float.floatToIntBits(f) + l3 + i26 + i27 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i1=2, i2=186, i3=7891, i4=82, i5=-32666, i28=58455, i29=-4, iArr[]=new int[N];
        float f3=0.9F;
        boolean b1=true;

        FuzzerUtils.init(iArr, 60547);

        for (i = 5; i < 167; ++i) {
            i2 = 1;
            do {
                long l=-73L;
                l -= Math.abs((i1 += i2) * (i1 / 81));
                for (i3 = i; i3 < 4; ++i3) {
                    i4 *= (28 + (--iArr[i + 1]));
                    Test.instanceCount += (((i3 * i5) + i3) - i3);
                    iArr[i] = (int)(--Test.instanceCount);
                    vMeth(l, i3);
                    i1 += i2;
                    Test.instanceCount >>= i4;
                    f3 *= Test.instanceCount;
                    if (b1) {
                        try {
                            i1 = (209 % i);
                            Test.iFld = (i / Test.iFld);
                            i5 = (55379 / i5);
                        } catch (ArithmeticException a_e) {}
                    } else if (Test.bFld) {
                        i5 = i2;
                        Test.bFld = Test.bFld;
                    }
                }
                f3 -= i1;
                Test.iFld &= i1;
                if (Test.bFld) {
                    i28 += (i2 ^ i28);
                    Test.iFld += (i2 - f3);
                } else if (true) {
                    i28 += (i2 - Test.instanceCount);
                    Test.instanceCount += (i2 * i1);
                    i28 = -65112;
                    i1 += (13 + (i2 * i2));
                }
                i1 = Test.sFld;
                i5 -= i1;
                i29 = 1;
                while (++i29 < 4) {
                    i1 *= (int)l;
                    i28 = Test.sFld;
                    i1 = i4;
                }
            } while ((i2 += 3) < 155);
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
//DEBUG  byMeth ->  byMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
