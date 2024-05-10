package tests.javafuzzer2986;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:26:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=14117L;
    public static float fFld=-74.771F;
    public static long lArrFld[]=new long[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -3L);
        FuzzerUtils.init(Test.sArrFld, (short)-20489);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6) {

        int i7=-34958, i8=9, i9=32097, iArr1[]=new int[N];
        float f1=1.918F;
        double d1=-9.115794, d2=-4.130488;

        FuzzerUtils.init(iArr1, 99);

        iArr1[(i6 >>> 1) % N] &= i6;
        i7 = 1;
        do {
            i6 = i6;
            for (f1 = i7; 7 > f1; ++f1) {
                i6 -= i8;
                i8 = i6;
                Test.instanceCount += (long)d1;
                i6 = i6;
                for (d2 = i7; 1 > d2; d2++) {
                    Test.instanceCount += (long)f1;
                    i6 ^= -55725;
                    switch ((i7 % 2) + 54) {
                    case 54:
                        i8 = i9;
                    case 55:
                        Test.instanceCount = i8;
                        i6 = (int)f1;
                    }
                }
            }
        } while (++i7 < 245);
        vMeth1_check_sum += i6 + i7 + Float.floatToIntBits(f1) + i8 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(d2) + i9 + FuzzerUtils.checkSum(iArr1);
    }

    public static long lMeth(boolean b) {

        int i4=14, i5=-157, i10=0, i11=8, i12=215, i13=37583, iArr[]=new int[N];
        float f=65.311F;
        byte by1=65;
        short s=19065;

        FuzzerUtils.init(iArr, 11);

        for (i4 = 8; i4 < 366; ++i4) {
            double d3=1.65447;
            iArr[i4] >>= 5;
            switch ((i4 % 2) + 70) {
            case 70:
                b = (((Test.instanceCount - f) + (i4 + by1)) != (f++));
                vMeth1(i4);
                break;
            case 71:
                i5 &= i4;
                d3 += i5;
                for (i10 = 1; i10 < 5; ++i10) {
                    for (i12 = 2; i4 < i12; i12--) {
                        switch ((i12 % 6) + 54) {
                        case 54:
                            d3 += s;
                            break;
                        case 55:
                            Test.instanceCount += i12;
                            break;
                        case 56:
                            Test.instanceCount = Test.instanceCount;
                            b = b;
                            i13 *= i11;
                        case 57:
                            if (i13 != 0) {
                            }
                            break;
                        case 58:
                            i5 *= i10;
                            break;
                        case 59:
                            i11 += i5;
                            break;
                        }
                    }
                }
                break;
            default:
                i5 += (55575 + (i4 * i4));
            }
        }
        long meth_res = (b ? 1 : 0) + i4 + i5 + Float.floatToIntBits(f) + by1 + i10 + i11 + i12 + i13 + s +
            FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(double d) {

        int i1=7, i2=10, i3=9, i14=216, i15=-30390, i16=-167, iArr2[]=new int[N];
        boolean b1=true;
        short s1=-12628;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 27.522F);
        FuzzerUtils.init(iArr2, -19813);

        i1 = 1;
        while (++i1 < 138) {
            for (i2 = 1; i2 < 11; ++i2) {
                i3 -= (int)(-(-lMeth(b1)));
            }
            for (i14 = 1; 11 > i14; ++i14) {
                Test.instanceCount += (((i14 * i15) + Test.fFld) - i3);
                switch (((i1 % 2) * 5) + 8) {
                case 9:
                    i3 <<= i1;
                    Test.fFld += i14;
                    break;
                case 10:
                    i15 += i1;
                    b1 = b1;
                    Test.lArrFld[i14 - 1] >>= 65;
                default:
                    i15 -= i14;
                    Test.fFld += i14;
                }
            }
            s1 <<= (short)-13;
            iArr2[i1] = i16;
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i1 + i2 + i3 + (b1 ? 1 : 0) + i14 + i15 + s1 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        byte by=72;
        int i=-18935, i17=-63833;
        double d4=55.78061;

        by -= (byte)(((Test.instanceCount++) * (-(by * 141))) + (++i));
        vMeth(d4);
        i = i;
        i <<= i;
        Test.instanceCount = i;
        i17 = 1;
        while (++i17 < 343) {
            i = (int)Test.fFld;
        }
        i = i17;
        i += -2;
        i %= (int)(i | 1);
        Test.sArrFld = Test.sArrFld;
        i &= by;



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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
