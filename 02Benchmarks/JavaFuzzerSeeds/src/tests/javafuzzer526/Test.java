package tests.javafuzzer526;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:17:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=11L;
    public static int iFld=-55053;
    public static float fFld=0.733F;
    public static volatile byte byFld=2;
    public boolean bFld=false;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.669F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, int i8) {

        double d2=2.71552;
        int i9=-5, i10=44074, iArr[]=new int[N];
        short s=7074, sArr[]=new short[N];
        boolean b1=true;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr, -13);
        FuzzerUtils.init(sArr, (short)31323);
        FuzzerUtils.init(lArr, 46129L);

        iArr[(Test.iFld >>> 1) % N] = (int)d2;
        for (i9 = 6; i9 < 160; i9++) {
            i7 += i9;
            d2 = i8;
            switch ((((i8 >>> 1) % 10) * 5) + 77) {
            case 118:
                s = (short)Test.instanceCount;
                sArr[i9 - 1] -= (short)i10;
                break;
            case 124:
                Test.iFld = i9;
                Test.fFld += (((i9 * Test.fFld) + i10) - Test.instanceCount);
                switch (((i9 % 10) * 5) + 97) {
                case 127:
                    switch (((i9 % 3) * 5) + 120) {
                    case 130:
                        i7 *= i9;
                        if (b1) continue;
                        break;
                    case 132:
                        i7 += (int)Test.fFld;
                        if (b1) continue;
                        break;
                    case 131:
                        try {
                            i10 = (iArr[i9] / 46);
                            i10 = (iArr[i9 + 1] / -54);
                            i10 = (i9 % 26187);
                        } catch (ArithmeticException a_e) {}
                        break;
                    }
                    break;
                case 145:
                    Test.fFld += (i9 * i9);
                case 98:
                    Test.fFld -= 3;
                    break;
                case 136:
                    Test.byFld -= (byte)Test.fFld;
                    break;
                case 102:
                    Test.iFld *= i9;
                    break;
                case 110:
                    Test.instanceCount *= -4;
                    break;
                case 146:
                    i7 += (((i9 * i7) + Test.instanceCount) - i8);
                    break;
                case 123:
                    i8 *= i8;
                case 116:
                    Test.fFld *= i8;
                case 113:
                    Test.iFld += (i9 * i9);
                    break;
                default:
                    Test.instanceCount += (((i9 * i7) + i8) - i9);
                }
                break;
            case 80:
                Test.instanceCount &= i8;
                break;
            case 91:
                i8 += -3;
                break;
            case 119:
                d2 += i10;
            case 93:
                lArr[i9][i9 + 1] >>>= Test.iFld;
                break;
            case 110:
                d2 -= i8;
                break;
            case 85:
                Test.iFld -= (int)-10L;
                break;
            case 88:
                i10 = (int)Test.fFld;
                break;
            case 82:
                Test.iFld &= s;
                break;
            }
        }
        vMeth1_check_sum += i7 + i8 + Double.doubleToLongBits(d2) + i9 + i10 + s + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l, int i2, double d1) {

        int i3=-78, i4=188, i5=22, i6=-9, i11=61996, i12=43, iArr1[]=new int[N];
        boolean b=true;
        byte by=-124;
        double dArr[][]=new double[N][N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(dArr, 125.68777);
        FuzzerUtils.init(iArr1, -33427);
        FuzzerUtils.init(lArr1, -2843204312L);

        for (i3 = 11; 276 > i3; i3++) {
            dArr[i3 + 1][i3] += (++Test.fFld);
            if (b) break;
            i4 += (((i3 * Test.iFld) + by) - Test.iFld);
            Test.fFld *= i3;
        }
        for (i5 = 11; i5 < 338; ++i5) {
            switch ((((((int)(Test.fFld / (Test.iFld | 1))) >>> 1) % 2) * 5) + 57) {
            case 60:
                vMeth1(-192, i2);
                for (i11 = 1; i11 < 5; i11++) {
                    Test.fFld /= (l | 1);
                    Test.iFld = i4;
                    l &= i2;
                    dArr[i11][i5] += Test.instanceCount;
                    iArr1[i5 - 1] = (int)l;
                    lArr1[i5 + 1] = i11;
                }
                break;
            case 63:
                Test.fFld += i5;
                break;
            }
        }
        vMeth_check_sum += l + i2 + Double.doubleToLongBits(d1) + i3 + i4 + (b ? 1 : 0) + by + i5 + i6 + i11 + i12 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth() {

        double d3=61.19788;
        int i13=4, i14=-22009, i15=49487, i16=-58138, i17=28503, i18=14, iArr2[]=new int[N];
        short s1=-8249;
        boolean b2=false, bArr[][]=new boolean[N][N];

        FuzzerUtils.init(iArr2, -41972);
        FuzzerUtils.init(bArr, false);

        vMeth(171L, Test.iFld, d3);
        iArr2[(Test.iFld >>> 1) % N] = Test.iFld;
        Test.iFld = 7;
        for (i13 = 12; i13 < 195; ++i13) {
            s1 += (short)(i13 ^ Test.iFld);
            d3 = Test.instanceCount;
            for (i15 = 1; i15 < 9; ++i15) {
                for (i17 = i13; i17 < 2; i17++) {
                    Test.instanceCount += (i17 ^ Test.instanceCount);
                }
                i14 += (int)(6419023819089747844L + (i15 * i15));
                bArr[i15][i15] = b2;
                d3 -= i15;
                i16 = (int)Test.fFld;
                i18 <<= 28563;
            }
            Test.iFld = i16;
        }
        long meth_res = Double.doubleToLongBits(d3) + i13 + i14 + s1 + i15 + i16 + i17 + i18 + (b2 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-8, i1=-2671, i20=-2, i21=-91, i22=12, i23=6593, i24=-9, i25=-10, i26=-56207, i27=-155, i28=40197,
            i29=21703, iArr3[]=new int[N];
        double d=2.5159;

        FuzzerUtils.init(iArr3, 65);

        Test.instanceCount = (--Test.iFld);
        for (i = 245; i > 1; --i) {
            Test.instanceCount += i;
            d = iMeth();
            i1 <<= Test.iFld;
            d = Test.instanceCount;
            Test.iFld += (-39760 + (i * i));
        }
        for (int i19 : iArr3) {
            Test.iFld += (int)Test.instanceCount;
            bFld = bFld;
            i1 += i1;
            i19 -= -239;
            for (i20 = 63; 1 < i20; i20--) {
                Test.iFld += (((i20 * i) + i20) - i20);
            }
            i1 = 20784;
            for (i22 = 63; i22 > 1; i22 -= 2) {
                i23 -= (int)118.6275;
            }
            Test.fArrFld[(i19 >>> 1) % N] += Test.instanceCount;
            i1 = -9;
            i24 = 1;
            do {
                iArr3[i24 - 1] -= (int)2092027474859719605L;
            } while ((i24 += 2) < 63);
        }
        i25 = 1;
        do {
            iArr3[i25 - 1] >>>= i20;
            switch ((i25 % 5) + 12) {
            case 12:
                i1 -= Test.byFld;
                i1 += (i25 + i);
                for (i26 = 7; 216 > i26; i26++) {
                    for (i28 = 1; i28 < 2; i28++) {
                        Test.instanceCount += 172L;
                        if (bFld) break;
                    }
                }
            case 13:
                Test.instanceCount = i1;
                break;
            case 14:
                bFld = true;
                break;
            case 15:
                i29 += i24;
            case 16:
                if (bFld) continue;
                break;
            }
        } while ((i25 += 3) < 349);


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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}