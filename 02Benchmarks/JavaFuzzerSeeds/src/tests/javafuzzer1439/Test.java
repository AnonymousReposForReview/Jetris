package tests.javafuzzer1439;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 20:44:02 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=2918212093L;
    public static double dFld=5.42019;
    public static float fFld=-59.254F;
    public static short sFld=19314;
    public static int iFld=89;
    public static boolean bFld=false;
    public static volatile boolean bFld1=false;
    public static long lArrFld[]=new long[N];
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 0L);
        FuzzerUtils.init(Test.dArrFld, 0.27929);
        FuzzerUtils.init(Test.iArrFld, -4);
        FuzzerUtils.init(Test.sArrFld, (short)20875);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i7) {

        int i8=-96, i9=-214, i10=51081, i11=2, iArr1[]=new int[N];
        long l2=220L;
        float f1=0.768F, fArr[]=new float[N];
        boolean b=true;

        FuzzerUtils.init(fArr, -2.269F);
        FuzzerUtils.init(iArr1, -12);

        for (i8 = 11; i8 < 243; ++i8) {
            fArr[i8 - 1] *= Test.instanceCount;
            for (l2 = 1; l2 < 7; l2++) {
                Test.instanceCount += (l2 * l2);
                i7 = -4;
                Test.lArrFld[i8 + 1] += i9;
                Test.lArrFld[i8 - 1] = Test.instanceCount;
                Test.instanceCount = i7;
                for (f1 = 1; f1 < 2; f1++) {
                    i10 = i9;
                    i10 = i9;
                    if (b) continue;
                    i7 >>>= Test.sFld;
                    Test.fFld -= i9;
                    iArr1[(int)(f1 + 1)] = i8;
                }
            }
        }
        long meth_res = i7 + i8 + i9 + l2 + i10 + Float.floatToIntBits(f1) + i11 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l1, int i5, int i6) {

        byte by=-119;
        int i12=26528, i13=0, i14=4761, i15=-30919, iArr2[][]=new int[N][N];
        boolean b1=true;

        FuzzerUtils.init(iArr2, 66);

        i6 += (i6 = 218);
        by <<= (byte)(((Test.fFld * i5) * (i5 + 14L)) * (i5 = iMeth1(i6)));
        Test.dArrFld[(i6 >>> 1) % N] -= -1.19151;
        iArr2[(i6 >>> 1) % N][(i5 >>> 1) % N] += i5;
        for (i12 = 5; i12 < 317; ++i12) {
            i13 = i6;
            for (i14 = 1; i14 < 5; ++i14) {
                i15 = (int)Test.instanceCount;
                Test.lArrFld = Test.lArrFld;
                switch ((i14 % 5) + 62) {
                case 62:
                    Test.dFld -= Test.fFld;
                    switch (((i15 >>> 1) % 7) + 87) {
                    case 87:
                        i5 -= (int)Test.dFld;
                        Test.instanceCount = l1;
                    case 88:
                        Test.dArrFld = Test.dArrFld;
                    case 89:
                        i5 >>>= (int)l1;
                        break;
                    case 90:
                        if (i15 != 0) {
                            vMeth_check_sum += l1 + i5 + i6 + by + i12 + i13 + i14 + i15 + (b1 ? 1 : 0) +
                                FuzzerUtils.checkSum(iArr2);
                            return;
                        }
                        break;
                    case 91:
                        l1 = i13;
                        break;
                    case 92:
                    case 93:
                        i13 = i12;
                        break;
                    }
                case 63:
                case 64:
                    l1 += (i14 * i14);
                    break;
                case 65:
                    if (b1) break;
                    break;
                case 66:
                    Test.fFld -= i12;
                    break;
                }
            }
        }
        vMeth_check_sum += l1 + i5 + i6 + by + i12 + i13 + i14 + i15 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth(int i4, long l) {

        int i16=115, i17=31, i18=14, i19=-53191, i20=251, i21=110;
        byte by1=-101;
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(sArr, (short)20162);

        i4 += (int)(Test.dFld--);
        vMeth(1731169209L, i4, i4);
        for (i16 = 15; i16 < 288; ++i16) {
            for (i18 = i16; i18 < 6; i18++) {
                i4 = by1;
                i19 += (((i18 * i18) + by1) - i18);
                l >>= l;
                Test.iArrFld[i18 - 1] += 155;
                sArr[i16][i16 + 1] = (short)i16;
                Test.sFld += (short)i4;
                for (i20 = 1; i20 < 1; ++i20) {
                    l += Test.sFld;
                    i17 -= -49693;
                    i17 += i20;
                    try {
                        i17 = (i21 % -125);
                        Test.iArrFld[i16] = (i16 % i16);
                        i4 = (121 % i18);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        long meth_res = i4 + l + i16 + i17 + i18 + i19 + by1 + i20 + i21 + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=16529, i1=-14, i2=-10, i3=-35596, i22=20286, i23=4, iArr[]=new int[N];
        float f=-19.215F, f2=0.515F, fArr1[]=new float[N];
        byte by2=-111;

        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(fArr1, -31.23F);

        for (i = 7; i < 395; i++) {
            Test.instanceCount = (iArr[i - 1] + 5005153385289619862L);
            if (Test.bFld1) {
                for (i2 = 2; i2 < 65; ++i2) {
                    f += (iMeth(i1, Test.instanceCount) * 119);
                    i3 = i2;
                    switch (i2 + 1) {
                    case 1:
                        i1 = (int)Test.instanceCount;
                        i3 = (int)Test.instanceCount;
                        Test.lArrFld[i - 1] = i3;
                        Test.iFld -= i1;
                        break;
                    case 2:
                        Test.instanceCount += (((i2 * Test.fFld) + i3) - i3);
                    case 3:
                        for (f2 = i; f2 < 2; f2++) {
                            if (true) {
                                Test.iArrFld[(int)(f2)] = i22;
                                Test.dFld = -170;
                                i3 >>>= i22;
                                Test.instanceCount += (long)(f2 - i22);
                            } else if (false) {
                                switch ((i2 % 3) + 91) {
                                case 91:
                                    iArr[i] = (int)2428374672665975102L;
                                    Test.iArrFld[i] &= i2;
                                    Test.instanceCount = (long)f;
                                    i1 = i;
                                    break;
                                case 92:
                                    if (Test.bFld) break;
                                    break;
                                case 93:
                                    Test.instanceCount = Test.instanceCount;
                                default:
                                    switch (((i3 >>> 1) % 2) + 8) {
                                    case 8:
                                        i1 = i3;
                                        break;
                                    case 9:
                                        Test.instanceCount = Test.instanceCount;
                                        Test.iFld >>= i22;
                                    default:
                                        Test.iFld = i2;
                                    }
                                }
                            }
                        }
                        break;
                    case 4:
                        Test.sArrFld[i] = (short)Test.instanceCount;
                    case 5:
                        Test.instanceCount <<= 3;
                        break;
                    case 6:
                        i3 >>>= (int)2L;
                        break;
                    case 7:
                        Test.lArrFld[i2 - 1] -= 14;
                    case 8:
                        Test.sFld <<= (short)i1;
                        break;
                    case 9:
                        Test.iFld += i2;
                    case 10:
                        Test.fFld -= i3;
                        break;
                    case 11:
                        iArr[i2 - 1] += i22;
                        break;
                    case 12:
                        i22 += (((i2 * i) + Test.iFld) - Test.instanceCount);
                        break;
                    case 13:
                        fArr1[i2 - 1] = 241;
                        break;
                    case 14:
                        Test.instanceCount = i1;
                        break;
                    case 15:
                        iArr[i] += i1;
                        break;
                    case 16:
                        i3 -= i3;
                        break;
                    case 17:
                        i1 = by2;
                    case 18:
                        Test.iArrFld[i2 - 1] |= Test.iFld;
                        break;
                    case 19:
                        i22 += (int)2.308F;
                    case 20:
                        i22 = 27629;
                        break;
                    case 21:
                        i3 = (int)Test.instanceCount;
                    case 22:
                        by2 = (byte)i22;
                        break;
                    case 23:
                        Test.dFld /= (i | 1);
                    case 24:
                        Test.dArrFld[i2 - 1] = 5834093100644105109L;
                        break;
                    case 25:
                    case 26:
                        Test.iFld = i;
                    case 27:
                        Test.instanceCount *= 171;
                    case 28:
                        Test.instanceCount += i2;
                        break;
                    case 29:
                        i3 = (int)114.183F;
                        break;
                    case 30:
                        Test.instanceCount += 7;
                    case 31:
                    case 32:
                        f /= (Test.iFld | 1);
                        break;
                    case 33:
                        by2 *= (byte)Test.instanceCount;
                        break;
                    case 34:
                        Test.iFld += i1;
                        break;
                    case 35:
                        Test.iArrFld[i2] = (int)Test.dFld;
                        break;
                    case 36:
                        Test.dArrFld[i + 1] += -47467;
                        break;
                    case 37:
                        Test.lArrFld[i + 1] += Test.instanceCount;
                        break;
                    case 38:
                        Test.iArrFld[i2] -= (int)Test.instanceCount;
                    case 39:
                        iArr[i2] += Test.iFld;
                        break;
                    case 40:
                        Test.dFld = i22;
                    case 41:
                        i1 <<= i;
                        break;
                    case 42:
                        if (Test.bFld) break;
                    case 43:
                        Test.sFld <<= (short)i;
                        break;
                    case 44:
                        if (Test.bFld) continue;
                        break;
                    case 45:
                    case 46:
                        fArr1[i2] -= i22;
                        break;
                    case 47:
                        iArr[i2 - 1] -= (int)Test.dFld;
                        break;
                    case 48:
                        Test.bFld1 = Test.bFld;
                        break;
                    case 49:
                        Test.iFld *= Test.iFld;
                        break;
                    case 50:
                        Test.iFld += (((i2 * f) + i1) - Test.iFld);
                    case 51:
                        iArr[i2] *= (int)f2;
                    case 52:
                        if (Test.bFld1) continue;
                        break;
                    case 53:
                        Test.iArrFld[i] = by2;
                    case 54:
                        Test.iArrFld = Test.iArrFld;
                        break;
                    case 55:
                        f = Test.fFld;
                    case 56:
                        Test.dFld += Test.iFld;
                        break;
                    case 57:
                        iArr[i - 1] = (int)-6850909827681718429L;
                    case 58:
                        Test.lArrFld[i] += i3;
                        break;
                    case 59:
                        by2 = (byte)i3;
                        break;
                    case 60:
                        by2 <<= by2;
                        break;
                    case 61:
                        iArr[(i3 >>> 1) % N] >>>= 5;
                        break;
                    case 62:
                        iArr[i2] *= Test.iFld;
                    case 63:
                        i1 += i2;
                        break;
                    case 64:
                        Test.iFld = i;
                        break;
                    case 65:
                        iArr[i - 1] -= i23;
                        break;
                    case 66:
                        fArr1[i] = Test.sFld;
                    case 67:
                        Test.bFld = Test.bFld1;
                        break;
                    case 68:
                        i23 += (((i2 * i3) + i2) - i22);
                    case 69:
                        Test.instanceCount <<= Test.iFld;
                    case 70:
                        i1 -= i2;
                        break;
                    }
                }
            } else if (Test.bFld) {
                iArr[i - 1] = i22;
            } else if (Test.bFld) {
                i23 += 229;
            } else {
                f += (i * i);
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
