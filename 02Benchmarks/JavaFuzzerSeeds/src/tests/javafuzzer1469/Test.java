package tests.javafuzzer1469;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:11:34 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static float fFld=56.770F;
    public boolean bFld=true;
    public short sFld=-21066;
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -96632434L);
        FuzzerUtils.init(Test.fArrFld, 109.38F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i3=1, i4=8, i6=38180, i7=24899, i8=-247, iArr[]=new int[N];
        double d=2.53027, d1=0.57199;
        long l=7202452310816229813L;
        byte by=-19;
        float f=-2.626F;
        short s=-30181;

        FuzzerUtils.init(iArr, -184);

        for (i3 = 2; i3 < 137; ++i3) {
            i4 >>= i4;
        }
        Test.instanceCount = i3;
        for (d = 3; d < 275; d++) {
            i7 = 6;
            while (--i7 > 0) {
                d1 = i3;
                for (l = 1; 1 > l; l++) {
                    Test.instanceCount += (l + by);
                    i6 = i8;
                    iArr[(int)(d - 1)] += (int)l;
                    i8 += (int)Test.instanceCount;
                    i8 &= i6;
                    f = s;
                    f += (l - i8);
                    Test.instanceCount += l;
                }
            }
        }
        vMeth2_check_sum += i3 + i4 + Double.doubleToLongBits(d) + i6 + i7 + Double.doubleToLongBits(d1) + l + i8 + by
            + Float.floatToIntBits(f) + s + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i2) {

        int i9=144, i10=46844, i11=2521, i12=0, i13=50, i14=242, iArr1[]=new int[N];
        double d2=-117.83154;

        FuzzerUtils.init(iArr1, 11);

        vMeth2();
        switch (((i2 >>> 1) % 8) + 72) {
        case 72:
            Test.lArrFld[(i2 >>> 1) % N] = Test.instanceCount;
        case 73:
            iArr1[(i2 >>> 1) % N] += (int)Test.instanceCount;
            i9 = 153;
            while (--i9 > 0) {
                Test.instanceCount <<= 103;
            }
            iArr1[(i2 >>> 1) % N] = i2;
            for (i10 = 330; i10 > 2; i10 -= 3) {
                i12 = 1;
                while (++i12 < 14) {
                    i11 += i10;
                    i2 -= (int)-2.159F;
                    d2 *= 10553;
                    for (i13 = 1; i13 < 1; i13 += 3) {
                        Test.fFld -= Test.instanceCount;
                        i14 = (int)Test.instanceCount;
                    }
                }
            }
            break;
        case 74:
            Test.fArrFld[(i12 >>> 1) % N] -= i14;
        case 75:
            Test.fFld += Test.instanceCount;
            break;
        case 76:
            iArr1[(i2 >>> 1) % N] += (int)Test.fFld;
        case 77:
            iArr1[(i10 >>> 1) % N] = (int)Test.instanceCount;
            break;
        case 78:
            Test.fFld = Test.fFld;
            break;
        case 79:
            i14 >>>= i11;
        default:
            i14 = (int)Test.fFld;
        }
        vMeth1_check_sum += i2 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d2) + i13 + i14 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i, int i1) {


        vMeth1(i);
        vMeth_check_sum += i + i1;
    }

    public void mainTest(String[] strArr1) {

        int i15=10, i16=21989, i17=4, i18=-50994, i19=-31216, i20=10, i21=9, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, -11);

        vMeth(i15, i15);
        for (i16 = 8; i16 < 274; ++i16) {
            for (i18 = 94; i18 > 3; i18--) {
                double d3=0.61379;
                d3 -= i17;
                i17 -= (int)Test.instanceCount;
                bFld = bFld;
                sFld += (short)(i18 - Test.instanceCount);
                i19 += (i18 + sFld);
                for (i20 = 1; i20 < 2; i20++) {
                    iArr2[i18] = i20;
                    Test.instanceCount -= (long)d3;
                    iArr2[i16] >>= i21;
                    i17 += (((i20 * i18) + i16) - i17);
                    i15 -= i16;
                    if (false) {
                        i21 = i15;
                    } else {
                        i21 = -222;
                    }
                    switch (((i20 % 4) * 5) + 60) {
                    case 61:
                        i19 = (int)Test.instanceCount;
                        i21 += (i20 - Test.instanceCount);
                        Test.lArrFld[i20 + 1] *= sFld;
                    case 77:
                        Test.fFld += (i20 * i20);
                        break;
                    case 64:
                        Test.instanceCount = Test.instanceCount;
                        Test.instanceCount = Test.instanceCount;
                        Test.fArrFld[i16 - 1] *= -155;
                        Test.instanceCount <<= i17;
                        break;
                    case 79:
                    default:
                        i19 ^= i21;
                        i21 = -39;
                        try {
                            i17 = (i16 % -43051);
                            i21 = (-41 % i20);
                            i15 = (-57 / i21);
                        } catch (ArithmeticException a_e) {}
                        i15 |= i19;
                    }
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
