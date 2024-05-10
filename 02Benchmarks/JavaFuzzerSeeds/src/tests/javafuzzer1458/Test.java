package tests.javafuzzer1458;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:02:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2054270452L;
    public static byte byFld=88;
    public static boolean bFld=true;
    public static float fArrFld[]=new float[N];
    public long lArrFld[]=new long[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 95.525F);
        FuzzerUtils.init(Test.sArrFld, (short)-6995);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        long l3=-57L;
        int i5=-224, i6=-227, i7=-3364, i8=-246, i9=-253, iArr[]=new int[N];
        float f1=1.9F;
        double d=-2.52173;
        boolean b=true;
        byte by=104;

        FuzzerUtils.init(iArr, -135);

        for (l3 = 257; 4 < l3; --l3) {
            Test.fArrFld[(int)(l3 - 1)] *= Test.instanceCount;
            Test.instanceCount ^= i5;
        }
        if (b) {
            Test.instanceCount *= i5;
            i5 = i5;
            for (i6 = 11; i6 < 365; ++i6) {
                Test.instanceCount = (long)f1;
                i7 += i6;
                switch ((i6 % 5) + 91) {
                case 91:
                    Test.instanceCount -= -288;
                    break;
                case 92:
                    for (i8 = 1; i8 < 5; i8++) {
                        i9 += (int)f1;
                        iArr[i8 - 1] *= i5;
                        d = -4L;
                    }
                case 93:
                    if (b) continue;
                    break;
                case 94:
                    f1 -= 159;
                    break;
                case 95:
                    by += (byte)(108 + (i6 * i6));
                }
            }
        } else {
            i7 = (int)l3;
        }
        long meth_res = l3 + i5 + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 + Double.doubleToLongBits(d) + (b ? 1 :
            0) + by + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i, float f) {

        long l2=1212619499L, lArr[][]=new long[N][N];
        int i1=21864, i2=4, i3=-60, i4=-1, i10=173, iArr1[]=new int[N];
        short s=25231;

        FuzzerUtils.init(iArr1, 62113);
        FuzzerUtils.init(lArr, -2L);

        for (l2 = 15; l2 < 278; ++l2) {
            i2 = 1;
            while (++i2 < 6) {
                i1 += i1;
                for (i3 = 1; i3 < 1; i3++) {
                    i1 = (int)((s - lMeth()) + l2);
                    i -= Test.byFld;
                    i1 = s;
                    i4 = i4;
                    iArr1[(int)(l2)] ^= i3;
                }
                i10 = 1;
                while (++i10 < 1) {
                    lArr[i2][i10 - 1] = i4;
                    i <<= -13;
                    Test.fArrFld[i10 + 1] -= l2;
                    iArr1[i2] >>>= Test.byFld;
                    if (true) break;
                }
            }
        }
        vMeth1_check_sum += i + Float.floatToIntBits(f) + l2 + i1 + i2 + i3 + i4 + s + i10 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l, long l1) {

        int i11=7954, i12=-208, i13=31148, i14=5, i15=0, i16=-140, i17=35162;
        float f2=0.255F;
        long l4=-198L;

        vMeth1(i11, f2);
        f2 *= i11;
        i11 >>= i11;
        for (i12 = 5; i12 < 204; i12++) {
            double d1=51.45734;
            d1 = i11;
            i13 += (int)f2;
            if (i13 != 0) {
                vMeth_check_sum += l + l1 + i11 + Float.floatToIntBits(f2) + i12 + i13 + i14 + i15 + l4 + i16 + i17;
                return;
            }
            for (i14 = i12; i14 < 8; ++i14) {
                switch ((((i12 >>> 1) % 1) * 5) + 85) {
                case 87:
                    f2 += (((i14 * i12) + i12) - l4);
                    if (Test.bFld) {
                        for (i16 = 1; 1 < i16; i16--) {
                            d1 /= ((long)(f2) | 1);
                            f2 += i16;
                            Test.instanceCount += i14;
                        }
                    } else {
                        Test.bFld = Test.bFld;
                    }
                    break;
                default:
                    f2 *= i12;
                }
            }
        }
        vMeth_check_sum += l + l1 + i11 + Float.floatToIntBits(f2) + i12 + i13 + i14 + i15 + l4 + i16 + i17;
    }

    public void mainTest(String[] strArr1) {

        int i18=-15080, i19=-54627, i20=-11, i21=27004, i22=-219, i23=247, i24=-143, i25=26150, i26=-193, i27=39664,
            iArr2[]=new int[N];
        double d2=-1.44385, dArr[][]=new double[N][N];
        short s1=-18833;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-79);
        FuzzerUtils.init(iArr2, -1);
        FuzzerUtils.init(dArr, 110.24169);

        vMeth(Test.instanceCount, Test.instanceCount);
        for (i18 = 16; 319 > i18; ++i18) {
            i19 += i18;
            i19 >>>= i19;
        }
        if (Test.bFld) {
            i20 = 1;
            do {
                Test.instanceCount -= i21;
                i21 >>= i21;
                lArrFld[i20 - 1] -= (long)d2;
                byArr[i20] -= (byte)i18;
                i19 += (i20 | i19);
                i21 += i20;
                iArr2[i20] &= i21;
            } while (++i20 < 269);
            for (i22 = 6; i22 < 324; ++i22) {
                i21 += i22;
                i23 ^= (int)Test.instanceCount;
                for (i24 = 1; i24 < 79; ++i24) {
                    dArr[i24][i24 - 1] *= Test.byFld;
                    i23 -= i23;
                    switch ((i22 % 2) + 72) {
                    case 72:
                        i23 = i22;
                        break;
                    case 73:
                        Test.byFld -= (byte)i20;
                        i19 = (int)-46L;
                        break;
                    }
                    for (i26 = i22; 2 > i26; i26++) {
                        Test.sArrFld[i22 - 1] = (short)Test.instanceCount;
                        d2 = Test.instanceCount;
                        d2 = i25;
                    }
                    Test.instanceCount = s1;
                    i27 += i24;
                    i23 = s1;
                }
            }
        } else if (Test.bFld) {
            i19 -= i26;
        } else if (Test.bFld) {
            i25 = (int)45324L;
        } else {
            d2 -= 52.880F;
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
