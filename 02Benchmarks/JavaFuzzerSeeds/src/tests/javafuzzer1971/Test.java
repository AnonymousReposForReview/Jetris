package tests.javafuzzer1971;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 06:54:21 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-3253004779L;
    public static double dFld=107.73728;
    public int iFld=12;
    public static boolean bFld=true;
    public int iFld1=-26585;
    public byte byFld=71;
    public short sFld=-6926;
    public long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -15437);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2() {

        int i3=0, i4=14, i5=43792, i6=-52354, iArr2[]=new int[N];
        byte by1=-92;
        short s=9722;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr2, 32560);
        FuzzerUtils.init(lArr, 518749318L);

        i3 = 1;
        do {
            switch ((i3 % 9) + 35) {
            case 35:
                i4 -= i4;
                if (Test.bFld) continue;
                i4 -= -61364;
                break;
            case 36:
                switch ((i3 % 2) * 5) {
                case 3:
                    i4 = by1;
                    i4 = (int)Test.instanceCount;
                    for (i5 = 1; i5 < 5; ++i5) {
                        Test.instanceCount -= -10L;
                        try {
                            i4 = (-1848810856 % i3);
                            i4 = (i6 % i6);
                            i4 = (i5 / -23876);
                        } catch (ArithmeticException a_e) {}
                        i4 = (int)Test.instanceCount;
                        iArr2[i5 - 1] = i5;
                        Test.instanceCount = Test.instanceCount;
                        Test.bFld = Test.bFld;
                    }
                    break;
                case 2:
                    if (Test.bFld) break;
                    break;
                }
            case 37:
                if (i6 != 0) {
                }
            case 38:
                by1 *= (byte)i4;
                break;
            case 39:
                s %= (short)(Test.instanceCount | 1);
                break;
            case 40:
                i4 += (int)-28.912F;
                break;
            case 41:
                Test.instanceCount += (i3 * i3);
                break;
            case 42:
                lArr[i3 - 1][i3] &= by1;
                break;
            case 43:
                i4 -= i3;
                break;
            }
        } while (++i3 < 324);
        long meth_res = i3 + i4 + by1 + i5 + i6 + s + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth1(int i1, int i2) {

        short s1=-21304;
        double d=-48.12774;
        int i7=22922, i8=75, i9=-18347, i10=-192;
        float f1=-8.650F;

        Test.dFld = (((iFld - i1) - Math.max(Test.instanceCount, 10L)) - (iMeth2() - -58));
        Test.iArrFld[(iFld1 >>> 1) % N] += s1;
        byFld += (byte)-4;
        for (d = 11; d < 302; ++d) {
            for (i8 = 1; i8 < 6; ++i8) {
                iFld1 += -57802;
                i10 *= (int)f1;
                i9 = (int)Test.instanceCount;
                Test.iArrFld[(int)(d)] -= iFld;
                iFld1 += i8;
                switch ((i8 % 5) + 78) {
                case 78:
                    i7 >>>= i7;
                    if (Test.bFld) break;
                    break;
                case 79:
                    i1 *= -14;
                    break;
                case 80:
                    s1 = (short)i10;
                case 81:
                    i9 >>>= i9;
                case 82:
                    i9 += (-10061 + (i8 * i8));
                    break;
                }
            }
        }
        long meth_res = i1 + i2 + s1 + Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(float f, byte by) {

        float f2=102.576F;
        int i11=-199, i12=-122, i13=14, i14=55515, i15=-98, i16=143, iArr1[][]=new int[N][N];

        FuzzerUtils.init(iArr1, -25297);

        iArr1[(iFld >>> 1) % N][(-37076 >>> 1) % N] *= (int)(((Test.instanceCount++) - (Test.instanceCount - iFld)) +
            (iMeth1(iFld1, iFld1) >>> iFld));
        iArr1[(iFld1 >>> 1) % N][(iFld1 >>> 1) % N] = iFld1;
        Test.instanceCount += 25368L;
        for (f2 = 4; f2 < 256; f2++) {
            for (i12 = (int)(f2); i12 < 6; i12++) {
                iFld1 -= sFld;
            }
            iArr1[(int)(f2)][(int)(f2 - 1)] = (int)f;
            Test.instanceCount -= iFld1;
            switch (((i13 >>> 1) % 8) + 34) {
            case 34:
                for (i14 = 1; 6 > i14; i14++) {
                    i16 = 1;
                    do {
                        double d1=1.110321;
                        iArr1[i16 - 1] = FuzzerUtils.int1array(N, (int)-200);
                        Test.iArrFld[i14] = (int)d1;
                        iFld1 &= i12;
                        iFld1 >>>= -4;
                    } while ((i16 += 2) < 2);
                }
                break;
            case 35:
                f *= i16;
                break;
            case 36:
                Test.bFld = Test.bFld;
                break;
            case 37:
                by %= (byte)-54905;
            case 38:
                Test.instanceCount ^= iFld;
                break;
            case 39:
                Test.dFld -= -865362930L;
                break;
            case 40:
                if (false) continue;
            case 41:
                iFld <<= i16;
            }
        }
        long meth_res = Float.floatToIntBits(f) + by + Float.floatToIntBits(f2) + i11 + i12 + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        long l=-8010707086694322628L, l1=3527159099L;
        int i=221, i17=-14, i18=-64999, i19=-13, i20=-11189, i21=1, i22=-7, i23=-22162, i24=8843, i25=7, iArr[]=new
            int[N];
        double d2=-53.61885, d3=-2.66324;
        float f3=0.380F;

        FuzzerUtils.init(iArr, -24052);

        Test.dFld += ((l++) - (++lArrFld[(i >>> 1) % N]));
        iArr[(i >>> 1) % N] &= (++iArr[(i >>> 1) % N]);
        if (Test.bFld) {
            Test.instanceCount = iMeth(3.780F, byFld);
        } else if (Test.bFld) {
            iArr[(i >>> 1) % N] -= -17487;
            for (i17 = 9; i17 < 279; ++i17) {
                if (Test.bFld) {
                    iFld *= (int)-3L;
                    for (i19 = 1; i19 < 93; i19 += 3) {
                        Test.instanceCount = -9;
                        for (i21 = 1; i21 < 4; ++i21) {
                            iArr[i21] <<= i22;
                        }
                        i18 = i17;
                    }
                    for (i23 = i17; i23 < 93; ++i23) {
                        iArr[i23 - 1] = (int)Test.instanceCount;
                    }
                } else {
                    l -= i21;
                    iFld *= i24;
                    i <<= sFld;
                }
                iArr[i17 - 1] *= (int)9183964779181987305L;
                Test.instanceCount += (i17 ^ i22);
                for (d2 = 5; d2 < 93; ++d2) {
                    iArr[(int)(d2)] += (int)l1;
                    l1 *= i22;
                }
                i22 = i22;
                Test.iArrFld[i17] -= (int)f3;
            }
            d3 = 1;
            do {
                l1 *= (long)d3;
                l1 = i;
                i += (int)-597295164829220093L;
                i24 = i22;
            } while (++d3 < 224);
        } else {
            i20 &= (int)l1;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
