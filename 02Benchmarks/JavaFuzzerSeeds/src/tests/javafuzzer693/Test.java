package tests.javafuzzer693;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:03:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-196L;
    public static int iFld=-10;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -53113L);
        FuzzerUtils.init(Test.iArrFld, 183);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, double d, long l1) {

        long l3=-2595946551L;
        int i5=100, i6=-6, i7=-13, iArr1[]=new int[N];
        short s=24865;

        FuzzerUtils.init(iArr1, 3989);

        for (long l2 : Test.lArrFld) {
            l3 = 1;
            while (++l3 < 4) {
                i5 *= i5;
                l2 = s;
                i5 <<= 39;
                Test.instanceCount -= Test.instanceCount;
                for (i6 = 1; i6 < 1; i6++) {
                    byte by=-59;
                    iArr1[(int)(l3)] += (int)121.484F;
                    s += (short)-5;
                    i5 -= i7;
                    i5 += i7;
                    i5 = (int)l2;
                    iArr1[(int)(l3)] = (int)-2567356703L;
                    by += (byte)(((i6 * l) + i7) - i6);
                }
                iArr1[(int)(l3)] = (int)8L;
            }
        }
        vMeth2_check_sum += l + Double.doubleToLongBits(d) + l1 + l3 + i5 + s + i6 + i7 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(int i3, boolean b, int i4) {

        int i8=-14, i9=4, i10=-2, i11=28313, i12=-48974, i13=136;
        double d1=-2.128072;
        short sArr[]=new short[N];
        byte byArr[][]=new byte[N][N];
        float fArr[]=new float[N];

        FuzzerUtils.init(sArr, (short)-3790);
        FuzzerUtils.init(byArr, (byte)83);
        FuzzerUtils.init(fArr, -70.257F);

        vMeth2(Test.instanceCount, 27.103693, Test.instanceCount);
        i3 *= -116;
        for (i8 = 1; 220 > i8; i8++) {
            for (i10 = 1; i10 < 7; i10++) {
                short s1=-13823;
                i9 += i11;
                sArr[i8 + 1] *= (short)i3;
                switch (((i8 >>> 1) % 10) + 5) {
                case 5:
                    i11 += i9;
                    break;
                case 6:
                    s1 = (short)i10;
                    Test.iArrFld[i8] /= 6;
                    Test.iArrFld[i8 - 1] *= -7;
                    break;
                case 7:
                    Test.iArrFld[i10 - 1] >>= 53;
                    for (i12 = 1; i12 < 2; i12++) {
                        byArr[i8][i12 - 1] = (byte)1977732504910297250L;
                        if (i12 != 0) {
                            vMeth1_check_sum += i3 + (b ? 1 : 0) + i4 + i8 + i9 + i10 + i11 + i12 + i13 +
                                Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(byArr)
                                + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                            return;
                        }
                    }
                case 8:
                    i11 *= (int)Test.instanceCount;
                case 9:
                    Test.lArrFld[i10 + 1] = -229;
                    break;
                case 10:
                    d1 += i12;
                    break;
                case 11:
                    i13 >>= i3;
                    break;
                case 12:
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 13:
                    fArr[i8 + 1] = (float)d1;
                    break;
                case 14:
                    if (i8 != 0) {
                        vMeth1_check_sum += i3 + (b ? 1 : 0) + i4 + i8 + i9 + i10 + i11 + i12 + i13 +
                            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(byArr) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                    break;
                default:
                    i9 += (int)Test.instanceCount;
                }
            }
        }
        vMeth1_check_sum += i3 + (b ? 1 : 0) + i4 + i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(byArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void vMeth(float f, int i) {

        int i1=41070, i2=40740, iArr[]=new int[N];
        boolean b1=false;

        FuzzerUtils.init(iArr, 6051);

        i1 = 1;
        while ((i1 += 3) < 170) {
            i2 = 1;
            do {
                i += (52405 + (i2 * i2));
            } while (++i2 < 27);
        }
        i -= (int)(((i2 * i1) - (i * Test.instanceCount)) - (iArr[(i2 >>> 1) % N] + (i + i2)));
        vMeth1(i1, b1, -2);
        vMeth_check_sum += Float.floatToIntBits(f) + i + i1 + i2 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        float f1=78.89F, fArr1[]=new float[N];
        int i14=7, i15=-3, i16=-7, i17=-61903, i18=-14, i19=38253, i20=65, i21=2;
        byte by1=61;

        FuzzerUtils.init(fArr1, 0.49F);

        vMeth(f1, 6);
        Test.iArrFld[(i14 >>> 1) % N] /= (int)(Test.instanceCount | 1);
        i14 *= 41476;
        i15 = 210;
        while ((i15 -= 2) > 0) {
            Test.instanceCount = Test.instanceCount;
        }
        by1 = (byte)i15;
        i14 = Test.iFld;
        Test.iFld = i14;
        i16 = 1;
        do {
            i14 >>= i15;
            Test.iArrFld[i16 - 1] = i16;
            i14 <<= i14;
            for (i17 = 8; i17 < 175; i17++) {
                i19 = 1;
                do {
                    Test.lArrFld[i16 - 1] += i14;
                    Test.iFld += (int)Test.instanceCount;
                    i14 += (i19 * i19);
                    f1 -= i14;
                    f1 = 88;
                } while (++i19 < 2);
                Test.iFld = 2;
                i18 += -10827;
                i18 += (41767 + (i17 * i17));
                for (i20 = i17; i20 < 2; ++i20) {
                    short s2=-3855;
                    s2 |= (short)i16;
                    i18 *= (int)Test.instanceCount;
                    s2 += (short)-35942L;
                    Test.iArrFld[i16 - 1] = i19;
                    i18 = (int)Test.instanceCount;
                    fArr1[i17] -= i15;
                    Test.instanceCount -= (long)f1;
                }
            }
        } while (++i16 < 143);



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