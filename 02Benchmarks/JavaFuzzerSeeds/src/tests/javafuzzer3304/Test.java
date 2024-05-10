package tests.javafuzzer3304;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:46:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1491258393L;
    public static float fFld=-95.550F;
    public static int iFld=35;
    public double dFld=55.114986;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d1) {

        int i5=-61731, i6=254, i7=11, i8=102, i9=-152, iArr1[]=new int[N];
        long l1=6107623256878287323L;
        boolean b=false;

        FuzzerUtils.init(iArr1, -65335);

        for (i5 = 5; i5 < 252; ++i5) {
            for (l1 = i5; l1 < 7; ++l1) {
                i6 += (int)(l1 * l1);
            }
            i7 -= i5;
            iArr1[i5] *= (int)l1;
            Test.fFld += 27698;
        }
        for (i8 = 23; i8 < 369; ++i8) {
            if (i7 != 0) {
                vMeth2_check_sum += Double.doubleToLongBits(d1) + i5 + i6 + l1 + i7 + i8 + i9 + (b ? 1 : 0) +
                    FuzzerUtils.checkSum(iArr1);
                return;
            }
            iArr1[i8 + 1] = i5;
            i6 = (int)-9L;
            iArr1[i8 - 1] = 22683;
            i6 = i8;
            Test.fFld = (float)d1;
            b = b;
            if (i7 != 0) {
                vMeth2_check_sum += Double.doubleToLongBits(d1) + i5 + i6 + l1 + i7 + i8 + i9 + (b ? 1 : 0) +
                    FuzzerUtils.checkSum(iArr1);
                return;
            }
        }
        vMeth2_check_sum += Double.doubleToLongBits(d1) + i5 + i6 + l1 + i7 + i8 + i9 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(int i3, long l, int i4) {

        double d2=102.121468;
        byte by=74;
        int i10=-82, i11=-9239, i12=-13, iArr2[]=new int[N], iArr3[][]=new int[N][N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 12.42F);
        FuzzerUtils.init(iArr2, 40599);
        FuzzerUtils.init(iArr3, 11274);

        vMeth2(d2);
        i3 = by;
        fArr[(i3 >>> 1) % N] = i4;
        iArr2 = iArr2;
        i10 = 1;
        while (++i10 < 294) {
            iArr3[i10 + 1][i10 + 1] = i4;
            for (i11 = i10; i11 < 6; ++i11) {
                fArr[i10] += (float)-44.56570;
            }
            iArr2[i10] += (int)2185032271L;
            i4 = i10;
            d2 -= i4;
            i4 *= (int)l;
            fArr[i10 - 1] += i12;
            by += (byte)(((i10 * i12) + i4) - Test.fFld);
        }
        iArr2[(i10 >>> 1) % N] -= i10;
        vMeth1_check_sum += i3 + l + i4 + Double.doubleToLongBits(d2) + by + i10 + i11 + i12 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(iArr3);
    }

    public static void vMeth(double d, int i2) {

        int i13=59841, i14=-56209, i16=8, i17=0, iArr4[]=new int[N];
        byte by1=86;
        short s=15754;
        boolean b1=true;

        FuzzerUtils.init(iArr4, 47601);

        vMeth1(i2, -60383L, i2);
        for (i13 = 5; i13 < 239; i13++) {
            if (b1) {
                d = by1;
                Test.fFld += i13;
                i2 *= i2;
                Test.instanceCount = i13;
            } else if (b1) {
                i2 -= i2;
                s = (short)i2;
            } else if (b1) {
                i2 /= (int)(i13 | 1);
            } else {
                i14 -= i14;
                for (i16 = 1; i16 < 7; ++i16) {
                    Test.iFld += i16;
                    i14 -= 52642;
                    Test.instanceCount = -19506;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i13 + i14 + by1 + s + (b1 ? 1 : 0) + i16 + i17 +
            FuzzerUtils.checkSum(iArr4);
    }

    public void mainTest(String[] strArr1) {

        int i=246, i1=6, i18=-13, i19=-134, i20=-26903, i21=11, i22=-56800, iArr[]=new int[N];
        boolean b2=true;
        long lArr[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, -8546365117806766932L);
        FuzzerUtils.init(iArr, 9);
        FuzzerUtils.init(sArr, (short)-14928);

        for (i = 222; i > 6; i -= 2) {
            lArr[i] -= (long)(iArr[i - 1] * ((i + Test.fFld) - Test.instanceCount));
            Test.instanceCount = (long)(2.719F + i);
            vMeth(dFld, i1);
        }
        Test.fFld += -19279;
        if (b2) {
            for (i18 = 11; i18 < 221; i18++) {
                i20 = 120;
                do {
                    dFld = i1;
                    switch ((i20 % 10) + 86) {
                    case 86:
                        i1 ^= i19;
                        i1 = i20;
                        break;
                    case 87:
                        i21 = 1;
                        do {
                            switch ((i18 % 1) + 105) {
                            case 105:
                                Test.iFld += (((i21 * i19) + Test.instanceCount) - Test.instanceCount);
                                break;
                            }
                            i19 = i20;
                            if (b2) continue;
                            if (true) {
                                Test.iFld = i18;
                                dFld = i1;
                                Test.fFld = i;
                                Test.iFld /= (int)(i19 | 1);
                            } else {
                                if (b2) continue;
                                if (b2) {
                                    dFld *= i18;
                                    dFld += i18;
                                    Test.instanceCount -= i20;
                                    i19 += (((i21 * Test.iFld) + i) - i);
                                } else if (b2) {
                                    Test.instanceCount += i21;
                                }
                            }
                            Test.instanceCount = i22;
                        } while (++i21 < 1);
                        break;
                    case 88:
                        lArr[i18 + 1] = i18;
                        break;
                    case 89:
                        dFld -= 0.94F;
                        break;
                    case 90:
                        i19 = i20;
                    case 91:
                        i1 = i19;
                    case 92:
                        b2 = b2;
                        break;
                    case 93:
                        i1 ^= 0;
                        break;
                    case 94:
                        b2 = b2;
                        break;
                    case 95:
                        Test.instanceCount = i19;
                    default:
                        dFld += Test.instanceCount;
                    }
                } while (--i20 > 0);
            }
        } else if (b2) {
            b2 = false;
        } else if (b2) {
            sArr[(i18 >>> 1) % N] += (short)dFld;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}