package tests.javafuzzer2977;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:26:28 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=7L;
    public static double dFld=0.78209;
    public static byte byFld=-41;
    public boolean bFld=true;
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)36);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l, short s1, int i11) {

        int i12=-2, i14=-18680, i15=-23302, i16=-24, i17=13, iArr1[]=new int[N];
        float f2=0.97F;

        FuzzerUtils.init(iArr1, -142);

        iArr1[(i11 >>> 1) % N] = (int)Test.instanceCount;
        i12 = 311;
        while (--i12 > 0) {
            for (i14 = 1; i14 < 5; i14++) {
                iArr1 = iArr1;
                iArr1[i12 - 1] <<= i12;
                i11 = i11;
                i15 >>>= i12;
                i11 /= 22;
                iArr1[i12 - 1] -= i11;
                i15 += (i14 - Test.instanceCount);
                for (i16 = 1; i16 < 2; i16++) {
                    i17 = (int)l;
                    i17 += (((i16 * i15) + l) - f2);
                    iArr1[i14 - 1] = (int)Test.instanceCount;
                    iArr1[i12] = i11;
                }
            }
        }
        long meth_res = l + s1 + i11 + i12 + i14 + i15 + i16 + i17 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i8) {

        float f1=-2.842F;
        int i9=12103, i10=64670, i18=-10, i19=-39124, i20=1, i21=159;
        short s2=30312;
        boolean b=false;
        long l1=12L;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -81.94928);

        for (double d : dArr) {
            f1 = Test.instanceCount;
            for (i9 = 4; 1 < i9; i9 -= 2) {
                f1 *= Float.intBitsToFloat(i8--);
                Test.instanceCount += ((Math.abs(i10) * iMeth1(-2593042002177305695L, s2, i8)) + -131);
                for (i18 = 1; i18 < 4; i18 += 2) {
                    i8 -= -13;
                    if (i10 != 0) {
                    }
                }
                if (b) break;
                Test.instanceCount = i19;
                i19 += (int)l1;
            }
            l1 += i10;
            for (i20 = 1; i20 < 4; ++i20) {
                Test.byArrFld[i20 - 1] += (byte)s2;
                i8 = i8;
            }
        }
        long meth_res = i8 + Float.floatToIntBits(f1) + i9 + i10 + s2 + i18 + i19 + (b ? 1 : 0) + l1 + i20 + i21 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=-6, i1=7, i2=-2, i3=-161, i4=-9, i5=6971, i6=168, i7=49, iArr[]=new int[N];
        float f=-126.194F;
        short s=7844;
        byte by=-47, by1=-121;

        FuzzerUtils.init(iArr, 157);

        for (i = 22; 381 > i; ++i) {
            switch (((i % 10) * 5) + 47) {
            case 78:
                for (i2 = 5; i2 > i; i2 -= 3) {
                    Test.instanceCount += (2268172070L + (i2 * i2));
                    try {
                        i1 = (i / -12078);
                        i1 = (i1 % 103);
                        i4 = (i3 / i2);
                    } catch (ArithmeticException a_e) {}
                    i3 += (i2 ^ i3);
                    for (i5 = i2; i5 < 1; i5++) {
                        f += i5;
                        s += (short)i5;
                    }
                    i7 = 1;
                    while (++i7 < 1) {
                        Test.instanceCount = Test.instanceCount;
                        i6 = (iArr[i]++);
                        Test.instanceCount += (((i7 * i6) + i5) - Test.instanceCount);
                        Test.dFld = iMeth(-8);
                        by -= (byte)i4;
                    }
                }
                break;
            case 64:
                f = Test.instanceCount;
            case 62:
                i1 = (int)f;
                break;
            case 48:
                Test.dFld *= i;
                break;
            case 84:
                Test.instanceCount -= Test.instanceCount;
            case 91:
                Test.dFld -= 1;
                break;
            case 58:
                i4 -= i5;
                break;
            case 60:
                by1 = (byte)f;
                break;
            case 65:
                i3 = i3;
                break;
            case 59:
                i1 += i4;
                break;
            default:
                i1 += (2870 + (i * i));
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + s + i7 + by + by1 +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i22=-11131, i23=-13, i24=-3383, i25=-9, i26=7, i27=-190, i28=6, i29=14, iArr2[]=new int[N];
        float f3=2.794F;
        long lArr[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr2, 10);
        FuzzerUtils.init(lArr, -4334L);
        FuzzerUtils.init(sArr, (short)-25939);

        vMeth();
        if (false) {
            for (i22 = 128; i22 > 8; --i22) {
                Test.instanceCount = i23;
                switch (((i22 % 10) * 5) + 118) {
                case 126:
                    i23 = (int)Test.dFld;
                    for (i24 = 12; i24 < 209; ++i24) {
                        i25 -= i24;
                    }
                    i23 = i23;
                    i23 += 111;
                case 122:
                    i23 -= i24;
                    Test.instanceCount += i22;
                case 157:
                    iArr2[i22] -= (int)Test.instanceCount;
                    i25 *= 0;
                    for (i26 = 2; i26 < 209; i26++) {
                        Test.instanceCount *= i26;
                        i27 += (int)(43485L + (i26 * i26));
                        i23 <<= 244;
                        Test.byFld %= (byte)((long)(f3) | 1);
                        lArr = FuzzerUtils.long1array(N, (long)-10961L);
                        i27 = i26;
                        for (i28 = i26; i28 < 2; ++i28) {
                            Test.instanceCount -= i22;
                            f3 = Test.instanceCount;
                            bFld = bFld;
                            i23 += i26;
                        }
                        if (bFld) {
                            sArr[i26] -= (short)Test.dFld;
                            i25 -= i26;
                            i23 = 51558;
                        } else if (bFld) {
                            i27 = i23;
                        } else {
                            try {
                                i29 = (-11038 / i23);
                                i25 = (58788 / i26);
                                iArr2[i26] = (iArr2[i22] / -42533);
                            } catch (ArithmeticException a_e) {}
                        }
                    }
                case 147:
                    i27 += (i22 ^ Test.byFld);
                    break;
                case 140:
                    i29 = i22;
                case 138:
                    i23 -= (int)f3;
                    break;
                case 120:
                    iArr2[i22] = i27;
                    break;
                case 132:
                    Test.instanceCount += (i22 | Test.byFld);
                    break;
                case 134:
                    i25 = (int)Test.instanceCount;
                    break;
                case 158:
                    i27 += (int)Test.dFld;
                    break;
                }
            }
        } else if (bFld) {
            Test.byFld = (byte)Test.instanceCount;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
