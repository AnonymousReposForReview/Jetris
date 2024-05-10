package tests.javafuzzer2864;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 21:44:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8947458209850379497L;
    public static int iFld=70;
    public static double dFld=53.71204;
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -426539514817964362L);
    }

    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, int i5, byte by1) {

        int i6=23226, i7=-237, i8=13, i9=19, i10=116, i11=-9, i12=12, i13=39581, i14=-38043, i15=-13, iArr[]=new int[N];
        float f=95.607F;
        boolean b=true;

        FuzzerUtils.init(iArr, 68);

        for (i6 = 394; i6 > 12; i6 -= 2) {
            f += f;
            i5 += (int)-110.204F;
            for (i8 = i6; i8 < 8; i8++) {
                iArr[i6 + 1] = i4;
                i9 = (int)Test.instanceCount;
                Test.instanceCount = Test.instanceCount;
                if (b) continue;
                for (i10 = 1; 1 > i10; i10++) {
                    f += i5;
                    iArr = iArr;
                }
            }
            for (i12 = 1; i12 < 8; ++i12) {
                for (i14 = 2; i14 > i6; i14 -= 2) {
                    if (i14 != 0) {
                        vMeth1_check_sum += i4 + i5 + by1 + i6 + i7 + Float.floatToIntBits(f) + i8 + i9 + (b ? 1 : 0) +
                            i10 + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                }
                Test.lArrFld[i12] = -4L;
            }
        }
        vMeth1_check_sum += i4 + i5 + by1 + i6 + i7 + Float.floatToIntBits(f) + i8 + i9 + (b ? 1 : 0) + i10 + i11 + i12
            + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr);
    }

    public static byte byMeth(long l1) {

        byte by2=31;
        int i16=19962, i17=-65, i18=-55672, i19=-38, i20=-40331, i21=5, i22=-1, iArr1[]=new int[N];
        boolean b1=true;
        short s=-56;
        float f2=0.816F;

        FuzzerUtils.init(iArr1, 13);

        vMeth1(Test.iFld, Test.iFld, by2);
        Test.iFld -= Test.iFld;
        for (i16 = 246; i16 > 6; i16 -= 3) {
            for (i18 = 1; i18 < 19; i18++) {
                float f1=-4.290F;
                b1 = b1;
                f1 -= i18;
                l1 += i18;
                for (i20 = 1; 2 > i20; ++i20) {
                    if (b1) continue;
                    iArr1[i16] = i21;
                    l1 -= i18;
                }
            }
        }
        s = (short)i18;
        i22 = 1;
        do {
            f2 = i16;
            Test.iFld += i22;
        } while (++i22 < 283);
        long meth_res = l1 + by2 + i16 + i17 + i18 + i19 + (b1 ? 1 : 0) + i20 + i21 + s + i22 +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr1);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth(int i, int i1, long l) {

        int i2=-358, i3=1, i23=111, i24=-11, i25=-41886, i26=242;
        float f3=60.1016F;
        short s1=20125, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)24072);

        for (i2 = 220; i2 > 7; i2--) {
            i3 -= (int)((byMeth(Test.instanceCount) + i3) * l);
            i3 = (int)249L;
            i += i2;
            for (i23 = 8; i23 > 1; --i23) {
                i <<= i1;
                for (i25 = 1; i25 < 2; ++i25) {
                    Test.iFld = -64249;
                    f3 += 106;
                    s1 *= (short)-2.898F;
                }
                Test.iFld = -1660;
            }
            i1 = s1;
            i24 = i23;
            sArr[i2] += (short)i24;
            f3 += (((i2 * f3) + i2) - i23);
        }
        vMeth_check_sum += i + i1 + l + i2 + i3 + i23 + i24 + i25 + i26 + Float.floatToIntBits(f3) + s1 +
            FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        byte by=119, byArr[][]=new byte[N][N];
        short s2=1763;
        int i27=-196, i28=6010, i29=157, i30=-253, i31=-195, i32=-9, i33=-63091, i34=-1;
        boolean b2=false;
        float f4=0.878F;

        FuzzerUtils.init(byArr, (byte)-18);

        Test.instanceCount = (by = (byte)Test.iFld);
        vMeth(-10833, Test.iFld, Test.instanceCount);
        Test.iFld = s2;
        Test.instanceCount = -155L;
        Test.instanceCount >>= Test.iFld;
        for (i27 = 15; 309 > i27; ++i27) {
            for (i29 = 3; i29 < 86; i29++) {
                if (b2) break;
                i30 -= (int)Test.instanceCount;
                switch (((i28 >>> 1) % 10) + 84) {
                case 84:
                    iArrFld[i27 - 1] = i27;
                    i30 += by;
                    i30 = i30;
                    break;
                case 85:
                case 86:
                    i28 %= (int)(i27 | 1);
                case 87:
                    switch (((i27 % 5) * 5) + 106) {
                    case 110:
                        for (i31 = i29; i31 < 2; ++i31) {
                            i32 += (((i31 * i29) + i29) - i30);
                            Test.instanceCount = Test.instanceCount;
                            iArrFld[i27 - 1] = (int)Test.instanceCount;
                            Test.instanceCount += (((i31 * Test.instanceCount) + i27) - Test.instanceCount);
                            Test.instanceCount += (((i31 * i28) + i30) - i31);
                            i30 = (int)Test.instanceCount;
                        }
                        Test.instanceCount -= i30;
                        iArrFld[i29 + 1] -= (int)Test.instanceCount;
                        break;
                    case 124:
                        for (i33 = 1; i33 < 2; ++i33) {
                            i32 = (int)-7122L;
                            byArr[i33 + 1][i29] += (byte)Test.instanceCount;
                            by = (byte)Test.dFld;
                        }
                        s2 >>>= (short)i34;
                        Test.iFld = i27;
                        break;
                    case 120:
                        Test.iFld ^= s2;
                        break;
                    case 127:
                    case 128:
                        iArrFld[i29 + 1] = i33;
                        break;
                    default:
                        Test.dFld = i32;
                    }
                    break;
                case 88:
                    try {
                        i30 = (i33 % i34);
                        i32 = (i32 / 26422);
                        i28 = (i33 / i31);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 89:
                    i32 -= i27;
                    break;
                case 90:
                    f4 += (((i29 * i28) + Test.instanceCount) - f4);
                    break;
                case 91:
                    try {
                        Test.iFld = (Test.iFld % i30);
                        iArrFld[i29 - 1] = (Test.iFld % 64400);
                        Test.iFld = (Test.iFld / -51366);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 92:
                    i28 += i30;
                    break;
                case 93:
                    if (false) break;
                    break;
                default:
                    iArrFld[i27 - 1] = i30;
                }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  byMeth ->  byMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 byMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}