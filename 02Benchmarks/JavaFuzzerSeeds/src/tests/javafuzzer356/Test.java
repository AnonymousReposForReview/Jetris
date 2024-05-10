package tests.javafuzzer356;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 02:45:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=9L;
    public byte byFld=-125;
    public static byte byFld1=-79;
    public static float fFld=-113.291F;
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-23033);
    }

    public static long fMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l, double d1) {

        short s=-29539, sArr[]=new short[N];
        int i6=-135, i7=-213, i8=-26935, i9=12, i10=241, iArr[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 49L);
        FuzzerUtils.init(iArr, -24);
        FuzzerUtils.init(sArr, (short)-10491);

        for (long l1 : lArr) {
            s = (short)i6;
            i6 *= i6;
            i6 += i6;
            for (i7 = 1; 4 > i7; i7++) {
                switch ((i7 % 7) + 88) {
                case 88:
                    switch (((i7 % 2) * 5) + 91) {
                    case 97:
                        iArr[i7 - 1] *= i7;
                        switch (((i6 >>> 1) % 8) + 94) {
                        case 94:
                            for (i9 = 1; i9 < 2; ++i9) {
                                i10 -= i10;
                                try {
                                    i8 = (i6 / -159);
                                    i10 = (6334 / i6);
                                    iArr[i7] = (i8 % i7);
                                } catch (ArithmeticException a_e) {}
                                Test.byFld1 *= (byte)i10;
                                i8 <<= i6;
                                i6 *= (int)-76.756F;
                            }
                            break;
                        case 95:
                            i10 += i7;
                            break;
                        case 96:
                        case 97:
                        case 98:
                            i6 |= i9;
                            break;
                        case 99:
                            l -= i8;
                        case 100:
                            d1 = i8;
                        case 101:
                            d1 -= i9;
                            break;
                        }
                        break;
                    case 94:
                        lArr[i7 - 1] *= i8;
                        break;
                    }
                    break;
                case 89:
                    Test.fFld += s;
                case 90:
                    l1 += (i7 - i10);
                    break;
                case 91:
                    iArr[i7 + 1] += i7;
                    break;
                case 92:
                    l1 <<= i10;
                case 93:
                    iArr[i7] = -55;
                    break;
                case 94:
                    sArr[i7 - 1] = (short)i9;
                    break;
                }
            }
        }
        long meth_res = l + Double.doubleToLongBits(d1) + s + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static short sMeth() {

        int i5=173, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -9);

        i5 = (-iMeth(Test.instanceCount, -74.72396));
        iArr1[(i5 >>> 1) % N] *= Test.byFld1;
        long meth_res = i5 + FuzzerUtils.checkSum(iArr1);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static float fMeth(int i2, double d) {

        int i3=7, i4=97, i11=-32429, i12=212, iArr2[]=new int[N];
        boolean b=false;
        short s1=13814;

        FuzzerUtils.init(iArr2, -139);

        for (i3 = 11; i3 < 322; ++i3) {
            if (b = ((176 * (--Test.instanceCount)) != (i4 ^ -141L))) continue;
            i2 = sMeth();
            iArr2[i3 - 1] = (int)d;
            if (false) {
                Test.instanceCount >>= i3;
                iArr2[i3] = (int)Test.instanceCount;
            } else if (b) {
                i2 += i3;
                s1 *= (short)i3;
            } else if (b) {
                Test.byFld1 = (byte)i2;
                if (i2 != 0) {
                }
                for (i11 = 1; i11 < 5; i11++) {
                    Test.instanceCount *= i12;
                    i12 = (int)212L;
                    iArr2[i11 - 1] -= i3;
                }
            }
        }
        long meth_res = i2 + Double.doubleToLongBits(d) + i3 + i4 + (b ? 1 : 0) + s1 + i11 + i12 +
            FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=7, i1=-4, i13=76, i14=13, i15=-13159, i16=-13, i17=92, i18=-43653, i19=-34009, i20=-23327, i21=34941,
            i22=-13, i23=-12, iArr3[]=new int[N];
        double d2=-45.74610, d3=89.15563, dArr[][]=new double[N][N];
        boolean b1=false;
        short s2=-19926;

        FuzzerUtils.init(dArr, -94.4185);
        FuzzerUtils.init(iArr3, 4547);

        for (i = 154; i > 7; i -= 3) {
            byFld -= (byte)(-33.979F - fMeth(i1, d2));
            Test.instanceCount += (long)d2;
            for (i13 = 1; 294 > i13; i13++) {
                for (i15 = 1; i15 < 2; ++i15) {
                    Test.fFld += ((long)i15 ^ (long)Test.instanceCount);
                    b1 = b1;
                    dArr[i - 1][i13 + 1] -= d2;
                    i14 = (int)Test.instanceCount;
                    Test.instanceCount <<= Test.instanceCount;
                    try {
                        i16 = (91 % i);
                        iArr3[i13 - 1] = (-1555324323 / iArr3[i13]);
                        i14 = (10570 / i13);
                    } catch (ArithmeticException a_e) {}
                    i14 = 10;
                }
                i16 += (i13 * i13);
                iArr3[i13 - 1] += (int)Test.instanceCount;
            }
            for (d3 = 11; d3 < 187; ++d3) {
                for (i18 = 1; i18 < 3; i18 += 2) {
                    i19 /= (int)(i13 | 1);
                    iArr3[i - 1] = Test.byFld1;
                    Test.sArrFld[i18] = (short)i15;
                }
            }
            if (b1) {
                for (i20 = i; i20 < 147; i20++) {
                    i21 = i;
                    Test.instanceCount += Test.instanceCount;
                    i14 = (int)Test.instanceCount;
                    for (i22 = i; i22 < 2; ++i22) {
                        i23 = s2;
                        iArr3[i22 + 1] <<= i16;
                    }
                    i16 = i23;
                    i17 = i16;
                    i16 += (((i20 * Test.fFld) + Test.instanceCount) - Test.instanceCount);
                }
            } else {
                iArr3 = FuzzerUtils.int1array(N, (int)0);
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
//DEBUG  sMeth ->  sMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth sMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}