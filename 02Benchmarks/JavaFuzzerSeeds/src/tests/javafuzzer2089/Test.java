package tests.javafuzzer2089;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 08:53:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-886789872L;
    public static float fFld=-42.963F;
    public static int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -9130);
        FuzzerUtils.init(Test.sArrFld, (short)-13912);
        FuzzerUtils.init(Test.fArrFld, -87.647F);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(double d1) {

        int i7=-62987, i8=-1, i9=12, i10=-11155, i12=46180, i13=64;
        float f2=-2.835F;
        short s1=-20134;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 578368870L);

        for (i7 = 4; 276 > i7; i7++) {
            i8 = (int)Test.instanceCount;
            i8 >>= i7;
            if (true) {
                for (i9 = i7; i9 < 6; i9 += 2) {
                    int i11=0;
                    i11 += i7;
                    switch (((i7 % 10) * 5) + 10) {
                    case 18:
                        Test.iArrFld[i9 + 1] -= (int)Test.instanceCount;
                        Test.instanceCount += (((i9 * i8) + i11) - f2);
                        Test.instanceCount = s1;
                    case 40:
                        for (i12 = 1; i12 < 1; i12 += 2) {
                            lArr[i9 + 1] <<= i7;
                            i11 = (int)f2;
                            Test.iArrFld[i9] += i7;
                            i13 -= i13;
                        }
                    case 52:
                        Test.iArrFld[i7 + 1] = i12;
                        break;
                    case 58:
                        i11 += (i9 * i9);
                    case 44:
                        i13 = (int)f2;
                        break;
                    case 13:
                        Test.instanceCount = 2;
                        break;
                    case 20:
                        Test.iArrFld[i9 + 1] = (int)d1;
                        break;
                    case 33:
                        f2 += (i9 * i9);
                        break;
                    case 21:
                        Test.iArrFld[i7 - 1] = 2;
                        break;
                    case 17:
                        i8 = (int)3L;
                        break;
                    default:
                        i10 -= (int)Test.instanceCount;
                    }
                }
            } else {
                i13 = i10;
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) + s1 + i12 + i13 +
            FuzzerUtils.checkSum(lArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(float f1, int i2) {

        int i3=30, i4=12, i5=-107, i6=-32347, i14=15012;
        double d=-127.66295;
        short s=4221;
        byte by=-124;
        boolean b2=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -5633L);

        Test.instanceCount <<= ((i2--) + Test.iArrFld[(i2 >>> 1) % N]);
        for (i3 = 9; i3 < 349; ++i3) {
            i2 += (int)(i2 = (int)((d - i4) + (s * 9)));
            for (i5 = 1; i5 < 5; ++i5) {
                s -= (short)iMeth2(d);
                switch (((i2 >>> 1) % 10) + 83) {
                case 83:
                    s = (short)i6;
                case 84:
                    Test.instanceCount += (i5 * i5);
                case 85:
                case 86:
                    Test.sArrFld[i5 - 1] = (short)-52376;
                    i6 -= i6;
                    i14 = 1;
                    do {
                        i6 = i14;
                        Test.instanceCount &= by;
                        i2 += (i14 - i3);
                        i2 = i3;
                    } while ((i14 += 2) < 2);
                    break;
                case 87:
                    if (b2) continue;
                    break;
                case 88:
                    i4 = i4;
                case 89:
                    Test.instanceCount += (-9004 + (i5 * i5));
                    break;
                case 90:
                    Test.fArrFld[i5 + 1] -= i5;
                    break;
                case 91:
                    lArr1[i5 + 1] *= i5;
                    break;
                case 92:
                    f1 = i14;
                    break;
                default:
                    Test.iArrFld[i5 + 1] -= s;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i2 + i3 + i4 + Double.doubleToLongBits(d) + s + i5 + i6 + i14 + by +
            (b2 ? 1 : 0) + FuzzerUtils.checkSum(lArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(boolean b, boolean b1, int i1) {

        float f=-2.831F;
        short s2=-26917;
        int i15=-16054, i16=-175, i17=10, i18=4;
        byte by1=100;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 10.74417);

        Test.iArrFld[(i1 >>> 1) % N] += i1;
        dArr[(i1 >>> 1) % N] *= Long.reverseBytes(Test.instanceCount);
        switch (((((int)(-56970 * (i1 + f))) >>> 1) % 1) + 66) {
        case 66:
            Test.iArrFld[(-97 >>> 1) % N] -= (int)(iMeth1(f, i1) + Test.instanceCount);
            s2 = s2;
            for (i15 = 6; i15 < 324; ++i15) {
                double d2=2.101618;
                i1 += (i15 * i16);
                try {
                    i1 = (i15 / Test.iArrFld[i15 - 1]);
                    Test.iArrFld[i15 - 1] = (i16 % i15);
                    Test.iArrFld[i15] = (Test.iArrFld[i15 + 1] % -14848);
                } catch (ArithmeticException a_e) {}
                for (i17 = 1; 5 > i17; ++i17) {
                    Test.fArrFld[i17 + 1] -= f;
                    by1 += (byte)i17;
                    Test.instanceCount *= 203L;
                    Test.iArrFld[i17 + 1] = i1;
                }
                i1 = (int)40727L;
                i18 += (int)d2;
            }
            break;
        default:
            by1 = (byte)i16;
        }
        long meth_res = (b ? 1 : 0) + (b1 ? 1 : 0) + i1 + Float.floatToIntBits(f) + s2 + i15 + i16 + i17 + i18 + by1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=9, i19=55033, i20=37017, i21=8, i22=20193, i23=-9, i24=120, i25=-29222, i26=0, i27=-11, i28=-9, i29=-13,
            i30=-6805;
        boolean b3=false;
        short s3=29290;
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(lArr2, 737646050L);

        i = (int)Long.reverseBytes(iMeth(true, b3, i) + Test.instanceCount);
        for (i19 = 1; i19 < 244; ++i19) {
            for (i21 = 3; i21 < 103; ++i21) {
                Test.instanceCount = i22;
                Test.iArrFld[i19 + 1] += s3;
                i ^= i;
                i20 = i21;
                for (i23 = 2; i23 > i21; --i23) {
                    Test.iArrFld[i21 + 1] = i21;
                    i22 &= 22083;
                    if (b3) continue;
                    i -= (int)Test.fFld;
                    Test.instanceCount += i22;
                }
            }
            Test.fFld += Test.instanceCount;
            for (i25 = 3; i25 < 103; i25++) {
                b3 = b3;
                if (b3) break;
                Test.instanceCount /= (Test.instanceCount | 1);
                i = i19;
                i26 *= (int)10181L;
                i += (((i25 * Test.instanceCount) + Test.instanceCount) - s3);
                i22 /= (int)1.459F;
                Test.instanceCount <<= 5;
            }
            s3 = (short)i22;
        }
        Test.instanceCount -= i24;
        i26 -= i26;
        for (i27 = 3; i27 < 239; ++i27) {
            for (i29 = 106; i29 > 5; i29 -= 3) {
                Test.fFld = Test.instanceCount;
            }
            lArr2[i27][i27] = i27;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}