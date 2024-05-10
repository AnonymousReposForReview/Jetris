package tests.javafuzzer854;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:55:13 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-13760L;
    public static short sFld=-19882;
    public static float fFld=-97.192F;
    public static volatile int iFld=6;
    public static byte byFld=-53;
    public static int iFld1=-4;
    public int iArrFld[]=new int[N];

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static void vSmallMeth(long l) {

        int i=253;
        double d=86.24720, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 109.43322);

        i -= ((-(i = i)) - (i + (i + i)));
        dArr[(9 >>> 1) % N] = (--d);
        vSmallMeth_check_sum += l + i + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth() {

        int i6=-67, i7=-8, i8=-32162, i9=-17, iArr[]=new int[N];
        double d1=1.96582;
        boolean b=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, 55);
        FuzzerUtils.init(sArr, (short)-15624);

        for (i6 = 3; 325 > i6; i6++) {
            iArr[i6] = i7;
            sArr = FuzzerUtils.short1array(N, (short)3968);
            i8 = 1;
            while (++i8 < 5) {
                i7 <<= i7;
                iArr[i6] |= (int)Test.instanceCount;
                i9 = 1;
                while (++i9 < 1) {
                    Test.fFld -= (float)d1;
                    i7 = (int)d1;
                    b = false;
                    i7 += (i9 ^ i8);
                    i7 += i6;
                }
                i7 = (int)Test.instanceCount;
                iArr[i8 + 1] = i7;
                if (i8 != 0) {
                }
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + Double.doubleToLongBits(d1) + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth1(int i1, int i2, int i3) {

        int i4=-5, i5=1, i10=-106, i11=167;
        long l2=4363644063736881410L, lArr[]=new long[N];
        boolean b1=true;

        FuzzerUtils.init(lArr, 2558441857L);

        for (i4 = 1; 200 > i4; i4++) {
            try {
                i2 = (i2 / -21146);
                i2 = (i4 / -1543102839);
                iArrFld[i4] = (-32 / i5);
            } catch (ArithmeticException a_e) {}
            i1 += (i4 + Test.sFld);
            Test.instanceCount += (Integer.reverseBytes(i1) * (iMeth() + i2));
            i3 += (((i4 * Test.instanceCount) + Test.sFld) - i1);
            i10 = 1;
            do {
                lArr[i4 + 1] >>>= i10;
                if (b1) {
                    iArrFld[i10 + 1] -= (int)l2;
                    l2 *= 34504;
                    i5 = i11;
                }
                if (false) break;
                i5 = i3;
                i3 <<= i10;
            } while (++i10 < 8);
            i11 = (int)Test.instanceCount;
        }
        vMeth1_check_sum += i1 + i2 + i3 + i4 + i5 + i10 + l2 + i11 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(long l1) {

        int i12=123, i13=2, i14=-5901, i15=-30158, i16=2, i17=-63004, i18=25;

        vMeth1(Test.iFld, Test.iFld, Test.iFld);
        for (i12 = 17; i12 < 328; ++i12) {
            Test.byFld *= (byte)Test.iFld;
            i13 -= (int)Test.instanceCount;
            for (i14 = 1; i14 < 5; i14++) {
                i13 *= (int)118.255F;
                Test.iFld <<= (int)l1;
                for (i16 = 1; i16 < 2; ++i16) {
                    i13 *= i14;
                    switch (((i13 >>> 1) % 2) + 58) {
                    case 58:
                        l1 = i18;
                        break;
                    case 59:
                        i17 >>= (int)-13764L;
                        break;
                    }
                }
                i18 += (i14 * i14);
                iArrFld[i12] = i12;
                Test.instanceCount += (i14 - i13);
            }
        }
        vMeth_check_sum += l1 + i12 + i13 + i14 + i15 + i16 + i17 + i18;
    }

    public void mainTest(String[] strArr1) {

        int i19=-7, i20=8, i21=47690, i22=0, i23=14, i24=170, i25=60998, i26=2, i27=1;
        boolean b2=false;
        double d2=2.7752;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -33.243F);

        for (int smallinvoc=0; smallinvoc<120; smallinvoc++) vSmallMeth(-9L);
        vMeth(Test.instanceCount);
        i19 = 1;
        do {
            Test.fFld = -70;
            switch ((i19 % 8) + 12) {
            case 12:
                if (b2) continue;
                for (i20 = i19; i20 < 94; ++i20) {
                    iArrFld[i20] /= (int)(Test.iFld | 1);
                    Test.iFld = Test.byFld;
                    Test.iFld -= i21;
                }
            case 13:
                Test.fFld += (-7 + (i19 * i19));
                break;
            case 14:
                if (b2) continue;
                i21 *= i21;
                Test.byFld *= (byte)i20;
                d2 = Test.instanceCount;
                break;
            case 15:
                iArrFld[i19 - 1] = Test.iFld;
                break;
            case 16:
                for (i22 = 3; i22 < 94; i22++) {
                    d2 *= i21;
                    Test.fFld += (i22 * i19);
                    i23 = (int)Test.fFld;
                    i23 <<= i21;
                    for (i24 = 1; 2 > i24; i24++) {
                        fArr = FuzzerUtils.float1array(N, (float)-9.943F);
                    }
                    i25 = (int)d2;
                    d2 = d2;
                }
                break;
            case 17:
                for (i26 = 4; i26 < 94; i26++) {
                    Test.sFld -= (short)i24;
                    i23 = Test.iFld1;
                    i21 += (i26 * i27);
                    Test.fFld += Test.byFld;
                }
                break;
            case 18:
                iArrFld[i19 + 1] = (int)Test.instanceCount;
                break;
            case 19:
                Test.iFld += i19;
                break;
            default:
                Test.instanceCount -= i23;
            }
        } while (++i19 < 267);


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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}