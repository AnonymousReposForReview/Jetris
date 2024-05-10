package tests.javafuzzer3153;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 02:54:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public double dFld=-87.54815;
    public static float fFld=64.639F;
    public static double dFld1=-121.52629;
    public boolean bFld=false;
    public static volatile long lArrFld[]=new long[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -34393L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b, int i3, int i4) {

        double d=17.111312;
        int i5=-6, i6=3, i7=56, i8=-7;
        short s=-1030;
        long l1=-2511938346542587766L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, 7423228301552358345L);

        for (d = 4; d < 139; ++d) {
            i3 += (int)d;
            s += (short)(-333204970L + (d * d));
        }
        for (long l : lArr) {
            i6 = 1;
            do {
                i5 += i6;
            } while (++i6 < 4);
        }
        i5 += i6;
        i7 = 1;
        do {
            l1 *= 0;
            i4 += i3;
            lArr = FuzzerUtils.long1array(N, (long)-56L);
            Test.fFld = i6;
        } while (++i7 < 306);
        i8 = i3;
        l1 = i4;
        s >>= (short)20066;
        vMeth1_check_sum += (b ? 1 : 0) + i3 + i4 + Double.doubleToLongBits(d) + i5 + s + i6 + i7 + l1 + i8 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i2) {

        int i9=13, i10=30397, i11=-45619, i12=-17160, i13=235;
        byte by=-32;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -119.580F);

        vMeth1(true, i2, i2);
        i2 -= i2;
        for (i9 = 12; i9 < 393; ++i9) {
            for (i11 = 1; 4 > i11; ++i11) {
                by = (byte)i12;
                Test.fFld += (float)Test.dFld1;
                i2 -= i11;
                i12 += -2;
                i13 = 1;
                do {
                    Test.instanceCount += (i13 - i9);
                    fArr = FuzzerUtils.float1array(N, (float)-1.469F);
                } while (++i13 < 2);
            }
            if (i2 != 0) {
                vMeth_check_sum += i2 + i9 + i10 + i11 + i12 + by + i13 +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
            i10 >>>= i9;
        }
        Test.instanceCount = i13;
        i2 = (int)3.315F;
        vMeth_check_sum += i2 + i9 + i10 + i11 + i12 + by + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vSmallMeth(int i1) {


        vMeth(i1);
        vSmallMeth_check_sum += i1;
    }

    public void mainTest(String[] strArr1) {

        int i=-55251, i14=3, i15=-6, i16=1, i17=37095, i18=99, i19=-8, i20=2, iArr[]=new int[N];
        byte by1=104;
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(fArr1, -1.785F);

        dFld -= i;
        i <<= i;
        for (int smallinvoc=0; smallinvoc<781; smallinvoc++) vSmallMeth(i);
        Test.lArrFld[(11555 >>> 1) % N] = i;
        switch (((i >>> 1) % 8) + 24) {
        case 24:
            i14 = 1;
            do {
                short s1=-26029;
                i = 37780;
                Test.instanceCount = i;
                Test.dFld1 -= Test.instanceCount;
                Test.fFld = s1;
                for (i15 = 5; i15 < 89; i15++) {
                    i17 = 1;
                    do {
                        iArr[i15 - 1] /= (int)(i | 1);
                    } while (++i17 < 2);
                    Test.lArrFld[i15 - 1] -= i16;
                    i = i;
                    Test.lArrFld[i14 + 1] += i18;
                    dFld = i15;
                    for (i19 = 1; i19 < 2; ++i19) {
                        i += i18;
                        if (bFld) {
                            Test.fFld += i14;
                            iArr = iArr;
                        } else {
                            dArrFld[i15 + 1] += i;
                        }
                        Test.instanceCount -= i15;
                        if (bFld) continue;
                    }
                    Test.instanceCount *= Test.instanceCount;
                    Test.instanceCount -= 60;
                    i += i16;
                    i = 5;
                }
            } while (++i14 < 282);
            i -= 12;
            break;
        case 25:
            i16 |= i19;
            break;
        case 26:
            Test.fFld = by1;
            break;
        case 27:
            i16 = (int)Test.instanceCount;
            break;
        case 28:
            i16 = by1;
            break;
        case 29:
            Test.lArrFld[(i15 >>> 1) % N] <<= i15;
            break;
        case 30:
            i16 = by1;
        case 31:
            i18 = (int)Test.fFld;
            break;
        default:
            Test.instanceCount ^= Test.instanceCount;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}