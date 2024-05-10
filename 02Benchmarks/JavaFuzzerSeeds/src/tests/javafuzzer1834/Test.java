package tests.javafuzzer1834;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 04:10:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5323819810554509041L;
    public static float fFld=55.36F;
    public static short sFld=-28883;
    public static int iFld=2;
    public static byte byArrFld[][]=new byte[N][N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)125);
        FuzzerUtils.init(Test.lArrFld, 3839718162L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i9, long l1) {

        int i10=-34891, i11=-24485, i12=-112, i13=8;
        long l2=180L;
        short s1=13125;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 104.122960);

        i9 *= (int)Test.instanceCount;
        i10 = 1;
        while (++i10 < 192) {
            l2 = 1;
            do {
                for (i11 = 1; i11 < 1; ++i11) {
                    Test.byArrFld[(int)(l2)][(int)(l2 + 1)] = (byte)i13;
                    Test.fFld += ((long)i11 | (long)i13);
                    dArr[i10] %= (i9 | 1);
                    Test.fFld += i11;
                }
                i12 += (int)(l2 * l2);
            } while (++l2 < 8);
            switch ((((i10 >>> 1) % 5) * 5) + 78) {
            case 96:
                l1 += (i10 * i10);
                i12 += i13;
                break;
            case 82:
                i13 += i11;
                Test.byArrFld[i10 + 1][i10] *= (byte)i9;
                i12 -= (int)Test.instanceCount;
                break;
            case 102:
                s1 += (short)(((i10 * i12) + l1) - i9);
                break;
            case 79:
                dArr[i10 - 1] *= Test.fFld;
                break;
            case 85:
            }
        }
        long meth_res = i9 + l1 + i10 + l2 + i11 + i12 + i13 + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i7=-24, i8=-3, i14=-19, i15=6, i16=176, i17=20, i18=3, iArr1[]=new int[N];
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -238L);
        FuzzerUtils.init(iArr1, -4);

        for (i7 = 8; i7 < 260; i7++) {
            Test.fFld += i7;
            if (lMeth(8, Test.instanceCount) != i7) continue;
            i8 *= (int)Test.fFld;
            for (i14 = i7; i14 < 6; ++i14) {
                if (b) break;
                i15 *= 20975;
            }
            Test.fFld -= -1;
            i16 = 6;
            do {
                for (i17 = 1; 1 < i17; i17--) {
                    i8 += (i17 * i17);
                }
            } while (--i16 > 0);
            iArr1[i7 + 1] = i8;
            Test.instanceCount = 95;
        }
        i18 = Test.sFld;
        i15 = 65379;
        vMeth1_check_sum += i7 + i8 + i14 + i15 + (b ? 1 : 0) + i16 + i17 + i18 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i, double d) {

        int i1=-6445, i2=-25, i3=10, i4=36478, i5=-146, i6=-36054, iArr[]=new int[N];
        short s=-13930;
        byte by=-99;
        double d1=0.31328, d2=-10.22250;
        long l3=180L;

        FuzzerUtils.init(iArr, 26);

        for (i1 = 368; i1 > 15; --i1) {
            i2 += (i1 * i1);
            i += (int)(((Test.fFld * Test.fFld) + Test.instanceCount) + ((i++) - s));
            for (i3 = 5; 1 < i3; i3--) {
                for (i5 = i1; i5 < 2; i5++) {
                    i2 -= (int)(((Test.fFld - i1) + (-(s - 2L))) - by);
                    iArr[i5] -= (int)((d++) - ((Test.instanceCount++) / ((Test.instanceCount - 5) | 1)));
                }
                vMeth1();
                d1 = 1;
                do {
                    iArr[i3 + 1] += i6;
                    Test.instanceCount >>= Test.instanceCount;
                    switch (((i3 % 5) * 5) + 70) {
                    case 94:
                        Test.instanceCount = Test.instanceCount;
                        break;
                    case 92:
                        Test.instanceCount += (long)(((d1 * i6) + l3) - Test.fFld);
                        i += (int)Test.instanceCount;
                    case 79:
                        i = (int)d2;
                        break;
                    case 87:
                        try {
                            iArr[i1] = (iArr[i1 - 1] % i3);
                            iArr[(int)(d1 - 1)] = (i6 / i);
                            iArr[(int)(d1 - 1)] = (1679653832 % i3);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 74:
                        l3 = Test.instanceCount;
                    default:
                        iArr[(int)(d1)] -= 44;
                    }
                } while (++d1 < 2);
            }
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + i1 + i2 + s + i3 + i4 + i5 + i6 + by +
            Double.doubleToLongBits(d1) + l3 + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i19=25587, i20=-2, i21=-33711, i22=-2, i23=169, i24=-12, i25=7, i26=118, i27=-23, i28=-11, iArr2[][]=new
            int[N][N];
        double d3=2.16416, d4=38.92719;
        float f=-47.506F;
        boolean b1=false;
        long l4=250011695L;
        byte by1=-122;

        FuzzerUtils.init(iArr2, 13);

        vMeth(i19, d3);
        i20 = 1;
        do {
            Test.instanceCount += (i20 * i20);
            for (f = i20; f < 67; f++) {
                for (i22 = 1; i22 < 1; ++i22) {
                    i19 += i22;
                    Test.instanceCount += Test.instanceCount;
                    Test.iFld -= i22;
                    Test.iFld += (i22 ^ i20);
                }
                if (b1) continue;
                i19 += (int)((long)f ^ (long)Test.fFld);
                for (i24 = i20; i24 < 1; i24++) {
                    i19 = i24;
                    Test.lArrFld[i20] = 3600545205833897272L;
                    Test.fFld = Test.instanceCount;
                }
            }
            Test.fFld = Test.instanceCount;
        } while (++i20 < 376);
        for (d4 = 240; d4 > 12; d4 -= 2) {
            d3 = Test.instanceCount;
            i23 >>= (int)l4;
            i19 |= -251;
            Test.iFld |= i23;
            iArr2[(int)(d4)][(int)(d4)] = Test.iFld;
            i27 = 1;
            while (++i27 < 220) {
                if (b1) continue;
                switch (((i27 % 1) * 5) + 11) {
                case 16:
                    iArr2[(int)(d4)][(int)(d4 - 1)] -= 12;
                    by1 = (byte)Test.instanceCount;
                default:
                    l4 += (((i27 * i28) + i21) - Test.instanceCount);
                }
                i28 = -61014;
                Test.iFld >>>= Test.sFld;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}