package tests.javafuzzer758;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 09:10:29 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=53L;
    public short sFld=19496;
    public static double dFld=1.105598;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -3L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i3=-4;

        i3 *= 28;
        long meth_res = i3;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l) {

        int i2=7;
        float f=0.186F;
        double d=-32.13613;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)43);

        byArr[(i2 >>> 1) % N] -= (byte)iMeth1();
        f -= 729L;
        d = i2;
        vMeth_check_sum += l + i2 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth(short s, int i1) {

        int i4=-4, i5=-13064, i6=4, i8=11, i9=7, iArr[][]=new int[N][N], iArr1[]=new int[N];
        boolean b=false;
        float f1=-1.36F;

        FuzzerUtils.init(iArr, 243);
        FuzzerUtils.init(iArr1, -52273);

        vMeth(Test.instanceCount);
        i4 = 1;
        do {
            switch ((i4 % 3) + 57) {
            case 57:
                b = b;
                i5 += i5;
                break;
            case 58:
                i1 += (i4 * i4);
                break;
            case 59:
                iArr[i4 + 1][i4 - 1] += (int)-101.555F;
                break;
            }
            i6 = 1;
            do {
                iArr[i6][i6 + 1] = (int)Test.instanceCount;
            } while (++i6 < 13);
            iArr[i4][i4] = 14;
        } while (++i4 < 124);
        i5 += i5;
        for (int i7 : iArr1) {
            for (i8 = 4; i8 > 1; i8 -= 2) {
                s += (short)(i8 * Test.instanceCount);
            }
            f1 -= -8;
        }
        long meth_res = s + i1 + i4 + (b ? 1 : 0) + i5 + i6 + i8 + i9 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-12, i10=-13, i11=-34, i12=195, i13=-1, i14=39033, i15=61748, i16=-49279, i17=-1, i18=3, i19=12242,
            i20=-10, i21=-31752, iArr2[]=new int[N];
        float f2=0.693F;
        boolean b1=false;
        byte by=-108;

        FuzzerUtils.init(iArr2, -200);

        i = (iMeth(sFld, i) + i);
        i10 = 299;
        do {
            if (b1) {
                i -= (int)f2;
                for (i11 = 2; 84 > i11; i11++) {
                    i12 = i11;
                    for (i13 = 1; 2 > i13; i13++) {
                        Test.dFld = i12;
                    }
                }
                for (i15 = 5; i15 < 84; i15++) {
                    iArr2[i10 - 1] += i14;
                    i = (int)-2335181266L;
                }
                Test.instanceCount = (long)f2;
            } else {
                i16 -= (int)f2;
                i += (i10 | i12);
            }
            Test.dFld -= i;
            i12 += i10;
            Test.instanceCount ^= i10;
            by = (byte)i15;
            i12 = i17;
            iArr2[i10] *= i13;
        } while (--i10 > 0);
        for (i18 = 258; i18 > 1; --i18) {
            for (i20 = 2; i20 < 98; i20++) {
                i17 <<= -13;
            }
            i17 <<= sFld;
            switch ((i18 % 9) + 103) {
            case 103:
                sFld += (short)(((i18 * i14) + i11) - i16);
                Test.instanceCount -= 44309L;
                break;
            case 104:
                i12 &= i17;
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
                i14 |= i17;
                Test.lArrFld = Test.lArrFld;
                break;
            case 110:
                i21 += (i18 * i18);
                break;
            case 111:
                Test.instanceCount >>= Test.instanceCount;
                break;
            default:
                i = i11;
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
